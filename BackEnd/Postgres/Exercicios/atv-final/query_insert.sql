-- CADASTRANDO DEPARTAMENTOS (SELECT * FROM DEPARTAMENTO)
INSERT INTO DEPARTAMENTO (NOME_DEPTO) VALUES
	('RH'),('MARKETING'),('VENDAS'),('DEVs'),('FINANCEIRO'),
	('JURIDICO'),('ADMINISTRAÇÃO'),('CONTÁBIL'),('PRODUÇÃO'),
	('ATENDIMENTO AO CLIENTE')

--CADASTRANDO EMPREGADOS (SELECT * FROM EMPREGADO)
INSERT INTO EMPREGADO (NOME_EMPREGADO, DATA_DE_NASCIMENTO, SALARIO, NUM_DEPTO) VALUES
    ('João Silva', '1990-05-15', 5000.00, 1),
    ('Maria Santos', '1985-08-20', 4800.00, 2),
    ('Pedro Oliveira', '1992-04-10', 4500.00, 3),
    ('Ana Costa', '1988-12-05', 5200.00, 4),
    ('Carlos Pereira', '1995-02-28', 4900.00, 5),
    ('Juliana Lima', '1991-07-17', 4700.00, 6),
    ('Fernando Souza', '1987-09-25', 5100.00, 7),
    ('Amanda Rocha', '1993-06-30', 4600.00, 8),
    ('Rodrigo Santos', '1989-03-12', 5300.00, 9),
    ('Patrícia Oliveira', '1994-10-22', 4800.00, 10),
    ('Lucas Ferreira', '1990-01-05', 4900.00, 10),
    ('Camila Vieira', '1985-11-18', 4700.00, 9),
    ('Gabriel Almeida', '1992-07-03', 5100.00, 8),
    ('Mariana Lima', '1988-09-14', 4800.00, 7),
    ('Rafael Silva', '1995-04-26', 5200.00, 6),
    ('Aline Pereira', '1991-02-08', 4900.00, 5),
    ('Felipe Souza', '1987-12-30', 5000.00, 4),
    ('Bruna Costa', '1993-06-15', 4700.00, 3),
    ('Gustavo Santos', '1989-03-28', 5300.00, 2),
    ('Isabela Oliveira', '1994-11-10', 4800.00, 1),
    ('Thiago Vieira', '1990-02-15', 4900.00, 1),
    ('Laura Almeida', '1985-12-28', 4700.00, 2),
    ('Matheus Lima', '1992-08-13', 5100.00, 3),
    ('Julia Silva', '1988-10-24', 4800.00, 4),
    ('Roberto Pereira', '1995-05-06', 5200.00, 5),
    ('Carla Souza', '1991-03-18', 4900.00, 6),
    ('Renato Costa', '1987-11-30', 5000.00, 7),
    ('Vanessa Santos', '1993-07-15', 4700.00, 8),
    ('Marcos Oliveira', '1989-04-28', 5300.00, 9),
    ('Sandra Almeida', '1994-12-10', 4800.00, 10),
    ('Diego Lima', '1990-03-25', 4900.00, 10),
    ('Carolina Silva', '1985-11-08', 4700.00, 9),
    ('José Pereira', '1992-08-23', 5100.00, 8),
    ('Ana Paula Souza', '1988-10-04', 4800.00, 7),
    ('Ricardo Costa', '1995-06-16', 5200.00, 6),
    ('Gabriela Santos', '1991-04-28', 4900.00, 5),
    ('Daniel Oliveira', '1987-12-10', 5000.00, 4),
    ('Paula Lima', '1993-08-15', 4700.00, 3),
    ('Marcelo Almeida', '1989-05-28', 5300.00, 2),
    ('Luiza Silva', '1994-01-10', 4800.00, 1),
    ('Alexandre Lima', '1990-04-25', 4900.00, 1),
    ('Tatiana Costa', '1985-12-08', 4700.00, 2),
    ('Bruno Pereira', '1992-09-23', 5100.00, 3),
    ('Camila Souza', '1988-11-04', 4800.00, 4),
    ('Fernando Santos', '1995-07-16', 5200.00, 5),
    ('Vanessa Oliveira', '1991-05-28', 4900.00, 6),
    ('Lucas Lima', '1987-12-11', 5000.00, 7),
    ('Mariana Almeida', '1993-09-15', 4700.00, 8),
    ('Rodrigo Silva', '1989-06-28', 5300.00, 9),
    ('Amanda Costa', '1994-02-10', 4800.00, 10),
    ('Guilherme Santos', '1990-05-25', 4900.00, 10),
    ('Carla Lima', '1985-12-08', 4700.00, 9),
    ('Renata Costa', '1992-10-23', 5100.00, 8),
    ('Thiago Pereira', '1988-11-04', 4800.00, 7),
    ('Juliana Souza', '1995-08-16', 5200.00, 6),
    ('Paulo Oliveira', '1991-06-28', 4900.00, 5),
    ('Fernanda Santos', '1987-12-11', 5000.00, 4),
    ('Marcos Lima', '1993-10-15', 4700.00, 3),
    ('Suzana Almeida', '1989-07-28', 5300.00, 2),
    ('Diego Silva', '1994-03-10', 4800.00, 1),
    ('Bianca Costa', '1990-06-25', 4900.00, 5),
    ('Lucas Pereira', '1985-12-08', 4700.00, 6),
    ('Mariana Lima', '1992-11-23', 5100.00, 7),
    ('Rafaela Souza', '1988-12-04', 4800.00, 8),
    ('Felipe Oliveira', '1995-09-16', 5200.00, 9),
    ('Aline Santos', '1991-07-28', 4900.00, 1),
    ('João Lima', '1987-12-11', 5000.00, 2),
    ('Patrícia Almeida', '1993-11-15', 4700.00, 3);

--CADASTRANDO PROJETOS (SELECT * FROM PROJETO)
INSERT INTO PROJETO (NOME_PROJETO, LUGAR) VALUES 
	('Desenvolvimento de Landing Page', 'São Paulo'),
	('Sistema de Gestão Escolar', 'Rio de Janeiro'),
    ('Aplicativo de E-commerce', 'Belo Horizonte'),
    ('Plataforma de Telemedicina', 'Curitiba'),
    ('Portal de Notícias', 'Porto Alegre'),
    ('Ferramenta de Análise de Dados', 'Florianópolis'),
    ('Sistema de Controle de Estoque', 'Salvador'),
    ('Aplicativo de Reservas de Restaurantes', 'Recife'),
    ('Site Corporativo para Empresa de Tecnologia', 'Brasília'),
    ('Plataforma de Ensino à Distância', 'Fortaleza'),
    ('Sistema de Gestão de Projetos', 'Manaus'),
    ('Aplicativo de Finanças Pessoais', 'Belém'),
    ('Portal de Serviços Públicos', 'Goiânia'),
    ('Sistema de Atendimento ao Cliente com Chatbot', 'Natal'),
    ('Aplicativo de Saúde e Bem-Estar', 'João Pessoa')
    
   