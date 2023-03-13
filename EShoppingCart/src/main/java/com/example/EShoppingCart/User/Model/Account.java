package com.example.EShoppingCart.User.Model;

import com.example.EShoppingCart.User.SD.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private Status status;
    @NotNull
    private Date createdDate;
    @NotNull
    private Date loginDate;

    public void getStatus(Status inactive) {
    }
}
