package infoStation;

import util.User;

import java.util.Scanner;




public class WelcomeStation {

    public static void setStation(User user) {
        System.out.println("Hello. Welcome to Azerbaijan Railways!Please enter card: ");
        Scanner sc = new Scanner(System.in);
        String card = sc.nextLine();
        if(card.equals(user.getId())){
            StationChecker.stationChecker(user);
        }

    }
}