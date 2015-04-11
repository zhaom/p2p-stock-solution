package com.solution.p2p.core.common.utils;

/**
 * Created by johnKee on 2015/4/11.
 */
public class Constants {
    // 通用是否
    public static final int COMMON_YES = 1;
    public static final int COMMON_NO = 0;
    // 会员类型【个人|企业】
    public static final int MEMBER_TYEP_PERSON = 10;
    public static final int MEMBER_TYEP_ENTERPRISE = 30;
    // direction 贷记 借记
    public static final int MEMBER_ACCOUNT_DIR_CREDIT = 50;
    public static final int MEMBER_ACCOUNT_DIR_DEBT = 51;

    // unit 人民币分
    public static final int MEMBER_ACCOUNT_AMOUNT_UNIT_CNYCENT = 60;
    // set_no
    public static final int MEMBER_ACCOUNT_SET_NO_DEFAULT = 90;

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

    //  账户状态【创建|可用|止付|冻结|销户】
    public static final int MEMBER_ACCOUNT_STATE_CREATED = 200;
    public static final int MEMBER_ACCOUNT_STATE_USABLE = 201;
    public static final int MEMBER_ACCOUNT_STATE_STOP_PAY = 202;
    public static final int MEMBER_ACCOUNT_STATE_FROZEN = 203;
    public static final int MEMBER_ACCOUNT_STATE_CLOSED = 204;

    // 成分类型[本金|利息|收费]
    public static final int MEMBER_ACCOUNT_ITEM_TYPE_PRINCIPAL = 300;
    public static final int MEMBER_ACCOUNT_ITEM_TYPE_INTEREST = 301;
    public static final int MEMBER_ACCOUNT_ITEM_TYPE_FEE = 302;

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

    // DATA_VERSION 数据版本
    public static final int MEMBER_ACCOUNT_DATA_VERSION_DEFAULT = 10000;





}
