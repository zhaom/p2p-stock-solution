package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.ProductDurationCategory;
import com.solution.p2p.core.common.entity.ProductDurationCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDurationCategoryMapper {
    int countByExample(ProductDurationCategoryExample example);

    int deleteByExample(ProductDurationCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductDurationCategory record);

    int insertSelective(ProductDurationCategory record);

    List<ProductDurationCategory> selectByExample(ProductDurationCategoryExample example);

    ProductDurationCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductDurationCategory record, @Param("example") ProductDurationCategoryExample example);

    int updateByExample(@Param("record") ProductDurationCategory record, @Param("example") ProductDurationCategoryExample example);

    int updateByPrimaryKeySelective(ProductDurationCategory record);

    int updateByPrimaryKey(ProductDurationCategory record);
}