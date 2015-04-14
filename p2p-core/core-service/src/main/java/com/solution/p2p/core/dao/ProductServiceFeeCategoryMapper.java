package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.ProductServiceFeeCategory;
import com.solution.p2p.core.common.entity.ProductServiceFeeCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductServiceFeeCategoryMapper {
    int countByExample(ProductServiceFeeCategoryExample example);

    int deleteByExample(ProductServiceFeeCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductServiceFeeCategory record);

    int insertSelective(ProductServiceFeeCategory record);

    List<ProductServiceFeeCategory> selectByExample(ProductServiceFeeCategoryExample example);

    ProductServiceFeeCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductServiceFeeCategory record, @Param("example") ProductServiceFeeCategoryExample example);

    int updateByExample(@Param("record") ProductServiceFeeCategory record, @Param("example") ProductServiceFeeCategoryExample example);

    int updateByPrimaryKeySelective(ProductServiceFeeCategory record);

    int updateByPrimaryKey(ProductServiceFeeCategory record);
}