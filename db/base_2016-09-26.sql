/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50550
Source Host           : localhost:3306
Source Database       : base

Target Server Type    : MYSQL
Target Server Version : 50550
File Encoding         : 65001

Date: 2016-09-26 01:22:43
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
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of appraise
-- ----------------------------
INSERT INTO `appraise` VALUES ('1', '张小光', 'head/0923_2.jpg', 'S1002', 'media/image/image1.jpg', '图片2', '图片3', '个人介绍', '2016-09-07', '0', '1', '1', '0');
INSERT INTO `appraise` VALUES ('2', '叶孤城', 'head/0923_2.jpg', 'S1003', 'media/image/image2.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '1', '2');
INSERT INTO `appraise` VALUES ('3', '万万堂', 'head/0923_2.jpg', 'S1004', 'media/image/image3.jpg', '图片2', '图片3', '个人介绍', null, null, '1', '0', '1');
INSERT INTO `appraise` VALUES ('4', '神刀门', 'head/0923_2.jpg', 'S1005', 'media/image/image4.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '0');
INSERT INTO `appraise` VALUES ('5', '飞天蜘蛛', 'head/0923_2.jpg', 'S1006', 'media/image/image1.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '0');
INSERT INTO `appraise` VALUES ('6', '幕容明珠', 'head/0923_2.jpg', 'S1007', 'media/image/image2.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '1');
INSERT INTO `appraise` VALUES ('7', '白天羽', 'head/0923_2.jpg', 'S1008', 'media/image/image3.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '0');
INSERT INTO `appraise` VALUES ('8', '花寒衣', 'head/0923_2.jpg', 'S1008', 'media/image/image4.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '0');
INSERT INTO `appraise` VALUES ('9', '花无期', 'head/0923_2.jpg', 'S1008', 'media/image/image1.jpg', '图片2', '图片3', '个人介绍', null, '0', '0', '0', '0');
INSERT INTO `appraise` VALUES ('10', '花白凤', 'head/0923_2.jpg', 'S1008', 'media/image/image1.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '0');
INSERT INTO `appraise` VALUES ('11', '马芳玲', 'head/0923_2.jpg', 'S1008', 'media/image/image1.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '0');
INSERT INTO `appraise` VALUES ('12', '荆无命', 'head/0923_2.jpg', 'S1008', 'media/image/image1.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '0');
INSERT INTO `appraise` VALUES ('13', '小李飞刀', 'head/0923_2.jpg', 'S1008', 'media/image/image1.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '0');
INSERT INTO `appraise` VALUES ('14', '路小佳', 'head/0923_2.jpg', 'S1008', 'media/image/image1.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '0');
INSERT INTO `appraise` VALUES ('15', '马空群', 'head/0923_2.jpg', 'S1008', 'media/image/image1.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '0');
INSERT INTO `appraise` VALUES ('16', '萧别离', 'head/0923_2.jpg', 'S1008', 'media/image/image1.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '0', '0');
INSERT INTO `appraise` VALUES ('17', '叶开', 'head/0923_2.jpg', 'S1008', 'media/image/image1.jpg', '图片2', '图片3', '个人介绍', null, null, '0', '5', '0');

-- ----------------------------
-- Table structure for `auth_fun`
-- ----------------------------
DROP TABLE IF EXISTS `auth_fun`;
CREATE TABLE `auth_fun` (
  `ID_` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '序列@',
  `CODE_` varchar(32) NOT NULL COMMENT '编码|要求唯一@',
  `NAME_` varchar(32) NOT NULL COMMENT '权限名@',
  `DESC_` varchar(128) DEFAULT NULL COMMENT '权限描述',
  `MODEL_CODE` varchar(32) NOT NULL COMMENT '模块ID',
  `SELF_CODE` varchar(16) DEFAULT NULL COMMENT '自己',
  `REQUEST_URL` varchar(255) NOT NULL COMMENT 'URL@',
  `SORT_` int(3) DEFAULT NULL COMMENT '排序@',
  `STATUS_` int(3) DEFAULT NULL COMMENT '状态@0:停用|1:启用',
  `APPEND_BY` bigint(18) DEFAULT NULL COMMENT '创建人@',
  `APPEND_TIME` datetime DEFAULT NULL COMMENT '创建时间@',
  `MODIFY_BY` bigint(18) DEFAULT NULL COMMENT '修改人',
  `MODIFY_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `REMARK_` varchar(1024) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB AUTO_INCREMENT=863 DEFAULT CHARSET=utf8 COMMENT='功能权限';

-- ----------------------------
-- Records of auth_fun
-- ----------------------------
INSERT INTO `auth_fun` VALUES ('560', 'doDelete', '删除动作', null, 'M001', 'authFun', 'auther/authFun/doDelete', '6', '0', '1', '2014-10-21 14:00:02', '1', '2014-10-21 14:00:02', null);
INSERT INTO `auth_fun` VALUES ('561', 'doModify', '修改动作', null, 'M001', 'authFun', 'auther/authFun/doModify', '5', '0', '1', '2014-10-21 14:00:02', '1', '2014-10-21 14:00:02', null);
INSERT INTO `auth_fun` VALUES ('562', 'modify', '修改页面', null, 'M001', 'authFun', 'auther/authFun/modify', '4', '0', '1', '2014-10-21 14:00:02', '1', '2014-10-21 14:00:02', null);
INSERT INTO `auth_fun` VALUES ('563', 'doAppend', '添加动作', null, 'M001', 'authFun', 'auther/authFun/doAppend', '3', '0', '1', '2014-10-21 14:00:02', '1', '2014-10-21 14:00:02', null);
INSERT INTO `auth_fun` VALUES ('564', 'append', '添加页面', null, 'M001', 'authFun', 'auther/authFun/append', '2', '0', '1', '2014-10-21 14:00:02', '1', '2014-10-21 14:00:02', null);
INSERT INTO `auth_fun` VALUES ('565', 'doBrowser', '查询动作', null, 'M001', 'authFun', 'auther/authFun/doBrowser', '1', '0', '1', '2014-10-21 14:00:02', '1', '2014-10-21 14:00:02', null);
INSERT INTO `auth_fun` VALUES ('566', 'browser', '查询页面', null, 'M001', 'authFun', 'auther/authFun/browser', '0', '0', '1', '2014-10-21 14:00:02', '1', '2014-10-21 14:00:02', null);
INSERT INTO `auth_fun` VALUES ('567', 'doDelete', '删除动作', null, 'M0062', 'roleAuth', 'role/roleAuth/doDelete', '6', '0', '1', '2014-10-21 14:00:02', '1', '2014-10-21 14:00:02', null);
INSERT INTO `auth_fun` VALUES ('568', 'doModify', '修改动作', null, 'M0062', 'roleAuth', 'role/roleAuth/doModify', '5', '0', '1', '2014-10-21 14:00:02', '1', '2014-10-21 14:00:02', null);
INSERT INTO `auth_fun` VALUES ('569', 'modify', '修改页面', null, 'M0062', 'roleAuth', 'role/roleAuth/modify', '4', '0', '1', '2014-10-21 14:00:02', '1', '2014-10-21 14:00:02', null);
INSERT INTO `auth_fun` VALUES ('570', 'doAppend', '添加动作', null, 'M0062', 'roleAuth', 'role/roleAuth/doAppend', '3', '0', '1', '2014-10-21 14:00:02', '1', '2014-10-21 14:00:02', null);
INSERT INTO `auth_fun` VALUES ('571', 'append', '添加页面', null, 'M0062', 'roleAuth', 'role/roleAuth/append', '2', '0', '1', '2014-10-21 14:00:02', '1', '2014-10-21 14:00:02', null);
INSERT INTO `auth_fun` VALUES ('572', 'doBrowser', '查询动作', null, 'M0062', 'roleAuth', 'role/roleAuth/doBrowser', '1', '0', '1', '2014-10-21 14:00:02', '1', '2014-10-21 14:00:02', null);
INSERT INTO `auth_fun` VALUES ('573', 'browser', '查询页面', null, 'M0062', 'roleAuth', 'role/roleAuth/browser', '0', '0', '1', '2014-10-21 14:00:02', '1', '2014-10-21 14:00:02', null);
INSERT INTO `auth_fun` VALUES ('574', 'doDelete', '删除动作', null, 'M0062', 'roleSys', 'role/roleSys/doDelete', '6', '0', '1', '2014-10-21 14:00:02', '1', '2014-10-21 14:00:02', null);
INSERT INTO `auth_fun` VALUES ('575', 'doModify', '修改动作', null, 'M0062', 'roleSys', 'role/roleSys/doModify', '5', '0', '1', '2014-10-21 14:00:02', '1', '2014-10-21 14:00:02', null);
INSERT INTO `auth_fun` VALUES ('576', 'modify', '修改页面', null, 'M0062', 'roleSys', 'role/roleSys/modify', '4', '0', '1', '2014-10-21 14:00:02', '1', '2014-10-21 14:00:02', null);
INSERT INTO `auth_fun` VALUES ('577', 'doAppend', '添加动作', null, 'M0062', 'roleSys', 'role/roleSys/doAppend', '3', '0', '1', '2014-10-21 14:00:02', '1', '2014-10-21 14:00:02', null);
INSERT INTO `auth_fun` VALUES ('578', 'append', '添加页面', null, 'M0062', 'roleSys', 'role/roleSys/append', '2', '0', '1', '2014-10-21 14:00:02', '1', '2014-10-21 14:00:02', null);
INSERT INTO `auth_fun` VALUES ('579', 'doBrowser', '查询动作', null, 'M0062', 'roleSys', 'role/roleSys/doBrowser', '1', '0', '1', '2014-10-21 14:00:02', '1', '2014-10-21 14:00:02', null);
INSERT INTO `auth_fun` VALUES ('580', 'browser', '查询页面', null, 'M0062', 'roleSys', 'role/roleSys/browser', '0', '0', '1', '2014-10-21 14:00:02', '1', '2014-10-21 14:00:02', null);
INSERT INTO `auth_fun` VALUES ('581', 'doDelete', '删除动作', null, 'M0060', 'sysAdmin', 'system/sysAdmin/doDelete', '6', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('582', 'doModify', '修改动作', null, 'M0060', 'sysAdmin', 'system/sysAdmin/doModify', '5', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('583', 'modify', '修改页面', null, 'M0060', 'sysAdmin', 'system/sysAdmin/modify', '4', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('584', 'doAppend', '添加动作', null, 'M0060', 'sysAdmin', 'system/sysAdmin/doAppend', '3', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('585', 'append', '添加页面', null, 'M0060', 'sysAdmin', 'system/sysAdmin/append', '2', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('586', 'doBrowser', '查询动作', null, 'M0060', 'sysAdmin', 'system/sysAdmin/doBrowser', '1', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('587', 'browser', '查询页面', null, 'M0060', 'sysAdmin', 'system/sysAdmin/browser', '0', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('588', 'doDelete', '删除动作', null, 'M0060', 'sysArea', 'system/sysArea/doDelete', '6', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('589', 'doModify', '修改动作', null, 'M0060', 'sysArea', 'system/sysArea/doModify', '5', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('590', 'modify', '修改页面', null, 'M0060', 'sysArea', 'system/sysArea/modify', '4', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('591', 'doAppend', '添加动作', null, 'M0060', 'sysArea', 'system/sysArea/doAppend', '3', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('592', 'append', '添加页面', null, 'M0060', 'sysArea', 'system/sysArea/append', '2', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('593', 'doBrowser', '查询动作', null, 'M0060', 'sysArea', 'system/sysArea/doBrowser', '1', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('594', 'browser', '查询页面', null, 'M0060', 'sysArea', 'system/sysArea/browser', '0', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('595', 'doDelete', '删除动作', null, 'M0060', 'sysItem', 'system/sysItem/doDelete', '6', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('596', 'doModify', '修改动作', null, 'M0060', 'sysItem', 'system/sysItem/doModify', '5', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('597', 'modify', '修改页面', null, 'M0060', 'sysItem', 'system/sysItem/modify', '4', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('598', 'doAppend', '添加动作', null, 'M0060', 'sysItem', 'system/sysItem/doAppend', '3', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('599', 'append', '添加页面', null, 'M0060', 'sysItem', 'system/sysItem/append', '2', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('600', 'doBrowser', '查询动作', null, 'M0060', 'sysItem', 'system/sysItem/doBrowser', '1', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('601', 'browser', '查询页面', null, 'M0060', 'sysItem', 'system/sysItem/browser', '0', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('602', 'doDelete', '删除动作', null, 'M0060', 'sysMenu', 'system/sysMenu/doDelete', '6', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('603', 'doModify', '修改动作', null, 'M0060', 'sysMenu', 'system/sysMenu/doModify', '5', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('604', 'modify', '修改页面', null, 'M0060', 'sysMenu', 'system/sysMenu/modify', '4', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('605', 'doAppend', '添加动作', null, 'M0060', 'sysMenu', 'system/sysMenu/doAppend', '3', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('606', 'append', '添加页面', null, 'M0060', 'sysMenu', 'system/sysMenu/append', '2', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('607', 'doBrowser', '查询动作', null, 'M0060', 'sysMenu', 'system/sysMenu/doBrowser', '1', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('608', 'browser', '查询页面', null, 'M0060', 'sysMenu', 'system/sysMenu/browser', '0', '0', '1', '2014-10-21 14:00:03', '1', '2014-10-21 14:00:03', null);
INSERT INTO `auth_fun` VALUES ('609', 'doDelete', '删除动作', null, 'M0060', 'sysModel', 'system/sysModel/doDelete', '6', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('610', 'doModify', '修改动作', null, 'M0060', 'sysModel', 'system/sysModel/doModify', '5', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('611', 'modify', '修改页面', null, 'M0060', 'sysModel', 'system/sysModel/modify', '4', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('612', 'doAppend', '添加动作', null, 'M0060', 'sysModel', 'system/sysModel/doAppend', '3', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('613', 'append', '添加页面', null, 'M0060', 'sysModel', 'system/sysModel/append', '2', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('614', 'doBrowser', '查询动作', null, 'M0060', 'sysModel', 'system/sysModel/doBrowser', '1', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('615', 'browser', '查询页面', null, 'M0060', 'sysModel', 'system/sysModel/browser', '0', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('616', 'doDelete', '删除动作', null, 'M0060', 'sysOrg', 'system/sysOrg/doDelete', '6', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('617', 'doModify', '修改动作', null, 'M0060', 'sysOrg', 'system/sysOrg/doModify', '5', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('618', 'modify', '修改页面', null, 'M0060', 'sysOrg', 'system/sysOrg/modify', '4', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('619', 'doAppend', '添加动作', null, 'M0060', 'sysOrg', 'system/sysOrg/doAppend', '3', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('620', 'append', '添加页面', null, 'M0060', 'sysOrg', 'system/sysOrg/append', '2', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('621', 'doBrowser', '查询动作', null, 'M0060', 'sysOrg', 'system/sysOrg/doBrowser', '1', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('622', 'browser', '查询页面', null, 'M0060', 'sysOrg', 'system/sysOrg/browser', '0', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('623', 'doDelete', '删除动作', null, 'M0060', 'sysRole', 'system/sysRole/doDelete', '6', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('624', 'doModify', '修改动作', null, 'M0060', 'sysRole', 'system/sysRole/doModify', '5', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('625', 'modify', '修改页面', null, 'M0060', 'sysRole', 'system/sysRole/modify', '4', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('626', 'doAppend', '添加动作', null, 'M0060', 'sysRole', 'system/sysRole/doAppend', '3', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('627', 'append', '添加页面', null, 'M0060', 'sysRole', 'system/sysRole/append', '2', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('628', 'doBrowser', '查询动作', null, 'M0060', 'sysRole', 'system/sysRole/doBrowser', '1', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('629', 'browser', '查询页面', null, 'M0060', 'sysRole', 'system/sysRole/browser', '0', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('630', 'doDelete', '删除动作', null, 'M0061', 'usrAuth', 'user/usrAuth/doDelete', '6', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('631', 'doModify', '修改动作', null, 'M0061', 'usrAuth', 'user/usrAuth/doModify', '5', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('632', 'modify', '修改页面', null, 'M0061', 'usrAuth', 'user/usrAuth/modify', '4', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('633', 'doAppend', '添加动作', null, 'M0061', 'usrAuth', 'user/usrAuth/doAppend', '3', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('634', 'append', '添加页面', null, 'M0061', 'usrAuth', 'user/usrAuth/append', '2', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('635', 'doBrowser', '查询动作', null, 'M0061', 'usrAuth', 'user/usrAuth/doBrowser', '1', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('636', 'browser', '查询页面', null, 'M0061', 'usrAuth', 'user/usrAuth/browser', '0', '0', '1', '2014-10-21 14:00:04', '1', '2014-10-21 14:00:04', null);
INSERT INTO `auth_fun` VALUES ('637', 'doDelete', '删除动作', null, 'M0061', 'usrRole', 'user/usrRole/doDelete', '6', '0', '1', '2014-10-21 14:00:05', '1', '2014-10-21 14:00:05', null);
INSERT INTO `auth_fun` VALUES ('638', 'doModify', '修改动作', null, 'M0061', 'usrRole', 'user/usrRole/doModify', '5', '0', '1', '2014-10-21 14:00:05', '1', '2014-10-21 14:00:05', null);
INSERT INTO `auth_fun` VALUES ('639', 'modify', '修改页面', null, 'M0061', 'usrRole', 'user/usrRole/modify', '4', '0', '1', '2014-10-21 14:00:05', '1', '2014-10-21 14:00:05', null);
INSERT INTO `auth_fun` VALUES ('640', 'doAppend', '添加动作', null, 'M0061', 'usrRole', 'user/usrRole/doAppend', '3', '0', '1', '2014-10-21 14:00:05', '1', '2014-10-21 14:00:05', null);
INSERT INTO `auth_fun` VALUES ('641', 'append', '添加页面', null, 'M0061', 'usrRole', 'user/usrRole/append', '2', '0', '1', '2014-10-21 14:00:05', '1', '2014-10-21 14:00:05', null);
INSERT INTO `auth_fun` VALUES ('642', 'doBrowser', '查询动作', null, 'M0061', 'usrRole', 'user/usrRole/doBrowser', '1', '0', '1', '2014-10-21 14:00:05', '1', '2014-10-21 14:00:05', null);
INSERT INTO `auth_fun` VALUES ('643', 'browser', '查询页面', null, 'M0061', 'usrRole', 'user/usrRole/browser', '0', '0', '1', '2014-10-21 14:00:05', '1', '2014-10-21 14:00:05', null);
INSERT INTO `auth_fun` VALUES ('644', 'doDelete', '删除动作', null, 'M0061', 'usrRoleAuth', 'user/usrRoleAuth/doDelete', '6', '0', '1', '2014-10-21 14:00:05', '1', '2014-10-21 14:00:05', null);
INSERT INTO `auth_fun` VALUES ('645', 'doModify', '修改动作', null, 'M0061', 'usrRoleAuth', 'user/usrRoleAuth/doModify', '5', '0', '1', '2014-10-21 14:00:05', '1', '2014-10-21 14:00:05', null);
INSERT INTO `auth_fun` VALUES ('646', 'modify', '修改页面', null, 'M0061', 'usrRoleAuth', 'user/usrRoleAuth/modify', '4', '0', '1', '2014-10-21 14:00:05', '1', '2014-10-21 14:00:05', null);
INSERT INTO `auth_fun` VALUES ('647', 'doAppend', '添加动作', null, 'M0061', 'usrRoleAuth', 'user/usrRoleAuth/doAppend', '3', '0', '1', '2014-10-21 14:00:05', '1', '2014-10-21 14:00:05', null);
INSERT INTO `auth_fun` VALUES ('648', 'append', '添加页面', null, 'M0061', 'usrRoleAuth', 'user/usrRoleAuth/append', '2', '0', '1', '2014-10-21 14:00:05', '1', '2014-10-21 14:00:05', null);
INSERT INTO `auth_fun` VALUES ('649', 'doBrowser', '查询动作', null, 'M0061', 'usrRoleAuth', 'user/usrRoleAuth/doBrowser', '1', '0', '1', '2014-10-21 14:00:05', '1', '2014-10-21 14:00:05', null);
INSERT INTO `auth_fun` VALUES ('650', 'browser', '查询页面', null, 'M0061', 'usrRoleAuth', 'user/usrRoleAuth/browser', '0', '0', '1', '2014-10-21 14:00:05', '1', '2014-10-21 14:00:05', null);
INSERT INTO `auth_fun` VALUES ('661', 'doDelete', '删除动作', null, 'M0063', 'mapRoleAuth', 'mapping/mapRoleAuth/doDelete', '6', '0', '1', '2014-10-30 12:38:02', '1', '2014-10-30 12:38:02', null);
INSERT INTO `auth_fun` VALUES ('662', 'doModify', '修改动作', null, 'M0063', 'mapRoleAuth', 'mapping/mapRoleAuth/doModify', '5', '0', '1', '2014-10-30 12:38:02', '1', '2014-10-30 12:38:02', null);
INSERT INTO `auth_fun` VALUES ('663', 'modify', '修改页面', null, 'M0063', 'mapRoleAuth', 'mapping/mapRoleAuth/modify', '4', '0', '1', '2014-10-30 12:38:02', '1', '2014-10-30 12:38:02', null);
INSERT INTO `auth_fun` VALUES ('664', 'doAppend', '添加动作', null, 'M0063', 'mapRoleAuth', 'mapping/mapRoleAuth/doAppend', '3', '0', '1', '2014-10-30 12:38:02', '1', '2014-10-30 12:38:02', null);
INSERT INTO `auth_fun` VALUES ('665', 'append', '添加页面', null, 'M0063', 'mapRoleAuth', 'mapping/mapRoleAuth/append', '2', '0', '1', '2014-10-30 12:38:02', '1', '2014-10-30 12:38:02', null);
INSERT INTO `auth_fun` VALUES ('666', 'doBrowser', '查询动作', null, 'M0063', 'mapRoleAuth', 'mapping/mapRoleAuth/doBrowser', '1', '0', '1', '2014-10-30 12:38:02', '1', '2014-10-30 12:38:02', null);
INSERT INTO `auth_fun` VALUES ('667', 'browser', '查询页面', null, 'M0063', 'mapRoleAuth', 'mapping/mapRoleAuth/browser', '0', '0', '1', '2014-10-30 12:38:02', '1', '2014-10-30 12:38:02', null);
INSERT INTO `auth_fun` VALUES ('668', 'doDelete', '删除动作', null, 'M0063', 'mapUserRelease', 'mapping/mapUserRelease/doDelete', '6', '0', '1', '2014-10-30 12:38:02', '1', '2014-10-30 12:38:02', null);
INSERT INTO `auth_fun` VALUES ('669', 'doModify', '修改动作', null, 'M0063', 'mapUserRelease', 'mapping/mapUserRelease/doModify', '5', '0', '1', '2014-10-30 12:38:02', '1', '2014-10-30 12:38:02', null);
INSERT INTO `auth_fun` VALUES ('670', 'modify', '修改页面', null, 'M0063', 'mapUserRelease', 'mapping/mapUserRelease/modify', '4', '0', '1', '2014-10-30 12:38:02', '1', '2014-10-30 12:38:02', null);
INSERT INTO `auth_fun` VALUES ('671', 'doAppend', '添加动作', null, 'M0063', 'mapUserRelease', 'mapping/mapUserRelease/doAppend', '3', '0', '1', '2014-10-30 12:38:02', '1', '2014-10-30 12:38:02', null);
INSERT INTO `auth_fun` VALUES ('672', 'append', '添加页面', null, 'M0063', 'mapUserRelease', 'mapping/mapUserRelease/append', '2', '0', '1', '2014-10-30 12:38:02', '1', '2014-10-30 12:38:02', null);
INSERT INTO `auth_fun` VALUES ('673', 'doBrowser', '查询动作', null, 'M0063', 'mapUserRelease', 'mapping/mapUserRelease/doBrowser', '1', '0', '1', '2014-10-30 12:38:02', '1', '2014-10-30 12:38:02', null);
INSERT INTO `auth_fun` VALUES ('674', 'browser', '查询页面', null, 'M0063', 'mapUserRelease', 'mapping/mapUserRelease/browser', '0', '0', '1', '2014-10-30 12:38:02', '1', '2014-10-30 12:38:02', null);
INSERT INTO `auth_fun` VALUES ('681', 'doDelete', '删除动作', null, 'M007', 'ctDataSource', 'checktools/ctDataSource/doDelete', '6', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('682', 'doModify', '修改动作', null, 'M007', 'ctDataSource', 'checktools/ctDataSource/doModify', '5', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('683', 'modify', '修改页面', null, 'M007', 'ctDataSource', 'checktools/ctDataSource/modify', '4', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('684', 'doAppend', '添加动作', null, 'M007', 'ctDataSource', 'checktools/ctDataSource/doAppend', '3', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('685', 'append', '添加页面', null, 'M007', 'ctDataSource', 'checktools/ctDataSource/append', '2', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('686', 'doBrowser', '查询动作', null, 'M007', 'ctDataSource', 'checktools/ctDataSource/doBrowser?offset=1&length=10', '1', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('687', 'browser', '查询页面', null, 'M007', 'ctDataSource', 'checktools/ctDataSource/browser', '0', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('688', 'doDelete', '删除动作', null, 'M007', 'ctHomework', 'checktools/ctHomework/doDelete', '6', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('689', 'doModify', '修改动作', null, 'M007', 'ctHomework', 'checktools/ctHomework/doModify', '5', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('690', 'modify', '修改页面', null, 'M007', 'ctHomework', 'checktools/ctHomework/modify', '4', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('691', 'doAppend', '添加动作', null, 'M007', 'ctHomework', 'checktools/ctHomework/doAppend', '3', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('692', 'append', '添加页面', null, 'M007', 'ctHomework', 'checktools/ctHomework/append', '2', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('693', 'doBrowser', '查询动作', null, 'M007', 'ctHomework', 'checktools/ctHomework/doBrowser?offset=1&length=10', '1', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('694', 'browser', '查询页面', null, 'M007', 'ctHomework', 'checktools/ctHomework/browser', '0', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('695', 'doDelete', '删除动作', null, 'M007', 'ctWorkResult', 'checktools/ctWorkResult/doDelete', '6', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('696', 'doModify', '修改动作', null, 'M007', 'ctWorkResult', 'checktools/ctWorkResult/doModify', '5', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('697', 'modify', '修改页面', null, 'M007', 'ctWorkResult', 'checktools/ctWorkResult/modify', '4', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('698', 'doAppend', '添加动作', null, 'M007', 'ctWorkResult', 'checktools/ctWorkResult/doAppend', '3', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('699', 'append', '添加页面', null, 'M007', 'ctWorkResult', 'checktools/ctWorkResult/append', '2', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('700', 'doBrowser', '查询动作', null, 'M007', 'ctWorkResult', 'checktools/ctWorkResult/doBrowser?offset=1&length=10', '1', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('701', 'browser', '查询页面', null, 'M007', 'ctWorkResult', 'checktools/ctWorkResult/browser', '0', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('702', 'doDelete', '删除动作', null, 'M007', 'ctWorkScript', 'checktools/ctWorkScript/doDelete', '6', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('703', 'doModify', '修改动作', null, 'M007', 'ctWorkScript', 'checktools/ctWorkScript/doModify', '5', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('704', 'modify', '修改页面', null, 'M007', 'ctWorkScript', 'checktools/ctWorkScript/modify', '4', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('705', 'doAppend', '添加动作', null, 'M007', 'ctWorkScript', 'checktools/ctWorkScript/doAppend', '3', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('706', 'append', '添加页面', null, 'M007', 'ctWorkScript', 'checktools/ctWorkScript/append', '2', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('707', 'doBrowser', '查询动作', null, 'M007', 'ctWorkScript', 'checktools/ctWorkScript/doBrowser?offset=1&length=10', '1', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('708', 'browser', '查询页面', null, 'M007', 'ctWorkScript', 'checktools/ctWorkScript/browser', '0', '0', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);
INSERT INTO `auth_fun` VALUES ('721', 'doDelete', '删除动作', null, 'M007', 'tBond', 'checktools/tBond/doDelete', '6', '0', '1', '2014-12-03 16:37:01', '1', '2014-12-03 16:37:01', null);
INSERT INTO `auth_fun` VALUES ('722', 'doModify', '修改动作', null, 'M007', 'tBond', 'checktools/tBond/doModify', '5', '0', '1', '2014-12-03 16:37:01', '1', '2014-12-03 16:37:01', null);
INSERT INTO `auth_fun` VALUES ('723', 'modify', '修改页面', null, 'M007', 'tBond', 'checktools/tBond/modify', '4', '0', '1', '2014-12-03 16:37:01', '1', '2014-12-03 16:37:01', null);
INSERT INTO `auth_fun` VALUES ('724', 'doAppend', '添加动作', null, 'M007', 'tBond', 'checktools/tBond/doAppend', '3', '0', '1', '2014-12-03 16:37:01', '1', '2014-12-03 16:37:01', null);
INSERT INTO `auth_fun` VALUES ('725', 'append', '添加页面', null, 'M007', 'tBond', 'checktools/tBond/append', '2', '0', '1', '2014-12-03 16:37:01', '1', '2014-12-03 16:37:01', null);
INSERT INTO `auth_fun` VALUES ('726', 'doBrowser', '查询动作', null, 'M007', 'tBond', 'checktools/tBond/doBrowser?offset=1&length=10', '1', '0', '1', '2014-12-03 16:37:01', '1', '2014-12-03 16:37:01', null);
INSERT INTO `auth_fun` VALUES ('727', 'browser', '查询页面', null, 'M007', 'tBond', 'gjjio/tBond/browser', '0', '0', '1', '2014-12-03 16:37:01', '1', '2014-12-03 16:37:01', null);
INSERT INTO `auth_fun` VALUES ('728', 'doDelete', '删除动作', null, 'M0080', 'tBond', 'gjjio/tBond/doDelete', '6', '0', '1', '2014-12-03 16:39:05', '1', '2014-12-03 16:39:05', null);
INSERT INTO `auth_fun` VALUES ('729', 'doModify', '修改动作', null, 'M0080', 'tBond', 'gjjio/tBond/doModify', '5', '0', '1', '2014-12-03 16:39:05', '1', '2014-12-03 16:39:05', null);
INSERT INTO `auth_fun` VALUES ('730', 'modify', '修改页面', null, 'M0080', 'tBond', 'gjjio/tBond/modify', '4', '0', '1', '2014-12-03 16:39:05', '1', '2014-12-03 16:39:05', null);
INSERT INTO `auth_fun` VALUES ('731', 'doAppend', '添加动作', null, 'M0080', 'tBond', 'gjjio/tBond/doAppend', '3', '0', '1', '2014-12-03 16:39:05', '1', '2014-12-03 16:39:05', null);
INSERT INTO `auth_fun` VALUES ('732', 'append', '添加页面', null, 'M0080', 'tBond', 'gjjio/tBond/append', '2', '0', '1', '2014-12-03 16:39:05', '1', '2014-12-03 16:39:05', null);
INSERT INTO `auth_fun` VALUES ('733', 'doBrowser', '查询动作', null, 'M0080', 'tBond', 'gjjio/tBond/doBrowser?offset=1&length=10', '1', '0', '1', '2014-12-03 16:39:05', '1', '2014-12-03 16:39:05', null);
INSERT INTO `auth_fun` VALUES ('734', 'browser', '查询页面', null, 'M0080', 'tBond', 'gjjio/tBond/browser', '0', '0', '1', '2014-12-03 16:39:05', '1', '2014-12-03 16:39:05', null);
INSERT INTO `auth_fun` VALUES ('735', 'doDelete', '删除动作', null, 'M0080', 'tCoborrower', 'gjjio/tCoborrower/doDelete', '6', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('736', 'doModify', '修改动作', null, 'M0080', 'tCoborrower', 'gjjio/tCoborrower/doModify', '5', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('737', 'modify', '修改页面', null, 'M0080', 'tCoborrower', 'gjjio/tCoborrower/modify', '4', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('738', 'doAppend', '添加动作', null, 'M0080', 'tCoborrower', 'gjjio/tCoborrower/doAppend', '3', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('739', 'append', '添加页面', null, 'M0080', 'tCoborrower', 'gjjio/tCoborrower/append', '2', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('740', 'doBrowser', '查询动作', null, 'M0080', 'tCoborrower', 'gjjio/tCoborrower/doBrowser?offset=1&length=10', '1', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('741', 'browser', '查询页面', null, 'M0080', 'tCoborrower', 'gjjio/tCoborrower/browser', '0', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('742', 'doDelete', '删除动作', null, 'M0080', 'tEmpaccount', 'gjjio/tEmpaccount/doDelete', '6', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('743', 'doModify', '修改动作', null, 'M0080', 'tEmpaccount', 'gjjio/tEmpaccount/doModify', '5', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('744', 'modify', '修改页面', null, 'M0080', 'tEmpaccount', 'gjjio/tEmpaccount/modify', '4', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('745', 'doAppend', '添加动作', null, 'M0080', 'tEmpaccount', 'gjjio/tEmpaccount/doAppend', '3', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('746', 'append', '添加页面', null, 'M0080', 'tEmpaccount', 'gjjio/tEmpaccount/append', '2', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('747', 'doBrowser', '查询动作', null, 'M0080', 'tEmpaccount', 'gjjio/tEmpaccount/doBrowser?offset=1&length=10', '1', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('748', 'browser', '查询页面', null, 'M0080', 'tEmpaccount', 'gjjio/tEmpaccount/browser', '0', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('749', 'doDelete', '删除动作', null, 'M0080', 'tEmpinfo', 'gjjio/tEmpinfo/doDelete', '6', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('750', 'doModify', '修改动作', null, 'M0080', 'tEmpinfo', 'gjjio/tEmpinfo/doModify', '5', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('751', 'modify', '修改页面', null, 'M0080', 'tEmpinfo', 'gjjio/tEmpinfo/modify', '4', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('752', 'doAppend', '添加动作', null, 'M0080', 'tEmpinfo', 'gjjio/tEmpinfo/doAppend', '3', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('753', 'append', '添加页面', null, 'M0080', 'tEmpinfo', 'gjjio/tEmpinfo/append', '2', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('754', 'doBrowser', '查询动作', null, 'M0080', 'tEmpinfo', 'gjjio/tEmpinfo/doBrowser?offset=1&length=10', '1', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('755', 'browser', '查询页面', null, 'M0080', 'tEmpinfo', 'gjjio/tEmpinfo/browser', '0', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('756', 'doDelete', '删除动作', null, 'M0080', 'tEmprecord', 'gjjio/tEmprecord/doDelete', '6', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('757', 'doModify', '修改动作', null, 'M0080', 'tEmprecord', 'gjjio/tEmprecord/doModify', '5', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('758', 'modify', '修改页面', null, 'M0080', 'tEmprecord', 'gjjio/tEmprecord/modify', '4', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('759', 'doAppend', '添加动作', null, 'M0080', 'tEmprecord', 'gjjio/tEmprecord/doAppend', '3', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('760', 'append', '添加页面', null, 'M0080', 'tEmprecord', 'gjjio/tEmprecord/append', '2', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('761', 'doBrowser', '查询动作', null, 'M0080', 'tEmprecord', 'gjjio/tEmprecord/doBrowser?offset=1&length=10', '1', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('762', 'browser', '查询页面', null, 'M0080', 'tEmprecord', 'gjjio/tEmprecord/browser', '0', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('763', 'doDelete', '删除动作', null, 'M0080', 'tLoanaccount', 'gjjio/tLoanaccount/doDelete', '6', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('764', 'doModify', '修改动作', null, 'M0080', 'tLoanaccount', 'gjjio/tLoanaccount/doModify', '5', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('765', 'modify', '修改页面', null, 'M0080', 'tLoanaccount', 'gjjio/tLoanaccount/modify', '4', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('766', 'doAppend', '添加动作', null, 'M0080', 'tLoanaccount', 'gjjio/tLoanaccount/doAppend', '3', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('767', 'append', '添加页面', null, 'M0080', 'tLoanaccount', 'gjjio/tLoanaccount/append', '2', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('768', 'doBrowser', '查询动作', null, 'M0080', 'tLoanaccount', 'gjjio/tLoanaccount/doBrowser?offset=1&length=10', '1', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('769', 'browser', '查询页面', null, 'M0080', 'tLoanaccount', 'gjjio/tLoanaccount/browser', '0', '0', '1', '2014-12-03 16:40:00', '1', '2014-12-03 16:40:00', null);
INSERT INTO `auth_fun` VALUES ('770', 'doDelete', '删除动作', null, 'M0080', 'tLoancontract', 'gjjio/tLoancontract/doDelete', '6', '0', '1', '2014-12-03 16:40:01', '1', '2014-12-03 16:40:01', null);
INSERT INTO `auth_fun` VALUES ('771', 'doModify', '修改动作', null, 'M0080', 'tLoancontract', 'gjjio/tLoancontract/doModify', '5', '0', '1', '2014-12-03 16:40:01', '1', '2014-12-03 16:40:01', null);
INSERT INTO `auth_fun` VALUES ('772', 'modify', '修改页面', null, 'M0080', 'tLoancontract', 'gjjio/tLoancontract/modify', '4', '0', '1', '2014-12-03 16:40:01', '1', '2014-12-03 16:40:01', null);
INSERT INTO `auth_fun` VALUES ('773', 'doAppend', '添加动作', null, 'M0080', 'tLoancontract', 'gjjio/tLoancontract/doAppend', '3', '0', '1', '2014-12-03 16:40:01', '1', '2014-12-03 16:40:01', null);
INSERT INTO `auth_fun` VALUES ('774', 'append', '添加页面', null, 'M0080', 'tLoancontract', 'gjjio/tLoancontract/append', '2', '0', '1', '2014-12-03 16:40:01', '1', '2014-12-03 16:40:01', null);
INSERT INTO `auth_fun` VALUES ('775', 'doBrowser', '查询动作', null, 'M0080', 'tLoancontract', 'gjjio/tLoancontract/doBrowser?offset=1&length=10', '1', '0', '1', '2014-12-03 16:40:01', '1', '2014-12-03 16:40:01', null);
INSERT INTO `auth_fun` VALUES ('776', 'browser', '查询页面', null, 'M0080', 'tLoancontract', 'gjjio/tLoancontract/browser', '0', '0', '1', '2014-12-03 16:40:01', '1', '2014-12-03 16:40:01', null);
INSERT INTO `auth_fun` VALUES ('777', 'doDelete', '删除动作', null, 'M0080', 'tLoanrecord', 'gjjio/tLoanrecord/doDelete', '6', '0', '1', '2014-12-03 16:40:01', '1', '2014-12-03 16:40:01', null);
INSERT INTO `auth_fun` VALUES ('778', 'doModify', '修改动作', null, 'M0080', 'tLoanrecord', 'gjjio/tLoanrecord/doModify', '5', '0', '1', '2014-12-03 16:40:01', '1', '2014-12-03 16:40:01', null);
INSERT INTO `auth_fun` VALUES ('779', 'modify', '修改页面', null, 'M0080', 'tLoanrecord', 'gjjio/tLoanrecord/modify', '4', '0', '1', '2014-12-03 16:40:01', '1', '2014-12-03 16:40:01', null);
INSERT INTO `auth_fun` VALUES ('780', 'doAppend', '添加动作', null, 'M0080', 'tLoanrecord', 'gjjio/tLoanrecord/doAppend', '3', '0', '1', '2014-12-03 16:40:01', '1', '2014-12-03 16:40:01', null);
INSERT INTO `auth_fun` VALUES ('781', 'append', '添加页面', null, 'M0080', 'tLoanrecord', 'gjjio/tLoanrecord/append', '2', '0', '1', '2014-12-03 16:40:01', '1', '2014-12-03 16:40:01', null);
INSERT INTO `auth_fun` VALUES ('782', 'doBrowser', '查询动作', null, 'M0080', 'tLoanrecord', 'gjjio/tLoanrecord/doBrowser?offset=1&length=10', '1', '0', '1', '2014-12-03 16:40:01', '1', '2014-12-03 16:40:01', null);
INSERT INTO `auth_fun` VALUES ('783', 'browser', '查询页面', null, 'M0080', 'tLoanrecord', 'gjjio/tLoanrecord/browser', '0', '0', '1', '2014-12-03 16:40:01', '1', '2014-12-03 16:40:01', null);
INSERT INTO `auth_fun` VALUES ('784', 'doDelete', '删除动作', null, 'M0080', 'tOverdueregist', 'gjjio/tOverdueregist/doDelete', '6', '0', '1', '2014-12-03 16:40:01', '1', '2014-12-03 16:40:01', null);
INSERT INTO `auth_fun` VALUES ('785', 'doModify', '修改动作', null, 'M0080', 'tOverdueregist', 'gjjio/tOverdueregist/doModify', '5', '0', '1', '2014-12-03 16:40:01', '1', '2014-12-03 16:40:01', null);
INSERT INTO `auth_fun` VALUES ('786', 'modify', '修改页面', null, 'M0080', 'tOverdueregist', 'gjjio/tOverdueregist/modify', '4', '0', '1', '2014-12-03 16:40:01', '1', '2014-12-03 16:40:01', null);
INSERT INTO `auth_fun` VALUES ('787', 'doAppend', '添加动作', null, 'M0080', 'tOverdueregist', 'gjjio/tOverdueregist/doAppend', '3', '0', '1', '2014-12-03 16:40:01', '1', '2014-12-03 16:40:01', null);
INSERT INTO `auth_fun` VALUES ('788', 'append', '添加页面', null, 'M0080', 'tOverdueregist', 'gjjio/tOverdueregist/append', '2', '0', '1', '2014-12-03 16:40:01', '1', '2014-12-03 16:40:01', null);
INSERT INTO `auth_fun` VALUES ('789', 'doBrowser', '查询动作', null, 'M0080', 'tOverdueregist', 'gjjio/tOverdueregist/doBrowser?offset=1&length=10', '1', '0', '1', '2014-12-03 16:40:01', '1', '2014-12-03 16:40:01', null);
INSERT INTO `auth_fun` VALUES ('790', 'browser', '查询页面', null, 'M0080', 'tOverdueregist', 'gjjio/tOverdueregist/browser', '0', '0', '1', '2014-12-03 16:40:01', '1', '2014-12-03 16:40:01', null);
INSERT INTO `auth_fun` VALUES ('791', 'doDelete', '删除动作', null, 'M0080', 'tPersonalaccinfo', 'gjjio/tPersonalaccinfo/doDelete', '6', '0', '1', '2014-12-03 16:40:02', '1', '2014-12-03 16:40:02', null);
INSERT INTO `auth_fun` VALUES ('792', 'doModify', '修改动作', null, 'M0080', 'tPersonalaccinfo', 'gjjio/tPersonalaccinfo/doModify', '5', '0', '1', '2014-12-03 16:40:02', '1', '2014-12-03 16:40:02', null);
INSERT INTO `auth_fun` VALUES ('793', 'modify', '修改页面', null, 'M0080', 'tPersonalaccinfo', 'gjjio/tPersonalaccinfo/modify', '4', '0', '1', '2014-12-03 16:40:02', '1', '2014-12-03 16:40:02', null);
INSERT INTO `auth_fun` VALUES ('794', 'doAppend', '添加动作', null, 'M0080', 'tPersonalaccinfo', 'gjjio/tPersonalaccinfo/doAppend', '3', '0', '1', '2014-12-03 16:40:02', '1', '2014-12-03 16:40:02', null);
INSERT INTO `auth_fun` VALUES ('795', 'append', '添加页面', null, 'M0080', 'tPersonalaccinfo', 'gjjio/tPersonalaccinfo/append', '2', '0', '1', '2014-12-03 16:40:02', '1', '2014-12-03 16:40:02', null);
INSERT INTO `auth_fun` VALUES ('796', 'doBrowser', '查询动作', null, 'M0080', 'tPersonalaccinfo', 'gjjio/tPersonalaccinfo/doBrowser?offset=1&length=10', '1', '0', '1', '2014-12-03 16:40:02', '1', '2014-12-03 16:40:02', null);
INSERT INTO `auth_fun` VALUES ('797', 'browser', '查询页面', null, 'M0080', 'tPersonalaccinfo', 'gjjio/tPersonalaccinfo/browser', '0', '0', '1', '2014-12-03 16:40:02', '1', '2014-12-03 16:40:02', null);
INSERT INTO `auth_fun` VALUES ('798', 'doDelete', '删除动作', null, 'M0080', 'tPersonalaccount', 'gjjio/tPersonalaccount/doDelete', '6', '0', '1', '2014-12-03 16:40:02', '1', '2014-12-03 16:40:02', null);
INSERT INTO `auth_fun` VALUES ('799', 'doModify', '修改动作', null, 'M0080', 'tPersonalaccount', 'gjjio/tPersonalaccount/doModify', '5', '0', '1', '2014-12-03 16:40:02', '1', '2014-12-03 16:40:02', null);
INSERT INTO `auth_fun` VALUES ('800', 'modify', '修改页面', null, 'M0080', 'tPersonalaccount', 'gjjio/tPersonalaccount/modify', '4', '0', '1', '2014-12-03 16:40:02', '1', '2014-12-03 16:40:02', null);
INSERT INTO `auth_fun` VALUES ('801', 'doAppend', '添加动作', null, 'M0080', 'tPersonalaccount', 'gjjio/tPersonalaccount/doAppend', '3', '0', '1', '2014-12-03 16:40:02', '1', '2014-12-03 16:40:02', null);
INSERT INTO `auth_fun` VALUES ('802', 'append', '添加页面', null, 'M0080', 'tPersonalaccount', 'gjjio/tPersonalaccount/append', '2', '0', '1', '2014-12-03 16:40:02', '1', '2014-12-03 16:40:02', null);
INSERT INTO `auth_fun` VALUES ('803', 'doBrowser', '查询动作', null, 'M0080', 'tPersonalaccount', 'gjjio/tPersonalaccount/doBrowser?offset=1&length=10', '1', '0', '1', '2014-12-03 16:40:02', '1', '2014-12-03 16:40:02', null);
INSERT INTO `auth_fun` VALUES ('804', 'browser', '查询页面', null, 'M0080', 'tPersonalaccount', 'gjjio/tPersonalaccount/browser', '0', '0', '1', '2014-12-03 16:40:02', '1', '2014-12-03 16:40:02', null);
INSERT INTO `auth_fun` VALUES ('805', 'doDelete', '删除动作', null, 'M0080', 'tPersonalinfo', 'gjjio/tPersonalinfo/doDelete', '6', '0', '1', '2014-12-03 16:40:03', '1', '2014-12-03 16:40:03', null);
INSERT INTO `auth_fun` VALUES ('806', 'doModify', '修改动作', null, 'M0080', 'tPersonalinfo', 'gjjio/tPersonalinfo/doModify', '5', '0', '1', '2014-12-03 16:40:03', '1', '2014-12-03 16:40:03', null);
INSERT INTO `auth_fun` VALUES ('807', 'modify', '修改页面', null, 'M0080', 'tPersonalinfo', 'gjjio/tPersonalinfo/modify', '4', '0', '1', '2014-12-03 16:40:03', '1', '2014-12-03 16:40:03', null);
INSERT INTO `auth_fun` VALUES ('808', 'doAppend', '添加动作', null, 'M0080', 'tPersonalinfo', 'gjjio/tPersonalinfo/doAppend', '3', '0', '1', '2014-12-03 16:40:03', '1', '2014-12-03 16:40:03', null);
INSERT INTO `auth_fun` VALUES ('809', 'append', '添加页面', null, 'M0080', 'tPersonalinfo', 'gjjio/tPersonalinfo/append', '2', '0', '1', '2014-12-03 16:40:03', '1', '2014-12-03 16:40:03', null);
INSERT INTO `auth_fun` VALUES ('810', 'doBrowser', '查询动作', null, 'M0080', 'tPersonalinfo', 'gjjio/tPersonalinfo/doBrowser?offset=1&length=10', '1', '0', '1', '2014-12-03 16:40:03', '1', '2014-12-03 16:40:03', null);
INSERT INTO `auth_fun` VALUES ('811', 'browser', '查询页面', null, 'M0080', 'tPersonalinfo', 'gjjio/tPersonalinfo/browser', '0', '0', '1', '2014-12-03 16:40:03', '1', '2014-12-03 16:40:03', null);
INSERT INTO `auth_fun` VALUES ('812', 'doDelete', '删除动作', null, 'M0080', 'tPersonalrecord', 'gjjio/tPersonalrecord/doDelete', '6', '0', '1', '2014-12-03 16:40:03', '1', '2014-12-03 16:40:03', null);
INSERT INTO `auth_fun` VALUES ('813', 'doModify', '修改动作', null, 'M0080', 'tPersonalrecord', 'gjjio/tPersonalrecord/doModify', '5', '0', '1', '2014-12-03 16:40:03', '1', '2014-12-03 16:40:03', null);
INSERT INTO `auth_fun` VALUES ('814', 'modify', '修改页面', null, 'M0080', 'tPersonalrecord', 'gjjio/tPersonalrecord/modify', '4', '0', '1', '2014-12-03 16:40:03', '1', '2014-12-03 16:40:03', null);
INSERT INTO `auth_fun` VALUES ('815', 'doAppend', '添加动作', null, 'M0080', 'tPersonalrecord', 'gjjio/tPersonalrecord/doAppend', '3', '0', '1', '2014-12-03 16:40:03', '1', '2014-12-03 16:40:03', null);
INSERT INTO `auth_fun` VALUES ('816', 'append', '添加页面', null, 'M0080', 'tPersonalrecord', 'gjjio/tPersonalrecord/append', '2', '0', '1', '2014-12-03 16:40:03', '1', '2014-12-03 16:40:03', null);
INSERT INTO `auth_fun` VALUES ('817', 'doBrowser', '查询动作', null, 'M0080', 'tPersonalrecord', 'gjjio/tPersonalrecord/doBrowser?offset=1&length=10', '1', '0', '1', '2014-12-03 16:40:03', '1', '2014-12-03 16:40:03', null);
INSERT INTO `auth_fun` VALUES ('818', 'browser', '查询页面', null, 'M0080', 'tPersonalrecord', 'gjjio/tPersonalrecord/browser', '0', '0', '1', '2014-12-03 16:40:03', '1', '2014-12-03 16:40:03', null);
INSERT INTO `auth_fun` VALUES ('819', 'doDelete', '删除动作', null, 'M0080', 'tPolicyfileFile', 'gjjio/tPolicyfileFile/doDelete', '6', '0', '1', '2014-12-03 16:40:03', '1', '2014-12-03 16:40:03', null);
INSERT INTO `auth_fun` VALUES ('820', 'doModify', '修改动作', null, 'M0080', 'tPolicyfileFile', 'gjjio/tPolicyfileFile/doModify', '5', '0', '1', '2014-12-03 16:40:03', '1', '2014-12-03 16:40:03', null);
INSERT INTO `auth_fun` VALUES ('821', 'modify', '修改页面', null, 'M0080', 'tPolicyfileFile', 'gjjio/tPolicyfileFile/modify', '4', '0', '1', '2014-12-03 16:40:03', '1', '2014-12-03 16:40:03', null);
INSERT INTO `auth_fun` VALUES ('822', 'doAppend', '添加动作', null, 'M0080', 'tPolicyfileFile', 'gjjio/tPolicyfileFile/doAppend', '3', '0', '1', '2014-12-03 16:40:03', '1', '2014-12-03 16:40:03', null);
INSERT INTO `auth_fun` VALUES ('823', 'append', '添加页面', null, 'M0080', 'tPolicyfileFile', 'gjjio/tPolicyfileFile/append', '2', '0', '1', '2014-12-03 16:40:03', '1', '2014-12-03 16:40:03', null);
INSERT INTO `auth_fun` VALUES ('824', 'doBrowser', '查询动作', null, 'M0080', 'tPolicyfileFile', 'gjjio/tPolicyfileFile/doBrowser?offset=1&length=10', '1', '0', '1', '2014-12-03 16:40:03', '1', '2014-12-03 16:40:03', null);
INSERT INTO `auth_fun` VALUES ('825', 'browser', '查询页面', null, 'M0080', 'tPolicyfileFile', 'gjjio/tPolicyfileFile/browser', '0', '0', '1', '2014-12-03 16:40:03', '1', '2014-12-03 16:40:03', null);
INSERT INTO `auth_fun` VALUES ('841', 'doDelete', '删除动作', null, 'M0080', 'tPolicyinfo', 'gjjio/tPolicyinfo/doDelete', '6', '0', '1', '2014-12-05 10:25:00', '1', '2014-12-05 10:25:00', null);
INSERT INTO `auth_fun` VALUES ('842', 'doModify', '修改动作', null, 'M0080', 'tPolicyinfo', 'gjjio/tPolicyinfo/doModify', '5', '0', '1', '2014-12-05 10:25:00', '1', '2014-12-05 10:25:00', null);
INSERT INTO `auth_fun` VALUES ('843', 'modify', '修改页面', null, 'M0080', 'tPolicyinfo', 'gjjio/tPolicyinfo/modify', '4', '0', '1', '2014-12-05 10:25:00', '1', '2014-12-05 10:25:00', null);
INSERT INTO `auth_fun` VALUES ('844', 'doAppend', '添加动作', null, 'M0080', 'tPolicyinfo', 'gjjio/tPolicyinfo/doAppend', '3', '0', '1', '2014-12-05 10:25:00', '1', '2014-12-05 10:25:00', null);
INSERT INTO `auth_fun` VALUES ('845', 'append', '添加页面', null, 'M0080', 'tPolicyinfo', 'gjjio/tPolicyinfo/append', '2', '0', '1', '2014-12-05 10:25:00', '1', '2014-12-05 10:25:00', null);
INSERT INTO `auth_fun` VALUES ('846', 'doBrowser', '查询动作', null, 'M0080', 'tPolicyinfo', 'gjjio/tPolicyinfo/doBrowser?offset=1&length=10', '1', '0', '1', '2014-12-05 10:25:00', '1', '2014-12-05 10:25:00', null);
INSERT INTO `auth_fun` VALUES ('847', 'browser', '查询页面', null, 'M0080', 'tPolicyinfo', 'gjjio/tPolicyinfo/browser', '0', '0', '1', '2014-12-05 10:25:00', '1', '2014-12-05 10:25:00', null);
INSERT INTO `auth_fun` VALUES ('848', 'doDelete', '删除动作', null, 'M0080', 'tLogs', 'gjjio/tLogs/doDelete', '6', '0', '1', '2014-12-30 15:48:02', '1', '2014-12-30 15:48:02', null);
INSERT INTO `auth_fun` VALUES ('849', 'doModify', '修改动作', null, 'M0080', 'tLogs', 'gjjio/tLogs/doModify', '5', '0', '1', '2014-12-30 15:48:02', '1', '2014-12-30 15:48:02', null);
INSERT INTO `auth_fun` VALUES ('850', 'modify', '修改页面', null, 'M0080', 'tLogs', 'gjjio/tLogs/modify', '4', '0', '1', '2014-12-30 15:48:02', '1', '2014-12-30 15:48:02', null);
INSERT INTO `auth_fun` VALUES ('851', 'doAppend', '添加动作', null, 'M0080', 'tLogs', 'gjjio/tLogs/doAppend', '3', '0', '1', '2014-12-30 15:48:02', '1', '2014-12-30 15:48:02', null);
INSERT INTO `auth_fun` VALUES ('852', 'append', '添加页面', null, 'M0080', 'tLogs', 'gjjio/tLogs/append', '2', '0', '1', '2014-12-30 15:48:02', '1', '2014-12-30 15:48:02', null);
INSERT INTO `auth_fun` VALUES ('853', 'doBrowser', '查询动作', null, 'M0080', 'tLogs', 'gjjio/tLogs/doBrowser?offset=1&length=10', '1', '0', '1', '2014-12-30 15:48:02', '1', '2014-12-30 15:48:02', null);
INSERT INTO `auth_fun` VALUES ('854', 'browser', '查询页面', null, 'M0080', 'tLogs', 'gjjio/tLogs/browser', '0', '0', '1', '2014-12-30 15:48:02', '1', '2014-12-30 15:48:02', null);
INSERT INTO `auth_fun` VALUES ('855', 'doDelete', '删除动作', null, 'M0080', 'tRunParam', 'gjjio/tRunParam/doDelete', '6', '0', '1', '2014-12-30 15:48:03', '1', '2014-12-30 15:48:03', null);
INSERT INTO `auth_fun` VALUES ('856', 'doModify', '修改动作', null, 'M0080', 'tRunParam', 'gjjio/tRunParam/doModify', '5', '0', '1', '2014-12-30 15:48:03', '1', '2014-12-30 15:48:03', null);
INSERT INTO `auth_fun` VALUES ('857', 'modify', '修改页面', null, 'M0080', 'tRunParam', 'gjjio/tRunParam/modify', '4', '0', '1', '2014-12-30 15:48:03', '1', '2014-12-30 15:48:03', null);
INSERT INTO `auth_fun` VALUES ('858', 'doAppend', '添加动作', null, 'M0080', 'tRunParam', 'gjjio/tRunParam/doAppend', '3', '0', '1', '2014-12-30 15:48:03', '1', '2014-12-30 15:48:03', null);
INSERT INTO `auth_fun` VALUES ('859', 'append', '添加页面', null, 'M0080', 'tRunParam', 'gjjio/tRunParam/append', '2', '0', '1', '2014-12-30 15:48:03', '1', '2014-12-30 15:48:03', null);
INSERT INTO `auth_fun` VALUES ('860', 'doBrowser', '查询动作', null, 'M0080', 'tRunParam', 'gjjio/tRunParam/doBrowser?offset=1&length=10', '1', '0', '1', '2014-12-30 15:48:03', '1', '2014-12-30 15:48:03', null);
INSERT INTO `auth_fun` VALUES ('861', 'browser', '查询页面', null, 'M0080', 'tRunParam', 'gjjio/tRunParam/browser', '0', '0', '1', '2014-12-30 15:48:03', '1', '2014-12-30 15:48:03', null);
INSERT INTO `auth_fun` VALUES ('862', 'admin', '缺省', null, 'M000', 'admin', 'test', '0', '1', '1', '2014-11-18 10:41:04', '1', '2014-11-18 10:41:04', null);

-- ----------------------------
-- Table structure for `auth_user`
-- ----------------------------
DROP TABLE IF EXISTS `auth_user`;
CREATE TABLE `auth_user` (
  `ID_` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `ACC_` varchar(16) NOT NULL COMMENT '账户名',
  `ACC_DESC` varchar(32) DEFAULT NULL COMMENT '账户描述',
  `PASSWD_` varchar(32) NOT NULL COMMENT '密码',
  `STATUS_` int(3) NOT NULL COMMENT '状态@停用:0|锁定:1|祼测:2|测试:3|生产:4',
  `OUTER_IDENT` varchar(16) DEFAULT NULL COMMENT '外部标识',
  `OUTER_DESC` varchar(16) DEFAULT NULL COMMENT '外部描述',
  `GLOBAL_KEY` varchar(32) DEFAULT NULL COMMENT '公钥',
  `PRIVATE_KEY` varchar(32) DEFAULT NULL COMMENT '私钥',
  `SECURITY_LEVEL` int(1) NOT NULL COMMENT '安全等级',
  `MOBILE_` varchar(16) DEFAULT NULL COMMENT '手机',
  `EMAIL_` varchar(64) DEFAULT NULL COMMENT '电邮',
  `ACC_FAILURE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '账户过期时间',
  `PASSWD_FAILURE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '账户密码过期时间',
  `GK_FAILURE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '公钥过过期时间',
  `PK_FAILURE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '私钥过期时间',
  `MULTI_PRODUCT` char(1) DEFAULT NULL COMMENT '多套接口',
  `APPEND_BY` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '添加时间',
  `MODIFY_BY` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改时间',
  `JFT_ACCOUNT` char(10) DEFAULT NULL COMMENT '集付通账号',
  PRIMARY KEY (`ID_`),
  KEY `AUHT_USER_UQKEY` (`ACC_`)
) ENGINE=InnoDB AUTO_INCREMENT=1116 DEFAULT CHARSET=utf8 COMMENT='接口授权用户';

-- ----------------------------
-- Records of auth_user
-- ----------------------------
INSERT INTO `auth_user` VALUES ('3', 'microage', '正式用户', '827CCB0EEA8A706C4C34A16891F84E7B', '4', 'sh_021001', null, 'D2553789C401D597A951D976F33FB76C', '6D0596EBA45CB3E3589B6EB2F0E065B5', '1', null, null, '2015-12-15 12:00:00', '2014-12-15 12:00:00', '2014-12-15 12:00:00', '2014-12-15 12:00:00', '0', '2013-07-31 15:32:25', '2013-07-31 15:32:25', '0');
INSERT INTO `auth_user` VALUES ('8', 'zqq', '12345', '827CCB0EEA8A706C4C34A16891F84E7B', '2', 'sh_021001', null, '1111', '1111', '0', '18705810400', '1@11.com', '2013-12-23 16:42:01', '2014-12-24 16:42:04', '2014-12-24 16:42:04', '2014-12-31 16:42:05', '0', '2013-12-23 16:43:02', '2015-03-16 18:01:27', '0');
INSERT INTO `auth_user` VALUES ('80', 'test_001', 'test_001', 'A6F59D88FB2D13083744A6CA09D590BD', '2', '111', '111', '123456', '123456', '0', '123456', '111111@126.com', '2014-09-02 11:37:00', '2014-09-02 11:37:00', '2014-09-02 11:37:00', '2014-09-02 11:37:00', '0', '2015-03-16 18:01:27', '2015-03-16 18:01:27', '0');
INSERT INTO `auth_user` VALUES ('123', '10030', '人事管理人员', '25D55AD283AA400AF464C76D713C07AD', '1', 'sh_021001', null, '123456', '123456', '0', '18670345671', '123@163.com', '2013-08-01 16:43:01', '2013-08-15 16:43:02', '2013-08-01 16:43:02', '2013-08-03 16:43:02', '0', '2013-07-30 16:38:51', '2013-07-30 16:38:51', '0');
INSERT INTO `auth_user` VALUES ('743', 'junit_test0', '测试用例账号', '827CCB0EEA8A706C4C34A16891F84E7B', '0', 'gx_0471001', null, '123456', '123456', '1', null, null, '2013-12-15 00:00:00', '2013-12-15 00:00:00', '2013-12-15 00:00:00', '2013-12-15 00:00:00', '0', '2013-07-31 15:32:25', '2013-07-31 15:32:25', '0');
INSERT INTO `auth_user` VALUES ('744', 'junit_test1', '测试用例账号', '827CCB0EEA8A706C4C34A16891F84E7B', '1', 'gx_0471001', null, '123456', '123456', '1', null, null, '2013-12-15 00:00:00', '2013-12-15 00:00:00', '2013-12-15 00:00:00', '2013-12-15 00:00:00', '0', '2013-07-31 15:32:25', '2013-07-31 15:32:25', '0');
INSERT INTO `auth_user` VALUES ('745', 'junit_test2', '测试用例账号', '827CCB0EEA8A706C4C34A16891F84E7B', '2', 'gx_0471001', null, '123456', '123456', '1', null, null, '2013-12-15 00:00:00', '2013-12-15 00:00:00', '2013-12-15 00:00:00', '2013-12-15 00:00:00', '0', '2013-07-31 15:32:25', '2013-07-31 15:32:25', '0');
INSERT INTO `auth_user` VALUES ('999', 'aFANS', 'admin', '827CCB0EEA8A706C4C34A16891F84E7B', '2', 'sh_021001', null, null, null, '1', null, null, '2011-09-14 12:52:04', '2011-09-14 12:52:04', '2011-09-14 12:52:04', '2011-09-14 12:52:04', '0', '2013-07-30 16:38:51', '2013-07-30 16:38:51', '1');
INSERT INTO `auth_user` VALUES ('1114', 'junit_test3', '测试用例账号', '827CCB0EEA8A706C4C34A16891F84E7B', '3', 'gx_0471001', null, '123456', '123456', '1', null, null, '2013-12-15 00:00:00', '2013-12-15 00:00:00', '2013-12-15 00:00:00', '2013-12-15 00:00:00', '0', '2013-07-31 15:32:25', '2013-07-31 15:32:25', '0');
INSERT INTO `auth_user` VALUES ('1115', 'junit_test4', '测试用例账号', '827CCB0EEA8A706C4C34A16891F84E7B', '4', 'gx_0471001', null, '123456', '123456', '1', '1897655321', '445@122.com', '2013-12-15 00:00:00', '2013-12-15 00:00:00', '2013-12-15 00:00:00', '2013-12-15 00:00:00', '0', '2013-07-31 15:32:25', '2013-07-31 15:32:25', '0');

-- ----------------------------
-- Table structure for `card_map`
-- ----------------------------
DROP TABLE IF EXISTS `card_map`;
CREATE TABLE `card_map` (
  `ID` bigint(18) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `INNER_IDENT` varchar(16) DEFAULT NULL COMMENT '内部产品唯一标识',
  `OUTER_IDENT` varchar(16) DEFAULT NULL COMMENT '外部产品唯一标识',
  `INNER_BIZ_KEY` varchar(32) DEFAULT NULL COMMENT '内部业务唯一标识',
  `OUTER_BIZ_KEY` varchar(32) DEFAULT NULL COMMENT '外部业务唯一标识',
  `ID_CARD` varchar(32) DEFAULT NULL COMMENT '身份证号',
  `STATUS` decimal(3,0) DEFAULT NULL COMMENT '状态@正常:1|存档:2||其它:3',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='卡号映射';

-- ----------------------------
-- Records of card_map
-- ----------------------------

-- ----------------------------
-- Table structure for `customer`
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `ID` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `OUTER_INNER` varchar(16) NOT NULL COMMENT '外部标识',
  `OUTER_DESC` varchar(32) DEFAULT NULL COMMENT '外部描述',
  `CORP_NAME` varchar(32) DEFAULT NULL COMMENT '企业名称',
  `CORP_CODE` varchar(32) DEFAULT NULL COMMENT '企业代码',
  `CORP_INFO` varchar(128) NOT NULL COMMENT '企业信息',
  `APPEND_BY` datetime DEFAULT NULL COMMENT '加入时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COMMENT='对接客户信息';

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1', 'gx_0471001', '集付宝', '金海集团', '31291000131218', '金海集团', '2013-01-01 15:11:20');
INSERT INTO `customer` VALUES ('2', 'gx_0471002', '集付宝2', '金海集团', '31291000131218', '金海集团', '2013-01-02 15:11:56');
INSERT INTO `customer` VALUES ('3', 'sh_021X001', '手机app平台', 'xx公司', '1000', '刈润体乳', '2013-04-01 15:12:36');
INSERT INTO `customer` VALUES ('4', '4', '他人与他人', '喝酒很关键', '1004', '反规划和', '2013-08-08 15:13:26');
INSERT INTO `customer` VALUES ('5', 'sh_021X002', '微时代', '买卖提', '1001', '上海买卖提实业实有限公司', '2013-08-08 15:24:41');
INSERT INTO `customer` VALUES ('6', '6', '玩儿微微', '无气味', '1006', '嗡嗡嗡', '2013-08-08 15:24:41');
INSERT INTO `customer` VALUES ('7', '7', '头一天一天', '玉玉', '1007', 'iuoioio', '2013-01-01 15:02:00');
INSERT INTO `customer` VALUES ('8', '8', '头一天一8', 'uiuoiuo', '1008', 'iuoioi88', '2013-01-01 15:02:00');
INSERT INTO `customer` VALUES ('9', '9', '请问请问', 'uiuo啪啪啪', '1009', 'iuw额为wewe', '2013-01-01 15:02:00');
INSERT INTO `customer` VALUES ('12', '10', 'werewolf', '我热温热污染', '10010', '价格将规划局和', '2013-08-30 15:27:53');
INSERT INTO `customer` VALUES ('13', '11', 'werewolf', '我热温热污染', '10011', 'iuw额为8', '2013-08-30 15:27:53');

-- ----------------------------
-- Table structure for `map_role_auth`
-- ----------------------------
DROP TABLE IF EXISTS `map_role_auth`;
CREATE TABLE `map_role_auth` (
  `ID_` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '序列@',
  `ROLE_CODE` varchar(32) DEFAULT NULL COMMENT '角色编码',
  `AUTH_CODE` varchar(32) DEFAULT NULL COMMENT '权限编码',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8 COMMENT='角色与权限关系';

-- ----------------------------
-- Records of map_role_auth
-- ----------------------------
INSERT INTO `map_role_auth` VALUES ('1', 'ADMIN', null);
INSERT INTO `map_role_auth` VALUES ('2', 'CT', null);
INSERT INTO `map_role_auth` VALUES ('3', 'GJJT', null);
INSERT INTO `map_role_auth` VALUES ('4', 'GJJT', '749');
INSERT INTO `map_role_auth` VALUES ('5', 'GJJT', '750');
INSERT INTO `map_role_auth` VALUES ('6', 'GJJT', '751');
INSERT INTO `map_role_auth` VALUES ('7', 'GJJT', '752');
INSERT INTO `map_role_auth` VALUES ('8', 'GJJT', '753');
INSERT INTO `map_role_auth` VALUES ('9', 'GJJT', '754');
INSERT INTO `map_role_auth` VALUES ('10', 'GJJT', '755');
INSERT INTO `map_role_auth` VALUES ('11', 'GJJT', '756');
INSERT INTO `map_role_auth` VALUES ('12', 'GJJT', '757');
INSERT INTO `map_role_auth` VALUES ('13', 'GJJT', '758');
INSERT INTO `map_role_auth` VALUES ('14', 'GJJT', '759');
INSERT INTO `map_role_auth` VALUES ('15', 'GJJT', '760');
INSERT INTO `map_role_auth` VALUES ('16', 'GJJT', '761');
INSERT INTO `map_role_auth` VALUES ('17', 'GJJT', '762');
INSERT INTO `map_role_auth` VALUES ('18', 'GJJT', '763');
INSERT INTO `map_role_auth` VALUES ('19', 'GJJT', '764');
INSERT INTO `map_role_auth` VALUES ('20', 'GJJT', '765');
INSERT INTO `map_role_auth` VALUES ('21', 'GJJT', '766');
INSERT INTO `map_role_auth` VALUES ('22', 'GJJT', '767');
INSERT INTO `map_role_auth` VALUES ('23', 'GJJT', '768');
INSERT INTO `map_role_auth` VALUES ('24', 'GJJT', '769');
INSERT INTO `map_role_auth` VALUES ('25', 'GJJT', '770');
INSERT INTO `map_role_auth` VALUES ('26', 'GJJT', '771');
INSERT INTO `map_role_auth` VALUES ('27', 'GJJT', '772');
INSERT INTO `map_role_auth` VALUES ('28', 'GJJT', '773');
INSERT INTO `map_role_auth` VALUES ('29', 'GJJT', '774');
INSERT INTO `map_role_auth` VALUES ('30', 'GJJT', '775');
INSERT INTO `map_role_auth` VALUES ('31', 'GJJT', '776');
INSERT INTO `map_role_auth` VALUES ('32', 'GJJT', '777');
INSERT INTO `map_role_auth` VALUES ('33', 'GJJT', '778');
INSERT INTO `map_role_auth` VALUES ('34', 'GJJT', '779');
INSERT INTO `map_role_auth` VALUES ('35', 'GJJT', '780');
INSERT INTO `map_role_auth` VALUES ('36', 'GJJT', '781');
INSERT INTO `map_role_auth` VALUES ('37', 'GJJT', '782');
INSERT INTO `map_role_auth` VALUES ('38', 'GJJT', '783');
INSERT INTO `map_role_auth` VALUES ('39', 'GJJT', '784');
INSERT INTO `map_role_auth` VALUES ('40', 'GJJT', '785');
INSERT INTO `map_role_auth` VALUES ('41', 'GJJT', '786');
INSERT INTO `map_role_auth` VALUES ('42', 'GJJT', '787');
INSERT INTO `map_role_auth` VALUES ('43', 'GJJT', '788');
INSERT INTO `map_role_auth` VALUES ('44', 'GJJT', '789');
INSERT INTO `map_role_auth` VALUES ('45', 'GJJT', '790');
INSERT INTO `map_role_auth` VALUES ('46', 'GJJT', '791');
INSERT INTO `map_role_auth` VALUES ('47', 'GJJT', '792');
INSERT INTO `map_role_auth` VALUES ('48', 'GJJT', '793');
INSERT INTO `map_role_auth` VALUES ('49', 'GJJT', '794');
INSERT INTO `map_role_auth` VALUES ('50', 'GJJT', '795');
INSERT INTO `map_role_auth` VALUES ('51', 'GJJT', '796');
INSERT INTO `map_role_auth` VALUES ('52', 'GJJT', '797');
INSERT INTO `map_role_auth` VALUES ('53', 'GJJT', '798');
INSERT INTO `map_role_auth` VALUES ('54', 'GJJT', '799');
INSERT INTO `map_role_auth` VALUES ('55', 'GJJT', '800');
INSERT INTO `map_role_auth` VALUES ('56', 'GJJT', '801');
INSERT INTO `map_role_auth` VALUES ('57', 'GJJT', '802');
INSERT INTO `map_role_auth` VALUES ('58', 'GJJT', '803');
INSERT INTO `map_role_auth` VALUES ('59', 'GJJT', '804');
INSERT INTO `map_role_auth` VALUES ('60', 'GJJT', '805');
INSERT INTO `map_role_auth` VALUES ('61', 'GJJT', '806');
INSERT INTO `map_role_auth` VALUES ('62', 'GJJT', '807');
INSERT INTO `map_role_auth` VALUES ('63', 'GJJT', '808');
INSERT INTO `map_role_auth` VALUES ('64', 'GJJT', '809');
INSERT INTO `map_role_auth` VALUES ('65', 'GJJT', '810');
INSERT INTO `map_role_auth` VALUES ('66', 'GJJT', '811');
INSERT INTO `map_role_auth` VALUES ('67', 'GJJT', '812');
INSERT INTO `map_role_auth` VALUES ('68', 'GJJT', '813');
INSERT INTO `map_role_auth` VALUES ('69', 'GJJT', '814');
INSERT INTO `map_role_auth` VALUES ('70', 'GJJT', '815');
INSERT INTO `map_role_auth` VALUES ('71', 'GJJT', '816');
INSERT INTO `map_role_auth` VALUES ('72', 'GJJT', '817');
INSERT INTO `map_role_auth` VALUES ('73', 'GJJT', '818');
INSERT INTO `map_role_auth` VALUES ('74', 'GJJT', '819');
INSERT INTO `map_role_auth` VALUES ('75', 'GJJT', '820');
INSERT INTO `map_role_auth` VALUES ('76', 'GJJT', '821');
INSERT INTO `map_role_auth` VALUES ('77', 'GJJT', '822');
INSERT INTO `map_role_auth` VALUES ('78', 'GJJT', '823');
INSERT INTO `map_role_auth` VALUES ('79', 'GJJT', '824');
INSERT INTO `map_role_auth` VALUES ('80', 'GJJT', '825');
INSERT INTO `map_role_auth` VALUES ('81', 'GJJT', '728');
INSERT INTO `map_role_auth` VALUES ('82', 'GJJT', '729');
INSERT INTO `map_role_auth` VALUES ('83', 'GJJT', '730');
INSERT INTO `map_role_auth` VALUES ('84', 'GJJT', '731');
INSERT INTO `map_role_auth` VALUES ('85', 'GJJT', '732');
INSERT INTO `map_role_auth` VALUES ('86', 'GJJT', '733');
INSERT INTO `map_role_auth` VALUES ('87', 'GJJT', '734');
INSERT INTO `map_role_auth` VALUES ('88', 'GJJT', '735');
INSERT INTO `map_role_auth` VALUES ('89', 'GJJT', '736');
INSERT INTO `map_role_auth` VALUES ('90', 'GJJT', '737');
INSERT INTO `map_role_auth` VALUES ('91', 'GJJT', '738');
INSERT INTO `map_role_auth` VALUES ('92', 'GJJT', '739');
INSERT INTO `map_role_auth` VALUES ('93', 'GJJT', '740');
INSERT INTO `map_role_auth` VALUES ('94', 'GJJT', '741');
INSERT INTO `map_role_auth` VALUES ('95', 'GJJT', '742');
INSERT INTO `map_role_auth` VALUES ('96', 'GJJT', '743');
INSERT INTO `map_role_auth` VALUES ('97', 'GJJT', '744');
INSERT INTO `map_role_auth` VALUES ('98', 'GJJT', '745');
INSERT INTO `map_role_auth` VALUES ('99', 'GJJT', '746');
INSERT INTO `map_role_auth` VALUES ('100', 'GJJT', '747');
INSERT INTO `map_role_auth` VALUES ('101', 'GJJT', '748');

-- ----------------------------
-- Table structure for `map_user_release`
-- ----------------------------
DROP TABLE IF EXISTS `map_user_release`;
CREATE TABLE `map_user_release` (
  `ID_` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `SYS_ADMIN_ID` bigint(18) DEFAULT NULL COMMENT '用户ID',
  `SYS_ORG_CODE` varchar(32) DEFAULT NULL COMMENT '组织编码',
  `USR_ROLE_CODE` varchar(32) DEFAULT NULL COMMENT '角色代码',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of map_user_release
-- ----------------------------
INSERT INTO `map_user_release` VALUES ('1', '0', 'bytSoft', 'ADMIN');
INSERT INTO `map_user_release` VALUES ('2', '3', 'bytSoft', 'GJJT');
INSERT INTO `map_user_release` VALUES ('3', '6', '330200', null);

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `ID` decimal(18,0) NOT NULL COMMENT '主键',
  `INNER_IDENT` varchar(16) NOT NULL COMMENT '内部标识',
  `INNER_DESC` varchar(32) DEFAULT NULL COMMENT '内部描述',
  `NAME` varchar(32) NOT NULL COMMENT '名称',
  `CODE` varchar(32) NOT NULL COMMENT '编号',
  `DESCRIPT` varchar(128) DEFAULT NULL COMMENT '描述',
  `VRESION` varchar(16) NOT NULL COMMENT '版本号',
  `STATUS` int(3) NOT NULL COMMENT '状态',
  `LIFE_CYCLE` int(3) DEFAULT NULL COMMENT '生命周期(月）',
  `APPEN_BY` datetime DEFAULT NULL COMMENT '加入时间',
  `MODIFY_BY` datetime DEFAULT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`ID`),
  KEY `PRODUCT_UQ` (`INNER_IDENT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品';

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('21', '2', 'tjrtjrt7', '爽歪歪热yhrty', '34213', '爽歪rher', 'version1003', '1', '12', null, '2014-01-07 11:35:06');
INSERT INTO `product` VALUES ('22', '3', 'v刹v刹', '宣传v刹洗', '213213', '范德萨范德萨个11111', 'version', '1', '3', '2013-01-01 11:38:10', '2014-01-07 18:15:22');
INSERT INTO `product` VALUES ('25', '4', '地方和规范化', '根深蒂固', '1001', '额维尔瓦热', 'version1002', '1', '3', '2013-08-15 14:30:05', '2013-08-15 14:30:05');
INSERT INTO `product` VALUES ('30', '5', '惹我认为二', '股份合计合计进来看', '1009', '问额外企鹅', 'version1009', '1', '9', '2013-08-15 14:35:49', '2013-08-15 14:35:49');
INSERT INTO `product` VALUES ('31', 'sh021denong001', '上海德浓微宝平台', '上海德浓微宝平台', '021001', '微宝应用平台一期', 'Version2.0', '1', '10', '2013-08-15 14:36:31', '2013-08-15 14:36:31');
INSERT INTO `product` VALUES ('32', 'gx0471jftcard002', '广西集付通01', '哟哟哟', '0471002', '四十四', 'version10011', '1', '4', '2013-08-15 14:37:34', '2013-08-15 14:37:34');
INSERT INTO `product` VALUES ('33', 'gx0471jftcard001', '网新创建广西集能项目', '集付宝对接接口', '0471001', '减肥减肥', 'version10013', '1', '12', '2013-08-15 14:55:57', '2013-08-15 14:55:57');
INSERT INTO `product` VALUES ('43', '1', '2', '1', '1', '1', '1', '1', '1', '2014-01-08 13:54:38', '2014-01-10 10:15:22');
INSERT INTO `product` VALUES ('46', 'te', 'te', 'te', 'te', 'te', 'te', '1', '1', '2014-01-08 14:04:12', '2014-01-08 14:04:12');

-- ----------------------------
-- Table structure for `product_above`
-- ----------------------------
DROP TABLE IF EXISTS `product_above`;
CREATE TABLE `product_above` (
  `ID_` bigint(18) NOT NULL AUTO_INCREMENT,
  `INNER_IDENT` varchar(32) DEFAULT NULL COMMENT '内部标识',
  `INNER_DESC` varchar(32) DEFAULT NULL COMMENT '内部描述',
  `OUTER_IDENT` varchar(32) DEFAULT NULL COMMENT '外部标识',
  `OUTER_DESC` varchar(32) DEFAULT NULL COMMENT '外部标识',
  `MODEL_` int(3) NOT NULL COMMENT '发部类型@1: 测试|2 :发布',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='在线上的产品';

-- ----------------------------
-- Records of product_above
-- ----------------------------
INSERT INTO `product_above` VALUES ('1', 'gx0471jftcard001', 'hz', 'gx_0471001', 'gz', '1');
INSERT INTO `product_above` VALUES ('2', 'gx0471jftcard002', '121212', 'gx0471jftcard002', '222333', '1');
INSERT INTO `product_above` VALUES ('3', 'gx0471jftcard003', 'jftcard003', 'gx0471jftcard003', 'jftcard003', '1');
INSERT INTO `product_above` VALUES ('4', 'gx0471jftcard002', 'hz', 'gx_0471002', 'gx', '2');
INSERT INTO `product_above` VALUES ('5', 'sh021denong001', '微宝一期', 'sh_021X002', '微时代 ', '1');

-- ----------------------------
-- Table structure for `role_auth`
-- ----------------------------
DROP TABLE IF EXISTS `role_auth`;
CREATE TABLE `role_auth` (
  `ID_` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '序列@',
  `ROLE_CODE` varchar(32) DEFAULT NULL COMMENT '角色编码',
  `AUTH_CODE` varchar(32) DEFAULT NULL COMMENT '权限编码',
  PRIMARY KEY (`ID_`),
  KEY `AK_KEY_2_ROLE_AUT` (`ID_`,`ROLE_CODE`,`AUTH_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权限关系';

-- ----------------------------
-- Records of role_auth
-- ----------------------------

-- ----------------------------
-- Table structure for `role_sys`
-- ----------------------------
DROP TABLE IF EXISTS `role_sys`;
CREATE TABLE `role_sys` (
  `ID_` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '序列',
  `NAME_` varchar(32) NOT NULL COMMENT '角色名称',
  `DESC_` varchar(128) DEFAULT NULL COMMENT '角色描述',
  `CODE_` varchar(32) NOT NULL COMMENT '角色代码',
  `CATEGORY_` bigint(5) DEFAULT NULL COMMENT '类别@',
  `STATUS_` int(3) NOT NULL COMMENT '状态@停用:0|启动:1',
  `APPEND_BY` bigint(18) NOT NULL COMMENT '创建人',
  `APPEND_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `MODIFY_BY` bigint(18) NOT NULL COMMENT '创建人',
  `MODIFIED_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改时间',
  `REMARK_` varchar(128) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='角色信息';

-- ----------------------------
-- Records of role_sys
-- ----------------------------
INSERT INTO `role_sys` VALUES ('1', '管理员', '管理员', 'ADMIN', '1', '1', '0', '2014-10-21 14:00:03', '0', '2014-10-21 14:00:03', null);
INSERT INTO `role_sys` VALUES ('2', '运维', '运维', 'OPERATE', '1', '1', '0', '2014-10-21 14:00:03', '0', '2014-10-21 14:00:03', null);
INSERT INTO `role_sys` VALUES ('3', '业务员', '业务员', 'BIZ', '1', '1', '0', '2014-10-21 14:00:03', '0', '2014-10-21 14:00:03', null);

-- ----------------------------
-- Table structure for `sys_admin`
-- ----------------------------
DROP TABLE IF EXISTS `sys_admin`;
CREATE TABLE `sys_admin` (
  `ID_` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `NAME_` varchar(32) NOT NULL COMMENT '账户名',
  `PWD_` varchar(32) NOT NULL COMMENT '密码',
  `ENABLED_` int(1) DEFAULT '0' COMMENT '是否有效@状态@0:无效|1:有效',
  `LOCKED_` int(1) DEFAULT '0' COMMENT '是否锁定@0:锁定|1:未锁定',
  `LOCK_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '锁定时间',
  `LOGIN_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '登录时间',
  `MOBILE_` varchar(16) DEFAULT NULL COMMENT '手机',
  `EMAIL_` varchar(32) DEFAULT NULL COMMENT '电邮',
  `LOGIN_FAILURE_COUNT` int(3) DEFAULT NULL COMMENT '登录错误次数',
  `APPEND_BY` bigint(18) DEFAULT NULL COMMENT '添加人',
  `MODIFY_BY` bigint(18) DEFAULT NULL COMMENT '修改人',
  `APPEND_TIME` datetime DEFAULT NULL COMMENT '添加时间',
  `MODIFY_TIME` datetime DEFAULT NULL COMMENT '最后修改时间',
  `SALT_` varchar(6) DEFAULT NULL COMMENT '调挤',
  `STATUS_` int(2) DEFAULT NULL COMMENT '状态@0:停用|1:启用',
  `PICTURE_ID` bigint(18) DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of sys_admin
-- ----------------------------
INSERT INTO `sys_admin` VALUES ('0', 'admin', '827CCB0EEA8A706C4C34A16891F84E7B', '0', '0', '2016-06-10 19:41:56', '2015-03-16 17:59:36', '13519991111', '13519991111@126.com', '0', null, null, null, null, null, '0', null);
INSERT INTO `sys_admin` VALUES ('2', 'sanss', '827CCB0EEA8A706C4C34A16891F84E7B', '0', '0', '2015-03-16 17:59:36', '2015-03-16 17:59:36', '13519991111', 'L', '0', '461763985687866816', '987988069420680448', '1959-09-25 00:00:00', '1959-12-06 00:00:00', 'H', '27', '124445027');
INSERT INTO `sys_admin` VALUES ('3', '91pp', '827CCB0EEA8A706C4C34A16891F84E7B', '0', '0', '2015-03-16 17:59:36', '2015-03-16 17:59:36', '13519991111', 'CpuahnRKlBhRTwrEMHOhqjUZX', '0', '876416126266121856', '100264694076031440', '2097-08-28 00:00:00', '1988-10-05 00:00:00', 'XI', '20', '115215026');
INSERT INTO `sys_admin` VALUES ('4', 'ct', '827CCB0EEA8A706C4C34A16891F84E7B', '0', '0', '2015-03-16 17:59:36', '2015-03-16 17:59:36', '13519991111', 'vpUGxWDk', '0', '641066065290942848', '748810780933126784', '2003-08-21 00:00:00', '2063-04-05 00:00:00', 'B', '38', '584794354');
INSERT INTO `sys_admin` VALUES ('5', 'gjjt', '827CCB0EEA8A706C4C34A16891F84E7B', '0', '0', '2015-03-16 17:59:36', '2015-03-16 17:59:36', '13519991111', 'txnNbbBVVmmCIGmWklIjCaHgCGso', '0', '489658310078084480', '9369902778416872', '1906-02-05 00:00:00', '2088-10-12 00:00:00', 'dIP', '61', '677819635');
INSERT INTO `sys_admin` VALUES ('6', 'test1', '827CCB0EEA8A706C4C34A16891F84E7B', '0', '0', '2015-03-16 17:59:36', '2015-03-16 17:59:36', '13519991111', 'NhIMCl', '0', '236467889044433824', '22728998214006424', '2084-12-20 00:00:00', '2074-11-26 00:00:00', 'CULoDA', '25', '908107354');
INSERT INTO `sys_admin` VALUES ('7', 'test2', '827CCB0EEA8A706C4C34A16891F84E7B', '0', '0', '2015-03-16 17:59:36', '2015-03-16 17:59:36', '13519991111', 'tJ', '0', '854625774547457664', '370790630113333440', '1929-11-03 00:00:00', '2060-01-22 00:00:00', 'FI', '43', '673012759');
INSERT INTO `sys_admin` VALUES ('8', 'test3', '827CCB0EEA8A706C4C34A16891F84E7B', '0', '0', '2015-03-16 17:59:36', '2015-03-16 17:59:36', '13519991111', 'bdDVZp', '0', '256200993899256000', '937786661088466688', '1972-01-14 00:00:00', '1924-01-01 00:00:00', 'UUmjSv', '77', '424925644');
INSERT INTO `sys_admin` VALUES ('9', 'test4', '827CCB0EEA8A706C4C34A16891F84E7B', '0', '0', '2015-03-16 17:59:36', '2015-03-16 17:59:36', '13519991111', 'OsIsJvnwmROOgBDwMbYqvRoYf', '0', '51652927417308096', '906303169205784832', '2058-07-10 00:00:00', '2004-01-16 00:00:00', 'T', '41', '39117969');
INSERT INTO `sys_admin` VALUES ('10', 'test5', '827CCB0EEA8A706C4C34A16891F84E7B', '0', '0', '2015-03-16 17:59:36', '2015-03-16 17:59:36', '13519991111', 'thylcfcxRifY', '0', '177817402640357600', '101386328926309936', '2041-09-21 00:00:00', '2051-12-25 00:00:00', 'xfowZ', '74', '104759056');

-- ----------------------------
-- Table structure for `sys_area`
-- ----------------------------
DROP TABLE IF EXISTS `sys_area`;
CREATE TABLE `sys_area` (
  `ID_` bigint(18) NOT NULL COMMENT 'ID',
  `CODE_` varchar(32) DEFAULT NULL COMMENT '代码',
  `NAME_` varchar(32) DEFAULT NULL COMMENT '名称',
  `ZIP_CODE_` varchar(4) DEFAULT NULL COMMENT '电话区号',
  `POST_CODE_` varchar(6) DEFAULT NULL COMMENT '邮编',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='行政区划';

-- ----------------------------
-- Records of sys_area
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_item`
-- ----------------------------
DROP TABLE IF EXISTS `sys_item`;
CREATE TABLE `sys_item` (
  `ID_` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `PARENT_ID` bigint(18) DEFAULT NULL COMMENT '父节点',
  `LADDER_` int(1) NOT NULL COMMENT '树阶',
  `ITEM_CODE` varchar(32) NOT NULL COMMENT '选项名称',
  `ITEM_COMMENTS` varchar(32) DEFAULT NULL COMMENT '选项描述',
  `STATUS_` int(2) NOT NULL DEFAULT '0' COMMENT '状态@停用:1|启用:0',
  `KEY_CODE` varchar(32) DEFAULT NULL COMMENT '编码',
  `KEY_VALUE` varchar(32) DEFAULT NULL COMMENT '值',
  `SORT_` int(3) DEFAULT '0' COMMENT '排序',
  `APPEND_BY_` bigint(18) DEFAULT NULL COMMENT '创建人',
  `APPEND_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `MODIFY_BY_` bigint(18) DEFAULT NULL COMMENT '修改人',
  `MODIFY_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `REMARK_` varchar(1024) DEFAULT NULL COMMENT '备注',
  `EXCERPT_ITEM_CODE` varchar(1024) DEFAULT NULL COMMENT '引用编码',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB AUTO_INCREMENT=618 DEFAULT CHARSET=utf8 COMMENT='系统选项表';

-- ----------------------------
-- Records of sys_item
-- ----------------------------
INSERT INTO `sys_item` VALUES ('385', '0', '1', 'SYSTEM', '内部系统类', '0', 'M006', null, '0', null, '2014-09-28 11:00:03', null, null, null, null);
INSERT INTO `sys_item` VALUES ('386', '385', '2', 'SYSITEM', '系统选项表', '0', null, null, '0', '0', '2014-09-28 11:00:03', null, null, 'SYSITEM', null);
INSERT INTO `sys_item` VALUES ('387', '386', '3', 'STATUS', '状态', '0', '1', '停用', '0', null, '2014-09-28 11:00:03', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('388', '386', '3', 'STATUS', '状态', '0', '0', '启用', '1', null, '2014-09-28 11:00:04', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('453', '385', '2', 'SYSMODEL', '系统模块', '0', null, null, '1', '0', '2014-09-28 14:09:55', null, null, 'SYSMODEL', null);
INSERT INTO `sys_item` VALUES ('454', '453', '3', 'STATUS', '状态', '0', '1', '停用', '0', null, '2014-09-28 14:09:55', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('455', '453', '3', 'STATUS', '状态', '0', '0', '启用', '1', null, '2014-09-28 14:09:56', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('456', '385', '2', 'SYSADMIN', '用户表', '0', null, null, '2', '0', '2014-09-28 14:21:44', null, null, 'SYSADMIN', null);
INSERT INTO `sys_item` VALUES ('457', '385', '2', 'SYSAREA', '行政区划', '0', null, null, '3', '0', '2014-09-28 14:21:47', null, null, 'SYSAREA', null);
INSERT INTO `sys_item` VALUES ('458', '385', '2', 'SYSMENU', '系统菜单', '0', null, null, '4', '0', '2014-09-28 14:21:49', null, null, 'SYSMENU', null);
INSERT INTO `sys_item` VALUES ('459', '385', '2', 'SYSORG', '组织机构', '0', null, null, '5', '0', '2014-09-28 14:21:50', null, null, 'SYSORG', null);
INSERT INTO `sys_item` VALUES ('460', '385', '2', 'SYSROLE', '角色信息', '0', null, null, '6', '0', '2014-09-28 14:21:51', null, null, 'SYSROLE', null);
INSERT INTO `sys_item` VALUES ('461', '460', '3', 'STATUS', '状态', '0', '0,', '停用', '0', null, '2014-09-28 14:21:51', null, null, 'STATUS', null);
INSERT INTO `sys_item` VALUES ('462', '460', '3', 'STATUS', '状态', '0', '1', '启动', '1', null, '2014-09-28 14:21:52', null, null, 'STATUS', null);
INSERT INTO `sys_item` VALUES ('463', '0', '1', 'AUTHER', '账户类', '0', 'M001', null, '1', null, '2014-09-29 13:36:19', null, null, null, null);
INSERT INTO `sys_item` VALUES ('464', '463', '2', 'AUTHFUN', '功能权限', '0', null, null, '0', '0', '2014-09-29 13:36:19', null, null, 'AUTHFUN', null);
INSERT INTO `sys_item` VALUES ('465', '0', '1', 'ORLE', '角色管理', '0', 'M0062', null, '2', null, '2014-09-29 13:42:29', null, null, null, null);
INSERT INTO `sys_item` VALUES ('466', '465', '2', 'ROLEAUTH', '角色权限关系', '0', null, null, '0', '0', '2014-09-29 13:42:30', null, null, 'ROLEAUTH', null);
INSERT INTO `sys_item` VALUES ('467', '465', '2', 'ROLESYS', '角色信息', '0', null, null, '1', '0', '2014-09-29 13:42:31', null, null, 'ROLESYS', null);
INSERT INTO `sys_item` VALUES ('468', '467', '3', 'STATUS', '状态', '0', '0,', '停用', '0', null, '2014-09-29 13:42:31', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('469', '467', '3', 'STATUS', '状态', '0', '1', '启动', '1', null, '2014-09-29 13:42:32', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('470', '0', '1', 'USER', '用户类', '0', 'M0061', null, '3', null, '2014-09-29 13:42:33', null, null, null, null);
INSERT INTO `sys_item` VALUES ('471', '470', '2', 'USRROLE', '角色信息', '0', null, null, '0', '0', '2014-09-29 13:42:33', null, null, 'USRROLE', null);
INSERT INTO `sys_item` VALUES ('472', '471', '3', 'STATUS', '状态', '0', '0', '停用', '0', null, '2014-09-29 13:42:33', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('473', '471', '3', 'STATUS', '状态', '0', '1', '启动', '1', null, '2014-09-29 13:42:34', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('474', '0', '1', 'SYSTEM', '角色管理', '0', 'M0060', null, '4', null, '2014-09-30 12:23:40', null, null, null, null);
INSERT INTO `sys_item` VALUES ('475', '474', '2', 'SYSORG', '组织机构', '0', null, null, '0', '0', '2014-09-30 12:23:41', null, null, 'SYSORG', null);
INSERT INTO `sys_item` VALUES ('493', '474', '2', 'SYSADMIN', '用户表', '0', null, null, '1', '0', '2014-10-09 16:30:16', null, null, 'SYSADMIN', null);
INSERT INTO `sys_item` VALUES ('494', '474', '2', 'SYSAREA', '行政区划', '0', null, null, '2', '0', '2014-10-09 16:30:19', null, null, 'SYSAREA', null);
INSERT INTO `sys_item` VALUES ('495', '474', '2', 'SYSITEM', '系统选项表', '0', null, null, '3', '0', '2014-10-09 16:30:21', null, null, 'SYSITEM', null);
INSERT INTO `sys_item` VALUES ('496', '495', '3', 'STATUS', '状态', '0', '1', '停用', '0', null, '2014-10-09 16:30:21', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('497', '495', '3', 'STATUS', '状态', '0', '0', '启用', '1', null, '2014-10-09 16:30:21', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('498', '474', '2', 'SYSMENU', '系统菜单', '0', null, null, '4', '0', '2014-10-09 16:30:22', null, null, 'SYSMENU', null);
INSERT INTO `sys_item` VALUES ('499', '474', '2', 'SYSMODEL', '系统模块', '0', null, null, '5', '0', '2014-10-09 16:30:23', null, null, 'SYSMODEL', null);
INSERT INTO `sys_item` VALUES ('500', '499', '3', 'STATUS', '状态', '0', '1', '停用', '0', null, '2014-10-09 16:30:23', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('501', '499', '3', 'STATUS', '状态', '0', '0', '启用', '1', null, '2014-10-09 16:30:24', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('502', '470', '2', 'USRAUTH', '系统权限', '0', null, null, '1', '0', '2014-10-09 16:30:26', null, null, 'USRAUTH', null);
INSERT INTO `sys_item` VALUES ('503', '502', '3', 'STATUS', '状态', '0', '0', '企业', '0', null, '2014-10-09 16:30:26', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('504', '502', '3', 'STATUS', '状态', '0', '1', '停用', '1', null, '2014-10-09 16:30:26', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('505', '470', '2', 'USRROLEAUTH', '角色权限', '0', null, null, '2', '0', '2014-10-09 16:30:28', null, null, 'USRROLEAUTH', null);
INSERT INTO `sys_item` VALUES ('506', '474', '2', 'SYSROLE', '角色信息', '0', null, null, '6', '0', '2014-10-09 17:51:13', null, null, 'SYSROLE', null);
INSERT INTO `sys_item` VALUES ('507', '506', '3', 'STATUS', '状态', '0', '0,', '停用', '0', null, '2014-10-09 17:51:13', null, null, 'STATUS', null);
INSERT INTO `sys_item` VALUES ('508', '506', '3', 'STATUS', '状态', '0', '1', '启动', '1', null, '2014-10-09 17:51:14', null, null, 'STATUS', null);
INSERT INTO `sys_item` VALUES ('513', '0', '1', 'MAPPING', '系统对象关系', '0', 'M0063', null, '5', null, '2014-10-30 12:38:11', null, null, null, null);
INSERT INTO `sys_item` VALUES ('514', '513', '2', 'MAPROLEAUTH', '角色与权限关系', '0', null, null, '0', '0', '2014-10-30 12:38:12', null, null, 'MAPROLEAUTH', null);
INSERT INTO `sys_item` VALUES ('515', '513', '2', 'MAPUSERRELEASE', null, '0', null, null, '1', '0', '2014-10-30 12:38:23', null, null, 'MAPUSERRELEASE', null);
INSERT INTO `sys_item` VALUES ('533', '0', '1', 'CHECKTOOLS', '数据核查', '0', 'M007', null, '6', null, '2014-11-18 10:41:41', null, null, null, null);
INSERT INTO `sys_item` VALUES ('534', '533', '2', 'CTDATASOURCE', '数据源配置', '0', null, null, '0', '0', '2014-11-18 10:41:41', null, null, 'CTDATASOURCE', null);
INSERT INTO `sys_item` VALUES ('535', '534', '3', 'STATUS', '状态', '0', '0', '停用', '0', null, '2014-11-18 10:41:41', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('536', '534', '3', 'STATUS', '状态', '0', '1', '启用', '1', null, '2014-11-18 10:41:41', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('537', '534', '3', 'STATUS', '状态', '0', '2', '连接成功', '2', null, '2014-11-18 10:41:41', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('538', '534', '3', 'STATUS', '状态', '0', '3', '连接失败', '3', null, '2014-11-18 10:41:42', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('539', '533', '2', 'CTHOMEWORK', '检查作业', '0', null, null, '1', '0', '2014-11-18 10:41:43', null, null, 'CTHOMEWORK', null);
INSERT INTO `sys_item` VALUES ('540', '539', '3', 'CATEGORY', '类别', '0', '1', '属性类', '0', null, '2014-11-18 10:41:43', null, null, 'CATEGORY_', null);
INSERT INTO `sys_item` VALUES ('541', '539', '3', 'CATEGORY', '类别', '0', '2', '冗余类', '1', null, '2014-11-18 10:41:43', null, null, 'CATEGORY_', null);
INSERT INTO `sys_item` VALUES ('542', '539', '3', 'CATEGORY', '类别', '0', '3', '关联类', '2', null, '2014-11-18 10:41:43', null, null, 'CATEGORY_', null);
INSERT INTO `sys_item` VALUES ('543', '539', '3', 'CATEGORY', '类别', '0', '4', '状态类', '3', null, '2014-11-18 10:41:43', null, null, 'CATEGORY_', null);
INSERT INTO `sys_item` VALUES ('544', '539', '3', 'STATUS', '状态', '0', '0', '停用', '0', null, '2014-11-18 10:41:44', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('545', '539', '3', 'STATUS', '状态', '0', '1', '启用', '1', null, '2014-11-18 10:41:44', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('546', '539', '3', 'STATUS', '状态', '0', '2', '作业中', '2', null, '2014-11-18 10:41:44', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('547', '533', '2', 'CTWORKRESULT', '作业成果', '0', null, null, '2', '0', '2014-11-18 10:41:44', null, null, 'CTWORKRESULT', null);
INSERT INTO `sys_item` VALUES ('548', '547', '3', 'CODE', '执行返回编码', '0', 'true', '成功', '0', null, '2014-11-18 10:41:45', null, null, 'CODE_', null);
INSERT INTO `sys_item` VALUES ('549', '547', '3', 'CODE', '执行返回编码', '0', 'false', '失败', '1', null, '2014-11-18 10:41:45', null, null, 'CODE_', null);
INSERT INTO `sys_item` VALUES ('550', '547', '3', 'RUNWAY', '执行方式', '0', 'auto', '自动', '0', null, '2014-11-18 10:41:45', null, null, 'RUN_WAY', null);
INSERT INTO `sys_item` VALUES ('551', '547', '3', 'RUNWAY', '执行方式', '0', 'manual', '手动', '1', null, '2014-11-18 10:41:45', null, null, 'RUN_WAY', null);
INSERT INTO `sys_item` VALUES ('552', '533', '2', 'CTWORKSCRIPT', '作业脚本', '0', null, null, '3', '0', '2014-11-18 10:41:45', null, null, 'CTWORKSCRIPT', null);
INSERT INTO `sys_item` VALUES ('553', '552', '3', 'TYPE', '类型', '0', '1', 'sql语句', '0', null, '2014-11-18 10:41:45', null, null, 'TYPE_', null);
INSERT INTO `sys_item` VALUES ('554', '552', '3', 'TYPE', '类型', '0', '2', '存储过程', '1', null, '2014-11-18 10:41:45', null, null, 'TYPE_', null);
INSERT INTO `sys_item` VALUES ('555', '552', '3', 'RESULTTYPE', '返回类型', '0', '1', '计数', '0', null, '2014-11-18 10:41:45', null, null, 'RESULT_TYPE', null);
INSERT INTO `sys_item` VALUES ('556', '552', '3', 'RESULTTYPE', '返回类型', '0', '2', '清单', '1', null, '2014-11-18 10:41:46', null, null, 'RESULT_TYPE', null);
INSERT INTO `sys_item` VALUES ('557', '552', '3', 'RESULTTYPE', '返回类型', '0', '3', '其它', '2', null, '2014-11-18 10:41:46', null, null, 'RESULT_TYPE', null);
INSERT INTO `sys_item` VALUES ('558', '552', '3', 'STATUS', '状态', '0', '0', '停用', '0', null, '2014-11-18 10:41:46', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('559', '552', '3', 'STATUS', '状态', '0', '1', '启用', '1', null, '2014-11-18 10:41:46', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('560', '552', '3', 'STATUS', '状态', '0', '2', '执行成功', '2', null, '2014-11-18 10:41:46', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('561', '552', '3', 'STATUS', '状态', '0', '3', '执行失败', '3', null, '2014-11-18 10:41:46', null, null, 'STATUS_', null);
INSERT INTO `sys_item` VALUES ('573', '533', '2', 'TBOND', '债券明细信息表', '0', null, null, '4', '0', '2014-12-03 16:37:17', null, null, 'TBOND', null);
INSERT INTO `sys_item` VALUES ('574', '0', '1', 'GJJIO', '公积金', '0', 'M0080', null, '7', null, '2014-12-03 16:39:58', null, null, null, null);
INSERT INTO `sys_item` VALUES ('575', '574', '2', 'TBOND', '债券明细信息表', '0', null, null, '0', '0', '2014-12-03 16:39:58', null, null, 'TBOND', null);
INSERT INTO `sys_item` VALUES ('576', '574', '2', 'TCOBORROWER', '共同贷款人信息', '0', null, null, '1', '0', '2014-12-03 16:40:01', null, null, 'TCOBORROWER', null);
INSERT INTO `sys_item` VALUES ('577', '574', '2', 'TEMPACCOUNT', '缴存单位总账信息', '0', null, null, '2', '0', '2014-12-03 16:40:02', null, null, 'TEMPACCOUNT', null);
INSERT INTO `sys_item` VALUES ('578', '574', '2', 'TEMPINFO', '单位信息', '0', null, null, '3', '0', '2014-12-03 16:40:05', null, null, 'TEMPINFO', null);
INSERT INTO `sys_item` VALUES ('579', '574', '2', 'TEMPRECORD', '缴存单位业务明细信息', '0', null, null, '4', '0', '2014-12-03 16:40:06', null, null, 'TEMPRECORD', null);
INSERT INTO `sys_item` VALUES ('580', '574', '2', 'TLOANACCOUNT', '借款人贷款账户信息', '0', null, null, '5', '0', '2014-12-03 16:40:08', null, null, 'TLOANACCOUNT', null);
INSERT INTO `sys_item` VALUES ('581', '574', '2', 'TLOANCONTRACT', '借款合同信息', '0', null, null, '6', '0', '2014-12-03 16:40:10', null, null, 'TLOANCONTRACT', null);
INSERT INTO `sys_item` VALUES ('582', '574', '2', 'TLOANRECORD', '贷款明细信息', '0', null, null, '7', '0', '2014-12-03 16:40:15', null, null, 'TLOANRECORD', null);
INSERT INTO `sys_item` VALUES ('583', '574', '2', 'TOVERDUEREGIST', '贷款人逾期登记信息', '0', null, null, '8', '0', '2014-12-03 16:40:17', null, null, 'TOVERDUEREGIST', null);
INSERT INTO `sys_item` VALUES ('584', '574', '2', 'TPERSONALACCINFO', '缴存个人账户信息', '0', null, null, '9', '0', '2014-12-03 16:40:22', null, null, 'TPERSONALACCINFO', null);
INSERT INTO `sys_item` VALUES ('585', '574', '2', 'TPERSONALACCOUNT', '缴存个人总账信息', '0', null, null, '10', '0', '2014-12-03 16:40:24', null, null, 'TPERSONALACCOUNT', null);
INSERT INTO `sys_item` VALUES ('586', '574', '2', 'TPERSONALINFO', '个人信息', '0', null, null, '11', '0', '2014-12-03 16:40:30', null, null, 'TPERSONALINFO', null);
INSERT INTO `sys_item` VALUES ('587', '574', '2', 'TPERSONALRECORD', '缴存个人业务明细信息', '0', null, null, '12', '0', '2014-12-03 16:40:32', null, null, 'TPERSONALRECORD', null);
INSERT INTO `sys_item` VALUES ('588', '574', '2', 'TPOLICYFILEFILE', '办公平台上传件信息表', '0', null, null, '13', '0', '2014-12-03 16:40:36', null, null, 'TPOLICYFILEFILE', null);
INSERT INTO `sys_item` VALUES ('589', '574', '2', 'TPOLICYFILERETURN', '通知回复表', '0', null, null, '14', '0', '2014-12-03 16:40:37', null, null, 'TPOLICYFILERETURN', null);
INSERT INTO `sys_item` VALUES ('593', '574', '2', 'TPOLICYINFO', '政策信息', '0', null, null, '15', '0', '2014-12-05 10:25:09', null, null, 'TPOLICYINFO', null);
INSERT INTO `sys_item` VALUES ('594', '574', '2', 'TLOGS', null, '0', null, null, '16', '0', '2014-12-30 15:48:24', null, null, 'TLOGS', null);
INSERT INTO `sys_item` VALUES ('595', '574', '2', 'TRUNPARAM', '运行时参数', '0', null, null, '17', '0', '2014-12-30 15:48:29', null, null, 'TRUNPARAM', null);
INSERT INTO `sys_item` VALUES ('596', '595', '3', 'RUNFLAG', '数据类型', '0', '1', '增量', '0', null, '2014-12-30 15:48:29', null, null, 'RUN_FLAG', null);
INSERT INTO `sys_item` VALUES ('597', '595', '3', 'RUNFLAG', '数据类型', '0', '2', '全量', '1', null, '2014-12-30 15:48:30', null, null, 'RUN_FLAG', null);
INSERT INTO `sys_item` VALUES ('614', '539', '3', 'CATEGORY', '类别', '0', '5', '自动处理类', '5', null, '2015-01-14 09:19:49', null, null, null, null);
INSERT INTO `sys_item` VALUES ('615', '552', '3', 'TYPE', '类型', '0', '3', 'shell脚本', '3', null, '2015-01-14 09:29:03', null, null, null, null);
INSERT INTO `sys_item` VALUES ('616', '552', '3', 'RESULTTYPE', '返回类型', '0', '4', '成功失败', '3', null, '2015-01-14 09:29:08', null, null, null, null);
INSERT INTO `sys_item` VALUES ('617', null, '0', 'DATA_DIRECTORY', '1', '1', '1', '1', '1', '1', null, null, null, null, null);

-- ----------------------------
-- Table structure for `sys_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `ID_` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '序列',
  `CODE_` varchar(16) NOT NULL COMMENT '编码',
  `NAME_` varchar(32) NOT NULL COMMENT '名称',
  `NAME_EN` varchar(32) DEFAULT NULL COMMENT '英文名称',
  `LADDER_` int(1) DEFAULT NULL COMMENT '阶级',
  `PARENT_ID` bigint(18) DEFAULT NULL COMMENT '父节点',
  `SORT_` bigint(5) DEFAULT '0' COMMENT '排序',
  `PICTURE_ID` bigint(18) DEFAULT NULL COMMENT '图标',
  `URL_` varchar(1024) DEFAULT NULL COMMENT 'url',
  `AUTHORITY_ID` bigint(18) DEFAULT NULL COMMENT '权限ID',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB AUTO_INCREMENT=284 DEFAULT CHARSET=utf8 COMMENT='系统菜单';

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', 'M00', 'XX管理系统', 'MRFRAME', '0', null, '0', null, null, null);
INSERT INTO `sys_menu` VALUES ('203', 'M001', '系统权限', null, '1', '0', '2', null, null, null);
INSERT INTO `sys_menu` VALUES ('204', '45', '功能权限管理', 'authFun', '2', '203', '0', null, null, '566');
INSERT INTO `sys_menu` VALUES ('205', 'M0062', '角色管理模块', null, '1', '0', '1', null, null, null);
INSERT INTO `sys_menu` VALUES ('206', '91', '角色权限关系管理', 'roleAuth', '2', '205', '0', null, null, '573');
INSERT INTO `sys_menu` VALUES ('207', '57', '角色信息管理', 'roleSys', '2', '205', '1', null, null, '580');
INSERT INTO `sys_menu` VALUES ('208', 'M0060', '系统功能', null, '1', '0', '0', null, null, null);
INSERT INTO `sys_menu` VALUES ('209', '95', '用户表管理', 'sysAdmin', '2', '208', '0', null, null, '587');
INSERT INTO `sys_menu` VALUES ('210', '81', '行政区划管理', 'sysArea', '2', '208', '1', null, null, '594');
INSERT INTO `sys_menu` VALUES ('211', '82', '系统选项表管理', 'sysItem', '2', '208', '2', null, null, '601');
INSERT INTO `sys_menu` VALUES ('212', '79', '系统菜单管理', 'sysMenu', '2', '208', '3', null, null, '608');
INSERT INTO `sys_menu` VALUES ('213', '38', '系统模块管理', 'sysModel', '2', '208', '4', null, null, '615');
INSERT INTO `sys_menu` VALUES ('214', '44', '组织机构管理', 'sysOrg', '2', '208', '5', null, null, '622');
INSERT INTO `sys_menu` VALUES ('215', '20', '角色信息管理', 'sysRole', '2', '208', '6', null, null, '629');
INSERT INTO `sys_menu` VALUES ('216', 'M0061', '用户类模块', null, '1', '0', '3', null, null, null);
INSERT INTO `sys_menu` VALUES ('217', '38', '系统权限管理', 'usrAuth', '2', '216', '3', null, null, '636');
INSERT INTO `sys_menu` VALUES ('218', '10', '角色信息管理', 'usrRole', '2', '216', '1', null, null, '643');
INSERT INTO `sys_menu` VALUES ('219', '43', '角色权限管理', 'usrRoleAuth', '2', '216', '2', null, null, '650');
INSERT INTO `sys_menu` VALUES ('221', 'M0063', '对应关系', null, '1', '0', '4', null, null, null);
INSERT INTO `sys_menu` VALUES ('222', '40', '角色与权限关系管理', 'mapRoleAuth', '2', '221', '0', null, null, '667');
INSERT INTO `sys_menu` VALUES ('223', '84', 'null管理', 'mapUserRelease', '2', '221', '1', null, null, '674');
INSERT INTO `sys_menu` VALUES ('241', 'M007', '数据核查模块', null, '1', '0', '0', null, null, null);
INSERT INTO `sys_menu` VALUES ('242', '69', '数据源配置管理', 'ctDataSource', '2', '241', '0', null, null, '687');
INSERT INTO `sys_menu` VALUES ('243', '40', '检查作业管理', 'ctHomework', '2', '241', '1', null, null, '694');
INSERT INTO `sys_menu` VALUES ('244', '94', '作业成果管理', 'ctWorkResult', '2', '241', '2', null, null, '701');
INSERT INTO `sys_menu` VALUES ('245', '68', '作业脚本管理', 'ctWorkScript', '2', '241', '3', null, null, '708');
INSERT INTO `sys_menu` VALUES ('261', '34', '债券明细信息表管理', 'tBond', '2', '262', '13', null, null, '727');
INSERT INTO `sys_menu` VALUES ('262', 'M0080', '公积金模块', null, '1', '0', '0', null, null, null);
INSERT INTO `sys_menu` VALUES ('263', '47', '共同贷款人信息管理', 'tCoborrower', '2', '262', '0', null, null, '741');
INSERT INTO `sys_menu` VALUES ('264', '22', '缴存单位总账信息管理', 'tEmpaccount', '2', '262', '1', null, null, '748');
INSERT INTO `sys_menu` VALUES ('265', '55', '单位信息管理', 'tEmpinfo', '2', '262', '2', null, null, '755');
INSERT INTO `sys_menu` VALUES ('266', '80', '缴存单位业务明细信息管理', 'tEmprecord', '2', '262', '3', null, null, '762');
INSERT INTO `sys_menu` VALUES ('267', '15', '借款人贷款账户信息管理', 'tLoanaccount', '2', '262', '4', null, null, '769');
INSERT INTO `sys_menu` VALUES ('268', '9', '借款合同信息管理', 'tLoancontract', '2', '262', '5', null, null, '776');
INSERT INTO `sys_menu` VALUES ('269', '35', '贷款明细信息管理', 'tLoanrecord', '2', '262', '6', null, null, '783');
INSERT INTO `sys_menu` VALUES ('270', '54', '贷款人逾期登记信息管理', 'tOverdueregist', '2', '262', '7', null, null, '790');
INSERT INTO `sys_menu` VALUES ('271', '26', '缴存个人账户信息管理', 'tPersonalaccinfo', '2', '262', '8', null, null, '797');
INSERT INTO `sys_menu` VALUES ('272', '99', '缴存个人总账信息管理', 'tPersonalaccount', '2', '262', '9', null, null, '804');
INSERT INTO `sys_menu` VALUES ('273', '25', '个人信息管理', 'tPersonalinfo', '2', '262', '10', null, null, '811');
INSERT INTO `sys_menu` VALUES ('274', '90', '缴存个人业务明细信息管理', 'tPersonalrecord', '2', '262', '11', null, null, '818');
INSERT INTO `sys_menu` VALUES ('275', '6', '办公平台上传件信息表管理', 'tPolicyfileFile', '2', '216', '12', null, null, '825');
INSERT INTO `sys_menu` VALUES ('281', '93', '政策信息管理', 'tPolicyinfo', '2', '262', '14', null, null, '847');
INSERT INTO `sys_menu` VALUES ('282', '18', 'null管理', 'tLogs', '2', '262', '14', null, null, '854');
INSERT INTO `sys_menu` VALUES ('283', '13', '运行时参数管理', 'tRunParam', '2', '262', '15', null, null, '861');

-- ----------------------------
-- Table structure for `sys_model`
-- ----------------------------
DROP TABLE IF EXISTS `sys_model`;
CREATE TABLE `sys_model` (
  `ID_` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `PARENT_ID` bigint(18) DEFAULT NULL COMMENT '父节点',
  `LADDER_` int(1) NOT NULL COMMENT '树阶',
  `MODEL_CODE` varchar(16) NOT NULL COMMENT '模块编号',
  `NAME_` varchar(32) NOT NULL COMMENT '模块名',
  `KEYWORD_` varchar(16) NOT NULL COMMENT '模块关键字',
  `PREFIX_` varchar(16) DEFAULT NULL COMMENT '表前缀',
  `STATUS_` int(3) NOT NULL COMMENT '状态@停用:1|启用:0',
  `APPEND_BY` datetime DEFAULT NULL COMMENT '创建时间',
  `DESC_` varchar(128) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`ID_`),
  KEY `AK_KEY_2_SYS_MODE` (`MODEL_CODE`,`KEYWORD_`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COMMENT='系统模块';

-- ----------------------------
-- Records of sys_model
-- ----------------------------
INSERT INTO `sys_model` VALUES ('1', '0', '2', 'M001', '权限模块', 'AUTHER', 'A', '0', null, null);
INSERT INTO `sys_model` VALUES ('2', '0', '2', 'M002', '商品模块', 'COMM', 'COMM_', '0', null, null);
INSERT INTO `sys_model` VALUES ('3', '0', '2', 'M003', '订单模块', 'ORDER', 'ORD_', '0', null, null);
INSERT INTO `sys_model` VALUES ('4', '0', '2', 'M004', '权限管理', 'AUTH', 'AUTH_', '0', null, null);
INSERT INTO `sys_model` VALUES ('5', '6', '3', 'M0061', '用户类', 'USER', 'USR_', '0', null, null);
INSERT INTO `sys_model` VALUES ('6', '0', '2', 'M006', '系统管理', 'M006', null, '0', null, null);
INSERT INTO `sys_model` VALUES ('7', '6', '3', 'M0062', '角色管理', 'ROLE', 'ROLE', '0', null, null);
INSERT INTO `sys_model` VALUES ('8', '6', '3', 'M0060', '角色管理', 'SYSTEM', 'SYS_', '0', null, null);
INSERT INTO `sys_model` VALUES ('9', '6', '3', 'M0063', '系统对象关系', 'MAPPING', 'MAP_', '0', null, null);
INSERT INTO `sys_model` VALUES ('10', '0', '2', 'M007', '数据核查', 'CHECKTOOLS', 'CT_', '0', null, null);
INSERT INTO `sys_model` VALUES ('11', '6', '3', 'M0080', '公积金', 'GJJIO', 'T_', '0', null, null);
INSERT INTO `sys_model` VALUES ('12', null, '1', 'MR FAN', 'XX管理系统', 'MASTER', null, '0', null, null);

-- ----------------------------
-- Table structure for `sys_org`
-- ----------------------------
DROP TABLE IF EXISTS `sys_org`;
CREATE TABLE `sys_org` (
  `ID_` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '序列',
  `APPEND_BY` bigint(18) NOT NULL COMMENT '添加人',
  `APPEND_TIME` datetime NOT NULL COMMENT '添加时间',
  `STATUS_` int(3) NOT NULL DEFAULT '0' COMMENT '状态@0:停用|1:启用',
  `MODIFY_BY` bigint(18) DEFAULT NULL COMMENT '修改人',
  `MODIFY_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `PARENT_ID` bigint(9) NOT NULL COMMENT '父节点',
  `NAME_` varchar(32) NOT NULL COMMENT '名称',
  `NAME_EN` varchar(16) DEFAULT NULL COMMENT '简称',
  `DESC_` varchar(128) DEFAULT NULL COMMENT '描述',
  `LADDER_` int(3) NOT NULL COMMENT '层次',
  `SORT_` bigint(5) DEFAULT '0' COMMENT '排序',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='组织机构';

-- ----------------------------
-- Records of sys_org
-- ----------------------------
INSERT INTO `sys_org` VALUES ('1', '0', '2014-10-30 09:42:24', '1', '0', '2014-10-30 09:42:24', '0', '百业通软件', 'bytSoft', null, '1', '0');
INSERT INTO `sys_org` VALUES ('2', '0', '2014-10-30 09:42:24', '1', '0', '2014-10-30 09:42:24', '1', '浙江', '330000', null, '2', '0');
INSERT INTO `sys_org` VALUES ('3', '0', '2014-10-30 09:42:24', '1', '0', '2014-10-30 09:42:24', '2', '杭州', '330100', null, '3', '1');
INSERT INTO `sys_org` VALUES ('4', '0', '2014-10-30 09:42:24', '1', '0', '2014-10-30 09:42:24', '2', '宁波', '330200', null, '3', '2');
INSERT INTO `sys_org` VALUES ('5', '0', '2014-10-30 09:42:24', '1', '0', '2014-10-30 09:42:24', '3', '余杭', '330101', null, '4', '1');
INSERT INTO `sys_org` VALUES ('6', '0', '2014-10-30 09:42:24', '1', '0', '2014-10-30 09:42:24', '3', '富阳', '330102', null, '4', '2');

-- ----------------------------
-- Table structure for `sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `ID` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '序列',
  `ROLE_NAME` varchar(32) NOT NULL COMMENT '角色名称',
  `ROLE_DESC` varchar(64) DEFAULT NULL COMMENT '角色描述',
  `ROLE_ACC_TYPE` int(3) NOT NULL COMMENT '角色类型',
  `AUTH_USER_ID` bigint(18) NOT NULL COMMENT '用户ID',
  `STATUS` int(3) NOT NULL DEFAULT '0' COMMENT '状态@停用:0|启动:1',
  `CREATE_BY` bigint(18) DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `MODIFY_BY` bigint(18) NOT NULL COMMENT '创建人',
  `MODIFIED_TIME` datetime NOT NULL COMMENT '修改时间',
  `REMARK` varchar(128) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`,`ROLE_ACC_TYPE`,`AUTH_USER_ID`,`STATUS`,`CREATE_TIME`,`MODIFY_BY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色信息';

-- ----------------------------
-- Records of sys_role
-- ----------------------------

-- ----------------------------
-- Table structure for `usr_auth`
-- ----------------------------
DROP TABLE IF EXISTS `usr_auth`;
CREATE TABLE `usr_auth` (
  `ID_` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '序列',
  `NAME_` varchar(32) NOT NULL COMMENT '名称@',
  `CODE_` varchar(16) NOT NULL COMMENT '编码@',
  `DESC_` varchar(128) DEFAULT NULL COMMENT '描述',
  `STATUS_` int(3) DEFAULT '0' COMMENT '状态@1:启用|0:停用',
  `URL_` varchar(128) NOT NULL COMMENT '地址',
  `APPEND_BY` bigint(18) DEFAULT NULL COMMENT '创建人@',
  `APPEND_TIME` datetime DEFAULT NULL COMMENT '创建时间@',
  `MODIFY_BY` bigint(18) DEFAULT NULL COMMENT '修改人@',
  `MODIFY_TIME` varchar(32) DEFAULT NULL COMMENT '修改时间@',
  `REMARK_` varchar(128) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统权限';

-- ----------------------------
-- Records of usr_auth
-- ----------------------------

-- ----------------------------
-- Table structure for `usr_auth_group`
-- ----------------------------
DROP TABLE IF EXISTS `usr_auth_group`;
CREATE TABLE `usr_auth_group` (
  `ID` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键@',
  `NAME` varchar(32) DEFAULT NULL COMMENT '权限组名称@',
  `REMARK` varchar(1024) DEFAULT NULL COMMENT '备注|权限的名称集合@',
  `CODE` varchar(32) DEFAULT NULL COMMENT '权限编码|权限编码组成的字符串@',
  `CREATE_BY` bigint(18) DEFAULT NULL COMMENT '创建人@',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间@',
  PRIMARY KEY (`ID`),
  KEY `AK_KEY_2_USR_AUTH` (`ID`,`NAME`,`REMARK`(255),`CODE`,`CREATE_BY`,`CREATE_TIME`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='权限组';

-- ----------------------------
-- Records of usr_auth_group
-- ----------------------------
INSERT INTO `usr_auth_group` VALUES ('1', '权限组1', '温热微软', '01', '1', '2013-12-22 17:06:00');

-- ----------------------------
-- Table structure for `usr_auth_group_auth`
-- ----------------------------
DROP TABLE IF EXISTS `usr_auth_group_auth`;
CREATE TABLE `usr_auth_group_auth` (
  `ID` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键@',
  `USR_AUTH_GROUP_ID` bigint(18) DEFAULT NULL COMMENT '权限组主键@',
  `USR_AUTH_ID` bigint(18) DEFAULT NULL COMMENT '权限主键@',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='权限组权限';

-- ----------------------------
-- Records of usr_auth_group_auth
-- ----------------------------
INSERT INTO `usr_auth_group_auth` VALUES ('1', '1', '20');
INSERT INTO `usr_auth_group_auth` VALUES ('2', '1', '19');

-- ----------------------------
-- Table structure for `usr_role`
-- ----------------------------
DROP TABLE IF EXISTS `usr_role`;
CREATE TABLE `usr_role` (
  `ID_` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '序列',
  `NAME_` varchar(32) NOT NULL COMMENT '角色名称',
  `DESC_` varchar(128) DEFAULT NULL COMMENT '角色描述',
  `TYPE_` int(3) NOT NULL COMMENT '角色类型',
  `STATUS_` int(3) NOT NULL COMMENT '状态@停用:0,|启动:1',
  `APPEND_BY` bigint(18) NOT NULL COMMENT '创建人',
  `APPEND_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `MODIFY_BY` bigint(18) NOT NULL COMMENT '创建人',
  `MODIFIED_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `REMARK_` varchar(128) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='角色信息';

-- ----------------------------
-- Records of usr_role
-- ----------------------------
INSERT INTO `usr_role` VALUES ('1', '系统管理员', 'ADMIN', '1', '0', '1', null, '1', null, null);
INSERT INTO `usr_role` VALUES ('2', '数据校对', 'CT', '1', '0', '1', null, '1', null, null);
INSERT INTO `usr_role` VALUES ('3', '公积数据导', 'GJJT', '1', '0', '1', null, '1', null, null);

-- ----------------------------
-- Table structure for `usr_role_auth`
-- ----------------------------
DROP TABLE IF EXISTS `usr_role_auth`;
CREATE TABLE `usr_role_auth` (
  `ID` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键@',
  `USR_ROLE_CODE` bigint(18) NOT NULL COMMENT '角色主键@',
  `USR_AUTH_ID` bigint(18) NOT NULL COMMENT '权限主键@',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=171 DEFAULT CHARSET=utf8 COMMENT='角色权限';

-- ----------------------------
-- Records of usr_role_auth
-- ----------------------------
INSERT INTO `usr_role_auth` VALUES ('18', '2', '20');
INSERT INTO `usr_role_auth` VALUES ('19', '2', '27');
INSERT INTO `usr_role_auth` VALUES ('20', '8', '20');
INSERT INTO `usr_role_auth` VALUES ('21', '8', '27');
INSERT INTO `usr_role_auth` VALUES ('22', '2', '18');
INSERT INTO `usr_role_auth` VALUES ('23', '8', '85');
INSERT INTO `usr_role_auth` VALUES ('165', '1', '28');
INSERT INTO `usr_role_auth` VALUES ('166', '3', '195');
INSERT INTO `usr_role_auth` VALUES ('167', '1', '196');
INSERT INTO `usr_role_auth` VALUES ('168', '1', '90');
INSERT INTO `usr_role_auth` VALUES ('170', '1', '122');
