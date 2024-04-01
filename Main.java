///  1. Welcome page
//2.Hansi stansiyada oldugunun teyin edilmesi
//3.Hansi stansiyaya getmek isteyirsiz?
//4. payment
//elave : Main.java duzelis elemeli !!!

import util.User;
import infoStation.Welcome;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        startApp();
    }

    public static void startApp(){
        User admin = new User(4169, "Admin",99999999);
        ArrayList<User> array = new ArrayList<>();
        array.add(admin);
        for (User user : array){
            Welcome.welcome(user);
        }
    }

}
