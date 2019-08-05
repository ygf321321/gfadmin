/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.8
Source Server Version : 80016
Source Host           : 192.168.1.8:3307
Source Database       : gfadmin

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2019-08-05 23:20:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(32) NOT NULL COMMENT 'ID',
  `username` varchar(255) DEFAULT NULL COMMENT '用户账号',
  `nickname` varchar(255) DEFAULT NULL COMMENT '姓名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `state` varchar(2) DEFAULT NULL COMMENT '是否有效',
  `mobile` varchar(255) DEFAULT NULL COMMENT '电话',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `insert_uid` varchar(32) DEFAULT NULL COMMENT '创建人ID',
  `insert_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_uid` varchar(32) DEFAULT NULL COMMENT '最后更新人ID',
  `update_time` datetime DEFAULT NULL COMMENT '最后更新时间',
  `version` int(11) DEFAULT NULL COMMENT '版本',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', '管理员', '928bfd2577490322a6e19b793691467e', null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('451b79a7d9c825d98d8bfaef88944d11', 'ygf', '石头1', '52e718994df8230e072b1d130d47b038', null, '11326541', 'dd@qq.com', null, null, null, null, null, '0');
