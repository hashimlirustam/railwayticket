package infoStation;

import util.Register;
import util.User;

import java.util.Scanner;
public class Welcome {

    public static void welcome(User user){
        System.out.println("Hello. Welcome to Azerbaijan Railways!Enter id:\n  Click to 0 to register..");
        Scanner sc = new Scanner(System.in);
        Integer card = sc.nextInt();
        if (card==0){
            Register.register();
       }else {
       if(card.equals(user.getId())){
           Operations.accountMenu(user);
       }else {
           System.out.println("Invalid id");
       }
    }}
   }

