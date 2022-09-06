package heckerRank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class LibraryFine {

    public static void main(String[] args) {
        Date[] arr = new Date[2];
        Scanner in = new Scanner(System.in);
        for(int i =0; i<2; i++){
            try {
                arr[i] = convertString(in.nextLine());
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        calcFine(arr);

    }

    public static Date convertString(String s) throws ParseException {
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        s = Arrays.stream(s.split(" ")).collect(Collectors.joining("-"));
        System.out.println(s);
        System.out.println(simpleDateFormat.parse(s));
        return simpleDateFormat.parse(s);
    }

    public static int calcFine(Date[] arr){
        Calendar actual = Calendar.getInstance();
        actual.setTime(arr[0]);
        Calendar expected = Calendar.getInstance();
        expected.setTime(arr[1]);
        int fine = 0;

        if (actual.after(expected)) {
            if(actual.get(Calendar.MONTH)== expected.get(Calendar.MONTH))
                fine = 15 * (actual.get(Calendar.DAY_OF_MONTH) - expected.get(Calendar.DAY_OF_MONTH));
            else if(actual.get(Calendar.YEAR)== expected.get(Calendar.YEAR))
                fine = 500 * (actual.get(Calendar.MONTH) - expected.get(Calendar.MONTH));
            else if(actual.get(Calendar.YEAR) > expected.get(Calendar.YEAR))
                fine = 10000;
        }

        System.out.println(fine);
        return fine;
    }
}
