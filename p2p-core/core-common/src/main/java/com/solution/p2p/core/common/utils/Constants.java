package com.solution.p2p.core.common.utils;

/**
 * Created by johnKee on 2015/4/11.
 */
public class Constants {
    // 通用是否
    public static final int COMMON_YES = 1;
    public static final int COMMON_NO = 0;

    // 通用排序
    public static final int COMMON_DESC = 5;
    public static final int COMMON_ASEC = 6;
    // 会员类型【个人|企业】
    public static final int MEMBER_TYEP_PERSON = 10;
    public static final int MEMBER_TYEP_ENTERPRISE = 30;
    // insert into sys_dict(value,name,category,category_name,sort) values(10,'个人','member_type','会员类型',1),(30,'企业','common_yes_or_no','会员类型',2);
    // direction 贷记 借记
    public static final int MEMBER_ACCOUNT_DIR_CREDIT = 50;
    public static final int MEMBER_ACCOUNT_DIR_DEBT = 51;
    // insert into sys_dict(value,name,category,category_name,sort) values(50,'贷记','member_account_dir','记账方向',1),(52,'借记','member_account_dir','记账方向',2);
    // 金额单位【人民币分|人民币元】
    public static final int AMOUNT_UNIT_CNYCENT = 60;
    public static final int AMOUNT_UNIT_CNYYUAN = 61;
    // 时间周期单位【自然日|交易日|自然月|自然年|一次性】
    public static final int DURATION_UNIT_DAY = 65;
    public static final int DURATION_UNIT_TRADE_DAY = 66;
    public static final int DURATION_UNIT_MONTH = 67;
    public static final int DURATION_UNIT_YEAR = 68;
    public static final int DURATION_UNIT_ONCE = 69;

    // 支付限定账户【所有账户都用75|限定为指定的账户类型|指定的账户类型禁止|只现金账户余额可用78】
    public static final int PAY_LIMIT_AMOUNT_TYPE_ALL_CAN = 75;
    public static final int PAY_LIMIT_AMOUNT_TYPE_SPECIAL_CAN = 76;
    public static final int PAY_LIMIT_AMOUNT_TYPE_SPECIAL_CANNOT = 77;
    public static final int PAY_LIMIT_AMOUNT_TYPE_MONEY_ONLY = 78;

    // 限定会员类型【所有会员都可以80|限定vip会员|限定新会员|特定指定类型的会员|禁止指定会员84】
    public static final int MEMBER_LIMIT_TYPE_ALL_CAN = 80;
    public static final int MEMBER_LIMIT_TYPE_VIP_CAN = 81;
    public static final int MEMBER_LIMIT_TYPE_NEW_CAN = 82;
    public static final int MEMBER_LIMIT_TYPE_SPECIAL_CAN = 83;
    public static final int MEMBER_LIMIT_TYPE_SPECIAL_CANNOT = 84;

    // insert into sys_dict(value,name,category,category_name,sort) values(60,'人民币分','money_unit','金额单位',1);
    // set_no
    public static final int MEMBER_ACCOUNT_SET_NO_DEFAULT = 90;
    // insert into sys_dict(value,name,category,category_name,sort) values(90,'90套账','set_no','账套号',1);
    // 【实名认证|身份证上传|绑定手机|邮箱绑定|昵称|手持身份证上传|提款密码|银行卡管理|登录密码|短信通知|自动投标|个人信息|注册时间】
    public static final int MEMBER_AUTH_STATUS_TYPE_REAL_NAME = 100;
    public static final int MEMBER_AUTH_STATUS_TYPE_IDCARD_UPLOAD = 101;
    public static final int MEMBER_AUTH_STATUS_TYPE_BIND_MOBILE_ = 102;
    public static final int MEMBER_AUTH_STATUS_TYPE_BIND_MAIL = 103;
    public static final int MEMBER_AUTH_STATUS_TYPE_SET_NICKNAME = 104;
    public static final int MEMBER_AUTH_STATUS_TYPE_STRICT_IDCARD_UPLOAD = 105;
    public static final int MEMBER_AUTH_STATUS_TYPE_WITHDRAW_PASSWORD = 106;
    public static final int MEMBER_AUTH_STATUS_TYPE_CARD_MANAGE = 107;
    public static final int MEMBER_AUTH_STATUS_TYPE_LOGIIN_PASSWORD = 108;
    public static final int MEMBER_AUTH_STATUS_TYPE_SMS_NOTICE = 109;
    public static final int MEMBER_AUTH_STATUS_TYPE_AUTO_INVEST = 110;
    public static final int MEMBER_AUTH_STATUS_TYPE_END_PROFILE = 111;
    public static final int MEMBER_AUTH_STATUS_TYPE_VALID_REG_TIME = 112;
    // insert into sys_dict(value,name,category,category_name,sort) values(100,'实名认证','member_auth','会员安全设置',10),(101,'身份证上传','member_auth','会员安全设置',20),(102,'绑定手机','member_auth','会员安全设置',30),(103,'邮箱绑定','member_auth','会员安全设置',40),(104,'昵称','member_auth','会员安全设置',50),(105,'手持身份证上传','member_auth','会员安全设置',60),
    //(106,'提款密码','member_auth','会员安全设置',70),(107,'银行卡管理','member_auth','会员安全设置',80),(108,'登录密码','member_auth','会员安全设置',90),(109,'短信通知','member_auth','会员安全设置',100),(110,'自动投标','member_auth','会员安全设置',110),(111,'个人信息','member_auth','会员安全设置',120),(112,'注册时间','member_auth','会员安全设置',130);
    //  账户状态【创建|可用|止付|冻结|销户】
    public static final int MEMBER_ACCOUNT_STATE_CREATED = 200;
    public static final int MEMBER_ACCOUNT_STATE_USABLE = 201;
    public static final int MEMBER_ACCOUNT_STATE_STOP_PAY = 202;
    public static final int MEMBER_ACCOUNT_STATE_FROZEN = 203;
    public static final int MEMBER_ACCOUNT_STATE_CLOSED = 204;
    // insert into sys_dict(value,name,category,category_name,sort) values(200,'创建','member_account_status','账户状态',10),(201,'可用','member_account_status','账户状态',20),(202,'止付','member_account_status','账户状态',30),(203,'冻结','member_account_status','账户状态',40),(204,'销户','member_account_status','账户状态',50);

    // 留言分类（271咨询、272建议、273投诉、274其它）
    public static final int GUESTBOOK_TYPE_CONSULT = 271;
    public static final int GUESTBOOK_TYPE_SUGGEST = 272;
    public static final int GUESTBOOK_TYPE_COMPLAINT = 273;
    public static final int GUESTBOOK_TYPE_OTHERS = 274;
   // insert into sys_dict(value,name,category,category_name,sort) values(271,'咨询','guestbook_type','留言分类',10),(272,'建议','guestbook_type','留言分类',20),(273,'投诉','guestbook_type','留言分类',30),(274,'其它','guestbook_type','留言分类',40);

    // 成分类型[本金|利息|收费|盈亏]
    public static final int MEMBER_ACCOUNT_ITEM_TYPE_PRINCIPAL = 300;
    public static final int MEMBER_ACCOUNT_ITEM_TYPE_INTEREST = 301;
    public static final int MEMBER_ACCOUNT_ITEM_TYPE_FEE = 302;
    public static final int MEMBER_ACCOUNT_ITEM_TYPE_PROFIT = 303;
    // insert into sys_dict(value,name,category,category_name,sort) values(300,'本金','member_account_item_type','成分类型',10),(301,'利息','member_account_item_type','成分类型',20),(302,'收费','member_account_item_type','成分类型',30),(303,'盈亏','member_account_item_type','成分类型',40)；
    //   账务操作类型[收入|支出|冻结|解冻|成份冻结|成份解冻]
    public static final int MEMBER_ACCOUNT_FINANCE_OP_TYPE_INCOME = 400;
    public static final int MEMBER_ACCOUNT_FINANCE_OP_TYPE_PAY = 401;
    public static final int MEMBER_ACCOUNT_FINANCE_OP_TYPE_FROZEN = 402;
    public static final int MEMBER_ACCOUNT_FINANCE_OP_TYPE_THAW = 403;
    public static final int MEMBER_ACCOUNT_FINANCE_OP_TYPE_ITEM_FROZEN = 404;
    public static final int MEMBER_ACCOUNT_FINANCE_OP_TYPE_ITEM_THAW = 405;

    // 交易类型[充值| 购买/支付|转账| 提现]
    public static final int MEMBER_ACCOUNT_TRADE_TYPE_RECHARGE = 500;
    public static final int MEMBER_ACCOUNT_TRADE_TYPE_PAY = 501;
    public static final int MEMBER_ACCOUNT_TRADE_TYPE_TRANSFER = 502;
    public static final int MEMBER_ACCOUNT_TRADE_TYPE_WITHDRAW = 503;

    // 支付工具[网关|快捷|代付|余额]
    public static final int MEMBER_ACCOUNT_PAY_METHOD_GATE = 600;
    public static final int MEMBER_ACCOUNT_PAY_METHOD_EXPRESS = 601;
    public static final int MEMBER_ACCOUNT_PAY_METHOD_DELEGATE_PAY = 602;
    public static final int MEMBER_ACCOUNT_PAY_METHOD_USABLE_AMOUNT = 603;

    // 对账类型【需和上方对账|需和下方对账|均需对账|无需对账】
    public static final int MEMBER_ACCOUNT_BALANCE_TYPE_UP_NEEDED = 700;
    public static final int MEMBER_ACCOUNT_BALANCE_TYPE_DOWN_NEEDED = 701;
    public static final int MEMBER_ACCOUNT_BALANCE_TYPE_BOTH_NEEDED = 702;
    public static final int MEMBER_ACCOUNT_BALANCE_TYPE_NONE_NEEDED = 703;
    // 记账操作状态[凭证登记|记账处理中|记账成功|记账失败]
    public static final int MEMBER_ACCOUNT_OP_STATUS_REG = 800;
    public static final int MEMBER_ACCOUNT_OP_STATUS_DOING = 801;
    public static final int MEMBER_ACCOUNT_OP_STATUS_SUCCESS = 802;
    public static final int MEMBER_ACCOUNT_OP_STATUS_FAILED = 803;

    // 系统操作类型【登录850|退出|充值|提现|转让|修改密码|找回密码|银行卡操作857】
    public static final int SYS_OP_TYPE_LOGIN = 850;
    public static final int SYS_OP_TYPE_LOGOUT = 851;
    public static final int SYS_OP_TYPE_RECHARGE = 852;
    public static final int SYS_OP_TYPE_WITHDRAW = 853;
    public static final int SYS_OP_TYPE_TRANSFER = 854;
    public static final int SYS_OP_TYPE_CHANGEPASSWORD = 855;
    public static final int SYS_OP_TYPE_BACKPASSWORD = 856;
    public static final int SYS_OP_TYPE_ABOUT_CARD = 857;



    // 记账接口访问模式[普通记账|手工记账|重复记账|冲正记账]
    public static final int MEMBER_ACCOUNT_REQ_METHOD_NORMAL = 900;
    public static final int MEMBER_ACCOUNT_REQ_METHOD_MANUAL = 901;
    public static final int MEMBER_ACCOUNT_REQ_METHOD_REPEAT = 902;
    public static final int MEMBER_ACCOUNT_REQ_METHOD_CORRECTION = 903;

    //  账户类型【个人基本账户1001|个人保证金|个人欠款|个人活动本金户|企业基本户|企业服务费账户|充值手续费账户|风险金|取现账户|取现手续费|转让手续费|企业活动本金账户3008】
    public static final int MEMBER_ACCOUNT_TYPE_PERSON_BASE = 1001;
    public static final int MEMBER_ACCOUNT_TYPE_PERSON_WARRANTY = 1002;
    public static final int MEMBER_ACCOUNT_TYPE_PERSON_DEBT = 1003;
    public static final int MEMBER_ACCOUNT_TYPE_PERSON_EVENT_PRINCIPAL = 1004;

    public static final int MEMBER_ACCOUNT_TYPE_ENTERPRISE_BASE = 3001;
    public static final int MEMBER_ACCOUNT_TYPE_ENTERPRISE_SERVICE_FEE = 3002;
    public static final int MEMBER_ACCOUNT_TYPE_ENTERPRISE_RECHARGE_FACTORAGE = 3003;
    public static final int MEMBER_ACCOUNT_TYPE_ENTERPRISE_RISK_FUND = 3004;
    public static final int MEMBER_ACCOUNT_TYPE_ENTERPRISE_WITHDRAW_DEPOSIT = 3005;
    public static final int MEMBER_ACCOUNT_TYPE_ENTERPRISE_WITHDRAW_DEPOSIT_FACTORAGE = 3006;
    public static final int MEMBER_ACCOUNT_TYPE_ENTERPRISE_TRANSFER_FACTORAGE = 3007;
    public static final int MEMBER_ACCOUNT_TYPE_ENTERPRISE_EVENT_PRINCIPAL = 3008;

    // 财务报表时间类型【年4003|月|周|日4000】
    public static final int MEMBER_ACCOUNT_FINANCE_RPT_TIME_TYPE_DAY = 4000;
    public static final int MEMBER_ACCOUNT_FINANCE_RPT_TIME_TYPE_WEEK = 4001;
    public static final int MEMBER_ACCOUNT_FINANCE_RPT_TIME_TYPE_MONTH = 4002;
    public static final int MEMBER_ACCOUNT_FINANCE_RPT_TIME_TYPE_YEAR = 4003;


    // 操盘账户类型【按月付费|按天付费|炒股大赛|免费体验】
    public static final int MEMBER_STOCK_ACCOUNT_TYPE_MONTH = 5000;
    public static final int MEMBER_STOCK_ACCOUNT_TYPE_DAY = 5001;
    public static final int MEMBER_STOCK_ACCOUNT_TYPE_MATCH = 5002;
    public static final int MEMBER_STOCK_ACCOUNT_TYPE_FREE = 5003;

    // 股票账户状态【新建5010|操盘中|已清盘5012】
    public static final int MEMBER_STOCK_ACCOUNT_STATUS_INIT = 5010;
    public static final int MEMBER_STOCK_ACCOUNT_STATUS_OPERATING = 5011;
    public static final int MEMBER_STOCK_ACCOUNT_STATUS_CLEAR = 5012;

    // 资源类型【菜单6000|按钮|tab页6002】
    public static final int SYS_RESOURCE_TYPE_MENU = 6000;
    public static final int SYS_RESOURCE_TYPE_BUTTON = 6001;
    public static final int SYS_RESOURCE_TYPE_TAB = 6002;

    // 消息类型【公告|通知|消息|新闻】
    public static final int SYS_MSG_TYPE_BROADCAST = 6101;
    public static final int SYS_MSG_TYPE_NOTICE = 6102;
    public static final int SYS_MSG_TYPE_PRIVATE_MSG = 6103;
    public static final int SYS_MSG_TYPE_NEWS = 6104;

    // DATA_VERSION 数据版本
    // public static final int MEMBER_ACCOUNT_DATA_VERSION_DEFAULT = 10000;


    // 标状态【初始|待发布|募集中|已满额|还款中|已还清|已强制平仓还清|已流标】
    public static final int BID_STATUS_INIT = 30000;
    public static final int BID_STATUS_WAIT_RELEASE = 30001;
    public static final int BID_STATUS_ONLINE = 30002;
    public static final int BID_STATUS_COLLECT_SUCCESS = 30003;
    public static final int BID_STATUS_REFUNDING = 30004;
    public static final int BID_STATUS_REFUNDED = 30005;
    public static final int BID_STATUS_FORCED_LIQUIDATION = 30006;
    public static final int BID_STATUS_FAILED = 30007;

    // 标支付状态【待支付|部分支付|已支付】
    public static final int BID_COLLECT_PAY_STATUS_NONE = 30100;
    public static final int BID_COLLECT_PAY_STATUS_PATIAL_PAYED = 30101;
    public static final int BID_COLLECT_PAY_STATUS_PAYED = 30102;

    // 还款状态【待还款40000|已还款|已逾期|逾期已还款|已提前还款|确认坏账40006】
    public static final int BID_REFUND_STATUS_WAITING = 40000;
    public static final int BID_REFUND_STATUS_REFUNDED = 40001;
    public static final int BID_REFUND_STATUS_OVER_DUE = 40002;
    public static final int BID_REFUND_STATUS_OVER_DUE_REFUNDED = 40004;
    public static final int BID_REFUND_STATUS_PRE_REFUNDED = 40005;
    public static final int BID_REFUND_STATUS_PRE_BAD_DEBT = 40006;

    // 投标状态【未支付|已支付|成功|失败】
    public static final int MBR_REQUEST_STATUS_NOPAY = 40100;
    public static final int MBR_REQUEST_STATUS_PAYED = 40101;
    public static final int MBR_REQUEST_STATUS_SUCCESS = 40102;
    public static final int MBR_REQUEST_STATUS_FAILED = 40103;

    // 分发状态【待分发50000|已逾期|已分发|提前分发|坏账已补偿50004】
    public static final int MEMBER_BID_DISTRIBUTE_STATUS_WAITING = 50000;
    public static final int MEMBER_BID_DISTRIBUTE_STATUS_OVER_DUE = 50001;
    public static final int MEMBER_BID_DISTRIBUTE_STATUS_DISTRIBUTED = 50002;
    public static final int MEMBER_BID_DISTRIBUTE_STATUS_PRE_DISTIBUTED = 50003;
    public static final int MEMBER_BID_DISTRIBUTE_STATUS_COMPENSATED = 50004;

    // 记账响应码[成功|失败]
    public static final int MEMBER_ACCOUNT_TRANSACTION_REP_CODE_SUCCESS = 100000;
    public static final int MEMBER_ACCOUNT_TRANSACTION_REP_CODE_FAILED = 200000;



    //应用里边的错误码
    public static final int ERROR_CODE_SERVICE_DATA_NOT_FOUND = 500404;
    public static final int ERROR_CODE_SERVICE_DATA_DEPULATE = 500405;





    public static final int ERROR_CODE_SERVICE_PASSWD_INCORRECT = 500601;


    public static final String CURRENT_USER = "loginMember";
    public static final String SERVER_APP_KEY = "645ba616-370a-43a8-a8e0-993e7a590cf0";
}
