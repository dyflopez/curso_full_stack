CREATE DATABASE instituto;

USE instituto;

INSERT INTO estudiante 
(id, identificacion, nombre, apellido, celular, correo) 
VALUES 
(NULL, 71723402, Juan David, Henao Estrada, 300545571, juan@gmail.com), 
(NULL, 71724402, Jairo, Hernandez, 300545572, jairo@gmail.com);


INSERT INTO estudiante (id, identificacion, nombre, apellido, celular, correo) 
VALUES 
(NULL, 71723404, Jaime, Tapias, 3002343344, jaime@gmail.com), 
(NULL, 71723405, Jorge, Gonzalez, 3005455712, jorge@gmail.com);



INSERT INTO estudiante (id, identificacion, nombre, apellido, celular, correo) 
VALUES 
(NULL, 71723406, Joaquin, Bedoya, 3005455713, joaquin@gmail.com), 
(NULL, 71723406, Jose, Juarez, 3005455717, jose@gmsil.com), 
(NULL, 71723407, Jesus, Alvarez, 3005455718, jesus@gmail.com), 
(NULL, 71723408, Jasson, jimenez, 3005455719, jasson@gmail.com), 
(NULL, 71723409, Anibal, Gutierrez, 3005455720, anibal@gmail.com), 
(NULL, 717234011, Arnulfo, Benavides, 3005455721, arnu@gmail.com), 
(NULL, 717234010, Angela, Figueroa, 3005455722, angela@gmail.com), 
(NULL, 717234013, Alberto, Puerta, 3005455714, alberto@gmail.com), 
(NULL, 717234014, Ana, Villegas, 3005455715, ana@gmail.com), 
(NULL, 717234015, Bernardo, Benjumea, 3005455716, bernardo@gmail.com);

INSERT INTO estudiante (id, identificacion, nombre, apellido, celular, correo) 
VALUES 
(NULL, 717234020, Byron, Osa, 3005455720, byron@gmail.com), 
(NULL, 717234021, Carlos, Salazar, 3005455722, carlos@gmail.com), 
(NULL, 717234023, Cristal, Fince, 3005455719, cristal@gmail.com), 
(NULL, 71723409, Clara, correa, 3005455720, clara@gmail.com), 
(NULL, 717234010, Corinne, Casas, 3005455721, corinne@gmail.com), 
(NULL, 717234011, Crisanto, Vargas, 3005455722, crisanto@gmail.com), 
(NULL, 717234022, Camilo, Saldarriaga, 3005455723, camilo@gmail.com), 
(NULL, 717234021, Diego, jimenez, 3005455715, diego@gmail.com), 
(NULL, 717234023, Damian, Restrepo, 3005455716, damian@gmail.com), 
(NULL, 717234023, Daniel, Florez, 3005455717, daniel@gmail.com), 
(NULL, 717234024, Emilio, Piedrahita, 3005455718, emilio@gmail.com), 
(NULL, 717234024, Edison, Suarez, 3005455724, edison@gmail.com);

INSERT INTO estudiante (id, identificacion, nombre, apellido, celular, correo) 
VALUES 
(NULL, 717234025, Edgar, Urrea, 3005455721, edgar@gmail.com), 
(NULL, 717234027, Eberardo, Velasquez, 3005455723, eber@gmail.com), 
(NULL, 71723408, Esteban, Vasquez, 3005455720, esteban@gmail.com), 
(NULL, 717234021, Fabian, Quintero, 300545512, fabian@gmail.com);


INSERT INTO estudiante (id, identificacion, nombre, apellido, celular, correo) 
VALUES 
(NULL, 1082333444, Fabiola, fernandez, 301323232, fabiola@gmail.com), 
(NULL, 1082333222, Franci, Sepulveda, 301323232, franci@gmail.com), 
(NULL, 717234084, Fernando, Duque, 30166777, fer@gmail.com), 
(NULL, 1082112222, Flavio, Guerrero, 3012322, flavio@gmail.com), 
(NULL, 108233990, Fulvio, Yepes, 30123233, fulvio@gmail.com);

CREATE OR REPLACE VIEW vw_vista_cantidad_estudiantes AS 
SELECT
COUNT(*)
FROM estudiante; 
SELECT * FROM vw_vista_cantidad_estudiantes WHERE 1;


CREATE OR REPLACE VIEW vw_listar_estudiantes AS
SELECT 
* 
FROM estudiante;
SELECT * FROM vw_listar_estudiantes WHERE 1;

UPDATE estudiante SET nombre = "DAVID"
WHERE id=1;

DELETE 
FROM estudiante
WHERE id = 36;

CREATE OR REPLACE VIEW vw_listar_apellido_h AS
SELECT * 
FROM estudiante 
WHERE apellido 
LIKE "h%";

CREATE OR REPLACE VIEW vw_listar_nombre_j AS
SELECT nombre 
FROM estudiante
WHERE nombre 
LIKE "j%";

CREATE OR REPLACE VIEW vw_id_descendiente AS
SELECT * 
FROM estudiante 
order by id DESC;
SELECT * FROM `vw_id_descendiente`;

CREATE OR REPLACE VIEW vw_listar_10_ids AS
SELECT * 
FROM estudiante
WHERE id < 11;
SELECT * FROM `vw_listar_10_ids;

CREATE OR REPLACE VIEW vw_contar_estudiantes_idmayor30 AS
SELECT COUNT(*)
FROM estudiante
WHERE id > 30;
SELECT * FROM vw_contar_estudiantes_idmayor30;

CREATE OR REPLACE VIEW vw_estudiante_menor_id AS
SELECT *
FROM estudiante
WHERE id in(select min(id) from estudiante);
SELECT * FROM vw_estudiante_menor_id;

CREATE OR REPLACE VIEW vw_estudiante_mayor_id AS
SELECT *
FROM estudiante
WHERE id in(select max(id) from estudiante);
SELECT * FROM vw_estudiante_mayor_id;

CREATE OR REPLACE VIEW vw_promedio_id_menor20 AS
SELECT avg(id)
FROM estudiante
WHERE id < 20;
SELECT * FROM vw_promedio_id_menor20;

CREATE OR REPLACE VIEW vw_id_entre_10_20 AS
SELECT *
FROM estudiante
WHERE id >9 and id < 21;
SELECT * FROM vw_id_entre_10_20;











