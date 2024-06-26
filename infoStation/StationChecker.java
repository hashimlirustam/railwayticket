package infoStation;

import util.PayTicket;
import util.User;

import java.util.Scanner;

public class StationChecker {

    public static void stationChecker(User user){
        System.out.println("Hey "+ user.getName() +" "+user.getId()+"! Where are u?\n 1.Baku 2.Khirdalan 3.Sumgayit");
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        switch (st) {
            case 1:
                selectedBaku(user);
                break;
            case 2:
                selectedKh(user);
                break;
            case 3:
                selectedSum(user);
                break;
        }
    }

static Scanner s = new Scanner(System.in);
public static void selectedBaku(User user) {
    System.out.println("Where u wanna go?\n1.Sumgayit\n2.Khirdalan");
    int i = s.nextInt();
    if (i == 1) {
        PayTicket.payment(user, "Baku-Sumgayit direction", InfoUtil.BakuSum);
    } else {
        PayTicket.payment(user, "Baku-Khirdalan direction", InfoUtil.BakuKh);
    }
}

public static void selectedSum(User user) {
    System.out.println("Where u wanna go?\n1.Baku\n2.Khirdalan");
    int i = s.nextInt();
    if (i == 1) {
        PayTicket.payment(user, "Sumgayit-Baku direction", InfoUtil.BakuSum);
    } else {
        PayTicket.payment(user, "Sumgayit-Khirdalan direction", InfoUtil.SumKh);
    }
}

public static void selectedKh(User user){
    System.out.println("Where u wanna go?\n1.Baku\n2.Sumgayit");
    int i = s.nextInt();
    if (i == 1) {
        PayTicket.payment(user, "Khirdalan-Baku direction", InfoUtil.BakuKh);
    } else {
        PayTicket.payment(user, "Khirdalan-Sumgayit direction", InfoUtil.SumKh);
    }
}
}
