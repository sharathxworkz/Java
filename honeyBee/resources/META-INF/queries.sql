CREATE SCHEMA `resort` ;

CREATE TABLE `resort`.`resort_info` (
  `rId` INT NOT NULL,
  `resortName` VARCHAR(45) NOT NULL,
  `location` VARCHAR(45) NULL,
  `checkInTime` DATETIME NULL,
  `checkOutTime` DATETIME NULL,
  `createdBy` VARCHAR(45) NULL,
  `createDate` DATE NULL,
  `updateDate` DATE NULL,
  `owner` VARCHAR(45) NULL,
  `pricePerDay` DOUBLE NULL,
  PRIMARY KEY (`rId`));