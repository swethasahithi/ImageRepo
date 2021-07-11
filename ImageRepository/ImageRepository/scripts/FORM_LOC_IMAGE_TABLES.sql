CREATE TABLE `tbl_users` (
  `I_USER_ID` int NOT NULL,
  `VC_USERNAME` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `VC_PASSWORD` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`I_USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

INSERT INTO tbl_users VALUES (1, 'USER1', 'PASS1');
INSERT INTO tbl_users VALUES (2, 'USER2', 'PASS2');
INSERT INTO tbl_users VALUES (3, 'USER3', 'PASS3');
INSERT INTO tbl_users VALUES (4, 'USER4', 'PASS4');
INSERT INTO tbl_users VALUES (5, 'USER5', 'PASS5');
INSERT INTO tbl_users VALUES (6, 'USER6', 'PASS6');
INSERT INTO tbl_users VALUES (7, 'USER7', 'PASS7');

CREATE TABLE `location_table` (
  `loc_id` int NOT NULL AUTO_INCREMENT,
  `loc_name` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `loc_address` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `loc_state` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `loc_pincode` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`loc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


INSERT INTO `image_repo`.`location_table`
VALUES (1, 'DSNR', NULL, 'Telangana', '500060');

INSERT INTO `image_repo`.`location_table`
VALUES (2, 'Shamshabad', NULL, 'Telangana', '500018');

INSERT INTO `image_repo`.`location_table`
VALUES (3, 'Others', NULL, 'Telangana', '500021');


CREATE TABLE `image_details` (
  `img_id` int NOT NULL AUTO_INCREMENT,
  `img_desc` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `img_grp` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`img_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

INSERT INTO `image_repo`.`image_details`
VALUES
(1, 'Description1', 'Group1');

INSERT INTO `image_repo`.`image_details`
VALUES
(2, 'Description2', 'Group2');

INSERT INTO `image_repo`.`image_details`
VALUES
(3, 'Description3', 'Group3');

CREATE TABLE `form_details` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `loc_id` int DEFAULT NULL,
  `I_USER_ID` int DEFAULT NULL,
  `designation` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `rice_variety` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `duration` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `crop_stage` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `img_id` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `submit_date` date DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `fk_loc_id_idx` (`loc_id`),
  KEY `k_usr_id_idx` (`I_USER_ID`),
  CONSTRAINT `fk_loc_id` FOREIGN KEY (`loc_id`) REFERENCES `location_table` (`loc_id`),
  CONSTRAINT `fk_usr_id` FOREIGN KEY (`I_USER_ID`) REFERENCES `tbl_users` (`I_USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

INSERT INTO `image_repo`.`form_details`
VALUES (1, 1,1,'PS','XY','100','stage1',1,'2021-10-10');
INSERT INTO `image_repo`.`form_details`
VALUES (2, 2,1,'PS','XY','200','stage2',1,'2021-10-10');
INSERT INTO `image_repo`.`form_details`
VALUES (3, 1,2,'PS','XY','100','stage3',2,'2021-10-10');
