package heckerRank;

public class LoopPrintMultiples {


    public static void main(String[] args) {
        printMultiples(3);

    }

    public static void printMultiples(int n){
        for(int i = 1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
