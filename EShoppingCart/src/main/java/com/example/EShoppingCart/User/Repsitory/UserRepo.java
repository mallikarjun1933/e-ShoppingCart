package com.example.EShoppingCart.User.Repsitory;

import com.example.EShoppingCart.User.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Integer> {
    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String userName, String password);

}
