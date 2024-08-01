--GROUP BY
-- LISTE O NUMERO DO DEPARTAMENTO E A QUANTIDADE DE EMPREGADOS DELE

-- SELECT NUM_DEPTO AS NUMERO_DEPTO, COUNT(*) AS TOTAL_EMPREGADOS
-- 	FROM EMPREGADO GROUP BY NUM_DEPTO

-- LISTAR O NUMERO TOTAL DE EMPREGADOS QUE RECEBEM SALARIOS SUPERIOR A 4500 
-- EM CADA DEPARTAMENTO COM MAIS DE 10 FUNCIONARIOS QUE GANHAM MAIS QUE 4500

-- CLAUSULA (HAVING) - VEM APOS GROUP BY E ANTES DO ORDER BY

-- SELECT NUM_DEPTO, COUNT(*) FROM EMPREGADO
-- 	WHERE SALARIO > 4500
-- 		GROUP BY NUM_DEPTO
-- 			HAVING COUNT(*) > 5

--JOINS
	--CITAR AS TABELAS ENVOLVIDAS NA CLAUSULA FROM
	--QUALIFICADORES (ALIAS) DE NOME - AMBIGUIDADES

--LISTAR O NOME DO EMPREGADO E DO DEPARTAMENTO AO QUAL ESTA ALOCADO
	--EMPREGADO
	--DEPARTAMENTO

-- SELECT 
-- 	e.NOME_EMPREGADO AS FUNCIONARIO, 
-- 	d.NOME_DEPTO AS DEPARTAMENTO, 
-- 	e.SALARIO AS SALARIO
-- FROM 
-- 	EMPREGADO e, DEPARTAMENTO d 
-- WHERE d.NUM_DEPTO = e.NUM_DEPTO 
-- ORDER BY e.SALARIO DESC
-- LIMIT 15

--LISTAR O NOME DOS EMPREGADOSCOM SEU RESPECTIVO DEPARTAMENTO QUE TRABALHAM 
--MAIS DE 15H EM ALGUM PROJETO

SELECT 
	e.NOME_EMPREGADO, 
	d.NOME_DEPTO 
FROM 
	EMPREGADO e, 
	DEPARTAMENTO d, 
	TRABALHA t
WHERE T.HORAS > '15'
AND d.NUM_DEPTO = e.NUM_DEPTO
AND t.MAT_EMPREGADO = e.MATRICULA

--LISTAR NUMERO DE HORAS TRABALHADAS EM PROJETOS DE CADA EMPREGADO POR DEPARTAMENTO
-- INFORMANDO O NOME DO DEPARTAMENTO E A MATRICULA DO EMPREGADO

SELECT 
	d.NOME_DEPTO, e.MATRICULA, SUM(T.HORAS)
FROM 
	EMPREGADO e, DEPARTAMENTO d, TRABALHA t
WHERE e.NUM_DEPTO = d.NUM_DEPTO
AND t.MAT_EMPREGADO = e.MATRICULA
GROUP BY d.NOME_DEPTO, e.MATRICULA

-- ALTER TABLE TRABALHA
-- ALTER COLUMN HORAS TYPE INTEGER USING HORAS::INTEGER

SELECT 
	e.NOME_EMPREGADO, 
	d.NOME_DEPTO, 
	e.MATRICULA, 
	SUM(T.HORAS)
FROM 
	EMPREGADO e
JOIN 
	DEPARTAMENTO d ON e.NUM_DEPTO = d.NUM_DEPTO
JOIN 
	TRABALHA t ON t.MAT_EMPREGADO = e.MATRICULA
GROUP BY e.NOME_EMPREGADO, d.NOME_DEPTO, e.MATRICULA

--LISTA OS NOMES DE TODOS OS EMPREGADOS E DOS DEPARTAMENTOS QUE ELES TRABALHAM
SELECT 
	e.NOME_EMPREGADO, 
	d.NOME_DEPTO
FROM 
	DEPARTAMENTO d
LEFT OUTER JOIN --RIGHT
	DEPARTAMENTO e ON d.NUM_DEPTO = e.NUM_DEPTO

--SUBCONSULTAS
--LISTAR OS EMPREGADOS QUE TRABALHAM NO DEPARTAMENTO DE DEVS
SELECT * FROM EMPREGADO 
	WHERE NUM_DEPTO 
		IN(SELECT NUM_DEPTO FROM DEPARTAMENTO WHERE NOME_DEPTO = 'DEVs');

--LISTAR OS EMPREGADOS CUJOS SALARIOS SAO MAIORES DO QUE A MEDIA SALARIAL E MOSTRE
--O QUANTO SAO MAIORES
SELECT 
	MATRICULA, 
	NOME_EMPREGADO, 
	NUM_DEPTO, 
	SALARIO,
	SALARIO - (SELECT ROUND(AVG(SALARIO), 2) FROM EMPREGADO) AS DIFERENCIA_SALARIAL 
FROM EMPREGADO
WHERE SALARIO > (SELECT AVG(SALARIO) FROM EMPREGADO)

SELECT
	NOME_EMPREGADO,
	SALARIO,
	ROUND((SALARIO - MEDIA_SALARIAL), 2) AS DIFERENCA_SALARIAL,
	ROUND(((SALARIO - MEDIA_SALARIAL)/MEDIA_SALARIAL)*100, 2) AS PERCENTUAL
FROM
	EMPREGADO,
	(SELECT AVG(SALARIO ) AS MEDIA_SALARIAL FROM EMPREGADO) AS MEDIA_SAL
WHERE SALARIO > (SELECT AVG(SALARIO) FROM EMPREGADO)
ORDER BY
SALARIO DESC

