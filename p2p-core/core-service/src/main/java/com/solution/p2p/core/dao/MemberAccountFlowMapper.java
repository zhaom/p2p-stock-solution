package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.MemberAccountFlow;
import com.solution.p2p.core.common.entity.MemberAccountFlowExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberAccountFlowMapper {
    int countByExample(MemberAccountFlowExample example);

    int deleteByExample(MemberAccountFlowExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberAccountFlow record);

    int insertSelective(MemberAccountFlow record);

    List<MemberAccountFlow> selectByExample(MemberAccountFlowExample example);

    MemberAccountFlow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberAccountFlow record, @Param("example") MemberAccountFlowExample example);

    int updateByExample(@Param("record") MemberAccountFlow record, @Param("example") MemberAccountFlowExample example);

    int updateByPrimaryKeySelective(MemberAccountFlow record);

    int updateByPrimaryKey(MemberAccountFlow record);
}