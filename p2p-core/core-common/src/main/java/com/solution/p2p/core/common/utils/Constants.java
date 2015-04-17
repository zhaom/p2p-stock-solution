package com.solution.p2p.core.common.utils;

/**
 * Created by johnKee on 2015/4/11.
 */
public class Constants {
    // 通用是否
    public static final int COMMON_YES = 1;
    public static final int COMMON_NO = 0;
    // insert into sys_dict(value,name,category,category_name,sort) values(1,'是','common_yes_or_no','是否',1),(0,'否','common_yes_or_no','是否',2);
    // 会员类型【个人|企业】
    public static final int MEMBER_TYEP_PERSON = 10;
    public static final int MEMBER_TYEP_ENTERPRISE = 30;
    // insert into sys_dict(value,name,category,category_name,sort) values(10,'个人','member_type','会员类型',1),(30,'企业','common_yes_or_no','会员类型',2);
    // direction 贷记 借记
    public static final int MEMBER_ACCOUNT_DIR_CREDIT = 50;
    public static final int MEMBER_ACCOUNT_DIR_DEBT = 51;
    // insert into sys_dict(value,name,category,category_name,sort) values(50,'贷记','member_account_dir','记账方向',1),(52,'借记','member_account_dir','记账方向',2);
    // unit 人民币分
    public static final int MEMBER_ACCOUNT_AMOUNT_UNIT_CNYCENT = 60;
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

    // 资源类型【菜单6000|按钮|tab页6002】
    public static final int SYS_RESOURCE_TYPE_MENU = 6000;
    public static final int SYS_RESOURCE_TYPE_BUTTON = 6001;
    public static final int SYS_RESOURCE_TYPE_TAB = 6002;

    // DATA_VERSION 数据版本
    // public static final int MEMBER_ACCOUNT_DATA_VERSION_DEFAULT = 10000;


    // 周期单位[日20000|月20001]
    public static final int BID_LIFE_DURATION_UNIT_DAY = 20000;
    public static final int BID_LIFE_DURATION_UNIT_MONTH = 20001;
    // 利率单位【日20100|月|年|一次性20103】
    public static final int BID_INTEREST_RATE_UNIT_DAY = 20100;
    public static final int BID_INTEREST_RATE_UNIT_MONTH = 20101;
    public static final int BID_INTEREST_RATE_UNIT_YEAR = 20102;
    public static final int BID_INTEREST_RATE_UNIT_ONCE = 20103;

    // 标状态
    public static final int BID_STATUS_CREATED = 30000;
    public static final int BID_STATUS_WAIT_RELEASE = 30001;
    public static final int BID_STATUS_ONLINE = 30002;
    public static final int BID_STATUS_REFUND = 30003;
    public static final int BID_STATUS_ENDED = 30004;
    public static final int BID_STATUS_CANCELED = 30005;
    // 还款状态
    public static final int BID_REFUND_STATUS_WAITING = 40000;
    public static final int BID_REFUND_STATUS_REFUNDED = 40001;
    public static final int BID_REFUND_STATUS_OVER_DUE = 40002;
    public static final int BID_REFUND_STATUS_OVER_DUE_REFUNDED = 40004;
    public static final int BID_REFUND_STATUS_PRE_REFUNDED = 40005;

    // 分发状态
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


    public static final String CURRENT_USER = "loginMember";
    public static final String SERVER_APP_KEY = "645ba616-370a-43a8-a8e0-993e7a590cf0";
}
