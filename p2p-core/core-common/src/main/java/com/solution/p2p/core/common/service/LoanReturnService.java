package com.solution.p2p.core.common.service;


import com.solution.p2p.core.common.entity.LoanReturnFlow;
import com.solution.p2p.core.common.utils.Pagination;
import com.solution.p2p.core.common.utils.ServiceResult;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-10
 * Time: 下午4:26
 * To change this template use File | Settings | File Templates.
 */
public interface LoanReturnService {

    public ServiceResult<Pagination<LoanReturnFlow>> findReturnFlow(Long loanId, int pageIndex, int pageSize, String appKey, String sign);

    public ServiceResult<LoanReturnFlow> confirmLoanPay(LoanReturnFlow loanReturnFlow, String appKey, String sign);
}
