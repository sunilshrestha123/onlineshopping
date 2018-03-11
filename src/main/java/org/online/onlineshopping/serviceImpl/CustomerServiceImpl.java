package org.online.onlineshopping.serviceImpl;

import org.online.onlineshopping.dao.CustomerDao;
import org.online.onlineshopping.model.Customer;
import org.online.onlineshopping.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;
    public void insert(Customer customer) {
        customerDao.insert(customer);

    }
}
