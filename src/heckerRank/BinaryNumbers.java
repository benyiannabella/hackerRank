package heckerRank;

public class BinaryNumbers {

    public static void calConsecutiveOnes(int n){
        StringBuilder remainder = new StringBuilder();
        while(n>0){
            remainder.append(n%2);
            n=n/2;
        }
        remainder = remainder.reverse();
        //System.out.println(remainder);
        int oneCount = 0;
        int temp=0;
        for (int i = 0; i<remainder.length(); i++){
            if(remainder.charAt(i) =='1'){
                oneCount++;
               if (oneCount>temp) temp = oneCount;
            } else {
                oneCount = 0;
            }
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        calConsecutiveOnes(13);
    }
}
