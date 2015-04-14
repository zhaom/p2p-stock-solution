package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.SysArea;
import com.solution.p2p.core.common.entity.SysAreaExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysAreaMapper {
    int countByExample(SysAreaExample example);

    int deleteByExample(SysAreaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysArea record);

    int insertSelective(SysArea record);

    List<SysArea> selectByExample(SysAreaExample example);

    SysArea selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysArea record, @Param("example") SysAreaExample example);

    int updateByExample(@Param("record") SysArea record, @Param("example") SysAreaExample example);

    int updateByPrimaryKeySelective(SysArea record);

    int updateByPrimaryKey(SysArea record);
}