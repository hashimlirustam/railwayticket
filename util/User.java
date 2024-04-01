package util;


import java.util.ArrayList;

public class User {
    ArrayList<User> array = new ArrayList<>();
    double balance;
    String name;
    Integer id;


    public User(Integer id, String name , double balance) {
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

    public Integer getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
