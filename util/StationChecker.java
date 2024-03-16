package util;

import stations.Baku;
import stations.Khirdalan;
import stations.Sumgayit;

import java.util.Scanner;

public class StationChecker {
    public static void stationChecker(User user){
        System.out.println("Where u are? 1.Baku 2.Khirdalan 3.Sumgayit");
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        switch (st) {
            case 1:
                Baku.inStation(user);
            case 2:
                Khirdalan.inStation(user);
            case 3:
                Sumgayit.inStation(user);
        }


    }

}
