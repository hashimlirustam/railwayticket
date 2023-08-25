import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int BakuSum = 1;
        int BakuGan = 10;
        int SumGan = 15;
        int amount = 0;
        System.out.println("Hello. Welcome to Azerbaijan Railways!\nWe have stations in \n1.Baku\n2.Sumgait\n3.Ganja\nWhere are you?");
        Scanner location = new Scanner(System.in);
        int city = location.nextInt();
        switch(city){
            case 1:stationBaku(BakuSum,BakuGan,amount);break;
            case 2:stationSumgait(BakuSum,SumGan,amount);break;
            case 3:stationGanja(BakuGan,SumGan,amount);break;
        }
    }


    public static void stationBaku(int BakuSum, int BakuGan,int amount) {
        System.out.println("Where are you going?\n1.Sumgait\n2.Ganja");
        Scanner baku = new Scanner(System.in);
        int bakuGo = baku.nextInt();
        System.out.println("How many are you?");
        int psn = baku.nextInt();
        switch (bakuGo) {
            case 1:
               amount = psn*BakuSum;
               buyTicket(amount);
                break;
            case 2:
                amount = psn*BakuGan;
                buyTicket(amount);
                break;
            default:
                System.out.println("Please try again!");
                stationBaku(BakuSum, BakuGan,amount);
        }

    }

    public static void stationSumgait(int BakuSum,int SumGan,int amount) {
        System.out.println("Where are you going?\n1.Baku\n2.Ganja");
        Scanner sumgait = new Scanner(System.in);
        int sumGo = sumgait.nextInt();
        System.out.println("How many are you?");
        int psn=sumgait.nextInt();
        switch (sumGo) {
            case 1:
                amount= psn*BakuSum;
                buyTicket(amount);
                break;
            case 2:
                amount= psn*SumGan;
                buyTicket(amount);
                break;
            default:
                System.out.println("Please try again!");
                stationSumgait(BakuSum,SumGan,amount);
        }

    }

    public static void stationGanja(int BakuGan,int SumGan,int amount) {
        System.out.println("Where are you going?\n1.Baku\n2.Sumgait");
        Scanner ganja = new Scanner(System.in);
        int ganGo = ganja.nextInt();
        System.out.println("How many are you?");
        int psn=ganja.nextInt();
        switch (ganGo) {
            case 1:
                amount=psn*BakuGan;
                buyTicket(amount);
                break;

            case 2:
                amount=psn*SumGan;
                buyTicket(amount);
                break;
            default:
                System.out.println("Please try again!");
                stationGanja(BakuGan,SumGan,amount);
        }

    }
    public static void buyTicket(int amount){
        System.out.println("Your trip amount is "  +amount +  "AZN. Choose payment method:\n1.Cash\n2.Cart");
        Scanner buy = new Scanner(System.in);
        int method = buy.nextInt();
        switch (method){
            case 1:
                System.out.println("Enter the money and tap to OK:");break;
            case 2:
                System.out.println("Enter cart to place and tap to OK");break;
            default:
                System.out.println("False!!!");break;
        }

    }
}

