package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.SysMsg;
import com.solution.p2p.core.common.entity.SysMsgExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysMsgMapper {
    int countByExample(SysMsgExample example);

    int deleteByExample(SysMsgExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysMsg record);

    int insertSelective(SysMsg record);

    List<SysMsg> selectByExample(SysMsgExample example);

    SysMsg selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysMsg record, @Param("example") SysMsgExample example);

    int updateByExample(@Param("record") SysMsg record, @Param("example") SysMsgExample example);

    int updateByPrimaryKeySelective(SysMsg record);

    int updateByPrimaryKey(SysMsg record);
}