package heckerRank;

interface AdvancedArithmetic{
    int divisorSum(int n);
}

public class CalcSumDivisor implements AdvancedArithmetic{

    public int divisorSum(int n) {
        int sum = 0;
        for(int i = 1; i <=n; i++){
            if(n%i==0){
                sum += i;
                System.out.print("value of i: " + i +", ");
                System.out.println();
            }
        }
        System.out.println("Sum of divisors: " + sum);
        return sum;
    }

    public static void main(String[] args) {
        CalcSumDivisor c = new CalcSumDivisor();
        c.divisorSum(20);
    }
}
