CREATE DATABASE YOUR_DATABASE_NAME;
USE YOUR_DATABASE_NAME;
CREATE TABLE `detallesdebe` (
  `id_debe` int(11) NOT NULL,
  `ID_Usuario` int(11) DEFAULT NULL,
  `Debe` varchar(255) DEFAULT NULL,
  `Total_Deuda` double DEFAULT NULL
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci;
CREATE TABLE `ejercicios` (
  `id_ejercicio` int(11) NOT NULL,
  `Nombre_Ejercicio` varchar(255) DEFAULT NULL,
  `Tipo_de_Ejercicio` varchar(255) DEFAULT NULL,
  `Nivel_del_Ejercicio` varchar(255) DEFAULT NULL,
  `Descripcion_ejercicio` varchar(255) DEFAULT NULL,
  `Imagen_Ejercicio` longblob DEFAULT NULL,
  `Imagen_Texto` varchar(255) NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci;
CREATE TABLE `enfermedades` (
  `id_enfermedad` int(11) NOT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `Enfermedades_Usuario` varchar(255) DEFAULT NULL
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci;
CREATE TABLE `entrenamientos` (
  `id_entrenamiento` int(11) NOT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `id_ejercicio` int(11) DEFAULT NULL,
  `id_Repeticiones` int(11) DEFAULT NULL,
  `id_Tiempos` int(11) DEFAULT NULL,
  `id_Series` int(11) DEFAULT NULL,
  `id_Rutinas` int(11) DEFAULT NULL,
  `id_debe` int(11) DEFAULT NULL,
  `Fecha_de_Entrenamiento` varchar(255) DEFAULT NULL
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci;
CREATE TABLE `informacion_fisica` (
  `id_informacion_fisica` int(11) NOT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `Peso_Usuario` double DEFAULT NULL,
  `Talla_Usuario` double DEFAULT NULL,
  `Perimetro_Usuario` double DEFAULT NULL,
  `IMC_Usuario` double DEFAULT NULL
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci;
CREATE TABLE `lesiones` (
  `id_lesion` int(11) NOT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `Lesiones_Usuario` varchar(255) DEFAULT NULL
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci;
CREATE TABLE `login` (
  `ID_Login` int(11) NOT NULL,
  `User` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci;
INSERT INTO
  `login` (`ID_Login`, `User`, `Password`)
VALUES
  (1, 'Admin', '$Admin#1234');
CREATE TABLE `medicamentos` (
    `id_medicamento` int(11) NOT NULL,
    `id_usuario` int(11) DEFAULT NULL,
    `Medicamentos_Usuario` varchar(255) DEFAULT NULL
  ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci;
CREATE TABLE `repeticiones` (
    `id_Repeticiones` int(11) NOT NULL,
    `ID_Usuario` int(11) DEFAULT NULL,
    `Repeticion_1` int(11) DEFAULT NULL,
    `Repeticion_2` int(11) DEFAULT NULL,
    `Repeticion_3` int(11) DEFAULT NULL,
    `Repeticion_4` int(11) DEFAULT NULL,
    `Repeticion_5` int(11) DEFAULT NULL,
    `Repeticion_6` int(11) DEFAULT NULL,
    `Repeticion_7` int(11) DEFAULT NULL,
    `Repeticion_8` int(11) DEFAULT NULL,
    `Repeticion_9` int(11) DEFAULT NULL,
    `Repeticion_10` int(11) DEFAULT NULL,
    `Repeticion_11` int(11) DEFAULT NULL,
    `Repeticion_12` int(11) DEFAULT NULL,
    `Repeticion_13` int(11) DEFAULT NULL,
    `Repeticion_14` int(11) DEFAULT NULL,
    `Repeticion_15` int(11) DEFAULT NULL
  ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci;
CREATE TABLE `revisiones_medicas` (
    `id_revision_medica` int(11) NOT NULL,
    `id_usuario` int(11) DEFAULT NULL,
    `Ultima_Revision_Medica_Usuario` varchar(255) DEFAULT NULL
  ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci;
CREATE TABLE `rutinas` (
    `id_Rutinas` int(11) NOT NULL,
    `ID_Usuario` int(11) DEFAULT NULL,
    `Ejercicio_1` varchar(255) DEFAULT NULL,
    `Ejercicio_2` varchar(255) DEFAULT NULL,
    `Ejercicio_3` varchar(255) DEFAULT NULL,
    `Ejercicio_4` varchar(255) DEFAULT NULL,
    `Ejercicio_5` varchar(255) DEFAULT NULL,
    `Ejercicio_6` varchar(255) DEFAULT NULL,
    `Ejercicio_7` varchar(255) DEFAULT NULL,
    `Ejercicio_8` varchar(255) DEFAULT NULL,
    `Ejercicio_9` varchar(255) DEFAULT NULL,
    `Ejercicio_10` varchar(255) DEFAULT NULL,
    `Ejercicio_11` varchar(255) DEFAULT NULL,
    `Ejercicio_12` varchar(255) DEFAULT NULL,
    `Ejercicio_13` varchar(255) DEFAULT NULL,
    `Ejercicio_14` varchar(255) DEFAULT NULL,
    `Ejercicio_15` varchar(255) DEFAULT NULL
  ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci;
CREATE TABLE `series` (
    `id_Series` int(11) NOT NULL,
    `ID_Usuario` int(11) DEFAULT NULL,
    `Serie_1` int(11) DEFAULT NULL,
    `Serie_2` int(11) DEFAULT NULL,
    `Serie_3` int(11) DEFAULT NULL
  ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci;
CREATE TABLE `tiempos` (
    `id_Tiempos` int(11) NOT NULL,
    `ID_Usuario` int(11) DEFAULT NULL,
    `Tiempo_1` int(11) DEFAULT NULL,
    `Tiempo_2` int(11) DEFAULT NULL,
    `Tiempo_3` int(11) DEFAULT NULL,
    `Tiempo_4` int(11) DEFAULT NULL,
    `Tiempo_5` int(11) DEFAULT NULL,
    `Tiempo_6` int(11) DEFAULT NULL,
    `Tiempo_7` int(11) DEFAULT NULL,
    `Tiempo_8` int(11) DEFAULT NULL,
    `Tiempo_9` int(11) DEFAULT NULL,
    `Tiempo_10` int(11) DEFAULT NULL,
    `Tiempo_11` int(11) DEFAULT NULL,
    `Tiempo_12` int(11) DEFAULT NULL,
    `Tiempo_13` int(11) DEFAULT NULL,
    `Tiempo_14` int(11) DEFAULT NULL,
    `Tiempo_15` int(11) DEFAULT NULL
  ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci;
CREATE TABLE `usuarios` (
    `id_usuario` int(11) NOT NULL,
    `ID_Login` int(11) DEFAULT NULL,
    `Nombre_Usuario` varchar(255) DEFAULT NULL,
    `Apellido_Usuario` varchar(255) DEFAULT NULL,
    `Fecha_Nacimiento_Usuario` varchar(255) DEFAULT NULL,
    `Telefono_Usuario` varchar(255) DEFAULT NULL,
    `Telefono_Emergencia_Usuario` varchar(255) DEFAULT NULL,
    `Objetivo_Usuario` varchar(255) DEFAULT NULL,
    `Tiene_Enfermedades_Usuario` varchar(255) DEFAULT NULL,
    `Consume_Medicamentos_Usuario` varchar(255) DEFAULT NULL,
    `Tiene_Lesiones_Usuario` varchar(255) DEFAULT NULL
  ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci;
ALTER TABLE
  `detallesdebe`
ADD
  PRIMARY KEY (`id_debe`),
ADD
  KEY `ID_Usuario` (`ID_Usuario`);
ALTER TABLE
  `ejercicios`
ADD
  PRIMARY KEY (`id_ejercicio`);
ALTER TABLE
  `enfermedades`
ADD
  PRIMARY KEY (`id_enfermedad`),
ADD
  KEY `id_usuario` (`id_usuario`);
ALTER TABLE
  `entrenamientos`
ADD
  PRIMARY KEY (`id_entrenamiento`),
ADD
  KEY `id_ejercicio` (`id_ejercicio`),
ADD
  KEY `id_Rutinas` (`id_Rutinas`),
ADD
  KEY `id_Series` (`id_Series`),
ADD
  KEY `id_Tiempos` (`id_Tiempos`),
ADD
  KEY `id_Repeticiones` (`id_Repeticiones`),
ADD
  KEY `id_debe` (`id_debe`),
ADD
  KEY `id_usuario` (`id_usuario`);
ALTER TABLE
  `informacion_fisica`
ADD
  PRIMARY KEY (`id_informacion_fisica`),
ADD
  KEY `id_usuario` (`id_usuario`);
ALTER TABLE
  `lesiones`
ADD
  PRIMARY KEY (`id_lesion`),
ADD
  KEY `id_usuario` (`id_usuario`);
ALTER TABLE
  `login`
ADD
  PRIMARY KEY (`ID_Login`);
ALTER TABLE
  `medicamentos`
ADD
  PRIMARY KEY (`id_medicamento`),
ADD
  KEY `id_usuario` (`id_usuario`);
ALTER TABLE
  `repeticiones`
ADD
  PRIMARY KEY (`id_Repeticiones`),
ADD
  KEY `ID_Usuario` (`ID_Usuario`);
ALTER TABLE
  `revisiones_medicas`
ADD
  PRIMARY KEY (`id_revision_medica`),
ADD
  KEY `id_usuario` (`id_usuario`);
ALTER TABLE
  `rutinas`
ADD
  PRIMARY KEY (`id_Rutinas`),
ADD
  KEY `ID_Usuario` (`ID_Usuario`);
ALTER TABLE
  `series`
ADD
  PRIMARY KEY (`id_Series`),
ADD
  KEY `ID_Usuario` (`ID_Usuario`);
ALTER TABLE
  `tiempos`
ADD
  PRIMARY KEY (`id_Tiempos`),
ADD
  KEY `ID_Usuario` (`ID_Usuario`);
ALTER TABLE
  `usuarios`
ADD
  PRIMARY KEY (`id_usuario`),
ADD
  KEY `ID_Login` (`ID_Login`);
ALTER TABLE
  `detallesdebe`
MODIFY
  `id_debe` int(11) NOT NULL AUTO_INCREMENT;
ALTER TABLE
  `ejercicios`
MODIFY
  `id_ejercicio` int(11) NOT NULL AUTO_INCREMENT;
ALTER TABLE
  `enfermedades`
MODIFY
  `id_enfermedad` int(11) NOT NULL AUTO_INCREMENT;
ALTER TABLE
  `entrenamientos`
MODIFY
  `id_entrenamiento` int(11) NOT NULL AUTO_INCREMENT;
ALTER TABLE
  `informacion_fisica`
MODIFY
  `id_informacion_fisica` int(11) NOT NULL AUTO_INCREMENT;
ALTER TABLE
  `lesiones`
MODIFY
  `id_lesion` int(11) NOT NULL AUTO_INCREMENT;
ALTER TABLE
  `login`
MODIFY
  `ID_Login` int(11) NOT NULL AUTO_INCREMENT,
  AUTO_INCREMENT = 3;
ALTER TABLE
  `medicamentos`
MODIFY
  `id_medicamento` int(11) NOT NULL AUTO_INCREMENT;
ALTER TABLE
  `repeticiones`
MODIFY
  `id_Repeticiones` int(11) NOT NULL AUTO_INCREMENT;
ALTER TABLE
  `revisiones_medicas`
MODIFY
  `id_revision_medica` int(11) NOT NULL AUTO_INCREMENT;
ALTER TABLE
  `rutinas`
MODIFY
  `id_Rutinas` int(11) NOT NULL AUTO_INCREMENT;
ALTER TABLE
  `series`
MODIFY
  `id_Series` int(11) NOT NULL AUTO_INCREMENT;
ALTER TABLE
  `tiempos`
MODIFY
  `id_Tiempos` int(11) NOT NULL AUTO_INCREMENT;
ALTER TABLE
  `usuarios`
MODIFY
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT;
ALTER TABLE
  `enfermedades`
ADD
  CONSTRAINT `enfermedades_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE
  `entrenamientos`
ADD
  CONSTRAINT `entrenamientos_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD
  CONSTRAINT `entrenamientos_ibfk_10` FOREIGN KEY (`id_Tiempos`) REFERENCES `tiempos` (`id_Tiempos`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD
  CONSTRAINT `entrenamientos_ibfk_11` FOREIGN KEY (`id_Repeticiones`) REFERENCES `repeticiones` (`id_Repeticiones`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD
  CONSTRAINT `entrenamientos_ibfk_12` FOREIGN KEY (`id_debe`) REFERENCES `detallesdebe` (`id_debe`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD
  CONSTRAINT `entrenamientos_ibfk_7` FOREIGN KEY (`id_ejercicio`) REFERENCES `ejercicios` (`id_ejercicio`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD
  CONSTRAINT `entrenamientos_ibfk_8` FOREIGN KEY (`id_Rutinas`) REFERENCES `rutinas` (`id_Rutinas`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD
  CONSTRAINT `entrenamientos_ibfk_9` FOREIGN KEY (`id_Series`) REFERENCES `series` (`id_Series`) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE
  `informacion_fisica`
ADD
  CONSTRAINT `informacion_fisica_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE
  `lesiones`
ADD
  CONSTRAINT `lesiones_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE
  `medicamentos`
ADD
  CONSTRAINT `medicamentos_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE
  `revisiones_medicas`
ADD
  CONSTRAINT `revisiones_medicas_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE
  `usuarios`
ADD
  CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`ID_Login`) REFERENCES `login` (`ID_Login`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;