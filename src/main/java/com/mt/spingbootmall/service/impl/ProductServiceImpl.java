package com.mt.spingbootmall.service.impl;

import com.mt.spingbootmall.dao.ProductDao;
import com.mt.spingbootmall.mdoel.Product;
import com.mt.spingbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
