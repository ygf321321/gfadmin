/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.8
Source Server Version : 80016
Source Host           : 192.168.1.8:3307
Source Database       : shirodemo

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2019-07-25 22:29:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for SysRole
-- ----------------------------
DROP TABLE IF EXISTS `SysRole`;
CREATE TABLE `SysRole` (
  `id` int(11) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `available` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of SysRole
-- ----------------------------
INSERT INTO `SysRole` VALUES ('1', 'admin', '管理', '1');
INSERT INTO `SysRole` VALUES ('2', 'vip', 'vip', '1');
