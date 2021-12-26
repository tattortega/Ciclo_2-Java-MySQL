create database biblioteca;
use biblioteca;	
create table tema(
codigo_tema varchar(15) not null,
nombre_tema varchar(50) not null,
constraint tema_pk primary key(codigo_tema));
create table editorial(
codigo_editorial varchar(15) not null,
nombre_editorial varchar(50) not null,
constraint editorial_pk primary key(codigo_editorial));
create table libro(
codigo_libro varchar(15) not null,
nombre_libro varchar(50) not null,
codigo_editorial varchar(15) not null,
constraint libro_pk primary key(codigo_libro),
constraint libro_codigo_libro_fk foreign key(codigo_editorial) references editorial(codigo_editorial));
create table tema_libro(
codigo_tema varchar(15) not null,
codigo_libro varchar(15) not null,
constraint tema_libro_pk primary key(codigo_tema,codigo_libro),
constraint tema_libro_codigo_tema_fk foreign key(codigo_tema) references tema(codigo_tema),
constraint tema_libro_codigo_libro_fk foreign key(codigo_libro) references libro(codigo_libro));
create table nacionalidad(
codigo_nacionalidad varchar(15) not null,
nombre_nacionalidad	 varchar(50) not null,
constraint nacionalidad_pk primary key(codigo_nacionalidad));
create table autor(
codigo_autor varchar(15) not null,
nombre_autor varchar(50) not null,
email_autor varchar(50) not null,
genero_autor varchar(1) not null,
constraint autor_pk primary key(codigo_autor),
constraint autor_genero_autor_ck check(genero_autor='M' or genero_autor='F'));
create table autor_nacionalidad(
codigo_autor varchar(15) not null,
codigo_nacionalidad varchar(15) not null,
constraint autor_nacionalidad_pk primary key(codigo_autor,codigo_nacionalidad),
constraint autor_nacionalidad_codigo_autor_fk foreign key(codigo_autor) references autor(codigo_autor),
constraint autor_nacionalidad_codigo_nacionalidad_fk foreign key(codigo_nacionalidad) references nacionalidad(codigo_nacionalidad));
create table libro_autor(
codigo_libro varchar(15) not null,
codigo_autor varchar(15) not null,
constraint libro_autor_pk primary key(codigo_libro,codigo_autor),
constraint libro_autor_codigo_libro_fk foreign key(codigo_libro) references libro(codigo_libro),
constraint libro_autor_codigo_autor_fk foreign key(codigo_autor) references autor(codigo_autor));
create table carrera(
codigo_carrera varchar(15) not null,
nombre_carrera varchar(50) not null,
constraint carrera_pk primary key(codigo_carrera));
create table usuario(
codigo_usuario varchar(15) not null,
nombre_usuario varchar(50) not null,
direccion_usuario varchar(50) not null,
telefono_usuario varchar(10),
constraint usuario_pk primary key(codigo_usuario));
create table usuario_carrera(
codigo_usuario varchar(15) not null,
codigo_carrera varchar(15) not null,
constraint usuario_carrera_pk primary key(codigo_usuario,codigo_carrera),
constraint usuario_carrera_codigo_usuario_fk foreign key(codigo_usuario) references usuario(codigo_usuario),
constraint usuario_carrera_codigo_carrera_fk foreign key(codigo_carrera) references carrera(codigo_carrera));
create table prestamo(
numero_prestamo varchar(15) not null,
fecha_prestamo date not null,
fecha_entrega_propuesta date not null,
fecha_entrega_real date not null,
valor_multa double,
codigo_usuario varchar(15) not null,
constraint prestamo_pk primary key(numero_prestamo),
constraint prestamo_codigo_usuario_fk foreign key(codigo_usuario) references usuario(codigo_usuario));
create table libro_prestamo(
codigo_libro varchar(15) not null,
numero_prestamo varchar(15) not null,
constraint libro_prestamo_pk primary key(codigo_libro,numero_prestamo),
constraint libro_prestamo_codigo_libro_fk foreign key(codigo_libro) references libro(codigo_libro),
constraint libro_prestamo_numero_prestamo_fk foreign key(numero_prestamo) references prestamo(numero_prestamo));
	