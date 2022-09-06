package heckerRank;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        List<Integer> myArr = new ArrayList<>();
        int n = keyBoard.nextInt();
        while (n > 0) {
            myArr.add(keyBoard.nextInt());
            n--;
        }
        System.out.println(myArr);
        boolean prime;
        System.out.println(LocalDateTime.now());
        for (int i = 0; i < myArr.size(); i++) {
            prime = true;
            if (myArr.get(i) == 1) prime = false;
            else {
                for (int j = 2; j < myArr.get(i); j++) {
                    if (myArr.get(i) % j == 0 && i != j) {
                        prime = false;
                        break;
                    } else {
                        prime = true;
                    }
                }
            }
            if (prime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }

        System.out.println(LocalDateTime.now());
    }
}
