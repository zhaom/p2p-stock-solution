package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.Bid;
import com.solution.p2p.core.common.entity.BidExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BidMapper {
    int countByExample(BidExample example);

    int deleteByExample(BidExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Bid record);

    int insertSelective(Bid record);

    List<Bid> selectByExample(BidExample example);

    Bid selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Bid record, @Param("example") BidExample example);

    int updateByExample(@Param("record") Bid record, @Param("example") BidExample example);

    int updateByPrimaryKeySelective(Bid record);

    int updateByPrimaryKey(Bid record);
}