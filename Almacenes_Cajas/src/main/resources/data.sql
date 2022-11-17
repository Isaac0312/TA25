DROP table IF EXISTS almacenes;
DROP table IF EXISTS cajas;

create table almacenes(
	codigo int NOT NULL AUTO_INCREMENT,
	lugar varchar(100),
	capacidad int,
    PRIMARY KEY(codigo)
);
create table cajas(
	num_referencia varchar(45),
	contenido varchar(100),
	valor int,
	almacen_id int,
    PRIMARY KEY(num_referencia),
    FOREIGN KEY(almacen_id) REFERENCES almacenes(codigo) ON DELETE CASCADE ON UPDATE CASCADE
);

insert into almacenes (lugar, capacidad)values('Madrid',10);
insert into almacenes (lugar, capacidad)values('Sevilla',100);
insert into almacenes (lugar, capacidad)values('Barcelona',25);
insert into cajas (num_referencia, contenido, valor, almacen_id) values('p','Ruedas',200, 1);
insert into cajas (num_referencia, contenido, valor, almacen_id) values('e','Coches',300000, 2);
insert into cajas (num_referencia, contenido, valor, almacen_id) values('r','Ropa',25000, 3);