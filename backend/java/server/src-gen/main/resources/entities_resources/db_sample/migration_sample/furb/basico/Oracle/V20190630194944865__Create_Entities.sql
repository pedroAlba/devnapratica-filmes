/* Database: Oracle. Generation date: 2019-06-30 19:49:44:865 */
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
	nome VARCHAR(255) NOT NULL,
	eh_rico NUMBER(1) /* ehRico */
);



/* Entity Filme */
create table filme (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	diretor RAW(16) NOT NULL,
	genero RAW(16) NOT NULL
);



/* Join Tables */
/* master: Filme as filme, detail: Ator as ator */
create table filme_atores (
	filme_id RAW(16) NOT NULL,
	atores_id RAW(16) NOT NULL
);

/* Primary Key Constraints */
alter table genero add constraint pk_genero_id primary key(id);
alter table diretor add constraint pk_diretor_id primary key(id);
alter table ator add constraint pk_ator_id primary key(id);
alter table filme_atores add constraint pk_filme_atores primary key(filme_id, atores_id);
alter table filme add constraint pk_filme_id primary key(id);

/* Foreign Key Constraints */
alter table filme add constraint fkrdlkohwgmageofqgjakcspac8cbj foreign key (diretor) references diretor (id);
alter table filme add constraint fkw386kmjvp1u2o9ytiz0yfxwzmctn foreign key (genero) references genero (id);
alter table filme_atores add constraint fkjjnjp6kdxczh9pgfyzkei06eihz6 foreign key (filme_id) references filme (id);
alter table filme_atores add constraint fkd88oot27krpoj6fkfkls8rcsbrxp foreign key (atores_id) references ator (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
