package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.EnterpriseRegInfo;
import com.solution.p2p.core.common.entity.EnterpriseRegInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EnterpriseRegInfoMapper {
    int countByExample(EnterpriseRegInfoExample example);

    int deleteByExample(EnterpriseRegInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EnterpriseRegInfo record);

    int insertSelective(EnterpriseRegInfo record);

    List<EnterpriseRegInfo> selectByExample(EnterpriseRegInfoExample example);

    EnterpriseRegInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EnterpriseRegInfo record, @Param("example") EnterpriseRegInfoExample example);

    int updateByExample(@Param("record") EnterpriseRegInfo record, @Param("example") EnterpriseRegInfoExample example);

    int updateByPrimaryKeySelective(EnterpriseRegInfo record);

    int updateByPrimaryKey(EnterpriseRegInfo record);
}