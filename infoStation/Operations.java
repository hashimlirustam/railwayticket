package infoStation;

import com.sun.tools.javac.Main;
import util.PayBalance;
import util.User;

import java.util.Scanner;

public class Operations {
    public static void accountMenu(User user) {
        System.out.println("Dear " + user.getName() + " " + user.getId() + "\n1.Show balance\n2.Pay balance\n3.Buy ticket\n4.Exit");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        if (op == 1) {
            showBalance(user);
        } else if (op == 2) {
            PayBalance.payBalance(user);
        } else if (op == 3) {
            StationChecker.stationChecker(user);
        } else if (op == 4) {
            logout(user);
        }
        }




    private static void showBalance(User user) {
        System.out.println("Your balance is :" + user.getBalance()
        );
        Operations.accountMenu(user);

    }

    public static void logout(User user){
        Welcome.welcome(user);


    }

}