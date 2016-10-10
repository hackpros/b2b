/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50614
Source Host           : localhost:3306
Source Database       : base

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2016-10-10 21:13:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `appraise_detail`
-- ----------------------------
DROP TABLE IF EXISTS `appraise_detail`;
CREATE TABLE `appraise_detail` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT,
  `sid` varchar(32) DEFAULT NULL,
  `name` varchar(16) DEFAULT NULL,
  `code` varchar(255) DEFAULT '图片1',
  `appraiseType` varchar(255) DEFAULT '图片2',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of appraise_detail
-- ----------------------------
INSERT INTO `appraise_detail` VALUES ('25', 'test', '叶孤城', 'S1003', 'best', '2016-10-09 00:00:00');
INSERT INTO `appraise_detail` VALUES ('26', 'test', '神刀门', 'S1005', 'best', '2016-10-10 00:00:00');
INSERT INTO `appraise_detail` VALUES ('27', 'test', '萧别离', 'S1008', 'best', '2016-10-10 00:00:00');
INSERT INTO `appraise_detail` VALUES ('28', 'test', 'aa', 'S444', 'better', '2016-10-10 00:00:00');
INSERT INTO `appraise_detail` VALUES ('29', 'test', '马空群', 'S1008', 'best', '2016-10-10 00:00:00');
INSERT INTO `appraise_detail` VALUES ('30', 'test', '萧别离', 'S1008', 'best', '2016-10-10 00:00:00');
INSERT INTO `appraise_detail` VALUES ('31', 'test', '万万堂', 'S1004', 'best', '2016-10-10 19:16:12');
