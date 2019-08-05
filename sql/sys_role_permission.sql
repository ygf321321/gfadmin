/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.8
Source Server Version : 80016
Source Host           : 192.168.1.8:3307
Source Database       : gfadmin

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2019-08-05 23:20:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'ID',
  `rid` varchar(32) DEFAULT NULL,
  `pid` varchar(32) DEFAULT NULL,
  `insert_uid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '创建人ID',
  `insert_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_uid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '最后更新人ID',
  `update_time` datetime DEFAULT NULL COMMENT '最后更新时间',
  `version` int(11) DEFAULT NULL COMMENT '版本',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------
