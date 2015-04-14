package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.MemberAccount;
import com.solution.p2p.core.common.entity.MemberAccountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberAccountMapper {
    int countByExample(MemberAccountExample example);

    int deleteByExample(MemberAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberAccount record);

    int insertSelective(MemberAccount record);

    List<MemberAccount> selectByExample(MemberAccountExample example);

    MemberAccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberAccount record, @Param("example") MemberAccountExample example);

    int updateByExample(@Param("record") MemberAccount record, @Param("example") MemberAccountExample example);

    int updateByPrimaryKeySelective(MemberAccount record);

    int updateByPrimaryKey(MemberAccount record);
}