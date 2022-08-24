package heckerRank;

public class ParseStringToInt {

    public static void printString(String s){
        try{
            int i = Integer.parseInt(s);
            System.out.println(i);
        } catch (RuntimeException ex){
            System.out.println("Bad String");
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        printString("hello");
    }
}
