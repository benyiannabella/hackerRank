package heckerRank;

import java.util.List;

public class BubbleSort {

    public static void sortElements(List<Integer> list){
        int temp = 0;
        int swapCount = 0;

        int[] arr = list.stream()
                .mapToInt(x->x)
                .toArray();

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swapCount++;
                }
            }
        }
        System.out.println("Array is sorted in " + swapCount + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length-1]);
    }

    public static void main(String[] args) {
        var list = List.of(4,3,1,2);
        sortElements(list);
    }
}
