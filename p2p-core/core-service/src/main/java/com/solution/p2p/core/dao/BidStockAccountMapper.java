package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.BidStockAccount;
import com.solution.p2p.core.common.entity.BidStockAccountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BidStockAccountMapper {
    int countByExample(BidStockAccountExample example);

    int deleteByExample(BidStockAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BidStockAccount record);

    int insertSelective(BidStockAccount record);

    List<BidStockAccount> selectByExample(BidStockAccountExample example);

    BidStockAccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BidStockAccount record, @Param("example") BidStockAccountExample example);

    int updateByExample(@Param("record") BidStockAccount record, @Param("example") BidStockAccountExample example);

    int updateByPrimaryKeySelective(BidStockAccount record);

    int updateByPrimaryKey(BidStockAccount record);
}