package util;

import util.StationChecker;
import util.User;

import java.util.Scanner;




public class WelcomeStation {

    public static void setStation(){
        System.out.println("Hello. Welcome to Azerbaijan Railways!Please enter card: ");
        Scanner sc = new Scanner(System.in);
        String card = sc.nextLine();
        if(card.equals("rustam")){
            StationChecker.stationChecker(User.rustam);
        } else if (card.equals("orxan")) {
            StationChecker.stationChecker(User.orxan);
        }

    }


}

