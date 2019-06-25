/* Database: PostgreSql. Generation date: 2019-06-18 19:41:16:290 */
/* Entity Cliente */
create table cliente (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	credito_habilitado BOOLEAN /* creditoHabilitado */,
	cpf VARCHAR(255) NOT NULL,
	id_foto VARCHAR(255) /* idFoto */
);



/* Entity Item */
create table item (
	id UUID NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	quantidade NUMERIC(19,4) NOT NULL,
	valor_unitario NUMERIC(19,4) NOT NULL /* valorUnitario */
);



/* Entity Pedido */
create table pedido (
	id UUID NOT NULL,
	data DATE NOT NULL,
	obsservacoes VARCHAR(255),
	cliente UUID NOT NULL
);



/* Join Tables */
/* master: Pedido as pedido, detail: Item as item */
create table pedido_itens (
	pedido_id UUID NOT NULL,
	itens_id UUID NOT NULL
);

/* Primary Key Constraints */
alter table cliente add constraint pk_cliente_id primary key(id);
alter table item add constraint pk_item_id primary key(id);
alter table pedido_itens add constraint pk_pedido_itens primary key(pedido_id, itens_id);
alter table pedido add constraint pk_pedido_id primary key(id);

/* Foreign Key Constraints */
alter table pedido add constraint fk9lzncwfml0pfhgyyvicjy5mj4exg foreign key (cliente) references cliente (id);
alter table pedido_itens add constraint fkpxfbmxuhwjbde6p3cnfmi6e9mvf9 foreign key (pedido_id) references pedido (id);
alter table pedido_itens add constraint fkizub1xsgph3tftsizxzcr5juj0hx foreign key (itens_id) references item (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
