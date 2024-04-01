package util;

import infoStation.StationChecker;
import infoStation.WelcomeStation;

import java.util.Random;
import java.util.Scanner;

public class Register {
    public static void register(){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        User user = new User(null, null, 0);
        user.setId(r.nextInt(5000-4168)+4169);
        System.out.println("name:");
        user.setName(sc.next());
        System.out.println("Complated!");
        StationChecker.stationChecker(user);
    }
}
