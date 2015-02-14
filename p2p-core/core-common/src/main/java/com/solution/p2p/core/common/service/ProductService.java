package com.solution.p2p.core.common.service;


import com.solution.p2p.core.common.entity.Loan;
import com.solution.p2p.core.common.entity.Product;
import com.solution.p2p.core.common.entity.ProductExample;
import com.solution.p2p.core.common.utils.Pagination;
import com.solution.p2p.core.common.utils.ServiceResult;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-10
 * Time: 下午12:39
 * To change this template use File | Settings | File Templates.
 */
public interface ProductService {

    ServiceResult<Product> createProduct(Product product, String appKey, String sign);

    ServiceResult<Product> createProdFromLoan(Loan loan, String appKey, String sign);

    ServiceResult<Product> updateProduct(Product product, String appKey, String sign);

    ServiceResult<Pagination<Product>> findProduct(ProductExample productExample, int pageIndex, int pageSize, String appKey, String sign);

    ServiceResult<Product> findOne(Long id, String appKey, String sign);

    ServiceResult<Product> deleteProduct(Long id, String appKey, String sign);

}
