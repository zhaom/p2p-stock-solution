package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.HdbBankInfo;
import com.solution.p2p.core.common.entity.HdbBankInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HdbBankInfoMapper {
    int countByExample(HdbBankInfoExample example);

    int deleteByExample(HdbBankInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HdbBankInfo record);

    int insertSelective(HdbBankInfo record);

    List<HdbBankInfo> selectByExample(HdbBankInfoExample example);

    HdbBankInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HdbBankInfo record, @Param("example") HdbBankInfoExample example);

    int updateByExample(@Param("record") HdbBankInfo record, @Param("example") HdbBankInfoExample example);

    int updateByPrimaryKeySelective(HdbBankInfo record);

    int updateByPrimaryKey(HdbBankInfo record);
}