package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.MemberAuthStatus;
import com.solution.p2p.core.common.entity.MemberAuthStatusExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberAuthStatusMapper {
    int countByExample(MemberAuthStatusExample example);

    int deleteByExample(MemberAuthStatusExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberAuthStatus record);

    int insertSelective(MemberAuthStatus record);

    List<MemberAuthStatus> selectByExample(MemberAuthStatusExample example);

    MemberAuthStatus selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberAuthStatus record, @Param("example") MemberAuthStatusExample example);

    int updateByExample(@Param("record") MemberAuthStatus record, @Param("example") MemberAuthStatusExample example);

    int updateByPrimaryKeySelective(MemberAuthStatus record);

    int updateByPrimaryKey(MemberAuthStatus record);
}