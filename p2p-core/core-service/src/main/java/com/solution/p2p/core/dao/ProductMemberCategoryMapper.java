package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.ProductMemberCategory;
import com.solution.p2p.core.common.entity.ProductMemberCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMemberCategoryMapper {
    int countByExample(ProductMemberCategoryExample example);

    int deleteByExample(ProductMemberCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductMemberCategory record);

    int insertSelective(ProductMemberCategory record);

    List<ProductMemberCategory> selectByExample(ProductMemberCategoryExample example);

    ProductMemberCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductMemberCategory record, @Param("example") ProductMemberCategoryExample example);

    int updateByExample(@Param("record") ProductMemberCategory record, @Param("example") ProductMemberCategoryExample example);

    int updateByPrimaryKeySelective(ProductMemberCategory record);

    int updateByPrimaryKey(ProductMemberCategory record);
}