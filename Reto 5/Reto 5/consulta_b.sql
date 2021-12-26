select d.nombre_docente,f.descripcion_facultad,m.nombre_materia
from materias m
inner join docente_materias dm on m.codigo_materia=dm.codigo_materia
inner join docente d on dm.codigo_docente=d.codigo_docente
inner join facultad f on d.codigo_facultad=f.codigo_facultad
where d.nombre_docente='Edgar Araque'
order by m.nombre_materia asc;