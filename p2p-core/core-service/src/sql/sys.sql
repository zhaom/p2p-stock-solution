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

insert into sys_dict(value,name,category,category_name,sort) values(1,'是','common_yes_or_no','是否',1),(0,'否','common_yes_or_no','是否',2);
insert into sys_dict(value,name,category,category_name,sort) values(5,'降序','orderBy','排序',1),(6,'升序','orderBy','排序',2);



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