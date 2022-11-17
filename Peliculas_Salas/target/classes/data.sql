DROP table IF EXISTS salas;
DROP table IF EXISTS peliculas;

create table peliculas(
	codigo int NOT NULL AUTO_INCREMENT,
	nombre varchar(100),
	edad int,
    PRIMARY KEY(codigo)
);
create table salas(
	codigo int NOT NULL AUTO_INCREMENT,
	nombre varchar(100),
    pelicula_codigo int,
    PRIMARY KEY(codigo),
    FOREIGN KEY(pelicula_codigo) REFERENCES peliculas(codigo) ON DELETE CASCADE ON UPDATE CASCADE
);

insert into peliculas (nombre, edad) values('Star wars',10);
insert into peliculas (nombre, edad) values('SHREK',12);
insert into peliculas (nombre, edad) values('Transformers',7);
insert into salas (nombre, pelicula_codigo) values('sala1',1);
insert into salas (nombre, pelicula_codigo) values('sala2',2);
insert into salas (nombre, pelicula_codigo) values('sala3',3);