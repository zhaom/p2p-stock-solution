package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.BidRefundInfo;
import com.solution.p2p.core.common.entity.BidRefundInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BidRefundInfoMapper {
    int countByExample(BidRefundInfoExample example);

    int deleteByExample(BidRefundInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BidRefundInfo record);

    int insertSelective(BidRefundInfo record);

    List<BidRefundInfo> selectByExample(BidRefundInfoExample example);

    BidRefundInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BidRefundInfo record, @Param("example") BidRefundInfoExample example);

    int updateByExample(@Param("record") BidRefundInfo record, @Param("example") BidRefundInfoExample example);

    int updateByPrimaryKeySelective(BidRefundInfo record);

    int updateByPrimaryKey(BidRefundInfo record);
}