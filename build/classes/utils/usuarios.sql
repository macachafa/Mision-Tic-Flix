CREATE TABLE usuario(
	alias VARCHAR(80),
    contraseña VARCHAR(80),
    nombre VARCHAR(40),
    apellido VARCHAR(40),
    documento INTEGER,
    tipo_de_documento VARCHAR(20),
    PRIMARY KEY(alias)
); 
INSERT INTO usuario VALUES ("bsgarciac", "12345678", "Brayan", "García", 10000001, "CC");
INSERT INTO usuario VALUES ("sebascrack88", "abcd1234", "Sebastian", "Molina", 123014510, "CC");
INSERT INTO usuario VALUES ("dianasofia1", "password", "Diana", "Cardenas", 3245142, "TI");
INSERT INTO usuario VALUES ("jesslyz", "jessguz1", "Jessica", "Guzman", 12478412, "CC");
INSERT INTO usuario VALUES ("walterxd", "anything32", "Walter", "Black", 11243412, "CE");
INSERT INTO usuario VALUES ("chikisasori", "135478632", "Juan", "Solano", 135478632, "CC");

