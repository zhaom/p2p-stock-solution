package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.MemberStockAccount;
import com.solution.p2p.core.common.entity.MemberStockAccountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberStockAccountMapper {
    int countByExample(MemberStockAccountExample example);

    int deleteByExample(MemberStockAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberStockAccount record);

    int insertSelective(MemberStockAccount record);

    List<MemberStockAccount> selectByExample(MemberStockAccountExample example);

    MemberStockAccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberStockAccount record, @Param("example") MemberStockAccountExample example);

    int updateByExample(@Param("record") MemberStockAccount record, @Param("example") MemberStockAccountExample example);

    int updateByPrimaryKeySelective(MemberStockAccount record);

    int updateByPrimaryKey(MemberStockAccount record);
}