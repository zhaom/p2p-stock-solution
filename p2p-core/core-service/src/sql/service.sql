drop table if exists bid;
drop table if exists member_bid_request;
drop table if exists bid_refund;
drop table if exists bid_refund_distribute;

drop table if exists production;
drop table if exists guaranty_category;
drop table if exists duration_category;
drop table if exists amount_category;
drop table if exists interest_category;
drop table if exists service_fee_category;
drop table if exists pay_category;
drop table if exists member_category;

create table if not exists bid(
  int bigint auto_increment not null comment 'id',
  code char(16) not null comment '标编码',
  prod_id bigint not null comment '产品编码',
  name varchar(50) not null comment '标名称',
  m_id bigint not null comment '借款人id',
  guaranty_amount bigint not null comment '保证金金额',
  collect_times int not null comment '配资倍数',
  collect_amount bigint not null comment '配资金额',
  collected_amount bigint not null comment '已经募集金额',
  life_duration int not null comment '配资周期',
  life_duration_unit int not null comment '周期单位',
  collect_interest_rate decimal(18,9) not null comment '配资利率',
  collect_interest_rate_unit int not null comment '配资利率单位',
  request_interest_rate decimal(18,9) not null comment '投标利率',
  request_interest_rate int not null comment '投标利率单位',
  collect_time_limit datetime not null comment '募资截止时间',
  bid_success_time datetime comment '成标时间',
  status int not null comment '状态',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(code),
  key(prod_id),
  key(m_id)
) charset=utf8 ENGINE=InnoDB comment '标信息表';

create table if not exists member_bid_request(
  int bigint auto_increment not null comment 'id',
  m_id bigint not null comment '会员id',
  b_id bigint not null comment '标id',
  amount bigint not null comment '投标金额',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(m_id),
  key(b_id)
) charset=utf8 ENGINE=InnoDB comment '会员投标表';

create table if not exists bid_refund(
  int bigint auto_increment not null comment 'id',
  m_id bigint not null comment '会员id',
  b_id bigint not null comment '标id',
  scheduled_refund_time datetime not null comment '应还款日',
  real_refund_time datetime comment '实际还款日',
  refund_flow_id char(16) comment '还款流水号',
  scheduled_refund_principal bigint not null comment '应还本金',
  scheduled_refund_interest bigint not null comment '应还利息',
  scheduled_refund_service_fee bigint not null comment '应还服务费',
  real_refund_amount bigint not null comment '实际还款额',
  real_refund_fine bigint not null comment '实际还款罚金',
  refund_status int not null comment '还款状态',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key (m_id, b_id, refund_status, scheduled_refund_time),
  key(scheduled_refund_time)
) charset=utf8 ENGINE=InnoDB comment '配资还款表';

create table if not exists bid_refund_distribute(
  id bigint auto_increment not null comment 'id',
  m_id bigint not null comment '会员id',
  b_id bigint not null comment '标id',
  request_amount bigint not null comment '投标金额',
  scheduled_dist_time datetime not null comment '应分发时间',
  scheduled_dist_principal bigint not null comment '应分发本金',
  scheduled_dist_interest bigint not null comment '应分发利息',
  scheduled_dist_revenue bigint not null comment '应分发其他补偿',
  real_dist_time datetime comment '实际分发时间',
  real_dist_amount bigint not null comment '实际分发金额',
  dist_status int not null comment '分发状态',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(m_id, dist_status, scheduled_dist_time),
  key(b_id, dist_status, scheduled_dist_time)
) charset=utf8 ENGINE=InnoDB comment '投标回款表';

create table if not exists production(
  id bigint auto_increment not null comment 'id',
  name varchar(50) not null comment '产品名称',
  guaranty_category int not null comment '抵押分类',
  life_duration_category int not null comment '存续周期分类',
  collect_duration_category int not null comment '募集周期分类',
  loan_amount_category int not null comment '借款金额分类',
  l_interest_category int not null comment '计息分类',
  l_service_fee_category int not null comment '服务费分类',
  l_pay_category int not null comment '支付分类',
  l_member_category int not null comment '借款人分类',
  b_interest_category int not null comment '投标人计息分类',
  b_service_fee_category int not null comment '投标人服务费分类',
  b_amount_category int not null comment '投标金额分类',
  b_pay_category int not null comment '投标人支付分类',
  b_member_category int not null comment '投标人分类',
  channel_category int not null comment '渠道分类',
  available int not null comment '是否可用',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id)
) charset=utf8 ENGINE=InnoDB comment '标产品表';

create table if not exists guaranty_category(
  id bigint auto_increment not null comment 'id',
  name varchar(50) not null comment '抵押分类名称',
  net_value_cycle int not null comment '净值估算周期',
  net_value_cycle_unit int not null comment '净值估算周期单位',
  alarm_percent int not null comment '预警比例阙值',
  forced_liquidation_percent int not null comment '强制平仓比例阙值',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id)
) charset=utf8 ENGINE=InnoDB comment '物品分类表';

create table if not exists duration_category(
  int bigint auto_increment not null comment 'id',
  name varchar(50) not null comment '周期分类名',
  limit_min_duration int not null comment '最短周期限定',
  limit_max_duration int not null comment '最长周期限定',
  duration_unit int not null comment '周期单位',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id)
) charset=utf8 ENGINE=InnoDB comment '周期分类';

create table if not exists amount_category(
  int bigint auto_increment not null comment 'id',
  name varchar(50)  not null comment '金额分类名',
  limit_min_amount int not null comment '最小金额',
  limit_max_amount int not null comment '最大金额',
  limit_step_amount int not null comment '步长',
  amount_unit int not null comment '单位',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id)
) charset=utf8 ENGINE=InnoDB comment '周期分类';

create table if not exists interest_category(
  int bigint auto_increment not null comment 'id',
  name varchar(50) not null comment '名称',
  limit_min_interest_rate decimal(18,9) not null comment '利率下限',
  limit_max_interest_rate decimal(18,9) not null comment '利率下限',
  prefer_interest_rate decimal(18,9) not null comment '默认利率',
  int_diff_time int not null comment '计息开始时间与募集结束时间偏差',
  diff_unit int not null comment '时间偏差单位',
  refund_int_diff_time_limit int not null comment '返息时间偏差限定',
  refund_int_first int not null comment '是否首先返息',
  refund_cycle_duration int not null comment '返息周期单周期长度',
  refund_cycle_duration_unit int not null comment '返息周期单周期长度单位',
  refund_int_times int not null comment '返息次数',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id)
) charset=utf8 ENGINE=InnoDB comment '计息分类';

create table if not exists service_fee_category(
  int bigint auto_increment not null comment 'id',
  name varchar(50) not null comment '名称',
  limit_min_service_fee_rate decimal(18,9) not null comment '服务费率下限',
  limit_max_service_fee_rate decimal(18,9) not null comment '服务费率上限',
  prefer_service_fee_rate decimal(18,9) not null comment '默认服务费率',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id)
) charset=utf8 ENGINE=InnoDB comment '计息分类';

create table if not exists pay_category(
  int bigint auto_increment not null comment 'id',
  name varchar(50) not null comment '名称',
  limit_usable_amount int not null comment '是否限定只有现金可用余额可用',
  all_usable int not null comment '是否所有余额可以使用',
  limit_usable_account_type varchar(200) not null comment '限定可用的账户种类',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id)
) charset=utf8 ENGINE=InnoDB comment '计息分类';

create table if not exists member_category(
  int bigint auto_increment not null comment 'id',
  name varchar(50) not null comment '名称',
  limit_vip_mamber int not null comment '是否限定vip会员',
  limit_new_member int not null comment '是否限定新会员',
  limit_member_type varchar(200) not null comment '限定的会员类型',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id)
) charset=utf8 ENGINE=InnoDB comment '计息分类';

create table if not exists channel_category(
  int bigint auto_increment not null comment 'id',
  name varchar(50) not null comment '名称',
  web_bid int not null comment '网站',
  mobile_bid int not null comment '移动端',
  limit_event_bid int not null comment '限定活动',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id)
) charset=utf8 ENGINE=InnoDB comment '计息分类';







