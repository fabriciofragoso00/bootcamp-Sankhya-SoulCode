-- Database: ATV-2

CREATE TABLE CLIENTES(
	id serial PRIMARY KEY,
	nome varchar(100) not null,
	email varchar(100) NOT NULL UNIQUE,
	telefone varchar(20),
	idade integer
);
-- INSERÇÃO DE CINCO REGISTROS NA TABELA CLIENTES
INSERT INTO CLIENTES (NOME,EMAIL,TELEFONE, IDADE) VALUES
('Ana Silva', 'ana.silva@example.com', '555-1234', 30),
('Bruno Costa', 'bruno.costa@example.com', '555-5678', 45),
('Carlos Souza', 'carlos.souza@example.com', '555-8765', 28),
('Daniela Lima', 'daniela.lima@example.com', '555-4321', 34),
('Eduardo Alves', 'eduardo.alves@example.com', '555-6789', 22);

-- TABELA PRODUTOS
CREATE TABLE PRODUTOS(
	CODIGO SERIAL PRIMARY KEY,
	NOME VARCHAR(100) NOT NULL,
	PRECO NUMERIC(10,2) NOT NULL,
	QUANTIDADE INTEGER NOT NULL
);

-- INSERÇÃO DE 03 PRODUTOS
INSERT INTO PRODUTOS (NOME, PRECO, QUANTIDADE) VALUES
    ('Produto A', 25.50, 10),
    ('Produto B', 15.75, 20),
    ('Produto C', 35.90, 5);
	
-- TABELA ITENS
CREATE TABLE ITENS(
	ID SERIAL PRIMARY KEY,
	CODIGO_PRODUTO INTEGER NOT NULL REFERENCES PRODUTOS(CODIGO),
	ID_CLIENTE INTEGER NOT NULL REFERENCES CLIENTES(ID),
	QUANTIDADE INTEGER NOT NULL
);

CREATE TABLE ITENS(
	ID SERIAL,
	CODIGO_PRODUTO INTEGER,
	ID_CLIENTE INTEGER,
	QUANTIDADE INTEGER NOT NULL,
	CONSTRAINT ITENS_PK PRIMARY KEY (ID),
	CONSTRAINT ITENS_PRODUTO_FK FOREIGN KEY (CODIGO_PRODUTO)
	REFERENCES PRODUTOS (CODIGO),
	CONSTRAINT ITENS_CLIENTES_FK FOREIGN KEY (ID_CLIENTE)
	REFERENCES CLIENTES (ID)
);

-- INSERÇÃO DE CINCO REGISTROS NA TABELA ITENS
INSERT INTO ITENS (CODIGO_PRODUTO, ID_CLIENTE, QUANTIDADE) VALUES
    (1, 1, 2),
    (2, 2, 1),
    (3, 3, 4),
    (1, 4, 1),
    (2, 5, 3);

--- CRIAÇÃO DAS VIEWS
-- * Visualizar os clientes e os produtos que compraram
CREATE VIEW CLIENTES_PRODUTOS AS
SELECT
	c.nome AS CLIENTE,
	p.nome AS PRODUTO,
	i.quantidade,
	p.preco,
	(i.quantidade * p.preco) AS TOTAL
FROM
	CLIENTES c
JOIN
	ITENS i ON c.id = i.id_cliente
JOIN
	PRODUTOS p ON i.codigo_produto = p.codigo

select cliente, produto, total from CLIENTES_PRODUTOS

-- VISUALIZAR O ESTOQUE DE PRODUTOS COM A QUANTIDADE TOTAL VENDIDA
CREATE VIEW produtos_estoque_vendas AS
SELECT
	p.nome AS produto,
	p.quantidade AS estoque,
	COALESCE(SUM(i.quantidade), 0) AS total_vendido
FROM
	produtos p LEFT JOIN itens i ON p.codigo = i.codigo_produto
GROUP BY
	p.nome, p.quantidade


SELECT * FROM produtos_estoque_vendas
