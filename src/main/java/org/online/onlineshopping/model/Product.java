package org.online.onlineshopping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="os_product")
public class Product {
    private static long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="os_product_id")
    private  int productId;
    private String productName;
    private String productType;
    private long productPrice;
    private long productWeight;
    private long productMgfDate;
    private long productExpDate;
    private String  productAbout;
    private String productRating;


}
