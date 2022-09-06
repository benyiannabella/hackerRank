package heckerRank;

public class IsBalanced {
    static boolean isBalanced(String s){
        char[] arr = s.toCharArray();
        int curlyR = 0;
        int curlyL = 0;
        int bracketR = 0;
        int bracketL = 0;
        if(s.isEmpty()){
            return true;
        } else {
            for(int i = 0; i < arr.length; i++){
                if(arr[i]=='{') curlyL++;
                if(arr[i]=='}') curlyR++;
                if(arr[i]=='(') bracketL++;
                if(arr[i]==')') bracketR++;
            }
        }
        if(curlyL==curlyR && bracketL == bracketR) {
            return true;
        } else {
            return false;
        }
    }
}
