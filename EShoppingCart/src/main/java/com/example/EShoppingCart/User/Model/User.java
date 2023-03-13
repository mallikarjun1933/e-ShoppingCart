package com.example.EShoppingCart.User.Model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="usersTable")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="userName")
    @NotEmpty
    @Length(min = 5,max = 10,message = "Name should be 5 to 10 characters only")
    private String name;
    @Column(name="userEmail")
    @NotEmpty(message = "Email is Required")
    private String email;
    @Column(name="user_Gender")
    private String gender;
    @Column(name="user_password")
    @NotEmpty(message = "Password is Required")
    private String password;
    private BigInteger phoneNumber;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name="user_roles",
    joinColumns = @JoinColumn(name="user_id",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name="role_id",referencedColumnName = "id"))
    private Set<Role> roles=new HashSet<Role>();
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    @OneToOne(cascade = CascadeType.ALL)
    private Account account;
    @NotNull
    private Date DateOfBirth;
}
