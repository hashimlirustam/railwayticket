package util;


public class User {

     double balance;
     String key;

    public User(double balance , String key) {
        this.balance = balance;
        this.key= key;
    }

    public double getBalance() {
        return balance;
    }

    public String getKey() {
        return key;
    }

    public static User orxan = new User(1.4 , "Orxan");
    public static User rustam = new User (2.3 , "Rustam");


}
