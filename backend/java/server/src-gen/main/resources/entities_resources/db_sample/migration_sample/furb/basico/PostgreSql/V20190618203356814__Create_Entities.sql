/* Database: PostgreSql. Generation date: 2019-06-18 20:33:56:814 */
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

/* Primary Key Constraints */
alter table genero add constraint pk_genero_id primary key(id);
alter table diretor add constraint pk_diretor_id primary key(id);
alter table filme_generos add constraint pk_filme_generos primary key(filme_id, generos_id);
alter table filme add constraint pk_filme_id primary key(id);

/* Foreign Key Constraints */
alter table filme add constraint fk1ta6mj3eptqx8enfxoghxl8bmyfb foreign key (diretor) references diretor (id);
alter table filme_generos add constraint fkog3uycgaxuhynmbqwauwdnvcrbhq foreign key (filme_id) references filme (id);
alter table filme_generos add constraint fkbcd2rnp6y2ldae2epfwdkieqf3o8 foreign key (generos_id) references genero (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
