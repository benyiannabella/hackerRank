package heckerRank;

import java.util.ArrayList;
import java.util.List;

public class JumpingOnClouds {

    public static int jumpingOnClouds(List<Integer> c) {

        int jumpCount = 0;
        if(c.size()>0){
            for(int i = 0; i<c.size(); i++){
                if(c.get(i) == 0 && i<c.size()-1){
                    if((i+1)<c.size()-1 && c.get(i+1)==0){
                        if((i+2)<c.size() && c.get(i+2)==0){
                            i++;
                            jumpCount++;
                            continue;
                        }
                        jumpCount++;
                    } else {
                        i++;
                        jumpCount++;
                    }
                }
            }
        }

        System.out.println(jumpCount);
        return jumpCount;
    }

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(List.of(0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0,
                0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0,
                0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0,
                0, 0, 0, 1, 0, 0, 0));
        jumpingOnClouds(myList);
    }
}
