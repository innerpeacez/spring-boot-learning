SET MODE MySQL;
CREATE TABLE IF NOT EXISTS `top.ipzgo.spring.ioc.lookup.test`(
   `id` INT UNSIGNED AUTO_INCREMENT,
   `title` VARCHAR(100) NOT NULL,
   `author` VARCHAR(40) NOT NULL,
   `date` DATE,
   PRIMARY KEY ( `id` )
);