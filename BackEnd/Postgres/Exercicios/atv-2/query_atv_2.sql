-- ***** LISTA 01 - AQUECIMENTO ************

-- ### Desafios de `INSERT`

-- **Adicionar um novo cliente**:
-- 	 1 - Adicione um novo cliente com os seguintes dados: nome, email, telefone e idade.

--SELECT * FROM CLIENTES
INSERT INTO CLIENTES (NOME, EMAIL, TELEFONE, IDADE) VALUES
('Adriano Gomes', 'adriano.gomes@example.com', '555-4321', 42)

-- **Adicionar um novo produto**:
--   2 - Adicione um novo produto com os seguintes dados: nome, preço e quantidade.
	
--SELECT * FROM PRODUTOS
INSERT INTO PRODUTOS (NOME, PRECO, QUANTIDADE) VALUES
	('Produto D', 50.50, 18)

-- **Adicionar um novo item de venda**:
--   3 - Adicione um novo item de venda relacionando um produto e um cliente existentes 
-- 	com uma quantidade específica.
	
--SELECT * FROM ITENS
INSERT INTO ITENS (CODIGO_PRODUTO, ID_CLIENTE, QUANTIDADE) VALUES
    (4, 6, 8)

-- ### Desafios de `UPDATE`

-- **Atualizar o telefone de um cliente**:
--   4 - Atualize o telefone de um cliente específico usando seu email como referência.

--SELECT * FROM CLIENTES
UPDATE CLIENTES SET TELEFONE = '555-2442' WHERE EMAIL = 'bruno.costa@example.com'

-- **Atualizar o preço e a quantidade de um produto**:
--   5 - Atualize o preço e a quantidade de um produto específico usando o nome do produto 
-- 	como referência.
	
--SELECT * FROM PRODUTOS
UPDATE PRODUTOS SET
	PRECO = 39.99,
	QUANTIDADE = 12
WHERE NOME = 'Produto B'

 -- **Atualizar a quantidade de um item de venda**:
 --   6 - Atualize a quantidade de um item de venda específico usando seu ID como referência.
	
--SELECT * FROM ITENS
UPDATE ITENS SET QUANTIDADE = 5 WHERE ID = 2

-- ### Desafios de `DELETE`

-- **Deletar um cliente específico**:
--   7 - Delete um cliente específico usando seu email como referência.

--SELECT * FROM CLIENTES
DELETE FROM ITENS
	WHERE ID_CLIENTE IN (SELECT ID FROM CLIENTES WHERE EMAIL = 'bruno.costa@example.com')
	
DELETE FROM CLIENTES WHERE EMAIL = 'bruno.costa@example.com'

	
-- **Deletar um produto específico**:
--   8 - Delete um produto específico usando o nome do produto como referência.
	
--SELECT * FROM PRODUTOS
DELETE FROM ITENS
	WHERE CODIGO_PRODUTO IN (SELECT CODIGO FROM PRODUTOS WHERE NOME = 'Produto B')
	
DELETE FROM PRODUTOS WHERE NOME = 'Produto B'
	
-- **Deletar um item de venda específico**:
--   9 - Delete um item de venda específico usando seu ID como referência.
	
--SELECT * FROM ITENS
DELETE FROM ITENS WHERE ID = 4

-- ### Desafios de Criação de `VIEWS`

-- **Criar uma view que exibe todos os clientes com suas respectivas idades e telefones**:
--   10 - Crie uma view que mostra o nome, idade e telefone de todos os clientes.
	
--SELECT * FROM VIEW_LISTA_CLIENTES
CREATE VIEW VIEW_LISTA_CLIENTES AS
SELECT
	c.NOME,
	c.TELEFONE,
	c.IDADE
FROM
CLIENTES c

-- **Criar uma view que exibe todos os produtos com seus preços e quantidades em estoque**:
--   11 - Crie uma view que mostra o nome, preço e quantidade de todos os produtos.

--SELECT * FROM VIEW_LISTA_PRODUTOS
CREATE VIEW VIEW_LISTA_PRODUTOS AS
SELECT
	p.NOME AS NOME_DO_PRODUTO,
	p.PRECO,
	p.QUANTIDADE AS QUANTIDADE_NO_ESTOQUE
FROM
PRODUTOS p

-- **Criar uma view que exibe o total vendido por cada cliente**:
--   12 - Crie uma view que mostra o nome do cliente e o total vendido por ele.

--SELECT * FROM VIEW_TOTAL_VENDIDO
CREATE VIEW VIEW_TOTAL_VENDIDO AS
SELECT
	c.NOME AS NOME_CLIENTE,
	ROUND((i.QUANTIDADE * p.PRECO), 2) AS TOTAL_VENDIDO
FROM
	CLIENTES c
JOIN
	ITENS i ON c.ID = i.ID_CLIENTE
JOIN
	PRODUTOS p ON i.CODIGO_PRODUTO = p.CODIGO

-- ### Desafios Adicionais

-- **Adicionar um novo cliente e uma nova compra para esse cliente**:
--   13 - Adicione um novo cliente com dados fictícios.
--   13.1 - Adicione um novo item de venda para esse cliente relacionando um produto existente.

--SELECT * FROM CLIENTES
INSERT INTO CLIENTES (NOME, EMAIL, TELEFONE, IDADE) VALUES
	('Fabricio Fragoso', 'fabricio.fragoso@example.com', '555-9900', 31)

--SELECT * FROM PRODUTOS
--SELECT * FROM ITENS
INSERT INTO ITENS (CODIGO_PRODUTO, ID_CLIENTE, QUANTIDADE) VALUES
    (1, 7, 7)

-- **Atualizar o nome e o email de um cliente específico**:
--   14 - Atualize o nome e o email de um cliente usando seu ID como referência.

--SELECT * FROM CLIENTES
UPDATE CLIENTES SET
	NOME = 'José Neto',
	EMAIL = 'jose.neto@example.com'
WHERE id = 3

-- **Deletar todos os itens de venda de um produto específico**:
--   15 - Delete todos os itens de venda de um produto específico usando o código 
--  do produto como referência.

--SELECT * FROM ITENS
DELETE FROM ITENS WHERE CODIGO_PRODUTO = 1

-- ***** LISTA 02 - VALENDO ************

-- **Adicionar múltiplos clientes**:
--   16 - Adicione três novos clientes com dados fictícios em uma única instrução `INSERT`.

--SELECT * FROM CLIENTES
INSERT INTO CLIENTES (NOME, EMAIL, TELEFONE, IDADE) VALUES
	('Alberto Guerra ', 'alberto.guerra@example.com', '555-1221', 50),
	('Walter kannemann', 'walter.kannemann@example.com', '555-1331', 33),
	('Pedro Geromel', 'Pedro.geromel@example.com', '555-1441', 39)

-- **Adicionar múltiplos produtos**:
--   17 - Adicione dois novos produtos com dados fictícios em uma única instrução `INSERT`.

--SELECT * FROM PRODUTOS
INSERT INTO PRODUTOS (NOME, PRECO, QUANTIDADE) VALUES
	('Produto E', 18.99, 23),
	('Produto F', 44.89, 21)

-- **Adicionar múltiplos itens de venda**:
--   18 - Adicione três novos itens de venda relacionando diferentes produtos e clientes 
-- 	existentes em uma única instrução `INSERT`.

--SELECT * FROM PRODUTOS
--SELECT * FROM ITENS
INSERT INTO ITENS (CODIGO_PRODUTO, ID_CLIENTE, QUANTIDADE) VALUES
    (5, 1, 8),
	(6, 10, 7),
	(4, 9, 3)

-- ### Desafios de `UPDATE`

-- **Atualizar a idade de todos os clientes acima de 30 anos**:
--   19 - Aumente a idade de todos os clientes que têm mais de 30 anos em 1 ano.

--SELECT * FROM CLIENTES
UPDATE CLIENTES SET
	IDADE = IDADE + 1
WHERE IDADE > 30

-- **Atualizar o preço de todos os produtos com quantidade menor que 10**:
--   20 - Aumente o preço de todos os produtos com quantidade menor que 10 em 10%.

--SELECT * FROM PRODUTOS
UPDATE PRODUTOS SET
	PRECO = PRECO * 1.10
WHERE QUANTIDADE < 10

-- **Atualizar o nome de todos os produtos para incluir uma palavra-chave**:
--   21 - Adicione a palavra "Promoção" ao início do nome de todos os produtos.

--SELECT * FROM PRODUTOS
UPDATE PRODUTOS SET
	NOME = 'Promoção ' || NOME

-- ### Desafios de `DELETE`

-- **Deletar todos os clientes com idade menor que 18 anos**:
--   22 - Delete todos os clientes que têm menos de 18 anos.

--SELECT * FROM CLIENTES
DELETE FROM CLIENTES WHERE IDADE < 18

-- **Deletar todos os produtos com preço maior que 50**:
--   23 - Delete todos os produtos cujo preço é maior que 50.

--SELECT * FROM ITENS
--SELECT * FROM PRODUTOS
DELETE FROM ITENS
	WHERE CODIGO_PRODUTO IN (SELECT CODIGO FROM PRODUTOS WHERE PRECO > 50.00)
	
DELETE FROM PRODUTOS WHERE PRECO > 50.00

-- **Deletar todos os itens de venda de clientes específicos**:
--   24 - Delete todos os itens de venda de clientes com email específico.

--SELECT * FROM CLIENTES
--SELECT * FROM ITENS
DELETE FROM ITENS
	WHERE ID_CLIENTE IN (SELECT ID FROM CLIENTES WHERE EMAIL = 'jose.neto@example.com')

-- ### Desafios de Criação de `VIEWS`

-- **Criar uma view que exibe o estoque total de produtos vendidos**:
--   25  - Crie uma view que mostra o nome do produto e o total vendido em relação 
--   ao estoque.
	
--SELECT * FROM VIEW_ESTOQUE_TOTAL_VENDIDO
CREATE OR REPLACE VIEW VIEW_ESTOQUE_TOTAL_VENDIDO AS
SELECT
	p.NOME AS PRODUTO,
	p.QUANTIDADE AS ESTOQUE,
	COALESCE(SUM(i.QUANTIDADE), 0) AS ESTOQUE_VENDIDO,
	COALESCE(ROUND((i.QUANTIDADE * p.PRECO), 2), 0) AS TOTAL_VENDIDO
FROM
	PRODUTOS p 
LEFT JOIN 
	ITENS i ON p.CODIGO = i.CODIGO_PRODUTO
GROUP BY
	p.NOME, p.QUANTIDADE, i.QUANTIDADE, p.PRECO

-- **Criar uma view que exibe os clientes que não fizeram compras**:
--   26  - Crie uma view que mostra o nome e email dos clientes que não têm itens de venda 
-- 	associados.

--SELECT * FROM VIEW_CLIENTES_SEM_VENDAS
CREATE OR REPLACE VIEW VIEW_CLIENTES_SEM_VENDAS AS
SELECT
	c.NOME AS CLIENTE,
	c.EMAIL
FROM
	CLIENTES c
LEFT JOIN ITENS i ON c.ID = i.ID_CLIENTE
WHERE i.ID_CLIENTE IS NULL
	

-- **Criar uma view que exibe os produtos não vendidos**:
--   27 - Crie uma view que mostra o nome e preço dos produtos que não foram vendidos
--	(quantidade de vendas igual a zero). 

--SELECT * FROM VIEW_PRODUTOS_NAO_VENDIDOS
CREATE OR REPLACE VIEW VIEW_PRODUTOS_NAO_VENDIDOS AS
SELECT
	p.NOME,
	p.PRECO
FROM
	PRODUTOS p
LEFT JOIN ITENS i ON p.CODIGO = i.CODIGO_PRODUTO
WHERE i.CODIGO_PRODUTO IS NULL

-- ### Desafios Adicionais

-- **Adicionar uma nova coluna em uma tabela e atualizar dados**:
--   28 - Adicione uma nova coluna `data_de_cadastro` à tabela `clientes` e preencha-a 
-- 	 com a data atual para todos os clientes.

--SELECT * FROM CLIENTES
ALTER TABLE CLIENTES ADD COLUMN DATA_DE_CADASTRO DATE
UPDATE CLIENTES SET DATA_DE_CADASTRO = CURRENT_DATE

-- **Atualizar o preço dos produtos com base em uma condição**:
--   29 - Aumente o preço de todos os produtos em 5% se a quantidade em estoque for menor 
--   que 20.

--SELECT * FROM PRODUTOS
UPDATE PRODUTOS SET
	PRECO = PRECO * 1.05
WHERE QUANTIDADE < 20

-- **Deletar registros duplicados em uma tabela**:
--   30 - Encontre e delete registros duplicados na tabela `clientes`, mantendo apenas um 
-- 	registro por cliente com base no email.

CREATE VIEW VIEW_CLIENTES_DUPLICADOS AS
SELECT 
    ID, 
    EMAIL,
    MIN(ID) OVER (PARTITION BY EMAIL) AS MANTER_ID
FROM 
    CLIENTES
WHERE 
    EMAIL IN (
	SELECT 
		EMAIL
	FROM 
		CLIENTES 
	GROUP BY 
		EMAIL 
	HAVING COUNT(*) > 1
);

DELETE FROM CLIENTES
WHERE 
    id IN (SELECT id FROM VIEW_CLIENTES_DUPLICADOS)
    AND 
    id NOT IN (SELECT MANTER_ID FROM VIEW_CLIENTES_DUPLICADOS);

-- **Criar uma view que exibe a média de vendas por produto**:
--   31 - Crie uma view que mostra o nome do produto e a média de itens vendidos por 
--   produto.

--SELECT * FROM VIEW_MEDIAS_VENDAS
CREATE OR REPLACE VIEW VIEW_MEDIAS_VENDAS AS
SELECT
	p.NOME AS PRODUTO,
	COALESCE(ROUND(AVG(i.QUANTIDADE), 2), 0) AS MEDIA_ITENS_VENDIDOS
FROM
	PRODUTOS p
LEFT JOIN
	ITENS i ON p.CODIGO = i.CODIGO_PRODUTO
GROUP BY
	p.NOME

-- **Adicionar um novo cliente e realizar múltiplas compras para esse cliente**:
--   32 - Adicione um novo cliente com dados fictícios.
--   32.1 - Adicione três novos itens de venda para esse cliente, relacionando diferentes 
-- produtos.

--SELECT * FROM CLIENTES
INSERT INTO CLIENTES (NOME, EMAIL, TELEFONE, IDADE) VALUES
('Gustavo Nunes', 'gustavo.nunes@example.com', '555-9909', 18)
	
UPDATE CLIENTES SET
	DATA_DE_CADASTRO = CURRENT_DATE
WHERE NOME ='Gustavo Nunes'

--SELECT * FROM ITENS
--SELECT * FROM PRODUTOS
INSERT INTO ITENS (CODIGO_PRODUTO, ID_CLIENTE, QUANTIDADE) VALUES
    (5, 11, 6),
	(3, 11, 7),
	(1, 11, 3)

-- **Atualizar o email de todos os clientes para um novo domínio**:
--   33 - Atualize o email de todos os clientes para um novo domínio, por exemplo, 
-- 	mude `@example.com` para `@novodominio.com`.
	
--SELECT * FROM CLIENTES
UPDATE CLIENTES SET
	EMAIL = REPLACE(EMAIL, '@example.com', '@novodominio')

-- **Deletar produtos que não foram vendidos nos últimos 6 meses**:
--   34 - Delete todos os produtos que não têm itens de venda associados nos últimos 
--   6 meses.

--SELECT * FROM ITENS
ALTER TABLE ITENS ADD COLUMN DATA_VENDA DATE
UPDATE ITENS SET DATA_VENDA = CURRENT_DATE

--TESTE PARA APAGAR UM PRODUTO
UPDATE ITENS SET 
	DATA_VENDA = '2023-11-19'
WHERE CODIGO_PRODUTO = 1
	
-- Identifica os produtos que não foram vendidos nos últimos 6 meses
CREATE OR REPLACE VIEW VIEW_PRODUTOS_SEM_VENDAS AS 
    SELECT 
		p.CODIGO
    FROM 
		PRODUTOS p
    LEFT JOIN 
		ITENS i 
	ON p.CODIGO = i.CODIGO_PRODUTO 
	AND i.DATA_VENDA >= CURRENT_DATE - INTERVAL '6 months'
    WHERE i.CODIGO_PRODUTO IS NULL

DELETE FROM ITENS
WHERE CODIGO_PRODUTO IN (
    SELECT codigo
    FROM VIEW_PRODUTOS_SEM_VENDAS
);

DELETE FROM PRODUTOS
WHERE CODIGO IN (
    SELECT CODIGO
    FROM VIEW_PRODUTOS_SEM_VENDAS
);

--SELECT * FROM PRODUTOS


-- **Criar uma view que exibe a proporção de vendas por cliente**:
--   35 - Crie uma view que mostra o nome do cliente e a proporção do total de vendas 
-- em relação ao total de vendas de todos os clientes.
	
--SELECT * FROM VIEW_PROPORCAO_VENDAS
CREATE OR REPLACE VIEW VIEW_PROPORCAO_VENDAS AS
SELECT 
    c.NOME AS NOME_CLIENTE,
    SUM(i.QUANTIDADE * p.PRECO) AS VENDAS_CLIENTES,
    SUM(SUM(i.QUANTIDADE * p.PRECO)) OVER() AS TOTAL_VENDAS,
    ROUND((SUM(i.QUANTIDADE * p.PRECO) / SUM(SUM(i.QUANTIDADE * p.PRECO)) OVER() * 1.0), 2) 
		AS PROPORCAO_VENDAS
FROM 
    CLIENTES c
JOIN 
    ITENS i ON c.ID = i.ID_CLIENTE
JOIN 
    PRODUTOS p ON i.CODIGO_PRODUTO = p.CODIGO
GROUP BY 
    c.NOME

--DROP VIEW VIEW_PROPORCAO_VENDAS.
