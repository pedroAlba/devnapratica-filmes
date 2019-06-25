/* Database: Oracle. Generation date: 2019-06-18 20:33:56:827 */
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

/* Primary Key Constraints */
alter table genero add constraint pk_genero_id primary key(id);
alter table diretor add constraint pk_diretor_id primary key(id);
alter table filme_generos add constraint pk_filme_generos primary key(filme_id, generos_id);
alter table filme add constraint pk_filme_id primary key(id);

/* Foreign Key Constraints */
alter table filme add constraint fkzkehyrazayxs54fdtpm9tk7doglh foreign key (diretor) references diretor (id);
alter table filme_generos add constraint fk1yrax12ah4stvzvu1hp06rlu2wpe foreign key (filme_id) references filme (id);
alter table filme_generos add constraint fktf0tvrcpwtpcmuwgxh7jzdhzcbft foreign key (generos_id) references genero (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
