/* Database: SqlServer. Generation date: 2019-06-30 10:58:57:845 */
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
	nome VARCHAR(255) NOT NULL,
	eh_rico BIT /* ehRico */
);



/* Entity Filme */
create table filme (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	diretor UNIQUEIDENTIFIER NOT NULL,
	genero UNIQUEIDENTIFIER NOT NULL
);



/* Join Tables */
/* master: Filme as filme, detail: Ator as ator */
create table filme_atores (
	filme_id UNIQUEIDENTIFIER NOT NULL,
	atores_id UNIQUEIDENTIFIER NOT NULL
);

/* Primary Key Constraints */
alter table genero add constraint pk_genero_id primary key(id);
alter table diretor add constraint pk_diretor_id primary key(id);
alter table ator add constraint pk_ator_id primary key(id);
alter table filme_atores add constraint pk_filme_atores primary key(filme_id, atores_id);
alter table filme add constraint pk_filme_id primary key(id);

/* Foreign Key Constraints */
alter table filme add constraint fkmy6bzhit058tahcvratkxqxg9zas foreign key (diretor) references diretor (id);
alter table filme add constraint fkduqqvymbuphno3ymsqmfaae7lqwl foreign key (genero) references genero (id);
alter table filme_atores add constraint fk2afvv1ohj8spfog9todh0wigvc6u foreign key (filme_id) references filme (id);
alter table filme_atores add constraint fknzsb7eac4zs8nfarao39wl3fmzee foreign key (atores_id) references ator (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
