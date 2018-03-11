package org.online.onlineshopping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="os_customer")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer implements Serializable{
    private static long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="os_customer_id")
    private int customerId;
    private String customerFname;
    private String customerMname;
    private String customerLname;
    private String customerBirthDate;
    private String customerGender;
    private String customerImage;
    private String customerEmail;
    private long customerPhone;
    private String customerAddress;
    private String customerCountry;
    private String customerCity;
    private String customerStreet;
    private  String customerPostalCode;
    private String customerStatus;





}
