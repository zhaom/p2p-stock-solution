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
  name varchar(20) not null comment '选项名',
  category varchar(20) not null comment '选项类别',
  category_name varchar(20) not null comment '类别名',
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