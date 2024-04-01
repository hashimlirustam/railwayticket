package util;

import infoStation.StationChecker;

import java.util.Scanner;

public class PayBalance {
    public static void payBalance(User user){
        System.out.println("How much u wanna increase balance?");
        Scanner sc = new Scanner(System.in);
        double pay = sc.nextDouble();
        user.setBalance(user.balance+pay);
        System.out.println("Your balance is " +user.balance);
        StationChecker.stationChecker(user);
    }
}
