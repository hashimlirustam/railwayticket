package util;


import java.util.ArrayList;

public class User {
    ArrayList<User> array = new ArrayList<>();
    double balance;
    String name;

    public User(double balance , String name) {
        this.balance = balance;
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public static User rustam = new User(2.5, "Rustam");

}
