# Para utilização do banco coloque o usuário: root, e senha: Unisul@1520
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema bd_emprestimo
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bd_emprestimo
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bd_emprestimo` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `bd_emprestimo` ;

-- -----------------------------------------------------
-- Table `bd_emprestimo`.`tb_amigo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_emprestimo`.`tb_amigo` (
  `id_amigo` INT NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `telefone` VARCHAR(11) NOT NULL,
  PRIMARY KEY (`id_amigo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_emprestimo`.`tb_ferramenta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_emprestimo`.`tb_ferramenta` (
  `id_ferramenta` INT NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `marca` VARCHAR(45) NOT NULL,
  `custo` FLOAT NOT NULL,
  PRIMARY KEY (`id_ferramenta`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_emprestimo`.`tb_emprestimo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_emprestimo`.`tb_emprestimo` (
  `id_emprestimo` INT NOT NULL,
  `data_emprestimo` DATE NULL,
  `data_devolucao` DATE NULL,
  `tb_amigo_id_amigo` INT NOT NULL,
  `tb_ferramenta_id_ferramenta` INT NOT NULL,
  PRIMARY KEY (`id_emprestimo`, `tb_amigo_id_amigo`, `tb_ferramenta_id_ferramenta`),
  INDEX `fk_tb_emprestimo_tb_amigo_idx` (`tb_amigo_id_amigo` ASC) VISIBLE,
  INDEX `fk_tb_emprestimo_tb_ferramenta1_idx` (`tb_ferramenta_id_ferramenta` ASC) VISIBLE,
  CONSTRAINT `fk_tb_emprestimo_tb_amigo`
    FOREIGN KEY (`tb_amigo_id_amigo`)
    REFERENCES `bd_emprestimo`.`tb_amigo` (`id_amigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_emprestimo_tb_ferramenta1`
    FOREIGN KEY (`tb_ferramenta_id_ferramenta`)
    REFERENCES `bd_emprestimo`.`tb_ferramenta` (`id_ferramenta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
