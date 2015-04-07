drop table if exists member;
drop table if exists member_auth_status;
drop table if exists member_account_balance;
drop table if exists member_accounting;
drop table if exists member_accounting_transaction;
drop table if exists member_stock_account;


create table member (
  id bigint auto_increment not null comment 'id',
  uname varchar(50) not null comment '用户名',
  email varchar(50) not null comment '邮箱',
  mobile varchar(15) not null comment '手机',
  password char(48) not null comment '登录密码',
  trade_password char(48) not null comment '交易密码',
  real_name varchar(100) not null comment '真实名称',
  type int not null comment '类别【个人|企业】',
  locked int not null comment '是否锁定【是|否】',
  code bigint not null comment '会员代码',
  nickname varchar(50) not null comment '昵称',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key(id),
  key(uname),
  key(email),
  key(mobile)
) charset=utf8 ENGINE=InnoDB comment '会员基础表';

create table member_auth_status (
  id bigint auto_increment not null comment 'id',
  m_id bigint not null comment '会员id',
  type int not null comment '类型【实名认证|身份证上传|绑定手机|邮箱绑定|昵称|手持身份证上传|提款密码|银行卡管理|登录密码|短信通知|自动投标|个人信息|注册时间】',
  status_value varchar(200) not null comment '分类型的值',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(m_id, type)
) charset=utf8 ENGINE=InnoDB comment '会员认证状态表';

create table member_account_balance (
  id bigint auto_increment not null comment 'id',
  m_id bigint not null comment '会员id',
  type int not null comment '账户类型【现金账户|积分账户|红包账户|权益金账户|各个冻结】',
  amount bigint not null comment '金额',
  -- frozen_amount bigint not null comment '冻结金额',
  unit int not null comment '单位',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(m_id,type)
) charset=utf8 ENGINE=InnoDB comment '会员账户平衡表';

create table member_accounting(
  id bigint auto_increment not null comment 'id',
  m_id bigint not null comment '会员id',
  type int not null comment '账户类型',
  from_date datetime not null comment '账期开始时间',
  thru_date datetime not null comment '账期结束时间',
  from_amount bigint not null comment '期初额',
  thru_amount bigint not null comment '期末额',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(m_id, type, from_date)
) charset=utf8 ENGINE=InnoDB comment '会员账户会计表';

create table member_accounting_transaction(
  id bigint auto_increment not null comment 'id',
  from_m_id bigint not null comment '源会员',
  to_m_id bigint not null comment '目标会员',
  from_ma_id bigint not null comment '来源账户',
  to_ma_id bigint not null comment '目标账户',
  type int not null comment '业务类型',
  amount bigint not null comment '发生额',
  unit int not null comment '单位',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(from_m_id, type),
  key(to_m_id, type)
) charset=utf8 ENGINE=InnoDB comment '入账事务表';

create table member_stock_account(
  id bigint auto_increment not null comment 'id',
  m_id bigint not null comment '会员id',
  type int not null comment '账户类型',
  from_date datetime not null comment '设立时间',
  thru_date datetime not null comment '清户时间',
  account_name varchar(20) not null comment '账户名',
  stock_code varchar(30) not null comment '炒股账号',
  usable_amount bigint not null comment '可用余额',
  cash_amount bigint not null comment '可取余额',
  cash_fund_amount bigint not null comment '保证金',
  financed_amount bigint not null comment '融资额',
  interest_amount  bigint not null comment '总利息',
  interest_payed bigint not null comment '已支付利息',
  stock_market_value bigint not null comment '股票市值',
  alarm_amount bigint not null comment '预警金额',
  forced_liquidation_amount bigint not null comment '强制平仓金额',
  last_value_time datetime not null comment '最新评估时间',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(m_id, type, from_date),
  key(stock_code),
  key(account_name)
) charset=utf8 ENGINE=InnoDB comment '会员股票账户表';



