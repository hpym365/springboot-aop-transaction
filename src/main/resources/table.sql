CREATE TABLE `tb_hospital` (
  `hospital_id` int(11) NOT NULL AUTO_INCREMENT,
  `hospital_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`hospital_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;
