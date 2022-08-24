package heckerRank;

import java.util.List;

public class ReverseArray {

    public static void revArray(int len, List<Integer> list){
        int[] myArr = new int[len];
        myArr = list.stream()
                .mapToInt(x->x)
                .toArray();

        for(int i = len-1; i>=0; i--){
            System.out.print(myArr[i] + " ");
        }
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1,4,3,2);
        revArray(4, list);
    }
}
