package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.MemberAccountTransaction;
import com.solution.p2p.core.common.entity.MemberAccountTransactionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberAccountTransactionMapper {
    int countByExample(MemberAccountTransactionExample example);

    int deleteByExample(MemberAccountTransactionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberAccountTransaction record);

    int insertSelective(MemberAccountTransaction record);

    List<MemberAccountTransaction> selectByExample(MemberAccountTransactionExample example);

    MemberAccountTransaction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberAccountTransaction record, @Param("example") MemberAccountTransactionExample example);

    int updateByExample(@Param("record") MemberAccountTransaction record, @Param("example") MemberAccountTransactionExample example);

    int updateByPrimaryKeySelective(MemberAccountTransaction record);

    int updateByPrimaryKey(MemberAccountTransaction record);
}