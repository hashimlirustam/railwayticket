package util;

import infoStation.Operations;

import java.util.Scanner;

public class PayBalance {
    public static void payBalance(User user){
        System.out.println("Your balance is " +user.getBalance()+". How much u wanna increase balance?");
        Scanner sc = new Scanner(System.in);
        double pay = sc.nextDouble();
        user.setBalance(user.balance+pay);
        System.out.println("Your balance is " +user.balance);
        Operations.accountMenu(user);
    }
}
