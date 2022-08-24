package heckerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMax {

    public static void calcMinMax(List<Integer> list) {
        long temp = 0;
        long[] myArr = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                temp += list.get(j);
            }
            temp=temp - list.get(i);
            myArr[i] = temp;
            temp = 0;
        }
        Arrays.sort(myArr);
        System.out.println(Arrays.toString(myArr));
        System.out.println(myArr[0] + " " + myArr[myArr.length-1]);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>() {{
            add(256741038);
            add(623958417);
            add(467905213);
            add(714532089);
            add(938071625);
        }};

        calcMinMax(list);
    }

}
