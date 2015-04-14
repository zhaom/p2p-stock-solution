package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.SysOpLog;
import com.solution.p2p.core.common.entity.SysOpLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysOpLogMapper {
    int countByExample(SysOpLogExample example);

    int deleteByExample(SysOpLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysOpLog record);

    int insertSelective(SysOpLog record);

    List<SysOpLog> selectByExample(SysOpLogExample example);

    SysOpLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysOpLog record, @Param("example") SysOpLogExample example);

    int updateByExample(@Param("record") SysOpLog record, @Param("example") SysOpLogExample example);

    int updateByPrimaryKeySelective(SysOpLog record);

    int updateByPrimaryKey(SysOpLog record);
}