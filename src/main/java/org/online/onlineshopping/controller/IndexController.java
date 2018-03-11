package org.online.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller //component
 public class IndexController {
    @RequestMapping(value={"/index","/"},method = RequestMethod.GET)
    public String returnIndex(){
        return "index";

    }

}



