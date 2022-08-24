package heckerRank;

import java.util.ArrayList;
import java.util.List;

public class RotateElements {

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        List<Integer> myList = new ArrayList<>(List.copyOf(a));
        for(int i = 0; i < a.size(); i++){
            if(i-d>=0) {
                myList.set((i - d), a.get(i));
            } else {
                myList.set(a.size() + (i - d), a.get(i));
            }
        }
        System.out.println(myList);
        return myList;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        rotLeft(list,0);
    }
}
