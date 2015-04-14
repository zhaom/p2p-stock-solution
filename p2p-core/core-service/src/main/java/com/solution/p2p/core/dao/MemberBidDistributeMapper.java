package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.MemberBidDistribute;
import com.solution.p2p.core.common.entity.MemberBidDistributeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberBidDistributeMapper {
    int countByExample(MemberBidDistributeExample example);

    int deleteByExample(MemberBidDistributeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberBidDistribute record);

    int insertSelective(MemberBidDistribute record);

    List<MemberBidDistribute> selectByExample(MemberBidDistributeExample example);

    MemberBidDistribute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberBidDistribute record, @Param("example") MemberBidDistributeExample example);

    int updateByExample(@Param("record") MemberBidDistribute record, @Param("example") MemberBidDistributeExample example);

    int updateByPrimaryKeySelective(MemberBidDistribute record);

    int updateByPrimaryKey(MemberBidDistribute record);
}