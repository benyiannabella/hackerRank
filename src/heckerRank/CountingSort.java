package heckerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort {

    public static List<Integer> countingSort(List<Integer> arr) {
        int[] myArr = arr.stream()
                .mapToInt(x->x)
                .toArray();

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < myArr.length; i++){
            if (i == 0) {
                for(int j = 0; j < 100; j++) {
                    list.add(0);
                }
            }

            if (list.get(myArr[i]) == 0) {
                list.set(myArr[i], 1);
            } else {
                list.set(myArr[i], list.get(myArr[i]) + 1);
            }


        }
        System.out.println(list);
        return list;


    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1,1,3,2,1);
        countingSort(list);
    }

}
