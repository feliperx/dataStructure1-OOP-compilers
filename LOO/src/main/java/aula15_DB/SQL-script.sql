DROP DATABASE if exists banco; 

CREATE DATABASE banco;

/*Create tabela filmes*/
CREATE TABLE filmes (

Codigo	 		integer 	NOT NULL PRIMARY KEY ,
Titulo 			varchar(35) 	NOT NULL,
Genero 			varchar(8),
Produtora 		varchar(15),
DataCompra 		date,

UNIQUE(Codigo)

);

INSERT INTO filmes VALUES (452, 'Era do gelo', 'Animação', 'Pixar', '2017-02-24');
INSERT INTO filmes VALUES (124, 'Máscara', 'Comédia', 'Warner Bros', '2018-06-17');
INSERT INTO filmes VALUES (122, 'Poderoso Chefão', 'Ação', 'Columbia', '2017-02-24');
INSERT INTO filmes VALUES (457, 'Titanic', 'Romance', 'Warner Bros', '1997-05-10');
INSERT INTO filmes VALUES (659, 'Killbill', 'Ação', 'Columbia ', '2007-12-10');
INSERT INTO filmes VALUES (1237, 'Forrest Gump', 'Comédia', 'Columbia', '2012-10-11');
INSERT INTO filmes VALUES (7895, 'Vingadores', 'Ação', 'Marvel', '2015-08-02');
INSERT INTO filmes VALUES (3548, 'Central do Brasil', 'Drama', 'Globo Filmes', '2011-05-12');
INSERT INTO filmes VALUES (23, 'Ratatouille', 'Animação', 'Pixar', '2016-04-08');
INSERT INTO filmes VALUES (4588, 'Rei Leão', 'Animação', 'Walt Disney', '2019-06-19');

