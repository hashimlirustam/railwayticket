package infoStation;

import util.Register;
import util.User;

import java.util.Scanner;




public class WelcomeStation {

    public static void setStation(User user){
        System.out.println("Hello. Welcome to Azerbaijan Railways!Please enter card.. (If u have not account please click 1 and register)");
        Scanner sc = new Scanner(System.in);
        int i= sc.nextInt();
        if (i==1){
            Register.register();
        }else {
        String card = sc.nextLine();
       if(card.equals(user.getId())){
           StationChecker.stationChecker(user);
       }else {
           System.out.println("Invalid id");
       }
    }}
   }

