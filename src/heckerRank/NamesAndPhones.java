package heckerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NamesAndPhones {
    public static void main(String []argh){
        Map<String, Integer> phoneBook = new HashMap<>();
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter a number:");
        int n = in.nextInt();
        //System.out.println("Enter names + phonebook:");
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(phoneBook.get(s)!=null){
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }

}
