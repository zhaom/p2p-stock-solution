drop table if exists loan;
drop table if exists loan_return;
drop table if exists loan_return_flow;
drop table if exists loan_return_pay;
drop table if exists loan_interest;
drop table if exists loan_interest_flow;
drop table if exists loan_warrant;
drop table if exists loan_audit_flow;

create table loan (
  id bigint auto_increment,
  loan_title varchar(200),
  user_id bigint,
  user_name varchar(100),
  categary varchar(20),
  loan_amount decimal(10,2),
  real_amount decimal(10,2),
  found_ratio int,
  biz_id bigint,
  biz_name varchar(200),
  apply_date date,
  term_date date,
  state varchar(20),
  created_time timestamp,
  created_by_user_id bigint,
  constraint pk_loan primary key(id)
) charset=utf8 ENGINE=InnoDB;
create index idx_loan_user_id on loan(user_id);
create index idx_loan_biz_id on loan(biz_id);
create index idx_loan_cuser_id on loan(created_by_user_id);

create table loan_return (
  loan_id bigint,
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
  constraint pk_loan_return primary key(loan_id)
) charset=utf8 ENGINE=InnoDB;

create table loan_return_flow (
  id bigint auto_increment,
  loan_id bigint,
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
  constraint pk_loan_rf primary key(id)
) charset=utf8 ENGINE=InnoDB;
create index idx_loan_rf_loan_id on loan_return_flow(loan_id);

create table loan_return_pay (
  id bigint auto_increment,
  loan_id bigint,
  loan_rf_id bigint,
  user_id bigint,
  amount decimal(10,2),
  state varchar(20),
  return_method varchar(20),
  created_time timestamp ,
  constraint pk_loan_return_pay primary key(id)
) charset=utf8 ENGINE=InnoDB;
create index idx_lrp_loan_id on loan_return_pay(loan_id);
create index idx_lrp_loan_rf_id on loan_return_pay(loan_rf_id);
create index idx_lrp_user_id on loan_return_pay(user_id);

create table loan_interest (
  loan_id bigint,
  interest_lifecycle_type varchar(20),
  begin_interest_date date,
  term_interest_date date,
  interest_rate decimal(10,2),
  state varchar(20),
  created_time timestamp,
  constraint pk_loan_interest primary key(loan_id)
) charset=utf8 ENGINE=InnoDB;

create table loan_interest_flow (
  id bigint auto_increment,
  loan_id bigint,
  expect_amount decimal(10,2),
  expect_date date,
  state varchar(20),
  created_time timestamp ,
  constraint pk_loan_if primary key(id)
) charset=utf8 ENGINE=InnoDB;
create index idx_loan_if_loan_id on loan_interest_flow(loan_id);

create table loan_warrant (
  id bigint auto_increment,
  loan_id bigint,
  warrant_type varchar(20),
  warrant_desc varchar(200),
  warrant_url varchar(200),
  state varchar(20),
  created_time timestamp ,
  created_by_user_id bigint,
  remark varchar(200),
  constraint pk_loan_warrant primary key(id)
) charset=utf8 ENGINE=InnoDB;
create index idx_lw_loan_id on loan_warrant(loan_id);
create index idx_lw_user_id on loan_warrant(created_by_user_id);

create table loan_audit_flow (
  id bigint auto_increment,
  loan_id bigint,
  current_user_id bigint,
  next_user_id bigint,
  next_role_id bigint,
  note varchar(400),
  audit_result varchar(20),
  created_time timestamp ,
  constraint pk_loan_af primary key(id)
) charset=utf8 ENGINE=InnoDB;
create index idx_laf_loan_id on loan_audit_flow(loan_id);
create index idx_laf_cuser_id on loan_audit_flow(current_user_id);
create index idx_laf_nrole_id on loan_audit_flow(next_role_id);