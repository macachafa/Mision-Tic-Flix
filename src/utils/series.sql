CREATE TABLE serie(
	id INTEGER AUTO_INCREMENT,
    producto_id INTEGER,
    temporadas INTEGER,
    episodios INTEGER,
    PRIMARY KEY(id),
    FOREIGN KEY(producto_id) REFERENCES producto(id)
); 
INSERT INTO serie(producto_id, temporadas, episodios) VALUES (6, 3, 26);
INSERT INTO serie(producto_id, temporadas, episodios) VALUES (7, 4, 45);
INSERT INTO serie(producto_id, temporadas, episodios) VALUES (8, 8, 73);
INSERT INTO serie(producto_id, temporadas, episodios) VALUES (9, 9, 103);
INSERT INTO serie(producto_id, temporadas, episodios) VALUES (10, 1, 335);