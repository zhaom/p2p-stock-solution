package com.solution.p2p.core.common.service;

import com.solution.p2p.core.common.entity.MemberAccount;
import com.solution.p2p.core.common.entity.MemberAccountFlow;
import com.solution.p2p.core.common.entity.MemberAccountTransaction;
import com.solution.p2p.core.common.utils.Pagination;
import com.solution.p2p.core.common.utils.ServiceResult;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 15-4-18
 * Time: 下午10:19
 * To change this template use File | Settings | File Templates.
 */
public interface MemberAccountFacadeService {

    /**
     * 初始化账户
     * @param uid
     * @param userType
     * @param appKey
     * @param signature
     * @return
     */
    ServiceResult<List<MemberAccount>> initMemberAccount(Long uid, Integer userType, String appKey, String signature);

    /**
     * 通用入账
     * @param memberAccountTransaction
     * @param appKey
     * @param signature
     * @return
     */
    ServiceResult<Integer> glAccounting(MemberAccountTransaction memberAccountTransaction, String appKey, String signature);

    /**
     * 冲账
     * @param memberAccountTransaction
     * @param appKey
     * @param signature
     * @return
     */
    ServiceResult<Integer> strikeAccounting(MemberAccountTransaction memberAccountTransaction, String appKey, String signature);

    /**
     * 账务流水
     * @param memberAccountId
     * @param fromDate
     * @param thruDate
     * @param appKey
     * @param signature
     * @return
     */
    ServiceResult<Pagination<MemberAccountFlow>> listMemberAccountFlow(Long memberAccountId, Date fromDate, Date thruDate, String appKey, String signature);
}
