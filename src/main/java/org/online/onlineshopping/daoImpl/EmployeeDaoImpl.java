package org.online.onlineshopping.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.online.onlineshopping.dao.EmployeeDao;
import org.online.onlineshopping.model.Customer;
import org.online.onlineshopping.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    SessionFactory sessionFactory;

    public void insert(Employee employee) {
        Session session = sessionFactory.openSession();
        session.save(employee);
        session.beginTransaction().commit();
        session.close();

    }
}