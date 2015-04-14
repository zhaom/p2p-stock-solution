package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.MemberAccountItem;
import com.solution.p2p.core.common.entity.MemberAccountItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberAccountItemMapper {
    int countByExample(MemberAccountItemExample example);

    int deleteByExample(MemberAccountItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberAccountItem record);

    int insertSelective(MemberAccountItem record);

    List<MemberAccountItem> selectByExample(MemberAccountItemExample example);

    MemberAccountItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberAccountItem record, @Param("example") MemberAccountItemExample example);

    int updateByExample(@Param("record") MemberAccountItem record, @Param("example") MemberAccountItemExample example);

    int updateByPrimaryKeySelective(MemberAccountItem record);

    int updateByPrimaryKey(MemberAccountItem record);
}