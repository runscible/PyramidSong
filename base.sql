CREATE TABLE `ABM`.`Empleados` ( `ID` INT NOT NULL AUTO_INCREMENT , `Nombre` VARCHAR(100) NOT NULL , `Sueldo` FLOAT(30) NOT NULL , `Fecha` TIMESTAMP on update CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , PRIMARY KEY (`ID`)) ENGINE = InnoDB;