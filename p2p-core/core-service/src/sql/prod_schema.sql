drop table if exists package;
drop table if exists package_item;
drop table if exists product;
drop table if exists prod_collect;
drop table if exists prod_return;
drop table if exists prod_return_flow;
drop table if exists prod_interest;
drop table if exists prod_interest_flow;
drop table if exists prod_audit_flow;

create table package (
  id bigint auto_increment,
  package_name varchar(200),
  risk varchar(20),
  expect_return decimal(10,2),
  state varchar(20),
  is_first_page int,
  release_time datetime,
  off_time datetime,
  created_time timestamp,
  last_updated_time timestamp,
  created_by_user_id bigint,
  constraint pk_package primary key(id)
) charset=utf8 ENGINE=InnoDB;

create table package_item (
  id bigint auto_increment,
  package_id bigint,
  package_name varchar(200),
  user_id bigint,
  prod_id bigint,
  prod_title varchar(200),
  risk varchar(20),
  expect_return decimal(10,2),
  config_ratio decimal(10,2),
  state varchar(20),
  created_time timestamp ,
  constraint pk_package_item primary key(id)
) charset=utf8 ENGINE=InnoDB;
create index idx_pi_package_id on package_item(package_id);
create index idx_pi_user_id on package_item(user_id);
create index idx_pi_prod_id on package_item(prod_id);

create table product (
  id bigint auto_increment,
  prod_title varchar(200),
  risk varchar(20),
  expect_return decimal(10,4),
  total_amount decimal(10,2),
  remain_amount decimal(10,2),
  real_amount decimal(10,2),
  found_begin_time date,
  found_end_time date,
  category varchar(20),
  state varchar(20),
  is_hot int,
  is_first_page int,
  is_new int,
  loan_id bigint,
  created_time timestamp,
  last_update_time timestamp,
  constraint pk_product primary key(id)
) charset=utf8 ENGINE=InnoDB;
create index idx_prod_loan_id on product(loan_id);

create table prod_collect (
  prod_id bigint,
  reserve_begin_time date,
  reserve_end_time date,
  release_begin_time date,
  release_end_time date,
  online_time datetime,
  constraint pk_prod_collect primary key(prod_id)
) charset=utf8 ENGINE=InnoDB;

create table prod_return (
  prod_id bigint,
  return_type varchar(20),
  first_return_date date,
  next_return_date date,
  last_return_date date,
  term_return_date date,
  returned_principal decimal(10,2),
  returned_interest decimal(10,2),
  surplus_principal decimal(10,2),
  surplus_interest decimal(10,2),
  state varchar(20),
  created_time timestamp,
  last_update_time timestamp ,
  constraint pk_prod_return primary key(prod_id)
) charset=utf8 ENGINE=InnoDB;

create table prod_return_flow (
  id bigint auto_increment,
  prod_id bigint,
  expect_amount decimal(10,2),
  amount decimal(10,2),
  expect_principal decimal(10,2),
  principal decimal(10,2),
  expect_interest decimal(10,2),
  interest decimal(10,2),
  expect_date date,
  real_date date,
  state varchar(20),
  created_time timestamp ,
  last_update_time timestamp,
  remark varchar(200),
  constraint pk_prod_rf primary key(id)
) charset=utf8 ENGINE=InnoDB;
create index idx_prf_prod_id on prod_return_flow(prod_id);

create table prod_interest (
  prod_id bigint,
  interest_lifecycle_type varchar(20),
  first_interest_date date,
  term_interest_date date,
  interest_rate decimal(10,2),
  state varchar(20),
  created_time timestamp,
  constraint pk_prod_interest primary key(prod_id)
) charset=utf8 ENGINE=InnoDB;

create table prod_interest_flow (
  id bigint auto_increment,
  prod_id bigint,
  expect_amount decimal(10,2),
  expect_date date,
  state varchar(20),
  created_time timestamp ,
  constraint pk_prod_if primary key(id)
) charset=utf8 ENGINE=InnoDB;
create index idx_prod_if_prod_id on prod_interest_flow(prod_id);

create table prod_audit_flow (
  id bigint auto_increment,
  prod_id bigint,
  current_user_id bigint,
  next_user_id bigint,
  next_role_id bigint,
  note varchar(400),
  audit_result varchar(20),
  created_time timestamp ,
  constraint pk_prod_af primary key(id)
) charset=utf8 ENGINE=InnoDB;
create index idx_paf_prod_id on prod_audit_flow(prod_id);
create index idx_paf_cuser_id on prod_audit_flow(current_user_id);
create index idx_paf_nrole_id on prod_audit_flow(next_role_id);
