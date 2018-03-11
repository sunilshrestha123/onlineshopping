package org.online.onlineshopping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="user")
public class User implements Serializable {
    private static long serialVersionUID=123L;
@Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String username;
    private String password;
    private int status;
    @OneToMany(mappedBy = "uuid")

    private List<UserRole> userRole;
}
