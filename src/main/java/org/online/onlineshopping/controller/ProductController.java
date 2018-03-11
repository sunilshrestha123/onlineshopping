package org.online.onlineshopping.controller;

import org.online.onlineshopping.model.Product;
import org.online.onlineshopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //component
@Transactional
public class ProductController {
    @Autowired

    private ProductService productService;
    @RequestMapping(value="/product")
    public  String returnProduct(){
        return "product";
    }
    //get data from from using post
    @RequestMapping(value="/save",method = RequestMethod.POST)
    public String save(@RequestParam("productName") String productName,
                       @RequestParam("productType") String productType,
                       @RequestParam("productPrice") long productPrice,
                       @RequestParam("productWeight") long productWeight,
                       @RequestParam("productMgfDate") long productMgfdate,
                       @RequestParam("productExpDate") long productExpDate,
                       @RequestParam("productAbout") String productAbout,
                       @RequestParam("productRating") String productRating){
        //encapsulate the data that you got from from
        Product product=new Product();
        product.setProductName(productName);
        product.setProductType(productType);
        product.setProductPrice(productPrice);
        product.setProductWeight(productWeight);
        product.setProductMgfDate(productMgfdate);
        product.setProductExpDate(productExpDate);
        product.setProductAbout(productAbout);
        product.setProductRating(productRating);
        productService.insert(product);
        return "redirect:/product";


    }
}
