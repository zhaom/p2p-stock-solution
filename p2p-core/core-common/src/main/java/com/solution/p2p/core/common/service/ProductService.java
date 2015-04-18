package com.solution.p2p.core.common.service;

import com.solution.p2p.core.common.entity.Product;
import com.solution.p2p.core.common.utils.ServiceResult;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 15-4-18
 * Time: 下午10:01
 * To change this template use File | Settings | File Templates.
 */
public interface ProductService {

    ServiceResult<Product> getProduct(Long productId, String appKey, String signature);
}
