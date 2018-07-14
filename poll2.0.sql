/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : poll2.0

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2018-07-14 09:11:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for poll_answers
-- ----------------------------
DROP TABLE IF EXISTS `poll_answers`;
CREATE TABLE `poll_answers` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `selections` varchar(255) DEFAULT NULL,
  `checkes` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `survey_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `survey_id` (`survey_id`),
  CONSTRAINT `poll_answers_ibfk_1` FOREIGN KEY (`survey_id`) REFERENCES `poll_survey` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of poll_answers
-- ----------------------------
INSERT INTO `poll_answers` VALUES ('4', '3|4', null, 'java的数据类型没听明白|老师速度太快', '1');
INSERT INTO `poll_answers` VALUES ('5', '5|3', null, 'java的引用类型没听明白|老师讲课太快', '1');
INSERT INTO `poll_answers` VALUES ('6', '4|3', null, 'java的引用类型没听明白|跟不上', '1');
INSERT INTO `poll_answers` VALUES ('7', '5|1', null, 'java的数据类型没听明白|老师速度太快', '1');
INSERT INTO `poll_answers` VALUES ('8', '5|3', null, 'java的数据类型没听明白|老师速度太快', '1');
INSERT INTO `poll_answers` VALUES ('9', '5|3', null, 'java的数据类型没听明白|老师速度太快', '2');
INSERT INTO `poll_answers` VALUES ('10', '5|3', null, 'java的数据类型没听明白|老师速度太快', '2');

-- ----------------------------
-- Table structure for poll_clazz
-- ----------------------------
DROP TABLE IF EXISTS `poll_clazz`;
CREATE TABLE `poll_clazz` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` text,
  `grade_id` bigint(20) DEFAULT NULL,
  `charge_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `grade_id` (`grade_id`),
  KEY `charge_id` (`charge_id`),
  CONSTRAINT `poll_clazz_ibfk_1` FOREIGN KEY (`grade_id`) REFERENCES `poll_grade` (`id`),
  CONSTRAINT `poll_clazz_ibfk_2` FOREIGN KEY (`charge_id`) REFERENCES `poll_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of poll_clazz
-- ----------------------------
INSERT INTO `poll_clazz` VALUES ('1', '大一1班', '软件开发Java方向', '2', '1');
INSERT INTO `poll_clazz` VALUES ('2', '大一2班', '软件开发测试方向', '2', '2');

-- ----------------------------
-- Table structure for poll_course
-- ----------------------------
DROP TABLE IF EXISTS `poll_course`;
CREATE TABLE `poll_course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` text,
  `period` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of poll_course
-- ----------------------------
INSERT INTO `poll_course` VALUES ('2', 'Html', '超文本标记语言', '5');
INSERT INTO `poll_course` VALUES ('5', 'css2', '层叠样式表222', '5');
INSERT INTO `poll_course` VALUES ('7', '马克思主义', '非常神奇一个学科', '5');
INSERT INTO `poll_course` VALUES ('8', 'js技术', '脚本语言服务器端语言', '25');

-- ----------------------------
-- Table structure for poll_grade
-- ----------------------------
DROP TABLE IF EXISTS `poll_grade`;
CREATE TABLE `poll_grade` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `descriptioin` text,
  `school_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `school_id` (`school_id`),
  CONSTRAINT `poll_grade_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `poll_school` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of poll_grade
-- ----------------------------
INSERT INTO `poll_grade` VALUES ('2', '大一年级', '2018届', '1');
INSERT INTO `poll_grade` VALUES ('3', '大二年级', '2017届', '1');
INSERT INTO `poll_grade` VALUES ('4', '大一年级ddddd', '2018届', '1');

-- ----------------------------
-- Table structure for poll_options
-- ----------------------------
DROP TABLE IF EXISTS `poll_options`;
CREATE TABLE `poll_options` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `label` varchar(255) DEFAULT NULL,
  `name` text,
  `score` int(11) DEFAULT NULL,
  `question_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `question_id` (`question_id`),
  CONSTRAINT `poll_options_ibfk_1` FOREIGN KEY (`question_id`) REFERENCES `poll_question` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of poll_options
-- ----------------------------
INSERT INTO `poll_options` VALUES ('62', 'B', '良好', '4', '21');
INSERT INTO `poll_options` VALUES ('92', 'A', '优秀', '5', '21');
INSERT INTO `poll_options` VALUES ('93', 'C', '及格', '3', '21');
INSERT INTO `poll_options` VALUES ('103', 'A', '优秀88888', '5', '19');
INSERT INTO `poll_options` VALUES ('104', 'B', '良好', '4', '19');
INSERT INTO `poll_options` VALUES ('105', 'C', '及格', '3', '19');
INSERT INTO `poll_options` VALUES ('106', 'A', '优秀88888', '5', '26');
INSERT INTO `poll_options` VALUES ('107', 'B', '良好', '4', '26');
INSERT INTO `poll_options` VALUES ('108', 'C', '及格', '3', '26');

-- ----------------------------
-- Table structure for poll_qq
-- ----------------------------
DROP TABLE IF EXISTS `poll_qq`;
CREATE TABLE `poll_qq` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `questionnaire_id` bigint(20) DEFAULT NULL,
  `question_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `questionnaire_id` (`questionnaire_id`),
  KEY `question_id` (`question_id`),
  CONSTRAINT `poll_qq_ibfk_1` FOREIGN KEY (`questionnaire_id`) REFERENCES `poll_questionnaire` (`id`) ON DELETE CASCADE,
  CONSTRAINT `poll_qq_ibfk_2` FOREIGN KEY (`question_id`) REFERENCES `poll_question` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of poll_qq
-- ----------------------------
INSERT INTO `poll_qq` VALUES ('6', '4', '15');
INSERT INTO `poll_qq` VALUES ('39', '1', '15');
INSERT INTO `poll_qq` VALUES ('40', '1', '19');
INSERT INTO `poll_qq` VALUES ('41', '1', '21');
INSERT INTO `poll_qq` VALUES ('42', '1', '16');
INSERT INTO `poll_qq` VALUES ('49', '9', '15');
INSERT INTO `poll_qq` VALUES ('50', '9', '16');

-- ----------------------------
-- Table structure for poll_question
-- ----------------------------
DROP TABLE IF EXISTS `poll_question`;
CREATE TABLE `poll_question` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `questionType` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of poll_question
-- ----------------------------
INSERT INTO `poll_question` VALUES ('15', '哪些知识点没有听明白？', '简答题');
INSERT INTO `poll_question` VALUES ('16', '对任课老师的主观评价？', '简答题');
INSERT INTO `poll_question` VALUES ('19', '老师技术水平好不好?', '单选题d');
INSERT INTO `poll_question` VALUES ('21', '老师负责态度？', '单选题');
INSERT INTO `poll_question` VALUES ('25', 'dddd', '单选题');
INSERT INTO `poll_question` VALUES ('26', '老师技术水平好不好77777?', '单选题d');

-- ----------------------------
-- Table structure for poll_questionnaire
-- ----------------------------
DROP TABLE IF EXISTS `poll_questionnaire`;
CREATE TABLE `poll_questionnaire` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of poll_questionnaire
-- ----------------------------
INSERT INTO `poll_questionnaire` VALUES ('1', '辅讲老师问卷', '这是一份辅讲老师的问卷');
INSERT INTO `poll_questionnaire` VALUES ('4', '主讲老师问卷', '这是一份主讲老师的问卷');
INSERT INTO `poll_questionnaire` VALUES ('5', 'ffff', 'fjdksafjksdjf');
INSERT INTO `poll_questionnaire` VALUES ('6', 'aa', 'aa');
INSERT INTO `poll_questionnaire` VALUES ('7', 'dasf', 'dfasf');
INSERT INTO `poll_questionnaire` VALUES ('8', 'aaa', 'aaa');
INSERT INTO `poll_questionnaire` VALUES ('9', 'gsd', 'ggg');

-- ----------------------------
-- Table structure for poll_school
-- ----------------------------
DROP TABLE IF EXISTS `poll_school`;
CREATE TABLE `poll_school` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `logoPath` varchar(255) DEFAULT NULL,
  `description` text,
  `address` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `copyright` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of poll_school
-- ----------------------------
INSERT INTO `poll_school` VALUES ('1', '郑州轻工业大学', 'dd', 'dd', 'ddd', 'ddd', 'dd');
INSERT INTO `poll_school` VALUES ('2', 'DFASDF', 'DAFASD', 'G', 'DDDD', 'G', 'G');
INSERT INTO `poll_school` VALUES ('3', 'DFASDF', 't', 't', 't', 't', 't');
INSERT INTO `poll_school` VALUES ('4', 'a', 'a', 'a', 'a', 'a', 'ADSF');
INSERT INTO `poll_school` VALUES ('5', '2', '2', '2', '2', '2', '2');
INSERT INTO `poll_school` VALUES ('6', 'dd', 'd', 'd', 'd', 'd', 'd');

-- ----------------------------
-- Table structure for poll_survey
-- ----------------------------
DROP TABLE IF EXISTS `poll_survey`;
CREATE TABLE `poll_survey` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `average` double DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `surveyDate` varchar(255) DEFAULT NULL,
  `course_id` bigint(20) DEFAULT NULL,
  `clazz_id` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `questionnaire_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `course_id` (`course_id`),
  KEY `clazz_id` (`clazz_id`),
  KEY `user_id` (`user_id`),
  KEY `questionnaire_id` (`questionnaire_id`),
  CONSTRAINT `poll_survey_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `poll_course` (`id`),
  CONSTRAINT `poll_survey_ibfk_2` FOREIGN KEY (`clazz_id`) REFERENCES `poll_clazz` (`id`),
  CONSTRAINT `poll_survey_ibfk_3` FOREIGN KEY (`user_id`) REFERENCES `poll_user` (`id`),
  CONSTRAINT `poll_survey_ibfk_4` FOREIGN KEY (`questionnaire_id`) REFERENCES `poll_questionnaire` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of poll_survey
-- ----------------------------
INSERT INTO `poll_survey` VALUES ('1', null, '审核未通过', '', '2018-06-29 08:54:07', '2', '1', '1', '1');
INSERT INTO `poll_survey` VALUES ('2', null, '正在进行', '2', '2018-07-02 09:50:13', '2', '1', '1', '1');
INSERT INTO `poll_survey` VALUES ('4', null, '审核通过', '', '2018-07-03 08:43:37', '5', '1', '1', '4');
INSERT INTO `poll_survey` VALUES ('5', null, '未开启', '', '2018-07-05 10:14:17', '2', '1', '1', '1');
INSERT INTO `poll_survey` VALUES ('6', null, '未审核状态', '', '2018-07-05 17:48:27', '7', '1', '1', '9');

-- ----------------------------
-- Table structure for poll_user
-- ----------------------------
DROP TABLE IF EXISTS `poll_user`;
CREATE TABLE `poll_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `birth` varchar(255) DEFAULT NULL,
  `hiredate` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of poll_user
-- ----------------------------
INSERT INTO `poll_user` VALUES ('1', 'terry', '男', '1996-02-02', '1996-02-02', null);
INSERT INTO `poll_user` VALUES ('2', 'larry', '男', '1996-02-02', '1996-02-02', null);
INSERT INTO `poll_user` VALUES ('3', 'BOB', '男', '1996-5-16', '2018-07-03', '管理员');
INSERT INTO `poll_user` VALUES ('4', 'terry', '男', '1996-02-02', '1996-02-02', '');
INSERT INTO `poll_user` VALUES ('5', 'terry', '男', '1996-02-02', '1996-02-02', '');
