package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.SysApp;
import com.solution.p2p.core.common.entity.SysAppExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysAppMapper {
    int countByExample(SysAppExample example);

    int deleteByExample(SysAppExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysApp record);

    int insertSelective(SysApp record);

    List<SysApp> selectByExample(SysAppExample example);

    SysApp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysApp record, @Param("example") SysAppExample example);

    int updateByExample(@Param("record") SysApp record, @Param("example") SysAppExample example);

    int updateByPrimaryKeySelective(SysApp record);

    int updateByPrimaryKey(SysApp record);
}