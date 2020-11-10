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
INSERT INTO `test` VALUES ('username11', 'password11', 'info11');
INSERT INTO `test` VALUES ('username12', 'password12', 'info12');
INSERT INTO `test` VALUES ('username13', 'password13', 'info13');
INSERT INTO `test` VALUES ('username14', 'password14', 'info14');
INSERT INTO `test` VALUES ('username15', 'password15', 'info15');
INSERT INTO `test` VALUES ('username16', 'password16', 'info16');
INSERT INTO `test` VALUES ('username17', 'password17', 'info17');
INSERT INTO `test` VALUES ('username18', 'password18', 'info18');
INSERT INTO `test` VALUES ('username19', 'password19', 'info19');
INSERT INTO `test` VALUES ('username20', 'password20', 'info20');
INSERT INTO `test` VALUES ('username21', 'password21', 'info21');
INSERT INTO `test` VALUES ('username22', 'password22', 'info22');
INSERT INTO `test` VALUES ('username23', 'password23', 'info23');
INSERT INTO `test` VALUES ('username24', 'password24', 'info24');
INSERT INTO `test` VALUES ('username25', 'password25', 'info25');
INSERT INTO `test` VALUES ('username26', 'password26', 'info26');
INSERT INTO `test` VALUES ('username27', 'password27', 'info27');
INSERT INTO `test` VALUES ('username28', 'password28', 'info28');
INSERT INTO `test` VALUES ('username29', 'password29', 'info29');
INSERT INTO `test` VALUES ('username30', 'password30', 'info30');
INSERT INTO `test` VALUES ('username31', 'password31', 'info31');
INSERT INTO `test` VALUES ('username32', 'password32', 'info32');
INSERT INTO `test` VALUES ('username33', 'password33', 'info33');
INSERT INTO `test` VALUES ('username34', 'password34', 'info34');
INSERT INTO `test` VALUES ('username35', 'password35', 'info35');
INSERT INTO `test` VALUES ('username36', 'password36', 'info36');
INSERT INTO `test` VALUES ('username37', 'password37', 'info37');
INSERT INTO `test` VALUES ('username38', 'password38', 'info38');
INSERT INTO `test` VALUES ('username39', 'password39', 'info39');
INSERT INTO `test` VALUES ('username40', 'password40', 'info40');
INSERT INTO `test` VALUES ('username41', 'password41', 'info41');
INSERT INTO `test` VALUES ('username42', 'password42', 'info42');
INSERT INTO `test` VALUES ('username43', 'password43', 'info43');
INSERT INTO `test` VALUES ('username44', 'password44', 'info44');
INSERT INTO `test` VALUES ('username45', 'password45', 'info45');
INSERT INTO `test` VALUES ('username46', 'password46', 'info46');
INSERT INTO `test` VALUES ('username47', 'password47', 'info47');
INSERT INTO `test` VALUES ('username48', 'password48', 'info48');
INSERT INTO `test` VALUES ('username49', 'password49', 'info49');
INSERT INTO `test` VALUES ('username50', 'password50', 'info50');
INSERT INTO `test` VALUES ('username51', 'password51', 'info51');
INSERT INTO `test` VALUES ('username52', 'password52', 'info52');
INSERT INTO `test` VALUES ('username53', 'password53', 'info53');
INSERT INTO `test` VALUES ('username54', 'password54', 'info54');
INSERT INTO `test` VALUES ('username55', 'password55', 'info55');
INSERT INTO `test` VALUES ('username56', 'password56', 'info56');
INSERT INTO `test` VALUES ('username57', 'password57', 'info57');
INSERT INTO `test` VALUES ('username58', 'password58', 'info58');
INSERT INTO `test` VALUES ('username59', 'password59', 'info59');
INSERT INTO `test` VALUES ('username60', 'password60', 'info60');
INSERT INTO `test` VALUES ('username61', 'password61', 'info61');
INSERT INTO `test` VALUES ('username62', 'password62', 'info62');
INSERT INTO `test` VALUES ('username63', 'password63', 'info63');
INSERT INTO `test` VALUES ('username64', 'password64', 'info64');
INSERT INTO `test` VALUES ('username65', 'password65', 'info65');
INSERT INTO `test` VALUES ('username66', 'password66', 'info66');
INSERT INTO `test` VALUES ('username67', 'password67', 'info67');
INSERT INTO `test` VALUES ('username68', 'password68', 'info68');
INSERT INTO `test` VALUES ('username69', 'password69', 'info69');
INSERT INTO `test` VALUES ('username70', 'password70', 'info70');
INSERT INTO `test` VALUES ('username71', 'password71', 'info71');
INSERT INTO `test` VALUES ('username72', 'password72', 'info72');
INSERT INTO `test` VALUES ('username73', 'password73', 'info73');
INSERT INTO `test` VALUES ('username74', 'password74', 'info74');
INSERT INTO `test` VALUES ('username75', 'password75', 'info75');
INSERT INTO `test` VALUES ('username76', 'password76', 'info76');
INSERT INTO `test` VALUES ('username77', 'password77', 'info77');
INSERT INTO `test` VALUES ('username78', 'password78', 'info78');
INSERT INTO `test` VALUES ('username79', 'password79', 'info79');
INSERT INTO `test` VALUES ('username80', 'password80', 'info80');
INSERT INTO `test` VALUES ('username81', 'password81', 'info81');
INSERT INTO `test` VALUES ('username82', 'password82', 'info82');
INSERT INTO `test` VALUES ('username83', 'password83', 'info83');
INSERT INTO `test` VALUES ('username84', 'password84', 'info84');
INSERT INTO `test` VALUES ('username85', 'password85', 'info85');
INSERT INTO `test` VALUES ('username86', 'password86', 'info86');
INSERT INTO `test` VALUES ('username87', 'password87', 'info87');
INSERT INTO `test` VALUES ('username88', 'password88', 'info88');
INSERT INTO `test` VALUES ('username89', 'password89', 'info89');
INSERT INTO `test` VALUES ('username90', 'password90', 'info90');
INSERT INTO `test` VALUES ('username91', 'password91', 'info91');
INSERT INTO `test` VALUES ('username92', 'password92', 'info92');
INSERT INTO `test` VALUES ('username93', 'password93', 'info93');
INSERT INTO `test` VALUES ('username94', 'password94', 'info94');
INSERT INTO `test` VALUES ('username95', 'password95', 'info95');
INSERT INTO `test` VALUES ('username96', 'password96', 'info96');
INSERT INTO `test` VALUES ('username97', 'password97', 'info97');
INSERT INTO `test` VALUES ('username98', 'password98', 'info98');
INSERT INTO `test` VALUES ('username99', 'password99', 'info99');
INSERT INTO `test` VALUES ('username100', 'password100', 'info100');
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
