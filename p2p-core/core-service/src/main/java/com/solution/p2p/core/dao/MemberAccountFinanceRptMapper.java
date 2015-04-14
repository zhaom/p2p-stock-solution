package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.MemberAccountFinanceRpt;
import com.solution.p2p.core.common.entity.MemberAccountFinanceRptExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberAccountFinanceRptMapper {
    int countByExample(MemberAccountFinanceRptExample example);

    int deleteByExample(MemberAccountFinanceRptExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberAccountFinanceRpt record);

    int insertSelective(MemberAccountFinanceRpt record);

    List<MemberAccountFinanceRpt> selectByExample(MemberAccountFinanceRptExample example);

    MemberAccountFinanceRpt selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberAccountFinanceRpt record, @Param("example") MemberAccountFinanceRptExample example);

    int updateByExample(@Param("record") MemberAccountFinanceRpt record, @Param("example") MemberAccountFinanceRptExample example);

    int updateByPrimaryKeySelective(MemberAccountFinanceRpt record);

    int updateByPrimaryKey(MemberAccountFinanceRpt record);
}