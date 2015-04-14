package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.ProductGuarantyCategory;
import com.solution.p2p.core.common.entity.ProductGuarantyCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductGuarantyCategoryMapper {
    int countByExample(ProductGuarantyCategoryExample example);

    int deleteByExample(ProductGuarantyCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductGuarantyCategory record);

    int insertSelective(ProductGuarantyCategory record);

    List<ProductGuarantyCategory> selectByExample(ProductGuarantyCategoryExample example);

    ProductGuarantyCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductGuarantyCategory record, @Param("example") ProductGuarantyCategoryExample example);

    int updateByExample(@Param("record") ProductGuarantyCategory record, @Param("example") ProductGuarantyCategoryExample example);

    int updateByPrimaryKeySelective(ProductGuarantyCategory record);

    int updateByPrimaryKey(ProductGuarantyCategory record);
}