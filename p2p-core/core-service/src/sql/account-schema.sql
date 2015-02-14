drop table if exists capital_account;
drop table if exists capital_account_flow;
drop table if exists capital_account_bankcard;

create table capital_account (
  id bigint auto_increment,
  user_id bigint,
  user_name varchar(100),
  categary varchar(10),
  amount decimal(10,2),
  frozen decimal(10,2),
  state varchar(20),
  prod_id bigint,
  prod_name varchar(200),
  profit decimal(10,2),
  profit_begin_time date,
  loan_id bigint,
  loan_name varchar(200),
  total_loan_amount decimal(10,2),
  returned_loan_amount decimal(10,2),
  created_time timestamp,
  constraint pk_capital_amount primary key(id)
) charset=utf8 ENGINE=InnoDB;
create index idx_ca_user_id on capital_account(user_id);
create index idx_ca_prod_id on capital_account(prod_id);
create index idx_ca_loan_id on capital_account(loan_id);
create index idx_ca_categary on capital_account(categary);

create table capital_account_flow (
  id bigint auto_increment,
  account_id bigint,
  flow_type varchar(10),
  income decimal(10,2),
  expense decimal(10,2),
  balance_amount decimal(10,2),
  state varchar(20),
  prod_id bigint,
  prod_name varchar(200),
  loan_id bigint,
  loan_name varchar(200),
  created_time timestamp,
  remark varchar(400),
  constraint pk_ca_flow primary key(id)
) charset=utf8 ENGINE=InnoDB;
create index idx_caf_account_id on capital_account_flow(account_id);

create table capital_account_bankcard (
  id bigint auto_increment,
  user_id bigint,
  account_id bigint,
  card_no varchar(40),
  card_type varchar(20),
  bank_code varchar(20),
  is_master bool default false,
  state varchar(20),
  created_time timestamp,
  constraint pk_ca_bankcard primary key(id)
) charset=utf8 ENGINE=InnoDB;
create index idx_cab_user_id on capital_account_bankcard(user_id);
create index idx_cab_account_id on capital_account_bankcard(account_id);
create index idx_cab_card_no on capital_account_bankcard(card_no);