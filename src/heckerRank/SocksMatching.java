package heckerRank;

import java.util.ArrayList;
import java.util.List;

public class SocksMatching {
    public static int sockMerchant(int n, List<Integer> ar) {
        int pairs = 0;
        int temp = 0;
        if(ar.size()!=0){
            for(int i = 0; i<ar.size(); i++) {

                    for (int j = i + 1; j < ar.size(); j++) {
                        if (ar.get(i).equals(ar.get(j))) {
                            pairs++;
                            temp = ar.get(i+1);
                            ar.set(i+1, ar.get(j));
                            ar.set(j, temp);
                            i++;
                            break;
                        }
                    }
                }

        } else {
                pairs=0;
        }
        System.out.println(pairs);
        return pairs;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6, 3, 6, 1, 4, 5, 5, 5));
        sockMerchant(20, list);
    }
}
