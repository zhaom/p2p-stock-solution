package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.MemberBidRequest;
import com.solution.p2p.core.common.entity.MemberBidRequestExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberBidRequestMapper {
    int countByExample(MemberBidRequestExample example);

    int deleteByExample(MemberBidRequestExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberBidRequest record);

    int insertSelective(MemberBidRequest record);

    List<MemberBidRequest> selectByExample(MemberBidRequestExample example);

    MemberBidRequest selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberBidRequest record, @Param("example") MemberBidRequestExample example);

    int updateByExample(@Param("record") MemberBidRequest record, @Param("example") MemberBidRequestExample example);

    int updateByPrimaryKeySelective(MemberBidRequest record);

    int updateByPrimaryKey(MemberBidRequest record);
}