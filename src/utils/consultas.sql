SELECT "Consulta 1";
SELECT nombre FROM usuario ORDER BY nombre;
SELECT "Consulta 2";
SELECT nombre, temporadas, rating FROM producto
	JOIN serie ON producto.id = serie.producto_id
	WHERE rating > 9;
SELECT "Consulta 3";
SELECT producto.nombre FROM producto
	JOIN creador ON creador.id = producto.creador_id
	JOIN pelicula ON producto.id = pelicula.producto_id
	WHERE creador.nombre LIKE "Tim Burton" ORDER BY pelicula.duracion;
SELECT "Consulta 4";
SELECT nombre FROM producto 
	JOIN comentario ON producto.id = comentario.producto_id
    WHERE usuario_alias LIKE "walterxd" ORDER BY producto.rating;
SELECT "Consulta 5";
SELECT opinion FROM comentario WHERE producto_id=9;
SELECT "Consulta 6";
SELECT count(producto.id) FROM producto
	JOIN serie ON producto.id = serie.producto_id
	WHERE rating > 8.5;