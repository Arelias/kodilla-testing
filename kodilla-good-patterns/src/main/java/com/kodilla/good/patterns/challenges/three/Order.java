package com.kodilla.good.patterns.challenges.three;

import java.time.LocalDate;
import java.util.Map;

public class Order {

    private static int Id = 0;
    private User user;
    private Map<Product, Integer> shoppingCart;
    private LocalDate purchaseDate;
    private LocalDate designatedDeliveryDate;

    public Order(User user, Map<Product, Integer> shoppingCart, LocalDate designatedDeliveryDate) {
        Id = Id+1; //Normalnie pobieralby z db czy cos
        this.user = user;
        this.shoppingCart = shoppingCart;
        this.purchaseDate = LocalDate.now();
        this.designatedDeliveryDate = designatedDeliveryDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static int getId() {
        return Id;
    }

    public Map<Product, Integer> getShoppingCart() {
        return shoppingCart;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public LocalDate getDesignatedDeliveryDate() {
        return designatedDeliveryDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (Id != order.Id) return false;
        if (!user.equals(order.user)) return false;
        if (!shoppingCart.equals(order.shoppingCart)) return false;
        if (!purchaseDate.equals(order.purchaseDate)) return false;
        return designatedDeliveryDate.equals(order.designatedDeliveryDate);
    }

    @Override
    public int hashCode() {
        int result = Id;
        result = 31 * result + user.hashCode();
        result = 31 * result + shoppingCart.hashCode();
        result = 31 * result + purchaseDate.hashCode();
        result = 31 * result + designatedDeliveryDate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Id=" + Id +
                ", user=" + user +
                ", shoppingCart=" + shoppingCart +
                ", purchaseDate=" + purchaseDate +
                ", designatedDeliveryDate=" + designatedDeliveryDate +
                '}';
    }
}
