drop table if exists recharge;
drop table if exists user_order;
drop table if exists order_pay;

create table recharge (
  id bigint auto_increment,
  user_id bigint,
  amount decimal(10,2),
  bank_code varchar(20),
  card_no varchar(40),
  state varchar(20),
  created_time timestamp ,
  constraint pk_recharge primary key(id)
) charset=utf8 ENGINE=InnoDB;
create index idx_recharge_user_id on recharge(user_id);

/**
充值应该是接口回调通知，此表记录充值回调的访问信息
create table recharge_notice (

)
*/

create table user_order (
  id bigint auto_increment,
  user_id bigint,
  prod_id bigint,
  amount decimal(10,2),
  state varchar(20),
  remark varchar(200),
  created_time timestamp,
  constraint pk_user_order primary key(id)
) charset=utf8 ENGINE=InnoDB;
create index idx_uo_user_id on user_order(user_id);
create index idx_uo_prod_id on user_order(prod_id);

create table order_pay (
  id bigint auto_increment,
  order_id bigint,
  user_id bigint,
  pay_way varchar(20),
  amount decimal(10,2),
  state varchar(20),
  remark varchar(20),
  created_time timestamp ,
  constraint pk_order_pay primary key(id)
) charset=utf8 ENGINE=InnoDB;
create index idx_op_order_id on order_pay(order_id);
create index idx_op_user_id on order_pay(user_id);

