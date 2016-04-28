/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2016-04-15 12:16:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user1
-- ----------------------------
DROP TABLE IF EXISTS `user1`;
CREATE TABLE `user1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) DEFAULT NULL,
  `userAge` int(255) DEFAULT NULL,
  `userAddress` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user1
-- ----------------------------
INSERT INTO `user1` VALUES ('1', 'cd', '222', 'd');
INSERT INTO `user1` VALUES ('2', 'CD', '1', 'CD');
INSERT INTO `user1` VALUES ('3', 'CAAAD', '1', 'AAAA');
INSERT INTO `user1` VALUES ('4', '撒的', '0', '12');
INSERT INTO `user1` VALUES ('23', 'jonny', '1', '浙江杭州');
INSERT INTO `user1` VALUES ('25', 'a', '1', 'a');
