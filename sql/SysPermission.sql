/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.8
Source Server Version : 80016
Source Host           : 192.168.1.8:3307
Source Database       : shirodemo

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2019-07-25 22:28:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for SysPermission
-- ----------------------------
DROP TABLE IF EXISTS `SysPermission`;
CREATE TABLE `SysPermission` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `resourceType` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `permission` varchar(255) DEFAULT NULL,
  `parentId` int(11) DEFAULT NULL,
  `parentIds` varchar(255) DEFAULT NULL,
  `available` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of SysPermission
-- ----------------------------
INSERT INTO `SysPermission` VALUES ('1', '用户管理', 'menu', 'userInfo/userList', 'userInfo:view', '0', '0/', '1');
INSERT INTO `SysPermission` VALUES ('2', '用户添加', 'button', 'userInfo/userAdd', 'userInfo:add', '1', '0/1', '1');
INSERT INTO `SysPermission` VALUES ('3', '用户删除', 'button', 'userInfo/userDel', 'userInfo:del', '1', '0/1', '1');
