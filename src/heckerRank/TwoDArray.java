package heckerRank;

import java.util.ArrayList;
import java.util.List;

public class TwoDArray {
    public static int hourglassNumber(List<List<Integer>> arr){
        int hourglassCount = 0;
        int sum = 0;
        int temp = 0;
        int[][] myArr = arr.stream()
                .map(l-> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);

        for(int i = 0; i < myArr.length; i++){
            if((i+2)<myArr.length){
                for(int j = 0; j < myArr[i].length; j++){
                    if((j+2)<myArr[i].length){
                        hourglassCount++;
                        temp = myArr[i][j] + myArr[i][j+1] + myArr[i][j+2] + myArr[i+1][j+1]
                                + myArr[i+2][j] + myArr[i+2][j+1] + myArr[i+2][j+2];
                        if(i==0 && j==0) sum = temp;
                        else {
                            if(temp > sum) sum = temp;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                break;
            }
        }

        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<Integer>(){{
            add(-1); add(-1); add(0); add(-9); add(-2); add(-2);
        }};
        List<Integer> list2=new ArrayList<Integer>(){{
            add(-2); add(-1); add(-6); add(-8); add(-2); add(-5);
        }};
        List<Integer> list3=new ArrayList<Integer>(){{
            add(-1); add(-1); add(-1); add(-2); add(-3); add(-4);
        }};
        List<Integer> list4=new ArrayList<Integer>(){{
            add(-1); add(-9); add(-2); add(-4); add(-4); add(-5);
        }};
        List<Integer> list5=new ArrayList<Integer>(){{
            add(-7); add(-3); add(-3); add(-2); add(-9); add(-9);
        }};
        List<Integer> list6=new ArrayList<Integer>(){{
            add(-1); add(-3); add(-1); add(-2); add(-4); add(-5);
        }};

        List<List<Integer>> myList = new ArrayList<>(){{
            add(list1); add(list2); add(list3); add(list4); add(list5); add(list6);
        }};

        //System.out.println(myList);
        hourglassNumber(myList);
    }
}
