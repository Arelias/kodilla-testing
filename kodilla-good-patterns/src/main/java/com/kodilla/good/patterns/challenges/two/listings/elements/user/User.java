package com.kodilla.good.patterns.challenges.two.listings.elements.user;

import com.kodilla.good.patterns.challenges.two.listings.Listing;
import com.kodilla.good.patterns.challenges.two.listings.elements.user.elements.ShoppingCart;

import java.util.List;

public class User {

    private String username;
    private String password;
    private String email;
    private ShoppingCart shoppingCart;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.shoppingCart = new ShoppingCart();
    }

    public User(String username, String password, String email, ShoppingCart shoppingCart) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.shoppingCart = shoppingCart;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
