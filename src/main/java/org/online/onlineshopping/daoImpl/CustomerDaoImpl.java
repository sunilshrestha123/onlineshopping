package org.online.onlineshopping.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.online.onlineshopping.dao.CustomerDao;
import org.online.onlineshopping.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao {
   @Autowired
    SessionFactory sessionFactory;
    public void insert(Customer customer) {
        Session session=sessionFactory.openSession();
        session.save(customer);
        session.beginTransaction().commit();
        session.close();

    }
}
