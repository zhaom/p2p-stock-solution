package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.SysOrg;
import com.solution.p2p.core.common.entity.SysOrgExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysOrgMapper {
    int countByExample(SysOrgExample example);

    int deleteByExample(SysOrgExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysOrg record);

    int insertSelective(SysOrg record);

    List<SysOrg> selectByExample(SysOrgExample example);

    SysOrg selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysOrg record, @Param("example") SysOrgExample example);

    int updateByExample(@Param("record") SysOrg record, @Param("example") SysOrgExample example);

    int updateByPrimaryKeySelective(SysOrg record);

    int updateByPrimaryKey(SysOrg record);
}