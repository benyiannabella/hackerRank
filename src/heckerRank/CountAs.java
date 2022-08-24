package heckerRank;

public class CountAs {

    public static long repeatedString(String s, long n) {
        long sTimes = (long)n/s.length();
        System.out.println("times: " + sTimes);
        long remain = (long)n%s.length();
        System.out.println("remain: " + remain);
        long result = 0;
        long aCount = s.chars()
            .filter(x->x=='a')
            .count();
        long aCountRem = s.substring(0,(int)remain)
                .chars()
                .filter(x->x=='a')
                .count();
        if(remain==0){
            result=aCount*sTimes;
        } else {
            result=(aCount*sTimes)+aCountRem;

        }
        System.out.println("count*times: " + aCount*sTimes);
        System.out.println("res: " + result);
        return result;
    }

    public static void main(String[] args) {
        repeatedString("gfcaaaecbg", 547602);
    }
}
