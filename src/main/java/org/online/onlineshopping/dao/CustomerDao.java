package org.online.onlineshopping.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.online.onlineshopping.model.Customer;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;


public interface CustomerDao {
void insert(Customer customer);


}

