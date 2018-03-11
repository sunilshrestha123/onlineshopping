package org.online.onlineshopping.serviceImpl;

import org.online.onlineshopping.dao.ProductDao;
import org.online.onlineshopping.model.Product;
import org.online.onlineshopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    public void insert(Product product) {
        productDao.insert(product);


    }
}
