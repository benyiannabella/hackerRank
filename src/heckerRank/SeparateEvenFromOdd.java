package heckerRank;

import java.util.Scanner;

public class SeparateEvenFromOdd {

    public static void separate(){

        Scanner keyB = new Scanner(System.in);
        //System.out.println("type the number of strings: ");
        while(keyB.hasNext()){
            int num = keyB.nextInt();
            for(int i = 0; i<num; i++){
                String odd="";
                String even="";
                //System.out.println("type a string");
                String s = keyB.next();
                for(int j = 0; j < s.length(); j++){
                    if(j%2 == 0){
                        even+=s.charAt(j);
                    } else {
                        odd+=s.charAt(j);
                    }
                }
                System.out.println(even + " " + odd);
            }
        }
        keyB.close();


    }

    public static void main(String[] args) {
        separate();
    }

}
