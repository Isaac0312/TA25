DROP table IF EXISTS fabricantes;
DROP table IF EXISTS articulos;

create table fabricantes(
	codigo int NOT NULL auto_increment,
	nombre varchar(250),
    PRIMARY KEY(codigo)
);

create table articulos(
	codigo int NOT NULL auto_increment,
	nombre varchar(250),
    precio int,
    fabricante_id int,
    PRIMARY KEY(codigo),
    FOREIGN KEY(fabricante_id) REFERENCES fabricantes(codigo)
);

insert into fabricantes (nombre)values('BMW');
insert into fabricantes (nombre)values('Audi');
insert into fabricantes (nombre)values('Seat');
insert into articulos (nombre, precio, fabricante_id)values('Rueda','200',1);
insert into articulos (nombre, precio, fabricante_id)values('Puerta','344',2);
insert into articulos (nombre, precio, fabricante_id)values('Coche','2000',3);