--https://halleyoliv.gitlab.io/pgdocptbr/ddl-alter.html#DDL-ALTER-ADDING-A-COLUMN
--https://www.mockaroo.com/

-- esquema relacuonal exemplo
-- empregado (matricula, nomes, salario, num_depto)
-- departamento (num_depto, nome)
-- projeto (num_proj, nome, lugar)
-- trabalha (mat_empregado, num_proj, horas)
-- dependente (matricula, nome, grau_parentesco)

CREATE TABLE IF NOT EXISTS DEPARTAMENTO(
	NUM_DEPTO SERIAL,
	NOME_DEPTO VARCHAR(60) NOT NULL,
	--CHAVE PRIMARIA
	CONSTRAINT DEPARTAMENTO_PK PRIMARY KEY(NUM_DEPTO)
);

ALTER SEQUENCE departamento_num_depto_seq RESTART WITH 1000;

-- INSERINDO DADOS EM UM BD SQL
-- CADASTRANDO DEPARTAMENTOS (SELECT * FROM DEPARTAMENTO)
INSERT INTO DEPARTAMENTO (NOME_DEPTO) VALUES
	('RH'),('MARKETING'),('VENDAS'),('DEVs'),('FINANCEIRO'),
	('JURIDICO'),('ADMINISTRAÇÃO'),('CONTÁBIL'),('PRODUÇÃO'),
	('ATENDIMENTO AO CLIENTE')

CREATE TABLE IF NOT EXISTS EMPREGADO(
	MATRICULA SERIAL NOT NULL,
	NOME_EMPREGADO VARCHAR(50) NOT NULL,
	SALARIO DECIMAL(10,2),
	NUM_DEPTO INT,
	--CHAVE PRIMARIA
	CONSTRAINT EMPREGADO_PK PRIMARY KEY (MATRICULA),
	--CHAVE ESTRANGEIRA
	CONSTRAINT EMPREG_DEPTO_FK FOREIGN KEY (NUM_DEPTO)
	REFERENCES DEPARTAMENTO(NUM_DEPTO)
	--REGRAS DE NEGOCIO
--	CONSTRAINT EMPREGADO_CONST_NOME UNIQUE (NOME_EMPREGADO),
--	CONSTRAINT EMPREGADO_CHECK CHECK (SALARIO > 2000)
);

--CADASTRANDO EMPREGADOS (SELECT * FROM EMPREGADO)
INSERT INTO EMPREGADO (NOME_EMPREGADO, SALARIO, NUM_DEPTO) VALUES
	('RODRIGO', 6900.00, 4),('SERGIO', 5800.00, 2),('KEVIN', 6900.00, 4),
	('ANA', 4800.00, 1),('VANUZIA', 5000.00, 3),('LEANDRO', 7500.00, 9),
	('ANABELE', 3950, 10),('OTÁVIO', 4800.00, 1),('BRUNA', 5800.00, 2),
	('BRUNO', 3950, 10),('JOEL', 5000.00, 3),('PETER', 5200.00, 5),
	('GLADSTONE', 7500, 9),('EMANUELA', 8000.00, 6),('ALICE', 3000.00, 8),
	('BARBARA', 5200.00, 5),('JUCIELE', 3500.00, 7),('ALMEIDA', 8000.00, 6),
	('VILLASANTI', 3000.00, 8),('PHELIPPE', 3500.00, 7)

-- SELECT * FROM visao_num_depto
-- SELECT nome_empregado, nome_depto FROM visao_num_depto
CREATE VIEW visao_num_depto AS(
SELECT 
-- e.MATRICULA,
-- e.NOME_EMPREGADO,
-- e.SALARIO,
-- e.NUM_DEPTO,
	e.*,
    d.NOME_DEPTO
FROM 
    EMPREGADO e
JOIN 
    DEPARTAMENTO d ON e.NUM_DEPTO = d.NUM_DEPTO
);

--SELECT * FROM VIEW_EMPREGADO_DEPARTAMENTO
CREATE OR REPLACE VIEW VIEW_EMPREGADO_DEPARTAMENTO AS
SELECT 
    d.NUM_DEPTO,
    d.NOME_DEPTO,
    COUNT(e.MATRICULA) AS QUANTIDADE_EMPREGADOS,
	ROUND(SUM(e.salario), 2) AS SOMA_SALARIOS,
	ROUND(AVG(e.salario), 2) AS MEDIA_SALARIAL
	
FROM 
    DEPARTAMENTO d
LEFT JOIN 
    EMPREGADO e ON d.NUM_DEPTO = e.NUM_DEPTO
GROUP BY 
    d.NUM_DEPTO, d.NOME_DEPTO;

--SELECT * FROM VIEW_EMPREGADO_DEPARTAMENTO
CREATE OR REPLACE VIEW VIEW_EMPREGADO_DEPARTAMENTO AS
SELECT 
    d.NUM_DEPTO,
    d.NOME_DEPTO,
    COUNT(e.MATRICULA) AS QUANTIDADE_EMPREGADOS,
    ROUND(SUM(e.SALARIO), 2) AS SOMA_SALARIOS,
    ROUND(AVG(e.SALARIO), 2) AS MEDIA_SALARIAL,
    (
        SELECT 
            ROUND(SUM(SALARIO), 2)
        FROM 
            EMPREGADO
    ) AS SOMA_TOTAL_SALARIOS,
    (
        SELECT 
            COUNT(MATRICULA)
        FROM 
            EMPREGADO
    ) AS TOTAL_EMPREGADOS
FROM 
    DEPARTAMENTO d
LEFT JOIN 
    EMPREGADO e ON d.NUM_DEPTO = e.NUM_DEPTO
GROUP BY 
    d.NUM_DEPTO, d.NOME_DEPTO;

--SELECT * FROM VIEW_EMPREGADO_DEPARTAMENTO
CREATE OR REPLACE VIEW VIEW_EMPREGADO_DEPARTAMENTO AS
SELECT 
    d.NUM_DEPTO,
    d.NOME_DEPTO,
    COUNT(e.MATRICULA) AS QUANTIDADE_EMPREGADOS,
    ROUND(SUM(e.SALARIO), 2) AS SOMA_SALARIOS,
    ROUND(AVG(e.SALARIO), 2) AS MEDIA_SALARIAL,
    t.SOMA_TOTAL_SALARIOS,
    t.TOTAL_EMPREGADOS
FROM 
    DEPARTAMENTO d
LEFT JOIN 
    EMPREGADO e ON d.NUM_DEPTO = e.NUM_DEPTO
CROSS JOIN (
    SELECT 
        ROUND(SUM(SALARIO), 2) AS SOMA_TOTAL_SALARIOS,
        COUNT(MATRICULA) AS TOTAL_EMPREGADOS
    FROM 
        EMPREGADO
) t
GROUP BY 
    d.NUM_DEPTO, d.NOME_DEPTO, t.SOMA_TOTAL_SALARIOS, t.TOTAL_EMPREGADOS;

--SELECT * FROM VIEW_TOTAL_SALARIOS_FUNCIONARIOS
CREATE OR REPLACE VIEW VIEW_TOTAL_SALARIOS_FUNCIONARIOS AS
SELECT 
    ROUND(SUM(SALARIO), 2) AS TOTAL_SALARIOS,
    COUNT(MATRICULA) AS TOTAL_FUNCIONARIOS,
    ROUND(AVG(SALARIO), 2) AS MEDIA_SALARIAL
FROM 
    EMPREGADO;


-- PROJETO (NUM_PROJ, NOME_PROJETO, LUGAR)
CREATE TABLE IF NOT EXISTS PROJETO(
	NUM_PROJ SERIAL NOT NULL,
	NOME_PROJETO VARCHAR(100) NOT NULL,
	LUGAR VARCHAR(40) NOT NULL,
	CONSTRAINT PROJETO_PK PRIMARY KEY(NUM_PROJ)
);

-- SELECT * FROM PROJETO
INSERT INTO PROJETO (NOME_PROJETO, LUGAR) VALUES
	('DESENVOLVIMENTO DE LANDING PAGE', 'SÃO PAULO')

--TRABALHA(MAT_EMPREGADO, NUM_PROJ, HORAS)
CREATE TABLE IF NOT EXISTS TRABALHA(
	MAT_EMPREGADO INT,
	NUM_PROJETO INT,
	HORAS VARCHAR(10),
	--CHAVE PRIMARIA
	CONSTRAINT TRABALHA_EMP_PROJ_PK PRIMARY KEY (MAT_EMPREGADO, NUM_PROJETO),
	--CHAVE ESTRANGEIRA
	CONSTRAINT TRABALHA_EMPREGADO_PK FOREIGN KEY (MAT_EMPREGADO)
	REFERENCES EMPREGADO (MATRICULA),
	CONSTRAINT TRABALHA_PROJETO_PK FOREIGN KEY (NUM_PROJETO)
	REFERENCES PROJETO (NUM_PROJ)	
);

--SELECT * FROM TRABALHA
INSERT INTO TRABALHA (MAT_EMPREGADO, NUM_PROJETO, HORAS) VALUES
	(2, 1, 30),(3, 1, 40),(98, 1, 10)


-- DEPENDENTE (MATRICULA_EMPREG, NOME_DEPENDENTE, GRAU_PARENTESCO)
CREATE TABLE IF NOT EXISTS DEPENDENTE(
	MAT_EMPREGADO INT,
	NOME_DEPENDENTE VARCHAR(60),
	GRAU_PARENTESCO VARCHAR(60),
	--CHAVE PRIMARIA
	CONSTRAINT DEPENDENTE_EMP_PK PRIMARY KEY (MAT_EMPREGADO),
	--CHAVE ESTRANGEIRA
	CONSTRAINT DEPENDENTE_EMPREGADO_FK FOREIGN KEY (MAT_EMPREGADO)
	REFERENCES EMPREGADO (MATRICULA)
);
-- SELECT * FROM DEPENDENTE
INSERT INTO DEPENDENTE(MAT_EMPREGADO, NOME_ DEPENDENTE, GRAU_PARENTESCO) VALUES
	(1, 'JOANA', 'MÃE')
	
-- DROP TABLE DEPARTAMENTO;

CREATE TABLE IF NOT EXISTS SETORES(
    NUM_DEPTO UUID DEFAULT gen_random_uuid() NOT NULL,
    NOME_DEPTO VARCHAR(60) NOT NULL,
    CONSTRAINT SETORES_PK PRIMARY KEY(NUM_DEPTO)
);