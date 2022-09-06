package heckerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DiagonalSumDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int left = 0;
        int right = 0;
        int[][] myArr = new int[arr.size()][];
        for(int i = 0; i < arr.size(); i++){
            myArr[i] = arr.get(i).stream()
                    .mapToInt(x->x)
                    .toArray();
            System.out.println(Arrays.toString(myArr[i]));
        }

        for(int i = 0; i<myArr.length; i++){
            for(int j = 0; j < myArr.length; j++){
                if(i==j){
                    left += myArr[i][j];
                }
            }
        }
        for(int i = 0; i<myArr.length; i++){
            for(int j = myArr.length-1-i; ; ){
                right += myArr[i][j];
                break;
            }
        }
        int diff = left - right;

        System.out.println(diff);
        return Math.abs(diff);
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();

        List<Integer> l2 = List.of(11,2,4);
        List<Integer> l3 = List.of(4,5,6);
        List<Integer> l4 = List.of(10,8,-12);

        lists.add(l2);
        lists.add(l3);
        lists.add(l4);
        diagonalDifference(lists);
    }
}
