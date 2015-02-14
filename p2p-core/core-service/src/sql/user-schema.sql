drop table if exists sys_user;
drop table if exists sys_app;
drop table if exists sys_user_app_roles;
drop table if exists sys_organization;
drop table if exists sys_resource;
drop table if exists sys_role;
drop table if exists sessions;
drop table if exists sys_biz;

create table sessions (
  id varchar(200),
  session varchar(2000),
  constraint pk_sessions primary key(id)
) charset=utf8 ENGINE=InnoDB;


create table sys_user (
  id bigint auto_increment,
  organization_id bigint,
  username varchar(100),
  email varchar(100),
  mobile varchar(15),
  password varchar(100),
  salt varchar(100),
  invest_state int,
  loan_state int,
  credit_rate int,
  locked bool default false,
  constraint pk_sys_user primary key(id)
) charset=utf8 ENGINE=InnoDB;
create unique index idx_su_username on sys_user(username);
create index idx_su_org_id on sys_user(organization_id);

create table sys_user_security (
  id bigint auto_increment,
  user_id bigint,
  auth_type varchar(10),
  auth_name varchar(100),
  auth_desc varchar(200),
  auth_result varchar(20),
  prop_name varchar(100),
  prop_value varchar(200),
  created_time datetime,
  last_update_time datetime,
  constraint pk_sys_user_security primary key(id)
) charset=utf8 engine=InnoDB;
create index idx_sus_user_id on sys_user_security(user_id);

create table sys_user_identification (
  id bigint auto_increment,
  user_id bigint,
  iden_type int,    //idcard,baseinfo,contactinfo,job,income,credit_report,live,house,car,marriage,edu,tech,mobile,weibo,website,wechat,mortgage,warrant
  iden_name varchar(100),
  prop_name varchar(200),
  prop_value varchar(200),
  resource_id bigint,
  created_time datetime,
  constraint pk_sui primary key(id)
) charset=utf8 engine=InnoDB;
create index idx_sui_user_id on sys_user_identification(user_id);

create table sys_app (
  id bigint auto_increment,
  name varchar(100),
  app_key varchar(100),
  app_secret varchar(100),
  available bool default false,
  constraint pk_sys_app primary key(id)
) charset=utf8 ENGINE=InnoDB;
create unique index idx_sys_app_app_key on sys_app(app_key);

create table sys_user_app_roles (
  id bigint auto_increment,
  user_id bigint,
  app_id bigint,
  role_ids varchar(100),
  constraint pk_sys_user_app_roles primary key(id)
) charset=utf8 ENGINE=InnoDB;
create unique index sys_user_app_roles_user_id_app_id on sys_user_app_roles(user_id, app_id);




create table sys_organization (
  id bigint auto_increment,
  name varchar(100),
  parent_id bigint,
  parent_ids varchar(100),
  available bool default false,
  constraint pk_sys_organization primary key(id)
) charset=utf8 ENGINE=InnoDB;
create index idx_sys_organization_parent_id on sys_organization(parent_id);
create index idx_sys_organization_parent_ids on sys_organization(parent_ids);


create table sys_resource (
  id bigint auto_increment,
  name varchar(100),
  type varchar(50),
  url varchar(200),
  parent_id bigint,
  parent_ids varchar(100),
  permission varchar(100),
  available bool default false,
  constraint pk_sys_resource primary key(id)
) charset=utf8 ENGINE=InnoDB;
create index idx_sys_resource_parent_id on sys_resource(parent_id);
create index idx_sys_resource_parent_ids on sys_resource(parent_ids);

create table sys_role (
  id bigint auto_increment,
  role varchar(100),
  description varchar(100),
  resource_ids varchar(100),
  available bool default false,
  constraint pk_sys_role primary key(id)
) charset=utf8 ENGINE=InnoDB;
create index idx_sys_role_resource_ids on sys_role(resource_ids);

create table sys_biz (
  id bigint auto_increment,
  code varchar(20),
  biz_name varchar(200),
  biz_addr varchar(200),
  biz_legal_person varchar(100),
  contact varchar(100),
  tel varchar(20),
  email varchar(50),
  user_id bigint,
  constraint pk_sys_biz primary key(id)
) charset=utf8 ENGINE=InnoDB;
create index idx_sys_biz_uid on sys_biz(user_id);