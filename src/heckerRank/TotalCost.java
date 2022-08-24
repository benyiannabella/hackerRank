package heckerRank;

public class TotalCost {

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        int finalPrice = (int)Math.round(meal_cost + (meal_cost *tip_percent)/100 + (meal_cost*tax_percent)/100);
        System.out.println(finalPrice);


    }

    public static void OddOrEven(int n) {
        System.out.println((n % 2) != 0 ? "Weird" : (n >= 6 && n <= 20) ? "Weird" : "Not Weird");

    }
    public static void main (String[]args){
        solve(10.25, 17, 5);
    }

}
