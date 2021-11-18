CREATE TABLE comentario(
	id INTEGER AUTO_INCREMENT,
    usuario_alias VARCHAR(80),
    producto_id INTEGER,
    opinion VARCHAR(100),
    PRIMARY KEY(id),
    FOREIGN KEY(usuario_alias) REFERENCES usuario(alias)
); 
INSERT INTO comentario(usuario_alias, producto_id, opinion) VALUES ("chikisasori", 10, "Muy buena novela, me ha cambiado la vida");
INSERT INTO comentario(usuario_alias, producto_id, opinion) VALUES ("dianasofia1", 4, "La he visto 5 veces, ya me sé todas las canciones");
INSERT INTO comentario(usuario_alias, producto_id, opinion) VALUES ("walterxd", 3, "Yo creo que Willy Wonka tenía planeado todo desde el principio");
INSERT INTO comentario(usuario_alias, producto_id, opinion) VALUES ("walterxd", 1, "Pensé que era una película para niños…");
INSERT INTO comentario(usuario_alias, producto_id, opinion) VALUES ("bsgarciac", 2, "Shrek 2 es mejor");
INSERT INTO comentario(usuario_alias, producto_id, opinion) VALUES ("jesslyz", 9, "La cuarta temporada es la mejor, Freak Show <3");
INSERT INTO comentario(usuario_alias, producto_id, opinion) VALUES ("sebascrack88", 9, "Respeto tu opinión, pero la mejor temporada es la segunda xd");
INSERT INTO comentario(usuario_alias, producto_id, opinion) VALUES ("walterxd", 8, "No me gustó el final");
INSERT INTO comentario(usuario_alias, producto_id, opinion) VALUES ("sebascrack88", 8, "A mí tampoco me gustó uwu");
INSERT INTO comentario(usuario_alias, producto_id, opinion) VALUES ("dianasofia1", 7, "Esta serie me motivó a tomar el curso de MisionTic");