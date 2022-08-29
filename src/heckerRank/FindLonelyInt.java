package heckerRank;

import java.util.List;

public class FindLonelyInt {
    public static int lonelyInteger(List<Integer>a) {
        int result = 0;
        Outer: for(int i = 0; i < a.size(); i++){
            if(a.size()>1) {
                for (int j = i + 1; j < a.size(); j++) {
                    if (a.get(i) == a.get(j)) {
                        continue Outer;
                    }
                    if(i==j-1 && j==a.size()-1){
                        result = a.get(j);
                        break Outer;
                    } else if (j==a.size()-1) {
                        result = a.get(i);
                        break Outer;
                    }
                }
            } else {
                result = a.get(i);
            }
        }
        System.out.println(result);
        return result;

    }

    public static void main(String[] args) {
        List<Integer> ints = List.of(0,0,1,2,1);
        lonelyInteger(ints);
    }
}
