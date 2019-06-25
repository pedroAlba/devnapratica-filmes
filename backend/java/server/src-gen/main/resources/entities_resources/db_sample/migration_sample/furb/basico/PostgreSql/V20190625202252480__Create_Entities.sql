/* Database: PostgreSql. Generation date: 2019-06-25 20:22:52:480 */
/* Entity Genero */
create table genero (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL
);



/* Entity Diretor */
create table diretor (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL
);



/* Entity Ator */
create table ator (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL
);



/* Entity Filme */
create table filme (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	diretor UUID NOT NULL
);



/* Join Tables */
/* master: Filme as filme, detail: Genero as genero */
create table filme_generos (
	filme_id UUID NOT NULL,
	generos_id UUID NOT NULL
);

/* master: Filme as filme, detail: Ator as ator */
create table filme_atores (
	filme_id UUID NOT NULL,
	atores_id UUID NOT NULL
);

/* Primary Key Constraints */
alter table genero add constraint pk_genero_id primary key(id);
alter table diretor add constraint pk_diretor_id primary key(id);
alter table ator add constraint pk_ator_id primary key(id);
alter table filme_generos add constraint pk_filme_generos primary key(filme_id, generos_id);
alter table filme_atores add constraint pk_filme_atores primary key(filme_id, atores_id);
alter table filme add constraint pk_filme_id primary key(id);

/* Foreign Key Constraints */
alter table filme add constraint fknnozxxrtwbr2p6uuascwvxvpzhic foreign key (diretor) references diretor (id);
alter table filme_generos add constraint fkhidyhl2o9lshn3rj85ry8iijtcdg foreign key (filme_id) references filme (id);
alter table filme_generos add constraint fk8mvejew0nxa78wvcac7phuhhybhw foreign key (generos_id) references genero (id);
alter table filme_atores add constraint fkrsb0oalk5xhcbcjmc7dud5g4w8tp foreign key (filme_id) references filme (id);
alter table filme_atores add constraint fke25elxxx9gdodv9enwqfib9kdjih foreign key (atores_id) references ator (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
