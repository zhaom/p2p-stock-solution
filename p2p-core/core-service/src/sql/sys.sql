drop table if exists sys_dict;
drop table if exists sys_user;
drop table if exists sys_app;
drop table if exists sys_user_app_roles;
drop table if exists sys_org;
drop table if exists sys_resource;
drop table if exists sys_role;
drop table if exists sys_op_log;
drop table if exists sys_msg;

create table if not exists sys_dict (
  id bigint auto_increment not null comment 'id',
  value int not null comment '选项值',
  name varchar(50) not null comment '选项名',
  category varchar(50) not null comment '选项类别',
  category_name varchar(50) not null comment '类别名',
  sort int not null comment '排序项',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(value)
) charset=utf8 ENGINE=InnoDB comment '系统字典表';

insert into sys_dict(value,name,category,category_name,sort) values(1,'是','yesOrNo','是否',1),(0,'否','yesOrNo','是否',2);
insert into sys_dict(value,name,category,category_name,sort) values(5,'降序','orderBy','排序',1),(6,'升序','orderBy','排序',2);
insert into sys_dict(value,name,category,category_name,sort) values(10,'个人','memberType','会员类型',1),(30,'企业','memberType','会员类型',2);
insert into sys_dict(value,name,category,category_name,sort) values(50,'贷记','memberAccountDir','记账方向',1),(52,'借记','memberAccountDir','记账方向',2);
insert into sys_dict(value,name,category,category_name,sort) values(60,'分','amountUnit','金额单位',1),(61,'元','amountUnit','金额单位',2);
insert into sys_dict(value,name,category,category_name,sort) values(65,'自然日','durationUnit','时间周期单位',1),(66,'交易日','durationUnit','时间周期单位',2),(67,'自然月','durationUnit','时间周期单位',3),(68,'自然年','durationUnit','时间周期单位',4),(69,'一次性','durationUnit','时间周期单位',5);
insert into sys_dict(value,name,category,category_name,sort) values(75,'所有账户可用','payLimitAmountType','支付限定账户',1),(76,'指定类型可用','payLimitAmountType','支付限定账户',2),(77,'指定类型禁止','payLimitAmountType','支付限定账户',3),(78,'只现金账户可用','payLimitAmountType','支付限定账户',4);
insert into sys_dict(value,name,category,category_name,sort) values(80,'所有会员允许','memberLimitType','限定会员',1),(81,'限定vip会员','memberLimitType','限定会员',2),(82,'限定新会员','memberLimitType','限定会员',3),(83,'特定指定类型的会员','memberLimitType','限定会员',4),(84,'禁止指定会员','memberLimitType','限定会员',5);
insert into sys_dict(value,name,category,category_name,sort) values(90,'90套账','setNo','账套号',1);
insert into sys_dict(value,name,category,category_name,sort) values(100,'实名认证','memberAuth','会员安全设置',10),(101,'身份证上传','memberAuth','会员安全设置',20),(102,'绑定手机','memberAuth','会员安全设置',30),(103,'邮箱绑定','memberAuth','会员安全设置',40),(104,'昵称','memberAuth','会员安全设置',50),(105,'手持身份证上传','memberAuth','会员安全设置',60),(106,'提款密码','memberAuth','会员安全设置',70),(107,'银行卡管理','memberAuth','会员安全设置',80),(108,'登录密码','memberAuth','会员安全设置',90),(109,'短信通知','memberAuth','会员安全设置',100),(110,'自动投标','memberAuth','会员安全设置',110),(111,'个人信息','memberAuth','会员安全设置',120),(112,'注册时间','memberAuth','会员安全设置',130);
insert into sys_dict(value,name,category,category_name,sort) values(200,'创建','memberAccountStatus','账户状态',10),(201,'可用','memberAccountStatus','账户状态',20),(202,'止付','memberAccountStatus','账户状态',30),(203,'冻结','memberAccountStatus','账户状态',40),(204,'销户','memberAccountStatus','账户状态',50);
insert into sys_dict(value,name,category,category_name,sort) values(271,'咨询','guestbookType','留言分类',10),(272,'建议','guestbookType','留言分类',20),(273,'投诉','guestbookType','留言分类',30),(274,'其它','guestbookType','留言分类',40);
insert into sys_dict(value,name,category,category_name,sort) values(300,'本金','memberAccountItemType','成分类型',10),(301,'利息','memberAccountItemType','成分类型',20),(302,'收费','memberAccountItemType','成分类型',30),(303,'盈亏','memberAccountItemType','成分类型',40);
insert into sys_dict(value,name,category,category_name,sort) values(400,'收入','accountOpType','账务操作类型',10),(401,'支出','accountOpType','账务操作类型',20),(402,'冻结','accountOpType','账务操作类型',30),(403,'解冻','accountOpType','账务操作类型',40),(404,'成份冻结','accountOpType','账务操作类型',50),(405,'成份解冻','accountOpType','账务操作类型',60);
insert into sys_dict(value,name,category,category_name,sort) values(500,'充值','tradeType','交易类型',10),(501,'购买/支付','tradeType','交易类型',20),(502,'转账','tradeType','交易类型',30),(503,'提现','tradeType','交易类型',40);
insert into sys_dict(value,name,category,category_name,sort) values(600,'网关','payMethod','支付工具',10),(601,'快捷','payMethod','支付工具',20),(602,'代付','payMethod','支付工具',30),(603,'余额','payMethod','支付工具',40);
insert into sys_dict(value,name,category,category_name,sort) values(700,'需和上方对账','balanceType','对账类型',10),(701,'需和下方对账','balanceType','对账类型',20),(702,'均需对账','balanceType','对账类型',30),(703,'无需对账','balanceType','对账类型',40);
insert into sys_dict(value,name,category,category_name,sort) values(800,'凭证登记','accountOpStatus','记账操作状态',10),(801,'记账处理中','accountOpStatus','记账操作状态',20),(802,'记账成功','accountOpStatus','记账操作状态',30),(803,'记账失败','accountOpStatus','记账操作状态',40);
insert into sys_dict(value,name,category,category_name,sort) values(850,'登录','sysOpType','系统操作类型',10),(851,'退出','sysOpType','系统操作类型',20),(852,'充值','sysOpType','系统操作类型',30),(853,'提现','sysOpType','系统操作类型',40),(854,'转让','sysOpType','系统操作类型',50),(855,'修改密码','sysOpType','系统操作类型',60),(856,'找回密码','sysOpType','系统操作类型',70),(857,'银行卡操作','sysOpType','系统操作类型',80);
insert into sys_dict(value,name,category,category_name,sort) values(900,'普通记账','accountReqMethod','记账接口访问模式',10),(901,'手工记账','accountReqMethod','记账接口访问模式',20),(902,'重复记账','accountReqMethod','记账接口访问模式',30),(903,'冲正记账','accountReqMethod','记账接口访问模式',40);
insert into sys_dict(value,name,category,category_name,sort) values(1001,'个人基本账户','accountType','账户类型',10),(1002,'个人保证金','accountType','账户类型',20),(1003,'个人欠款','accountType','账户类型',30),(1004,'个人活动本金户','accountType','账户类型',40),(3001,'企业基本户','accountType','账户类型',50),(3002,'企业服务费账户','accountType','账户类型',60),(3003,'充值手续费账户','accountType','账户类型',70),(3004,'风险金','accountType','账户类型',80),(3005,'取现账户','accountType','账户类型',90),(3006,'取现手续费','accountType','账户类型',100),(3007,'转让手续费','accountType','账户类型',110),(3008,'企业活动本金账户','accountType','账户类型',120);
insert into sys_dict(value,name,category,category_name,sort) values(4000,'日','accountFinanceRptTimeType','财务报表时间类型',10),(4001,'周','accountFinanceRptTimeType','财务报表时间类型',20),(4002,'月','accountFinanceRptTimeType','财务报表时间类型',30),(4003,'年','accountFinanceRptTimeType','财务报表时间类型',40);
insert into sys_dict(value,name,category,category_name,sort) values(5000,'按月付费','stockAccountType','操盘账户类型',10),(5001,'按天付费','stockAccountType','操盘账户类型',20),(5002,'炒股大赛','stockAccountType','操盘账户类型',30),(5003,'免费体验','stockAccountType','操盘账户类型',40);
insert into sys_dict(value,name,category,category_name,sort) values(5010,'新建','stockAccountStatus','股票账户状态',10),(5011,'操盘中','stockAccountStatus','股票账户状态',20),(5012,'已清盘','stockAccountStatus','股票账户状态',30);
insert into sys_dict(value,name,category,category_name,sort) values(6000,'菜单','resourceType','资源类型',10),(6001,'按钮','resourceType','资源类型',20),(6002,'tab页','resourceType','资源类型',30);
insert into sys_dict(value,name,category,category_name,sort) values(6101,'公告','msgType','消息类型',10),(6102,'通知','msgType','消息类型',20),(6103,'消息','msgType','消息类型',30),(6104,'新闻','msgType','消息类型',40);
insert into sys_dict(value,name,category,category_name,sort) values(30000,'初始','bidStatus','标状态',10),(30001,'待发布','bidStatus','标状态',20),(30002,'募集中','bidStatus','标状态',30),(30003,'已满额','bidStatus','标状态',40),(30004,'还款中','bidStatus','标状态',50),(30005,'已还清','bidStatus','标状态',60),(30006,'已强制平仓还清','bidStatus','标状态',70),(30007,'已流标','bidStatus','标状态',80);
insert into sys_dict(value,name,category,category_name,sort) values(30100,'待支付','collectPayStatus','标支付状态',10),(30101,'部分支付','collectPayStatus','标支付状态',20),(30102,'已支付','collectPayStatus','标支付状态',30);
insert into sys_dict(value,name,category,category_name,sort) values(40000,'待还款','bidRefundStatus','还款状态',10),(40001,'已还款','bidRefundStatus','还款状态',20),(40002,'已逾期','bidRefundStatus','还款状态',30),(40004,'逾期已还款','bidRefundStatus','还款状态',40),(40005,'已提前还款','bidRefundStatus','还款状态',50),(40006,'确认坏账','bidRefundStatus','还款状态',60);
insert into sys_dict(value,name,category,category_name,sort) values(40100,'未支付','mbrStatus','投标状态',10),(40101,'已支付','mbrStatus','投标状态',20),(40102,'成功','mbrStatus','投标状态',30),(40103,'失败','mbrStatus','投标状态',40);
insert into sys_dict(value,name,category,category_name,sort) values(50000,'待分发','bidDistributeStatus','分发状态',10),(50001,'已逾期','bidDistributeStatus','分发状态',20),(50002,'已分发','bidDistributeStatus','分发状态',30),(50003,'提前分发','bidDistributeStatus','分发状态',40),(50004,'坏账已补偿','bidDistributeStatus','分发状态',50);
insert into sys_dict(value,name,category,category_name,sort) values(100000,'成功','maTranRepCode','记账响应码',10),(100100,'失败','maTranRepCode','记账响应码',20);



create table if not exists sys_user (
  id bigint auto_increment not null comment 'id',
  org_id bigint not null comment '部门编码',
  uname varchar(50) not null comment '登录名',
  password char(48) not null comment '密码',
  real_name varchar(50) not null comment '姓名',
  locked int not null comment '是否锁定【是1|否0】',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key(id),
  key(uname)
) charset=utf8 ENGINE=InnoDB comment '管理用户表';

create table if not exists sys_app (
  id bigint auto_increment not null comment 'id',
  name varchar(50) not null comment '应用名称',
  app_key varchar(50) not null comment '应用的key',
  app_secret varchar(100) not null comment '应用的密钥',
  available int not null comment '是否可用【是1|否0】',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key(id)
) charset=utf8 ENGINE=InnoDB comment '系统应用表';

create table if not exists sys_user_app_roles (
  id bigint auto_increment not null comment 'id',
  user_id bigint not null comment '系统用户id',
  app_id bigint not null comment '系统应用id',
  role_ids varchar(100) not null comment '角色id组',
  primary key(id),
  key(user_id,app_id)
) charset=utf8 ENGINE=InnoDB comment '系统用户应用角色表';

create table if not exists sys_org (
  id bigint auto_increment not null comment 'id',
  name varchar(100) not null comment '机构名称',
  parent_id bigint not null comment '上级机构id',
  parent_ids varchar(100) not null comment '级联上级id组',
  available int not null comment '是否存在【是1|否0】',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key(id)
) charset=utf8 ENGINE=InnoDB comment '系统机构表';

create table if not exists sys_resource (
  id bigint auto_increment not null comment 'id',
  name varchar(100) not null comment '名称',
  type int not null comment '资源类型【菜单6000|按钮|tab页6002】',
  url varchar(200) not null comment 'url',
  parent_id bigint not null comment '上级资源id',
  parent_ids varchar(100) not null comment '级联上级资源id组',
  permission varchar(100) not null comment '需要权限',
  available int not null comment '是否可用【是1|否0】',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key(id)
) charset=utf8 ENGINE=InnoDB comment '系统资源表';

create table if not exists sys_role (
  id bigint auto_increment not null comment 'id',
  role_name varchar(100) not null comment '角色名',
  resource_ids varchar(100) not null comment '资源组',
  available int not null comment '是否可用【是1|否0】',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key(id)
) charset=utf8 ENGINE=InnoDB comment '角色表';

create table if not exists sys_op_log (
  id bigint auto_increment not null comment 'id',
  op_type int not null comment '系统操作类型【登录850|退出|充值|提现|转让|修改密码|找回密码|银行卡操作857】',
  content varchar(100) not null comment '操作内容',
  operator_id bigint not null comment '操作人',
  relate_id bigint default -1 comment '相关业务id',
  is_member_op int not null comment '是否会员自己操作【是1|否0】',
  m_id bigint not null comment '相关会员，会员自助操作时为自己',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(m_id, op_type, create_time),
  key(relate_id)
) charset=utf8 ENGINE=InnoDB comment '系统操作日志表';

create table if not exists sys_msg (
  id bigint NOT NULL AUTO_INCREMENT COMMENT '标识ID',
  type int not null comment '消息类型【公告|通知|消息|新闻】',
  title varchar(100) DEFAULT NULL COMMENT '标题（发布标题）',
  content varchar(4000) COMMENT '内容（发布内容）',
  publish_date datetime DEFAULT NULL COMMENT '发布时间',
  is_publish int DEFAULT NULL COMMENT '是否发布【是1|否0】',
  from_uid bigint DEFAULT NULL COMMENT '发布人',
  to_uid bigint default null comment '接收人',
  pic_url varchar(200) DEFAULT NULL COMMENT '图片',
  is_read int DEFAULT NULL COMMENT '是否已读【是1|否0】',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  PRIMARY KEY (id),
  key(type,to_uid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统消息表';