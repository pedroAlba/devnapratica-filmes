/* Database: Oracle. Generation date: 2019-06-25 20:22:52:495 */
/* Entity Genero */
create table genero (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL
);



/* Entity Diretor */
create table diretor (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL
);



/* Entity Ator */
create table ator (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL
);



/* Entity Filme */
create table filme (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	diretor RAW(16) NOT NULL
);



/* Join Tables */
/* master: Filme as filme, detail: Genero as genero */
create table filme_generos (
	filme_id RAW(16) NOT NULL,
	generos_id RAW(16) NOT NULL
);

/* master: Filme as filme, detail: Ator as ator */
create table filme_atores (
	filme_id RAW(16) NOT NULL,
	atores_id RAW(16) NOT NULL
);

/* Primary Key Constraints */
alter table genero add constraint pk_genero_id primary key(id);
alter table diretor add constraint pk_diretor_id primary key(id);
alter table ator add constraint pk_ator_id primary key(id);
alter table filme_generos add constraint pk_filme_generos primary key(filme_id, generos_id);
alter table filme_atores add constraint pk_filme_atores primary key(filme_id, atores_id);
alter table filme add constraint pk_filme_id primary key(id);

/* Foreign Key Constraints */
alter table filme add constraint fkbwduqtnzbim3qize8g0bfdahwzcw foreign key (diretor) references diretor (id);
alter table filme_generos add constraint fkowi8ucudgdlhs7c6wl5tli42low3 foreign key (filme_id) references filme (id);
alter table filme_generos add constraint fkxiswgif8kpzslhzajplm6irfiqgu foreign key (generos_id) references genero (id);
alter table filme_atores add constraint fkiefait1cuxukz9ijcvcplkecbggc foreign key (filme_id) references filme (id);
alter table filme_atores add constraint fkbetg9ofrf7yilrrmap18xw7qsvhm foreign key (atores_id) references ator (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
