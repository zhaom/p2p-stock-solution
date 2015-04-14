package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.SysUserAppRoles;
import com.solution.p2p.core.common.entity.SysUserAppRolesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserAppRolesMapper {
    int countByExample(SysUserAppRolesExample example);

    int deleteByExample(SysUserAppRolesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUserAppRoles record);

    int insertSelective(SysUserAppRoles record);

    List<SysUserAppRoles> selectByExample(SysUserAppRolesExample example);

    SysUserAppRoles selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUserAppRoles record, @Param("example") SysUserAppRolesExample example);

    int updateByExample(@Param("record") SysUserAppRoles record, @Param("example") SysUserAppRolesExample example);

    int updateByPrimaryKeySelective(SysUserAppRoles record);

    int updateByPrimaryKey(SysUserAppRoles record);
}