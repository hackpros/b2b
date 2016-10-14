/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50550
Source Host           : localhost:3306
Source Database       : base

Target Server Type    : MYSQL
Target Server Version : 50550
File Encoding         : 65001

Date: 2016-10-21 20:31:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `appraise`
-- ----------------------------
DROP TABLE IF EXISTS `appraise`;
CREATE TABLE `appraise` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `head` varchar(255) DEFAULT NULL,
  `code` varchar(16) DEFAULT NULL,
  `img1` varchar(255) DEFAULT '图片1',
  `img2` varchar(255) DEFAULT '图片2',
  `img3` varchar(255) DEFAULT '图片3',
  `contant` varchar(255) DEFAULT '个人介绍',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `sort_inex` int(11) DEFAULT NULL COMMENT '排序字段',
  `good` int(11) DEFAULT NULL COMMENT '差评',
  `better` int(11) DEFAULT NULL COMMENT '一般',
  `best` int(11) DEFAULT NULL COMMENT '满意',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of appraise
-- ----------------------------
INSERT INTO `appraise` VALUES ('2', '范申瑜', 'head/head_1.jpg', '科员', 'media/image/image2.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '1', '2');
INSERT INTO `appraise` VALUES ('3', '何兰木', 'head/head_2.jpg', '科员', 'media/image/image3.jpg', '图片2', '图片3', '个人介绍', null, null, '1', '1', '1');
INSERT INTO `appraise` VALUES ('4', '华松', 'head/head_3.jpg', '科员', 'media/image/image4.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '14');
INSERT INTO `appraise` VALUES ('5', '黄静', 'head/head_4.jpg', '科员', 'media/image/image1.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '0');
INSERT INTO `appraise` VALUES ('6', '赖瑞', 'head/head_5.jpg', '科员', 'media/image/image2.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '13');
INSERT INTO `appraise` VALUES ('7', '李菲', 'head/head_6.jpg', '科员', 'media/image/image3.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '0');
INSERT INTO `appraise` VALUES ('8', '李梦璇', 'head/head_7.jpg', '科员', 'media/image/image4.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '0');
INSERT INTO `appraise` VALUES ('9', '梁彩虹', 'head/head_8.jpg', '科员', 'media/image/image1.jpg', '图片2', '图片3', '个人介绍', null, '0', '0', '1', '11');
INSERT INTO `appraise` VALUES ('10', '田晓冬', 'head/head_9.jpg', '科员', 'media/image/image1.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '0');
INSERT INTO `appraise` VALUES ('11', '王丹', 'head/head_10.jpg', '科员', 'media/image/image1.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '0');
INSERT INTO `appraise` VALUES ('12', '王仁珍', 'head/head_11.jpg', '科员', 'media/image/image1.jpg', '图片2', '图片3', '个人介绍', null, null, '1', '0', '1');
INSERT INTO `appraise` VALUES ('13', '杨庶弘', 'head/head_12.jpg', '科员', 'media/image/image1.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '0');
INSERT INTO `appraise` VALUES ('14', '杨忠叶', 'head/head_13.jpg', '科员', 'media/image/image1.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '0');
INSERT INTO `appraise` VALUES ('15', '张晶', 'head/head_14.jpg', '科员', 'media/image/image1.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '0');
INSERT INTO `appraise` VALUES ('16', '张勤', 'head/head_15.jpg', '科员', 'media/image/image1.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '1', '0');
INSERT INTO `appraise` VALUES ('17', '赵远涛', 'head/head_16.jpg', '科员', 'media/image/image1.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '5', '1');
INSERT INTO `appraise` VALUES ('18', '小朱雕', 'head/head_17.jpg', '科员', '图片1', '图片2', '图片3', '个人介绍', '2016-10-15', null, '0', '0', '0');
INSERT INTO `appraise` VALUES ('19', '好员工', 'head/head_18.jpg', '科员', '图片1', '图片2', '图片3', '个人介绍', '2016-10-15', null, '0', '0', '0');
