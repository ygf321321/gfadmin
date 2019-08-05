/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.8
Source Server Version : 80016
Source Host           : 192.168.1.8:3307
Source Database       : gfadmin

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2019-08-05 23:06:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'ID',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `pid` varchar(32) DEFAULT NULL,
  `zindex` int(11) DEFAULT NULL COMMENT '排序',
  `type` varchar(5) DEFAULT NULL COMMENT '分类',
  `code` varchar(50) DEFAULT NULL COMMENT '编码',
  `descrpt` varchar(255) DEFAULT NULL COMMENT '描述',
  `icon` varchar(255) DEFAULT NULL COMMENT '图标样式',
  `url` varchar(255) DEFAULT NULL,
  `path` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `insert_uid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '创建人ID',
  `insert_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_uid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '最后更新人ID',
  `update_time` datetime DEFAULT NULL COMMENT '最后更新时间',
  `version` int(11) DEFAULT NULL COMMENT '版本',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES ('1', '组织管理', '0', '1', null, 'orgManage', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_permission` VALUES ('2', '用户管理', '1', '2', null, 'userManage', null, null, null, null, null, null, null, null, null, null);
