/* Database: PostgreSql. Generation date: 2019-06-30 19:49:44:826 */
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
	nome VARCHAR(255) NOT NULL,
	eh_rico BOOLEAN /* ehRico */
);



/* Entity Filme */
create table filme (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	diretor UUID NOT NULL,
	genero UUID NOT NULL
);



/* Join Tables */
/* master: Filme as filme, detail: Ator as ator */
create table filme_atores (
	filme_id UUID NOT NULL,
	atores_id UUID NOT NULL
);

/* Primary Key Constraints */
alter table genero add constraint pk_genero_id primary key(id);
alter table diretor add constraint pk_diretor_id primary key(id);
alter table ator add constraint pk_ator_id primary key(id);
alter table filme_atores add constraint pk_filme_atores primary key(filme_id, atores_id);
alter table filme add constraint pk_filme_id primary key(id);

/* Foreign Key Constraints */
alter table filme add constraint fkosig9qsiafczczs90ifkj2lpu5rn foreign key (diretor) references diretor (id);
alter table filme add constraint fkc0bstlycr6u7hqtqpssjoyw3joqr foreign key (genero) references genero (id);
alter table filme_atores add constraint fkix0znzx1qytgqejbpjdno5wvn4ce foreign key (filme_id) references filme (id);
alter table filme_atores add constraint fkovupxec0vnlwuj4nxftfr6ofyecu foreign key (atores_id) references ator (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
