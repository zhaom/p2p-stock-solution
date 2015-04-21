drop table if exists member;
drop table if exists member_auth_status;
drop table if exists enterprise_reg_info;
drop table if exists member_account;
drop table if exists member_account_item;
drop table if exists member_account_flow;
drop table if exists member_account_finance_rpt;
drop table if exists member_account_transaction;
drop table if exists member_stock_account;


create table if not exists member (
  id bigint auto_increment not null comment 'id',
  uname varchar(50) not null comment '用户名',
  email varchar(50) not null comment '邮箱',
  mobile varchar(15) not null comment '手机',
  password char(48) not null comment '登录密码',
  trade_password char(48) comment '交易密码',
  real_name varchar(50) comment '真实名称',
  type int not null comment '类别【个人10|企业30】',
  locked int not null comment '是否锁定【是1|否0】',
  code bigint comment '会员代码',
  nickname varchar(50) comment '昵称',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key(id),
  key(uname),
  key(email),
  key(mobile)
) charset=utf8 ENGINE=InnoDB comment '会员基础表';

create table if not exists member_auth_status (
  id bigint auto_increment not null comment 'id',
  m_id bigint not null comment '会员id',
  type int not null comment '类型【实名认证100|身份证上传|绑定手机|邮箱绑定|昵称|手持身份证上传|提款密码|银行卡管理|登录密码|短信通知|自动投标|个人信息|注册时间112】',
  status_value varchar(200) not null comment '分类型的值',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(m_id, type)
) charset=utf8 ENGINE=InnoDB comment '会员认证状态表';

create table if not exists enterprise_reg_info (
  id bigint auto_increment not null comment 'id',
  m_id bigint not null comment '会员id',
  enterprise_name varchar(100) not null comment '企业名称',
  enterprise_reg_no varchar(20) not null comment '营业执照注册号',
  enterprise_reg_addr varchar(200) not null comment '营业执照所在地',
  enterprise_duration datetime not null comment '营业期限',
  enterprise_addr varchar(200) not null comment '常用地址',
  enterprise_tel varchar(20) not null comment '联系电话',
  enterprise_reg_pic varchar(100) not null comment '营业执照副本',
  enterprise_org_code varchar(20) not null comment '组织机构代码',
  enterprise_biz_scope varchar(400) comment '营业范围',
  enterprise_reg_amount varchar(20) comment '注册资金',
  enterprise_fax varchar(20) comment '传真',
  enterprise_legal_real_name varchar(50) not null comment '法人真实姓名',
  enterprise_legal_id_card varchar(18) not null comment '法人身份证号',
  enterprise_id_pic_front varchar(100) not null comment '法人身份证正面照',
  enterprise_id_pic_back varchar(100) not null comment '法人身份证反面照',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(m_id)
) charset=utf8 ENGINE=InnoDB comment '企业会员认证信息表';

create table if not exists member_account (
  id bigint auto_increment not null comment 'id',
  m_id bigint not null comment '会员id',
  name varchar(50) not null comment '账户名称',
  type int not null comment '账户类型【个人基本账户1001|个人保证金|个人欠款|个人活动本金户|企业基本户|企业服务费账户|充值手续费账户|风险金|取现账户|取现手续费|转让手续费|企业活动本金账户3008】',
  set_no int not null comment '账套号90',
  data_version int not null comment '账户数据版本,事务使用',
  direction int not null comment '余额方向【贷记50|借记51】',
  amount bigint not null comment '账户余额',
  frozen_amount bigint not null comment '冻结金额',
  unit int not null comment '单位【人民币分60】',
  state int not null comment '账户状态【创建200|可用|止付|冻结|销户204】',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(m_id,type)
) charset=utf8 ENGINE=InnoDB comment '会员账户表';

create table if not exists member_account_item (
  id bigint AUTO_INCREMENT not null comment 'id',
  m_id bigint not null comment '会员id',
  member_account_id bigint not null comment '账户id',
  item_type int not null comment '成分类型【本金300|利息|收费302】',
  data_version int not null comment '账户数据版本10000',
  amount bigint not null comment '余额',
  frozen_amount bigint not null comment '冻结',
  unit int not null comment '单位【人民币分60】',
  available int not null comment '是否有效【是1|否0】',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(member_account_id,item_type),
  key(m_id,item_type)
) charset=utf8 ENGINE=InnoDB comment '会员账户余额成分表';

create table if not exists member_account_flow (
  id bigint auto_increment not null comment '收支流水id',
  member_account_id bigint not null comment '账户id',
  m_id bigint not null comment '会员id',
  member_account_item_id bigint not null comment '成份id',
  mat_id bigint not null comment '记账凭证id',
  mat_date date not null comment '记账日期',
  mat_service_code int comment '记账服务码(暂时空)',
  finance_op_type int not null comment '账务操作类型[收入400|支出|冻结|解冻|成份冻结|成份解冻405]',
  amount bigint not null comment '记账金额',
  thawed_amount bigint comment '已解冻金额',
  unit int not null comment '单位【人民币分60】',
  mat_summary varchar(200) comment '记账摘要',
  trade_type int comment '交易类型[充值500| 购买/支付|转账| 提现503]',
  trade_seq_no bigint comment '交易流水号',
  pay_seq_no bigint comment '支付流水号',
  thru_frozen_amount bigint not null comment '期末冻结金额',
  thru_amount bigint not null comment '期末余额',
  biz_member_id varchar(50) comment '企业会员号',
  biz_app_date varchar(20) comment '企业平台日期',
  biz_order_no varchar(50) comment '企业订单号',
  pay_method int not null comment '支付工具[网关600|快捷|代付|余额603]',
  bank_code varchar(50) comment '机构编码',
  bank_biz_code varchar(50) comment '机构给平台的商户号',
  bank_accept_date varchar(20) comment '机构受理日期',
  bank_accept_seq_no varchar(50) comment '机构接收的请求号',
  bank_rep_seq_no varchar(50) comment '机构的返回流水号',
  balance_type int comment '对账类型【需和上方对账700|需和下方对账|均需对账|无需对账703】',
  up_balance_flag int comment '上方对账标志[是1|否0]',
  down_balance_flag int comment '下方对账标志[是1|否0]',
  member_account_flow_ext varchar(200) comment '扩展字段',
  remark varchar(200) comment '备注',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(member_account_id),
  key(m_id)
) charset=utf8 ENGINE=InnoDB comment '会员账户流水表';

create table if not exists member_account_finance_rpt(
  id bigint auto_increment not null comment 'id',
  finance_rpt_time_type int not null comment '财务报表时间类型【年4003|月|周|日4000】',
  finance_time  varchar(8) not null comment '时间【YYYY|YYYYMM|YYYYMMDD】',
  m_id bigint not null comment '会员id',
  member_account_id bigint not null comment '账户id',
  member_account_name bigint not null comment '账户名',
  member_account_type int not null comment '账户类型【个人基本账户1001|个人保证金|个人欠款|个人活动本金户|企业基本户|企业服务费账户|充值手续费账户|风险金|取现账户|取现手续费|转让手续费|企业活动本金账户3008】',
  set_no int not null comment '账套号90',
  direction int not null comment '余额方向【贷记50|借记51】',
  from_amount bigint not null comment '期初额',
  from_frozen_amount bigint not null comment '期初冻结额',
  thru_amount bigint not null comment '期末额',
  thru_frozen_amount bigint not null comment '期末冻结额',
  total_income_count int not null comment '总收入笔数',
  total_income_amount bigint not null comment '总收入金额',
  total_expend_count int not null comment '总支出笔数',
  total_expend_amount bigint not null comment '总支出金额',
  total_frozen_count int not null comment '总冻结笔数',
  total_frozen_amount bigint not null comment '总冻结金额',
  total_thaw_count int not null comment '总解冻笔数',
  total_thaw_amount bigint not null comment '总解冻金额',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(m_id),
  key(finance_time),
  key(member_account_id, member_account_type)
) charset=utf8 ENGINE=InnoDB comment '会员账户会计表';

create table if not exists member_account_transaction(
  id bigint auto_increment not null comment 'id',
  req_app varchar(50) not null comment '请求模块',
  req_time datetime not null comment '请求时间',
  req_seq_no bigint not null comment '请求流水号',
  tran_no char(18) not null comment '记账凭证号',
  old_tran_no char(18) comment '原记账凭证号',
  mat_date date not null comment '记账日',
  mat_req_method int not null comment '记账接口访问模式[普通记账900|手工记账|重复记账|冲正记账903]',
  mat_op_state int not null comment '记账操作状态[凭证登记800|记账处理中|记账成功|记账失败803]',
  trade_type int comment '交易类型[充值500| 购买/支付|转账| 提现503]',
  trade_date date comment '交易日',
  trade_seq_no bigint comment '交易流水号',
  pay_seq_no bigint comment '支付流水号',
  mat_item_info varchar(400) not null comment '记账明细信息',
  mat_rep_code int not null comment '记账响应码[成功100000|失败200000]',
  mat_item_result varchar(400) not null comment '记账明细结果信息',
  mat_ext varchar(400) comment '扩展字段',
  mat_remark varchar(400) comment '备注',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(tran_no,old_tran_no),
  key(mat_date),
  key(trade_date)
) charset=utf8 ENGINE=InnoDB comment '记账事务表';

create table if not exists member_stock_account(
  id bigint auto_increment not null comment 'id',
  m_id bigint not null comment '会员id',
  type int not null comment '账户类型【按月付费5000|按天付费|炒股大赛|免费体验5003】',
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
  status int not null comment '股票账户状态【新建5010|操盘中|已清盘5012】',
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP comment '创建时间',
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
  primary key (id),
  key(m_id, type, from_date, thru_date),
  key(stock_code),
  key(account_name)
) charset=utf8 ENGINE=InnoDB comment '会员股票账户表';


