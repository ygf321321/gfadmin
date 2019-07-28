/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.8
Source Server Version : 80016
Source Host           : 192.168.1.8:3307
Source Database       : shirodemo

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2019-07-25 22:29:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for SysUserRole
-- ----------------------------
DROP TABLE IF EXISTS `SysUserRole`;
CREATE TABLE `SysUserRole` (
  `uid` int(11) DEFAULT NULL,
  `rid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of SysUserRole
-- ----------------------------
INSERT INTO `SysUserRole` VALUES ('1', '1');
INSERT INTO `SysUserRole` VALUES ('1', '2');
