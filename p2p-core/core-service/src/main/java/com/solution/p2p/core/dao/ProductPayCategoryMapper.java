package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.ProductPayCategory;
import com.solution.p2p.core.common.entity.ProductPayCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductPayCategoryMapper {
    int countByExample(ProductPayCategoryExample example);

    int deleteByExample(ProductPayCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductPayCategory record);

    int insertSelective(ProductPayCategory record);

    List<ProductPayCategory> selectByExample(ProductPayCategoryExample example);

    ProductPayCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductPayCategory record, @Param("example") ProductPayCategoryExample example);

    int updateByExample(@Param("record") ProductPayCategory record, @Param("example") ProductPayCategoryExample example);

    int updateByPrimaryKeySelective(ProductPayCategory record);

    int updateByPrimaryKey(ProductPayCategory record);
}