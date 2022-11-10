DROP table IF EXISTS empleado;
DROP table IF EXISTS departamentos;

create table departamentos(
	codigo int NOT NULL AUTO_INCREMENT,
	nombre varchar(100),
	presupuesto int,
    PRIMARY KEY(codigo)
);
create table empleados(
	DNI char(8),
	nombre varchar(100),
	apellidos varchar(255),
	departamento_id int,
    PRIMARY KEY(DNI),
    FOREIGN KEY(departamento_id) REFERENCES departamentos(codigo)
);

insert into departamentos (nombre, presupuesto)values('Primero',10);
insert into departamentos (nombre, presupuesto)values('Segundo',20);
insert into departamentos (nombre, presupuesto)values('Tercero',30);
insert into empleados (dni,nombre, apellidos, departamento_id)values('533','Isaac','Ejarque', 1);
insert into empleados (dni,nombre, apellidos, departamento_id)values('532','Jose','Marin', 2);
insert into empleados (dni,nombre, apellidos, departamento_id)values('531','Carlos','Navarro', 3);