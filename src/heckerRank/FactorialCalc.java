package heckerRank;

public class FactorialCalc {
    public static int factorial(int n) {
        int fact = 1;
        for(int i=n; i>=1; i--){
            fact*=i;
        }
        System.out.println(fact);
        return fact;
    }

    public static void main(String[] args) {
        factorial(3);
    }
}
