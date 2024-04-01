package util;

import infoStation.Welcome;

import java.util.Scanner;

public class PayTicket {
    public static void payment(User user, String station, double ammount){
        System.out.println("Dear "+ user.getName()+"."+" You chose "+ station +". How much ticket u wanna buy?" );
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double paymentAm = x*ammount;
        double userBalance = user.getBalance();
        if(userBalance>=paymentAm){
            userBalance -= paymentAm;
            System.out.println("Progressing...\noperation complated.");
        receipt(user, station,paymentAm,userBalance);}
        else {System.out.println("Your balance isnt enought!Please increase your balance..");
        PayBalance.payBalance(user);}
    }

    public static void receipt(User user, String station ,double ammount,double userBalance){
        System.out.println("Name: "+user.getName()+"\nDirection: "+station+"\nPaid ammount: " +ammount+"\nBalance: "+userBalance+"\nThanks for choosing us:) We are waiting u again..");
        Welcome.welcome(user);
    }
}
