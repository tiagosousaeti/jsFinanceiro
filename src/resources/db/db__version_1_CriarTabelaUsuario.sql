DROP TABLE IF EXISTS usuario;

CREATE TABLE usuario (
  id INT NOT NULL,
  usuario VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL,
  senha VARCHAR(50) NOT NULL,
  nivel INT NOT NULL,
  status INT NOT NULL,
  constraint pk_Usuario primary key(id)
);

INSERT INTO usuario (id, usuario, email, senha, nivel, status) VALUES (1, 'TIAGOSOUSA', 'contato@tiagosousa.eti.br', '41a7eba232d19296de25b0e650fd7eba', 0, 0);