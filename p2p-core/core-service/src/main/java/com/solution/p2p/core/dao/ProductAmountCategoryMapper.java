package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.ProductAmountCategory;
import com.solution.p2p.core.common.entity.ProductAmountCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductAmountCategoryMapper {
    int countByExample(ProductAmountCategoryExample example);

    int deleteByExample(ProductAmountCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductAmountCategory record);

    int insertSelective(ProductAmountCategory record);

    List<ProductAmountCategory> selectByExample(ProductAmountCategoryExample example);

    ProductAmountCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductAmountCategory record, @Param("example") ProductAmountCategoryExample example);

    int updateByExample(@Param("record") ProductAmountCategory record, @Param("example") ProductAmountCategoryExample example);

    int updateByPrimaryKeySelective(ProductAmountCategory record);

    int updateByPrimaryKey(ProductAmountCategory record);
}