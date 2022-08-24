package heckerRank;

import java.util.Arrays;

public class SortArrByElementLength {

    public static void main(String[] args) {
        var arr2 = new String[] { "hello", "Bye", "Pa" };
        String temp = "";
        for (int i = 0; i < arr2.length; i++)
        {
            for (int j = i + 1; j < arr2.length; j++)
            {
                if (arr2[i].length() > arr2[j].length())
                {
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr2));
    }
}
