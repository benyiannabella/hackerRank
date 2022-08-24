package heckerRank;

import java.util.ArrayList;
import java.util.List;

public class RatioOfArrElements {
    public static void plusMinus(List<Integer> arr) {
        double positive = arr.stream()
                .filter(x->x > 0)
                .count();

        double negative = arr.stream()
                .filter(x->x < 0)
                .count();

        double eqZero = arr.stream()
                .filter(x->x == 0)
                .count();

        System.out.format("%.6f",(positive/arr.size()));
        System.out.println();
        System.out.format("%.6f",(negative/arr.size()));
        System.out.println();
        System.out.format("%.6f",(eqZero/arr.size()));
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-4);
        list.add(3);
        list.add(-9);
        list.add(0);
        list.add(4);
        list.add(1);
        plusMinus(list);
    }
}
