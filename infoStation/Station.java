package infoStation;

import util.User;

import java.util.Scanner;

public class Station {
    public static void station(User user, String station, double ammount){
        System.out.println("Welcome dear "+ user.getName()+"."+" You chose "+ station +" How much ticket u wanna?" );
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double payment = x*ammount;
        double userBalance = user.getBalance();
        if(userBalance>=payment){
            userBalance= userBalance-payment;
            System.out.println("Progressing...\n operation complated.\n Your balance is "+userBalance);}
        else System.out.println("invalid operation :");
    }
}
