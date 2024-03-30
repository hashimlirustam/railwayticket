package util;

import infoStation.InfoUtil;
import utility.Baku;
import infoStation.Station;

import java.util.Scanner;

public class StationChecker {
    Baku baku;

    public static void stationChecker(User user){
        System.out.println("Which direction u wanna go?\n 1.Baku-Khirdalan 2.Khirdalan-Sumgayit 3.Baku-Sumgayit");
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        switch (st) {
            case 1:
               Station.station(user, "Baku-Khirdalan direction" ,InfoUtil.BakuKh);
               break;
            case 2:
                Station.station(user,"Sumgayit-Khirdalan direction" ,InfoUtil.SumKh);
                break;
            case 3:
                Station.station(user, "Baku-Sumgayit direction"  ,InfoUtil.BakuSum);
                break;
        }


    }


}
