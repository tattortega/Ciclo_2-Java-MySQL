create database recurso_docente;
use recurso_docente;
create table docente(
codigo_docente varchar(15) not null,
nombre_docente varchar(50) not null,
codigo_facultad varchar(15) not null,
constraint docente_pk primary key(codigo_docente),
constraint codigo_facultad_fk foreign key(codigo_facultad) references facultad(codigo_facultad));
create table facultad(
codigo_facultad varchar(15) not null,
descripcion_facultad varchar(50) not null,
constraint facultad_pk primary key(codigo_facultad));
create table materias(
codigo_materia varchar(15) not null,
nombre_materia varchar(50) not null,
numero_creditos int not null,
numero_horas int not null,
codigo_linea varchar(15) not null,
constraint materias_pk primary key(codigo_materia),
constraint materias_codigo_linea_fk foreign key(codigo_linea) references linea(codigo_linea));
create table linea(
codigo_linea varchar(15) not null,
descripcion_linea varchar(50) not null,
constraint linea_pk primary key(codigo_linea));
create table docente_materias(
codigo_docente varchar(15) not null,
codigo_materia varchar(15) not null,
constraint docente_materias_pk primary key(codigo_docente,codigo_materia),
constraint docente_materias_codigo_docente_fk foreign key(codigo_docente) references docente(codigo_docente),
constraint docente_materias_codigo_materia_fk foreign key(codigo_materia) references materias(codigo_materia));
create table estudios(
codigo_estudio varchar(15) not null,
descripcion_estudio varchar(50) not null,
titulo_estudio varchar(50) not null,
fecha_realizacion date not null,
constraint estudios_pk primary key(codigo_estudio));
create table institucion(
codigo_institucion varchar(15) not null,
nombre_institucion varchar(50) not null,
constraint institucion_pk primary key(codigo_institucion));
create table institucion_estudios(
codigo_institucion varchar(15) not null,
codigo_estudio varchar(15) not null,
constraint institucion_estudios primary key(codigo_institucion,codigo_estudio) ,
constraint institucion_estudios_codigo_institucion foreign key(codigo_institucion) references institucion(codigo_institucion),
constraint institucion_estudios_codigo_estudio foreign key(codigo_estudio) references estudios(codigo_estudio));
create table docente_estudios(
codigo_docente varchar(15) not null,
codigo_estudio varchar(15) not null,
constraint docente_estudios primary key(codigo_docente,codigo_estudio),
constraint docente_estudios_codigo_docente foreign key(codigo_docente) references docente(codigo_docente),
constraint docente_estudios_codigo_estudio foreign key(codigo_estudio) references estudios(codigo_estudio));
