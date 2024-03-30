///  1. Welcome page
//2.Hansi stansiyada oldugunun teyin edilmesi
//3.Hansi stansiyaya getmek isteyirsiz?
//4. payment
//5.

import util.User;
import util.WelcomeStation;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        User rustam = new User(2.5, "Rustam");
        ArrayList<User> array = new ArrayList<>();
        array.add(rustam);
        for (User user : array){
            WelcomeStation.setStation(user);
        }
    }
}
