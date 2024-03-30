package util;

import infoStation.StationChecker;
import infoStation.WelcomeStation;

import java.util.Scanner;

public class Register {
    public static void register(){
        Scanner sc = new Scanner(System.in);
        User user = new User(null, null, 0);
        System.out.println("id:");
        user.setId(sc.next());
        System.out.println("name:");
        user.setName(sc.next());
        System.out.println("Complated!");
        StationChecker.stationChecker(user);
    }
}
