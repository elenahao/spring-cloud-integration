CREATE TABLE `sc`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `username` VARCHAR(45) NOT NULL COMMENT '用户名',
  `password` VARCHAR(45) NULL COMMENT '密码',
  PRIMARY KEY (`id`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COMMENT = '用户表';