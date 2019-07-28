/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.8
Source Server Version : 80016
Source Host           : 192.168.1.8:3307
Source Database       : shirodemo

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2019-07-25 22:29:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for SysRolePermission
-- ----------------------------
DROP TABLE IF EXISTS `SysRolePermission`;
CREATE TABLE `SysRolePermission` (
  `rid` int(11) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of SysRolePermission
-- ----------------------------
INSERT INTO `SysRolePermission` VALUES ('1', '1');
INSERT INTO `SysRolePermission` VALUES ('1', '2');
