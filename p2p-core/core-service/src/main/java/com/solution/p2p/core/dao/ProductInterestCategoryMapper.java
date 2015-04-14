package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.ProductInterestCategory;
import com.solution.p2p.core.common.entity.ProductInterestCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductInterestCategoryMapper {
    int countByExample(ProductInterestCategoryExample example);

    int deleteByExample(ProductInterestCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductInterestCategory record);

    int insertSelective(ProductInterestCategory record);

    List<ProductInterestCategory> selectByExample(ProductInterestCategoryExample example);

    ProductInterestCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductInterestCategory record, @Param("example") ProductInterestCategoryExample example);

    int updateByExample(@Param("record") ProductInterestCategory record, @Param("example") ProductInterestCategoryExample example);

    int updateByPrimaryKeySelective(ProductInterestCategory record);

    int updateByPrimaryKey(ProductInterestCategory record);
}