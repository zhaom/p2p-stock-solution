package com.solution.p2p.core.dao;

import com.solution.p2p.core.common.entity.ProductChannelCategory;
import com.solution.p2p.core.common.entity.ProductChannelCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductChannelCategoryMapper {
    int countByExample(ProductChannelCategoryExample example);

    int deleteByExample(ProductChannelCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductChannelCategory record);

    int insertSelective(ProductChannelCategory record);

    List<ProductChannelCategory> selectByExample(ProductChannelCategoryExample example);

    ProductChannelCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductChannelCategory record, @Param("example") ProductChannelCategoryExample example);

    int updateByExample(@Param("record") ProductChannelCategory record, @Param("example") ProductChannelCategoryExample example);

    int updateByPrimaryKeySelective(ProductChannelCategory record);

    int updateByPrimaryKey(ProductChannelCategory record);
}