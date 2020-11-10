/*
 Navicat Premium Data Transfer

 Source Server         : localhost-mysql
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : redis_bloomfilter

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 12/10/2020 00:59:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `myuser`;
CREATE TABLE `myuser` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `name` varchar(255) NOT NULL COMMENT '模拟数据',
  PRIMARY KEY (`id`),
  KEY `name_idx` (`name`) USING BTREE COMMENT 'name索引'
) ENGINE=InnoDB AUTO_INCREMENT=1000001 DEFAULT CHARSET=utf8;

CREATE PROCEDURE insert_datas(IN count_insert INT)
BEGIN
	DECLARE my_name VARCHAR(20);
	DECLARE i INT DEFAULT(1);
	-- insert datas
	WHILE i <= count_insert DO
		SET my_name = CONCAT('name_',i);
		INSERT INTO `myuser` VALUES(i,my_name);
		SET i = i + 1;
		END WHILE;
END;

# 插入100万条数据 (insert 1 million datas)
CALL `insert_datas(1000000)`;