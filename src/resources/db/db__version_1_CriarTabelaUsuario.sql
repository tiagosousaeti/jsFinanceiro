DROP TABLE IF EXISTS chaves;
DROP TABLE IF EXISTS usuario;

CREATE TABLE chaves 
(
tabela varchar primary key, 
proximoId BIGINT
);

CREATE TABLE usuario (
  id BIGINT NOT NULL,
  usuario VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL,
  senha VARCHAR(50) NOT NULL,
  nivel INT NOT NULL,
  status INT NOT NULL,
  constraint pk_Usuario primary key(id)
);
INSERT INTO chaves (tabela, proximoId) VALUES ('usuario', 1);