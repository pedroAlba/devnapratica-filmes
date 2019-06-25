/* Database: SqlServer. Generation date: 2019-06-25 20:22:52:491 */
/* Entity Genero */
create table genero (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL
);



/* Entity Diretor */
create table diretor (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL
);



/* Entity Ator */
create table ator (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL
);



/* Entity Filme */
create table filme (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	diretor UNIQUEIDENTIFIER NOT NULL
);



/* Join Tables */
/* master: Filme as filme, detail: Genero as genero */
create table filme_generos (
	filme_id UNIQUEIDENTIFIER NOT NULL,
	generos_id UNIQUEIDENTIFIER NOT NULL
);

/* master: Filme as filme, detail: Ator as ator */
create table filme_atores (
	filme_id UNIQUEIDENTIFIER NOT NULL,
	atores_id UNIQUEIDENTIFIER NOT NULL
);

/* Primary Key Constraints */
alter table genero add constraint pk_genero_id primary key(id);
alter table diretor add constraint pk_diretor_id primary key(id);
alter table ator add constraint pk_ator_id primary key(id);
alter table filme_generos add constraint pk_filme_generos primary key(filme_id, generos_id);
alter table filme_atores add constraint pk_filme_atores primary key(filme_id, atores_id);
alter table filme add constraint pk_filme_id primary key(id);

/* Foreign Key Constraints */
alter table filme add constraint fkm9hvsa9tjkox7ugwf3gdxdc3snsg foreign key (diretor) references diretor (id);
alter table filme_generos add constraint fksbqjgm6k9l4j3jawxde71qa6l4qa foreign key (filme_id) references filme (id);
alter table filme_generos add constraint fkx4ycb1eo853nipyydzcm44hgcljv foreign key (generos_id) references genero (id);
alter table filme_atores add constraint fk9whdevmyeimxqwvwk7lfoblpikby foreign key (filme_id) references filme (id);
alter table filme_atores add constraint fk4cs62aprawxdb49e2j1filwng6yh foreign key (atores_id) references ator (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
