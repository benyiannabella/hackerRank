package heckerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindMedian {

    public static int findMedian(List<Integer> arr) {
        int median = 0;
        arr= arr.stream()
                .sorted()
                .collect(Collectors.toList());
        for(int i = 0; i < arr.size(); i++){

            median = arr.size()/2;
        }
        return median;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(){{add(5); add(3); add(1); add(4); add(5);}};
        findMedian(arr);
    }
}
