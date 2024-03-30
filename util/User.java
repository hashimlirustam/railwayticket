package util;


import java.util.ArrayList;
import java.util.Scanner;

public class User {
    ArrayList<User> array = new ArrayList<>();
    double balance;
    String name;
    String id;


    public User(String id, String name , double balance) {
        this.balance = balance;
        this.name= name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }


}
