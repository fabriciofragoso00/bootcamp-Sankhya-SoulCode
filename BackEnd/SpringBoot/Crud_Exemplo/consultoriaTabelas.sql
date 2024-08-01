CREATE TABLE clientes (
	id_cliente serial, 
	nome_empresa varchar(100)  NOT NULL UNIQUE,
  	nome_responsavel varchar(100)  NOT NULL,
  	cnpj varchar(14)  NOT NULL UNIQUE,
  	telefone, varchar(15) NOT NULL,
  	email varchar(100)  NOT NULL UNIQUE,
    senha varchar(300) NOT NULL,
	consultor_id int NOT NULL
  	data_cadastro  DEFAULT CURRENT_TIMESTAMP,
	--CHAVE PRIMÁRIA
	CONSTRAINT clientes_id_cliente_pk PRIMARY KEY(id_cliente),
	CONSTRAINT  clientes _id_consultor_fk O
);

--drop table consultor

CREATE TABLE consultor (
  	id_consultor serial,
	nome_consultor varchar(100) NOT NULL,
	especializacao varchar(100) NOT NULL,
	experiencia varchar(100) NOT NULL,
	telefone varchar(15) NOT NULL,
	email varchar(100)  NOT NULL UNIQUE,
    senha varchar(300) NOT NULL,
	data_cadastro timestamp DEFAULT date_trunc('second', CURRENT_TIMESTAMP),
	--CHAVE PRIMÁRIA
	CONSTRAINT consultores_id_consultor_pk PRIMARY KEY(id_consultor)
);

CREATE TABLE consultas (
    id_consulta serial,
    id_cliente int NOT NULL,
	id_consultor int NOT NULL,
    data_consulta date NOT NULL,
    hora_consulta varchar(6) NOT NULL,
    --CHAVE PRIMÁRIA
    CONSTRAINT consultas_id_consulta_pk PRIMARY KEY(id_consulta),
    --CHAVES ESTRANGEIRAS
    CONSTRAINT consultas_id_consultor_fk FOREIGN KEY(id_consultor) 
		REFERENCES consultores(id_consultor),
    CONSTRAINT consultas_id_cliente_fk FOREIGN KEY(id_cliente) 
		REFERENCES clientes(id_cliente),
    --RESTRIÇÃO DE UNICIDADE
    CONSTRAINT consultas_unica UNIQUE(id_consultor, id_cliente, data_agendamento)
);

CREATE TABLE relatorio_de_consultoria (
    id_relatorio_de_consultoria serial,
    consulta_id int NOT NULL,
    id_cliente int NOT NULL,
    id_consultor int NOT NULL
	--CHAVE PRIMÁRIA
	CONSTRAINT relatorio_id_relatorio_pk PRIMARY KEY(id_relatorio_de_consultoria),
	--CHAVE ESTRANGEIRAS
	CONSTRAINT relatorio_consulta_id_consulta_fk FOREIGN KEY(consulta_id)
		REFERENCES consultas(id_consulta),
	CONSTRAINT relatorio_consulta_id_cliente_fk FOREIGN KEY(id_cliente)
		REFERENCES clientes (id_cliente),
	CONSTRAINT relatorio_consulta_id_consultor_fk FOREIGN KEY(id_consultor)
		REFERENCES consultores (id_consultor)
);

CREATE TABLE feedbacks (
    id_feedback serial,
    id_cliente int NOT NULL,
    data_feedback timestamp NOT NULL,
    feedback varchar(1000)
	--CHAVE PRIMÁRIA
	CONSTRAINT feedbacks_id_feedbacks_pk PRIMARY KEY(id_feedback),
	--CHAVE ESTRANGEIRA
	CONSTRAINT feedbacks_id_cliente_fk FOREIGN KEY(id_cliente)
		REFERENCES clientes(id_cliente)
);