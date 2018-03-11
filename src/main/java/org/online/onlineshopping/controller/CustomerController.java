package org.online.onlineshopping.controller;

import org.online.onlineshopping.model.Product;
import org.online.onlineshopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.HttpServletBean;



@Controller //component

public class CustomerController {

    @RequestMapping(value = "/customer")
    public String returnCustomer() {
        return "customer";

    }


}