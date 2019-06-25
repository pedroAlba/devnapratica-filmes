/* Database: SqlServer. Generation date: 2019-06-18 20:33:56:823 */
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

/* Primary Key Constraints */
alter table genero add constraint pk_genero_id primary key(id);
alter table diretor add constraint pk_diretor_id primary key(id);
alter table filme_generos add constraint pk_filme_generos primary key(filme_id, generos_id);
alter table filme add constraint pk_filme_id primary key(id);

/* Foreign Key Constraints */
alter table filme add constraint fkymro4p4wlvxdkttjwuxx9yb02f2p foreign key (diretor) references diretor (id);
alter table filme_generos add constraint fkapbabyx5sedvyayyraqgjx7iczuq foreign key (filme_id) references filme (id);
alter table filme_generos add constraint fkjit6teej60hbnmqsqwav7dqwwowq foreign key (generos_id) references genero (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
