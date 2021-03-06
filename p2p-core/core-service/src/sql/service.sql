﻿drop table if exists bid;
drop table if exists member_bid_request;
drop table if exists bid_refund_info;
drop table if exists member_bid_distribute;

drop table if exists product;
drop table if exists product_guaranty_category;
drop table if exists product_duration_category;
drop table if exists product_amount_category;
drop table if exists product_interest_category;
drop table if exists product_service_fee_category;
drop table if exists product_pay_category;
drop table if exists product_member_category;
drop table if exists product_channel_category;
drop table if exists bid_stock_account;

create table if not exists bid(
  id bigint auto_increment not null comment 'id',
  code char(16) not null comment '标编码',
  prod_id bigint not null comment '产品编码',
  name varchar(50) not null comment '标名称',
  m_id bigint not null comment '借款人id',
  guaranty_amount bigint not null comment '保证金金额',
  collect_times int not null comment '配资倍数',
  collect_amount bigint not null comment '配资金额',
  collected_amount bigint not null comment '已经募集金额',
  life_duration int not null comment '配资周期',
  life_duration_unit int not null comment '周期单位【自然日65|交易日|自然月|自然年|一次性69】',
  collect_interest_rate decimal(18,9) not null comment '配资利率',
  collect_interest_rate_unit int not null comment '配资利率单位【自然日65|交易日|自然月|自然年|一次性69】',
  request_interest_rate decimal(18,9) not null comment '投标利率',
  request_interest_rate_unit int not null comment '投标利率单位【自然日65|交易日|自然月|自然年|一次性69】',
  collect_from_time datetime not null comment '募资开始时间',
  collect_thru_time datetime not null comment '募资截止时间',
  bid_success_time datetime comment '成标时间',
  bid_status int not null comment '状态【初始30000|募集中|已满额|还款中|已还清|已强制平仓还清|已流标30007】',
  collect_pay_status int not null comment '支付状态【待支付30100|部分支付|已支付30102】',
  requirement_service_fee bigint not null comment '服务费',
  requirement_management_fee bigint not null comment '管理费',
  requirement_other_fee bigint not null comment '其它费用',
  is_split_profit int not null comment '是否分收益【是1|否0】',
  split_ratio int not null comment '分成比例',
  is_transfer int not null comment '是否转让标【是1|否0】',
  transfer_parent_id bigint comment '转让标的父id，对应memberBidRequest的id',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(code),
  key(prod_id),
  key(m_id),
  key(transfer_parent_id)
) charset=utf8 ENGINE=InnoDB comment '标信息表';

create table if not exists member_bid_request(
  id bigint auto_increment not null comment 'id',
  m_id bigint not null comment '会员id',
  b_id bigint not null comment '标id',
  amount bigint not null comment '投标金额',
  request_status int not null comment '投标状态【未支付40100|已支付|成功|失败40103】',
  failed_reason varchar(50) comment '失败原因',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(m_id),
  key(b_id)
) charset=utf8 ENGINE=InnoDB comment '会员投标表';

create table if not exists bid_refund_info (
  id bigint auto_increment not null comment 'id',
  m_id bigint not null comment '会员id',
  b_id bigint not null comment '标id',
  issue char(5) not null comment '期数',
  scheduled_refund_time datetime not null comment '应还款日',
  real_refund_time datetime comment '实际还款日',
  refund_flow_id char(16) comment '还款流水号',
  scheduled_refund_principal bigint not null comment '应还本金',
  scheduled_refund_interest bigint not null comment '应还利息',
  scheduled_refund_service_fee bigint not null comment '应还服务费',
  real_refund_amount bigint not null comment '实际还款额',
  real_refund_fine bigint not null comment '实际还款罚金',
  refund_status int not null comment '还款状态【待还款40000|已还款|已逾期|逾期已还款|已提前还款|确认坏账40006】',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key (m_id, b_id, refund_status, scheduled_refund_time),
  key(scheduled_refund_time)
) charset=utf8 ENGINE=InnoDB comment '配资还款表';

create table if not exists member_bid_distribute(
  id bigint auto_increment not null comment 'id',
  m_id bigint not null comment '会员id',
  b_id bigint not null comment '标id',
  issue char(5) not null comment '期数',
  request_amount bigint not null comment '投标金额',
  scheduled_dist_time datetime not null comment '应分发时间',
  scheduled_dist_principal bigint not null comment '应分发本金',
  scheduled_dist_interest bigint not null comment '应分发利息',
  scheduled_dist_revenue bigint not null comment '应分发其他补偿',
  real_dist_time datetime comment '实际分发时间',
  real_dist_amount bigint not null comment '实际分发金额',
  dist_status int not null comment '分发状态【待分发50000|已逾期|已分发|提前分发|坏账已补偿50004】',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(m_id, dist_status, scheduled_dist_time),
  key(b_id, dist_status, scheduled_dist_time)
) charset=utf8 ENGINE=InnoDB comment '投标回款表';

create table if not exists product(
  id bigint auto_increment not null comment 'id',
  name varchar(50) not null comment '产品名称',
  guaranty_category int not null comment '抵押分类',                                -- 【股票|债权|期货持仓|外汇持仓|...】
  life_duration_category int not null comment '存续周期分类',                      -- 【按天配资|按月配资】
  collect_duration_category int not null comment '募集周期分类',                  --  【按天募集|按小时募集】
  loan_amount_category int not null comment '借款金额分类',                        --  【超小额|小额|普通额|大额】
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

create table if not exists product_guaranty_category(
  id int auto_increment not null comment 'id',
  name varchar(50) not null comment '抵押分类名称',
  net_value_cycle int not null comment '净值估算周期',
  net_value_cycle_unit int not null comment '净值估算周期单位',
  alarm_percent int not null comment '预警比例阙值',
  forced_liquidation_percent int not null comment '强制平仓比例阙值',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id)
) charset=utf8 ENGINE=InnoDB comment '产品抵押分类定义表';

create table if not exists product_duration_category(
  id int auto_increment not null comment 'id',
  name varchar(50) not null comment '周期分类名',
  limit_min_duration int not null comment '最短周期限定',
  limit_max_duration int not null comment '最长周期限定',
  duration_unit int not null comment '周期单位【自然日65|交易日|自然月|自然年|一次性69】',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id)
) charset=utf8 ENGINE=InnoDB comment '产品周期分类定义表';

create table if not exists product_amount_category(
  id int auto_increment not null comment 'id',
  name varchar(50)  not null comment '金额分类名',
  limit_min_amount bigint not null comment '最小金额',
  limit_max_amount bigint not null comment '最大金额',
  limit_step_amount bigint not null comment '步长',
  amount_unit int not null comment '单位【人民币分60|人民币元61】',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id)
) charset=utf8 ENGINE=InnoDB comment '产品金额分类定义表';

create table if not exists product_interest_category(
  id bigint auto_increment not null comment 'id',
  name varchar(50) not null comment '名称',
  limit_min_interest_rate decimal(18,9) not null comment '利率下限',
  limit_max_interest_rate decimal(18,9) not null comment '利率下限',
  prefer_interest_rate decimal(18,9) not null comment '默认利率',
  interest_rate_unit int not null comment '计息时间单位【自然日65|交易日|自然月|自然年|一次性69】',
  int_diff_time int not null comment '计息开始时间与募集结束时间偏差',
  diff_unit int not null comment '时间偏差单位计息时间单位【自然日65|交易日|自然月|自然年|一次性69】',
  refund_int_diff_time_limit int not null comment '返息时间偏差限定',
  refund_int_first int not null comment '是否首先返息【是1|否0】',
  refund_cycle_duration int not null comment '返息周期单周期长度',
  refund_cycle_duration_unit int not null comment '返息周期单周期长度单位【自然日65|交易日|自然月|自然年|一次性69】',
  refund_int_times int not null comment '多次返息【是1|否0】',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id)
) charset=utf8 ENGINE=InnoDB comment '产品计息分类定义表';

create table if not exists product_service_fee_category(
  id int auto_increment not null comment 'id',
  name varchar(50) not null comment '名称',
  limit_min_service_fee_rate decimal(18,9) not null comment '服务费率下限',
  limit_max_service_fee_rate decimal(18,9) not null comment '服务费率上限',
  prefer_service_fee_rate decimal(18,9) not null comment '默认服务费率',
  service_fee_rate_unit int not null comment '服务费率时间单位【自然日65|交易日|自然月|自然年|一次性69】',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id)
) charset=utf8 ENGINE=InnoDB comment '产品服务费分类定义表';

create table if not exists product_pay_category(
  id int auto_increment not null comment 'id',
  name varchar(50) not null comment '名称',
  amount_limit_type int not null comment '账户限定分类【所有账户都用75|限定为指定的账户类型|指定的账户类型禁止|只现金账户余额可用78】',
  account_types varchar(200) not null comment '指定可用的账户种类',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id)
) charset=utf8 ENGINE=InnoDB comment '产品支付分类定义表';

create table if not exists product_member_category(
  id int auto_increment not null comment 'id',
  name varchar(50) not null comment '名称',
  mamber_limit_type int not null comment '会员限定类型【所有会员都可以80|限定vip会员|限定新会员|特定指定类型的会员|禁止指定会员84】',
  member_types varchar(200) not null comment '限定的会员类型',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id)
) charset=utf8 ENGINE=InnoDB comment '产品会员分类定义表';

create table if not exists product_channel_category(
  id int auto_increment not null comment 'id',
  name varchar(50) not null comment '名称',
  web_bid int not null comment '网站【是1|否0】',
  mobile_bid int not null comment '移动端【是1|否0】',
  wechat_bid int not null comment '微信【是1|否0】',
  event_bid_limit_type int not null comment '活动限定类型【所有活动允许|所有活动禁止|限定活动允许|限定活动禁止】',
  event_bids varchar(200) not null comment '指定的活动',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id)
) charset=utf8 ENGINE=InnoDB comment '产品渠道分类定义表';


create table if not exists bid_stock_account(
  id bigint auto_increment not null comment 'id',
  b_id bigint not null comment '标id',
  m_id bigint not null comment '借款人id',
  m_stock_account_id bigint not null comment '股票账户',
  from_time datetime not null comment '关联开始时间',
  thru_time datetime not null comment '关联结束时间',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(m_stock_account_id, from_time, thru_time),
  key(m_id,from_time,thru_time)
) charset=utf8 ENGINE=InnoDB comment '配资标与股票账户关联表';









