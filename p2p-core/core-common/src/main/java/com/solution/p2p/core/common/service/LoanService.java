package com.solution.p2p.core.common.service;

import com.solution.p2p.core.common.entity.Loan;
import com.solution.p2p.core.common.entity.LoanExample;
import com.solution.p2p.core.common.utils.Pagination;
import com.solution.p2p.core.common.utils.ServiceResult;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-10
 * Time: 上午10:30
 * To change this template use File | Settings | File Templates.
 */
public interface LoanService {

    public ServiceResult<Loan> createLoan(Loan loan, String appKey, String sign);

    public ServiceResult<Pagination<Loan>> findLoan(LoanExample loanExample, int pageIndex, int pageSize, String appKey, String sign);

    public ServiceResult<Loan> updateLoan(Loan loan, String appKey, String sign);

    public ServiceResult<Loan> deleteLoan(Loan loan, String appKey, String sign);

    public ServiceResult<Loan> findOne(Long loanId, String appKey, String sign);
}
