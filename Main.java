///  1. Welcome page
//2.Hansi stansiyada oldugunun teyin edilmesi
//3.Hansi stansiyaya getmek isteyirsiz?
//4. payment
//elave : Main.java duzelis elemeli !!!

import util.Register;
import util.User;
import infoStation.WelcomeStation;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<User> array = new ArrayList<>();
        User rustam = new User("rustam", "Rustam",6.5);
        array.add(rustam);
        System.out.println("Do you have account? \n1.Yes\n2.No");
        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt();
        if (i==1){
         for (User user : array){
            WelcomeStation.setStation(user);
        }}
        else {
            Register.register();
        }


    }

}
