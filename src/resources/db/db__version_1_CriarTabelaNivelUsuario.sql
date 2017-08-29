DROP TABLE IF EXISTS nivel;
DROP TABLE IF EXISTS usuario;

CREATE TABLE nivel 
(
  id INT NOT NULL,
  nivel VARCHAR(30) NOT NULL,
   constraint pk_Nivel PRIMARY KEY(id)
);

CREATE TABLE usuario (
  id INT NOT NULL,
  usuario char(50) NOT NULL,
  email char(50) NOT NULL,
  senha char(50) NOT NULL,
  ativo char(1) NOT NULL DEFAULT 'S',
  id_nivel INT NOT NULL,
  constraint pk_Usuario primary key(id),
  constraint fk_Usuario_IdNivel foreign key(id_nivel) references nivel on delete cascade
);

INSERT INTO nivel (id, nivel) VALUES (1, 'ADMINISTRADOR');
INSERT INTO nivel (id, nivel) VALUES (2, 'USUARIO');
INSERT INTO usuario (id, usuario, email, senha, ativo, id_nivel) VALUES (1, 'TIAGOSOUSA', 'contato@tiagosousa.eti.br', '41a7eba232d19296de25b0e650fd7eba', 'S', 1);