package org.online.onlineshopping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="user_role")
public class UserRole implements Serializable {
    private static long serialVersionUID=1l;
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private  int urId;
    private  String role;
    @ManyToOne
    private User uuid;





}
