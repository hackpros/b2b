/*
Navicat MySQL Data Transfer

Source Server         : bae
Source Server Version : 50614
Source Host           : localhost:3306
Source Database       : b2b-activity

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2016-07-01 19:01:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `activity`
-- ----------------------------
DROP TABLE IF EXISTS `activity`;
CREATE TABLE `activity` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '序列@',
  `creatBy` bigint(9) NOT NULL COMMENT '创建人',
  `platformCode` bigint(9) NOT NULL COMMENT '平台编码',
  `name` varchar(64) NOT NULL COMMENT '名称',
  `theme` varchar(128) NOT NULL COMMENT '主题',
  `content` varchar(255) DEFAULT NULL COMMENT '内容',
  `status` int(3) DEFAULT '0' COMMENT '状态1:启用;2:停用;3结束',
  `beginTime` datetime NOT NULL COMMENT '开始时间',
  `endTime` datetime DEFAULT NULL COMMENT '结束时间',
  `weight` bigint(9) DEFAULT NULL COMMENT '优先级',
  `giftId` bigint(9) NOT NULL COMMENT '礼物Id',
  `giftName` varchar(32) NOT NULL COMMENT '礼物名称',
  `creatTime` datetime NOT NULL COMMENT '创建时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动表';

-- ----------------------------
-- Records of activity
-- ----------------------------

-- ----------------------------
-- Table structure for `activity_attr`
-- ----------------------------
DROP TABLE IF EXISTS `activity_attr`;
CREATE TABLE `activity_attr` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '序列',
  `parentId` bigint(9) NOT NULL COMMENT '活动Id',
  `activityImg` varchar(255) DEFAULT NULL COMMENT '活动图片',
  `giftId` bigint(9) NOT NULL COMMENT '礼物Id',
  `giftName` varchar(32) NOT NULL COMMENT '礼物名称',
  `shareTitle` varchar(32) DEFAULT NULL COMMENT '分享标题',
  `shareUrl` varchar(128) DEFAULT NULL COMMENT '分享地址',
  `simg` varchar(255) DEFAULT NULL COMMENT '图片',
  `limg` varchar(255) DEFAULT NULL COMMENT '小图片',
  `lowestImg` varchar(255) DEFAULT NULL COMMENT 'logo',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动属性';

-- ----------------------------
-- Records of activity_attr
-- ----------------------------

-- ----------------------------
-- Table structure for `dict`
-- ----------------------------
DROP TABLE IF EXISTS `dict`;
CREATE TABLE `dict` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `parentId` bigint(9) NOT NULL COMMENT '父节点',
  `ladder` char(1) NOT NULL COMMENT '树阶',
  `itemCode` varchar(32) NOT NULL COMMENT '选项名称',
  `itemComment` varchar(32) DEFAULT NULL COMMENT '选项描述',
  `status` int(3) NOT NULL COMMENT '状态@停用:1|启用:0',
  `keyCode` varchar(32) DEFAULT NULL COMMENT '编码',
  `keyVal` varchar(32) DEFAULT NULL COMMENT '值',
  `sqrt` bigint(5) DEFAULT NULL COMMENT '排序',
  `appendBy` bigint(9) DEFAULT NULL COMMENT '创建人',
  `appendTime` datetime DEFAULT NULL COMMENT '创建时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `refactorCode` varchar(32) DEFAULT NULL COMMENT '引用编码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='数据字典';

-- ----------------------------
-- Records of dict
-- ----------------------------

-- ----------------------------
-- Table structure for `gift`
-- ----------------------------
DROP TABLE IF EXISTS `gift`;
CREATE TABLE `gift` (
  `ID` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '序列@',
  `name` varchar(64) NOT NULL COMMENT '名称',
  `status` int(3) NOT NULL COMMENT '状态@1:启用;2:停用',
  `categoryCode` varchar(32) NOT NULL COMMENT '类别编码',
  `cycle` int(3) DEFAULT NULL COMMENT '有效果期@从获得时开始',
  `value` bigint(9) DEFAULT NULL COMMENT '价值@',
  `unitCode` varchar(32) NOT NULL COMMENT '计量单位@',
  `userWay` int(3) DEFAULT NULL COMMENT '使用方式@1:直接领取;2:手工领取;3:赠送',
  `locked` char(1) DEFAULT NULL COMMENT '锁定@true.false,上线后不可更改',
  `businessCode` varchar(32) NOT NULL COMMENT '业务编码',
  `thiredBusCode` varchar(32) DEFAULT NULL COMMENT '第三方业务编码',
  `deficitNum` bigint(9) DEFAULT NULL COMMENT '总数',
  `stockNum` bigint(9) DEFAULT NULL COMMENT '可用数量',
  `createBy` bigint(9) DEFAULT NULL COMMENT '创建人',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  `srcCode` bigint(9) NOT NULL COMMENT '来源',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`),
  KEY `AK_Key_2` (`ID`,`name`,`status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='奖励';

-- ----------------------------
-- Records of gift
-- ----------------------------

-- ----------------------------
-- Table structure for `gift_attr`
-- ----------------------------
DROP TABLE IF EXISTS `gift_attr`;
CREATE TABLE `gift_attr` (
  `ID` bigint(9) NOT NULL COMMENT '序列@',
  `giftId` bigint(9) DEFAULT NULL COMMENT '礼物ID',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='奖励属性表';

-- ----------------------------
-- Records of gift_attr
-- ----------------------------

-- ----------------------------
-- Table structure for `gift_category`
-- ----------------------------
DROP TABLE IF EXISTS `gift_category`;
CREATE TABLE `gift_category` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(128) DEFAULT NULL COMMENT '名称',
  `code` varchar(32) DEFAULT NULL COMMENT '编码',
  `parentId` bigint(5) DEFAULT NULL COMMENT '父节点',
  `status` int(3) DEFAULT NULL COMMENT '状态',
  `level` int(3) DEFAULT NULL COMMENT '级别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='奖励类别 ';

-- ----------------------------
-- Records of gift_category
-- ----------------------------

-- ----------------------------
-- Table structure for `user_ewallet`
-- ----------------------------
DROP TABLE IF EXISTS `user_ewallet`;
CREATE TABLE `user_ewallet` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键@',
  `userId` bigint(9) NOT NULL COMMENT '用户id',
  `platformCode` bigint(9) NOT NULL COMMENT '平台编码',
  `userName` varchar(32) DEFAULT NULL COMMENT '用户名',
  `userMobile` varchar(32) DEFAULT NULL COMMENT '手机号',
  `balance` bigint(9) NOT NULL DEFAULT '0' COMMENT '余额(单位是分)',
  `lastTakenBalance` bigint(9) DEFAULT NULL COMMENT '上次取款金额',
  `lastTakenTime` datetime DEFAULT NULL COMMENT '上次取款时间',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `lastTakenAcc` varchar(32) DEFAULT NULL COMMENT '上次取款账号',
  `status` int(3) NOT NULL COMMENT '状态@',
  `locked` char(1) NOT NULL COMMENT '锁定＠锁定后不能提款',
  `lockTime` datetime DEFAULT NULL COMMENT '锁定时间',
  `unlockTime` datetime DEFAULT NULL COMMENT '解锁时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户现金钱包';

-- ----------------------------
-- Records of user_ewallet
-- ----------------------------

-- ----------------------------
-- Table structure for `user_ewallet_log`
-- ----------------------------
DROP TABLE IF EXISTS `user_ewallet_log`;
CREATE TABLE `user_ewallet_log` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userId` bigint(9) NOT NULL COMMENT '创建时间',
  `userName` varchar(32) DEFAULT NULL COMMENT '用户名',
  `platformCode` bigint(9) NOT NULL COMMENT '平台编码',
  `initiatorId` bigint(9) DEFAULT NULL COMMENT '发起人Id\r\n            发起者',
  `initiatorName` varchar(32) DEFAULT NULL COMMENT '发起者姓名',
  `statement` varchar(255) DEFAULT NULL COMMENT '陈述',
  `amount` bigint(9) NOT NULL COMMENT '交易金额',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `typeCode` varchar(32) NOT NULL COMMENT '类型编码',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资金记录';

-- ----------------------------
-- Records of user_ewallet_log
-- ----------------------------

-- ----------------------------
-- Table structure for `user_gift`
-- ----------------------------
DROP TABLE IF EXISTS `user_gift`;
CREATE TABLE `user_gift` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userId` bigint(9) NOT NULL COMMENT '用户业务ID',
  `platformCode` bigint(9) NOT NULL COMMENT '平台来源',
  `userName` varchar(64) NOT NULL COMMENT '用户名',
  `mobile` varchar(32) DEFAULT NULL COMMENT '手机号',
  `srcBizId` bigint(9) NOT NULL COMMENT '礼物来源的业务ID',
  `srcBizName` varchar(64) NOT NULL COMMENT '礼物来源名称@活动,个人',
  `overdueTime` datetime DEFAULT NULL COMMENT '过期时间',
  `status` int(3) DEFAULT NULL COMMENT '状态@0:默认;1:未领取，2:领取中;3:已领取,4:已使用;5:已过期(第三方的礼物会有第二中状态)',
  `creatBy` bigint(9) NOT NULL COMMENT '创建人@可能是系统，也可以是人',
  `creattime` datetime NOT NULL COMMENT '创建时间',
  `gitName` varchar(32) NOT NULL COMMENT '礼物名称',
  `amount` bigint(9) NOT NULL COMMENT '价值',
  `giftBizCode` varchar(32) NOT NULL COMMENT '礼物业务编码',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户礼物表';

-- ----------------------------
-- Records of user_gift
-- ----------------------------

-- ----------------------------
-- Table structure for `user_gift_log`
-- ----------------------------
DROP TABLE IF EXISTS `user_gift_log`;
CREATE TABLE `user_gift_log` (
  `ID_` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userId` bigint(9) NOT NULL COMMENT '创建时间',
  `userName` varchar(32) DEFAULT NULL COMMENT '用户名',
  `platformCode` bigint(9) NOT NULL COMMENT '修改时间',
  `initiatorId` bigint(9) DEFAULT NULL COMMENT '发起人Id\r\n            发起者',
  `initiatorName` varchar(32) DEFAULT NULL COMMENT '发起者姓名',
  `statement` varchar(255) NOT NULL COMMENT '陈述',
  `amount` bigint(9) DEFAULT NULL COMMENT '价值',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  `typeCode` varchar(32) DEFAULT NULL COMMENT '类型编码',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='礼物日志表';

-- ----------------------------
-- Records of user_gift_log
-- ----------------------------
