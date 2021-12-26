select d.nombre_docente,f.descripcion_facultad
from materias m
inner join docente_materias dm on m.codigo_materia=dm.codigo_materia
inner join docente d on dm.codigo_docente=d.codigo_docente
inner join facultad f on d.codigo_facultad=f.codigo_facultad
where m.nombre_materia='Excel Avanzado'
order by d.nombre_docente asc;