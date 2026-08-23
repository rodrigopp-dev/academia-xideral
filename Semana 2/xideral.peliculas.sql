CREATE DATABASE IF NOT EXISTS xideral;
USE xideral;

DROP TABLE IF EXISTS peliculas;
CREATE TABLE IF NOT EXISTS peliculas (
  id int NOT NULL AUTO_INCREMENT,
  titulo varchar(255) DEFAULT NULL,
  descripcion varchar(255) DEFAULT NULL,
  fecha_estreno varchar(255) DEFAULT NULL,
  duracion int DEFAULT NULL,
  genero varchar(255) DEFAULT NULL,
  director varchar(255) DEFAULT NULL,
  calificacion double DEFAULT NULL,
  idioma_original varchar(255) DEFAULT NULL,
  pais_origen varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
);

INSERT INTO peliculas (id, titulo, descripcion, fecha_estreno, duracion, genero, director, calificacion, idioma_original, pais_origen) VALUES
(1, 'El Padrino', 'La historia de la familia Corleone bajo la dirección de Don Vito Corleone.', '1972-03-24', 175, 'Crimen', 'Francis Ford Coppola', 9.2, 'Inglés', 'Estados Unidos'),
(2, 'Interestelar', 'Un grupo de astronautas viaja a través de un agujero de gusano en busca de un nuevo hogar para la humanidad.', '2014-11-07', 169, 'Ciencia Ficción', 'Christopher Nolan', 9.2, 'Japonés', 'Estados Unidos'),
(3, 'El Viaje de Chihiro', 'Una niña pequeña se adentra en un mundo mágico dominado por dioses, brujas y espíritus.', '2001-07-20', 125, 'Animación', 'Hayao Miyazaki', 8.6, 'Japonés', 'Japón'),
(4, 'Parásitos', 'Toda la familia de Ki-taek está desempleada y se interesa por la vida de la adinerada familia Park.', '2019-05-30', 132, 'Suspenso', 'Bong Joon Ho', 8.5, 'Coreano', 'Corea del Sur'),
(5, 'El Señor de los Anillos: La Comunidad del Anillo', 'Un joven hobbit, Frodo Bolsón, emprende un viaje para destruir el Anillo Único.', '2001-12-19', 178, 'Fantasía', 'Peter Jackson', 8.8, 'Inglés', 'Nueva Zelanda'),
(6, 'Pulp Fiction', 'Las vidas de dos matones, un boxeador, la esposa de un gánster y dos bandidos se entrelazan.', '1994-10-14', 154, 'Crimen', 'Quentin Tarantino', 8.9, 'Inglés', 'Estados Unidos'),
(7, 'Forrest Gump', 'Las presidencias de Kennedy y Johnson, Vietnam y otros eventos históricos se desarrollan desde la perspectiva de un hombre de Alabama.', '1994-07-06', 142, 'Drama', 'Robert Zemeckis', 8.8, 'Inglés', 'Estados Unidos'),
(8, 'Origen', 'Un ladrón que roba secretos corporativos a través del uso de la tecnología de los sueños recibe la tarea inversa.', '2010-07-16', 148, 'Ciencia Ficción', 'Christopher Nolan', 8.8, 'Inglés', 'Estados Unidos'),
(9, 'Gladiador', 'Un general romano traicionado busca venganza contra el corrupto emperador que asesinó a su familia.', '2000-05-05', 155, 'Acción', 'Ridley Scott', 8.5, 'Inglés', 'Estados Unidos'),
(10, 'La La Land: Una historia de amor', 'Un pianista de jazz y una aspirante a actriz se enamoran en Los Ángeles mientras persiguen sus sueños.', '2016-12-09', 128, 'Romance', 'Damien Chazelle', 8, 'Inglés', 'Estados Unidos'),
(11, 'Coco', 'Miguel viaja a la Tierra de los Muertos para encontrar a su bisabuelo músico y resolver el secreto familiar.', '2017-10-27', 105, 'Animación', 'Lee Unkrich', 8.4, 'Español', 'Estados Unidos'),
(12, 'Matrix', 'Un hacker informático aprende sobre la verdadera naturaleza de su realidad y su papel en la guerra contra sus controladores.', '1999-03-31', 136, 'Ciencia Ficción', 'Lana Wachowski', 8.7, 'Inglés', 'Estados Unidos');