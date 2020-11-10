/*
 Navicat Premium Data Transfer

 Source Server         : localhost-mysql
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 10/11/2020 13:40:36
*/

-- 创建数据库 demo
create database `demo` default character set utf8 collate utf8_general_ci;
 
use demo;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;


-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `username` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test
-- ----------------------------
BEGIN;
INSERT INTO `test` VALUES ('username1', 'password1', 'info1');
INSERT INTO `test` VALUES ('username2', 'password2', 'info2');
INSERT INTO `test` VALUES ('username3', 'password3', 'info3');
INSERT INTO `test` VALUES ('username4', 'password4', 'info4');
INSERT INTO `test` VALUES ('username5', 'password5', 'info5');
INSERT INTO `test` VALUES ('username6', 'password6', 'info6');
INSERT INTO `test` VALUES ('username7', 'password7', 'info7');
INSERT INTO `test` VALUES ('username8', 'password8', 'info8');
INSERT INTO `test` VALUES ('username9', 'password9', 'info9');
INSERT INTO `test` VALUES ('username10', 'password10', 'info10');
COMMIT;

-- ----------------------------
-- Procedure structure for proc_01
-- ----------------------------
DROP PROCEDURE IF EXISTS `proc_01`;
delimiter ;;
CREATE PROCEDURE `proc_01`(IN count int)
begin
    declare i int;
    set i = 0;
    loop_lable: loop
        set i = i+1;
        insert into test(username, password, info)
            VALUES (concat('username',i),
                concat('password',i),
                concat('info',i));
        if i>=count then
            leave loop_lable;
        end if;
    end loop;
end
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
