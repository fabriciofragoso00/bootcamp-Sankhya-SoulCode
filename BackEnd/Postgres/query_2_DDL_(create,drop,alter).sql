-- DDL (CREATE, DROP, ALTER)
-- ADICIONANDO COLUNAS
ALTER TABLE EMPREGADO ADD sexo char;
ALTER TABLE EMPREGADO ADD COLUMN email text CHECK (email <> '');
-- REMOVENDO COLUNAS
ALTER TABLE EMPREGADO DROP COLUMN EMAIL;
ALTER TABLE EMPREGADO DROP COLUMN SEXO;
ALTER TABLE EMPREGADO DROP COLUMN CONTATO;
--ADD REGRA
ALTER TABLE EMPREGADO ALTER COLUMN SEXO SET NOT NULL;
-- ADD COLUNA JA COM VALOR DEFAULT
ALTER TABLE EMPREGADO ALTER COLUMN email SET DEFAULT 'nome@nome.com'
-- REMOVER VALOR DEFAULT
ALTER TABLE EMPREGADO ALTER COLUMN EMAIL DROP DEFAULT;
-- MUDAR O TIPO DE DADOS DE UMA COLUNA
ALTER TABLE EMPREGADO ALTER COLUMN SALARIO TYPE REAL;
ALTER TABLE EMPREGADO ALTER COLUMN SALARIO TYPE NUMERIC(10,2);
-- RENOMEAR UMA COLUNA
ALTER TABLE EMPREGADO RENAME COLUMN EMAIL TO CONTATO;
-- RENOMEAR UMA TABELA
ALTER TABLE EMPREGADO RENAME TO FUNCIONARIOS;
ALTER TABLE FUNCIONARIOS RENAME TO EMPREGADO;

DELETE FROM DEPARTAMENTO
WHERE NUM_DEPTO = 11;

-- ADD RESTRIÇÃO PARA NAO ACEITAR NOMES REPETIDOS EM DEPARTAMENTO
ALTER TABLE DEPARTAMENTO ADD CONSTRAINT DEPTO_UNICO_NAME UNIQUE (NOME_DEPTO);

--EXTRAÇÃO DE DADOS (SELECT)
--PROJEÇÃO

--SELECT <LISTA DE ATRIBUTOS> FROM <TABELA>
--SELECT * FROM EMPREGADO

--SELECT matricula, nome_empregado FROM EMPREGADO

--CLAUSULA WHERE
--SELECT <LISTA DE ATRIBUTOS> FROM <TABELA> WHERE <CONDIÇÃO>

--OPERADORES RELACIONAIS
--<> OU != DIFERENTE
-->, <, =, >=, <=

--OPERADORES LOGICOS

--LISTAR NOME, SALARIO DOS EMPREGADOS DO DEPTO 03 MAIOR DE 5000 SALARIO
SELECT NOME_EMPREGADO, SALARIO FROM EMPREGADO
	WHERE NUM_ DEPTO = 3 AND SALARIO > 5000
		LIMIT 5

--LISTAR OS EMPREGADOS COM SALARIO ENTRE 2000 E 5000
SELECT NOME_EMPREGADO, SALARIO FROM EMPREGADO
	WHERE  SALARIO >= 2000 AND SALARIO <= 5000

SELECT NOME_EMPREGADO, SALARIO FROM EMPREGADO
	WHERE  SALARIO NOT BETWEEN 2000 AND 5000

--LISTAR TODOS OS EMPREGADOS QUE TEM O PRIMEIRO NOME MARIA
--LIKE ou NOT LIKE

SELECT * FROM EMPREGADO
	WHERE NOME_EMPREGADO LIKE '%MA%'

--CLAUSULAS ORDER BY
SELECT * FROM EMPREGADO ORDER BY SALARIO, NOME_EMPREGADO ASC;

--CALCULO NA CLAUSULA SELECT
--MOSTRA O NOME , SALARIO DOS EMPREGADOS COM AJUSTES 40%
--OS QUE GANHAM ABAIXO DE 5000

SELECT NOME_EMPREGADO, SALARIO AS SALARIO_ANTERIOR, (SALARIO * 1.4) AS NOVO_SALARIO 
	FROM EMPREGADO
		WHERE SALARIO <= 5000

--FUNÇÕES DE AGREGAÇÃO
--MOSTRAR O VALOR DO MAIOR SALARIO DOS EMPREGADOS
--AVG(MEDIA), MIN, MAX, COUNT, SUM

SELECT MAX(SALARIO) FROM EMPREGADO
SELECT AVG(SALARIO) FROM EMPREGADO

SELECT NOME_EMPREGADO, SALARIO FROM EMPREGADO 
	WHERE SALARIO IN (SELECT MAX(SALARIO) FROM EMPREGADO);

--QUNTOS EMPREGADOS GANHAM MAIS QUE 7000
SELECT COUNT(*) FROM EMPREGADO WHERE SALARIO >=7000

--QUAIS OS DIFERENTES SALARIOS PAGOS PELA EMPRESA
SELECT DISTINCT(SALARIO) FROM EMPREGADO




