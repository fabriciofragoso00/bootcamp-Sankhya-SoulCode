-- BDOR
-- TABELA GENERICA (PESSOA)
CREATE TABLE IF NOT EXISTS PESSOA(
	id SERIAL PRIMARY KEY,
	nome VARCHAR(100),
	tipo char(1) CHECK (tipo IN('F', 'J')),
	endereco tp_endereco
);

-- CRIAR TIPOS COMPOSTOS
CREATE TYPE tp_endereco AS (
	logradouro VARCHAR(100),
	numero varchar(20),
	cidade varchar(50),
	estado char(2),
	cep varchar(10)
);

select * from pessoa

CREATE TABLE IF NOT EXISTS pessoa_fisica (
	cpf VARCHAR(14) primary key,
	data_nascimento DATE
)INHERITS(pessoa);

select * from pessoa_fisica

CREATE TABLE IF NOT EXISTS pessoa_juridica (
	cnpj VARCHAR(14) primary key,
	razao_social varchar(100)
)INHERITS(pessoa);

-- INSERIR PESSOA_FISICA
INSERT INTO pessoa_fisica (nome, tipo, endereco, cpf, data_nascimento)
VALUES ('João Souza', 'F', 
		ROW('Av. Paulista', '1000', 'São Paulo', 'SP', '01310-100'),
		'987.654.321-00', '1990-05-20')

SELECT * FROM pessoa

INSERT INTO pessoa_juridica (nome, tipo, endereco, cnpj, razao_social)
VALUES 
('Empresa ABC', 'J', 
 ROW('Rua das Empresas', '456', 'Rio de Janeiro', 'RJ', '20000-000'), 
 '12.345.678', 'ABC Comércio Ltda'),
('Empresa XYZ', 'J', ROW('Av. Brasil', '200', 'Rio de Janeiro', 'RJ', '20220-200'), '98.765.432', 'XYZ Indústria e Comércio S.A.');

create view visao_pessoa_juridica as
SELECT 
    id, 
    nome, 
    tipo,
	cnpj,
    razao_social,
    (endereco).logradouro,
    (endereco).numero,
    (endereco).cidade,
    (endereco).estado,
    (endereco).cep    
FROM pessoa_juridica;

select * from visao_pessoa_juridica

SELECT 
    p.id, 
    p.nome, 
    p.tipo,
    (p.endereco).logradouro,
    (p.endereco).numero,
    (p.endereco).cidade,
    (p.endereco).estado,
    (p.endereco).cep
FROM pessoa p
WHERE p.tipo = 'F';





