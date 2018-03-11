package org.online.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller //component
@Transactional
public class LoginController {
    @RequestMapping(value="/login")
    public  String returnLogin(){
        return "login";
    }
}
