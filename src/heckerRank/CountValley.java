package heckerRank;

public class CountValley {
    //how many valleys the hiker enters
    //valleys are above see level
    public static int countingValleys(int steps, String path) {
        int valley=0;
        int uCount = 0;
        int dCount = 0;
        boolean down = false;


        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i)=='U'){
                uCount++;
                if(uCount > dCount) {
                   down = false;
                }

            } else {
                dCount++;
                if(uCount < dCount) {
                    down =  true;
                }
            }
            if(uCount== dCount && down) valley++;

        }


        System.out.println(valley);
        return valley;
    }

    public static void main(String[] args) {
        countingValleys(8, "UDDDUDUU");
    }

    }
