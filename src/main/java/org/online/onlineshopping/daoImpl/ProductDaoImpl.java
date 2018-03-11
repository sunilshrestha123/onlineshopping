package org.online.onlineshopping.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.online.onlineshopping.dao.ProductDao;
import org.online.onlineshopping.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao{
    @Autowired
    SessionFactory sessionFactory;
    public void insert(Product product) {
        Session session=sessionFactory.openSession();
        session.save(product);
        session.beginTransaction().commit();
        session.close();
    }
}
