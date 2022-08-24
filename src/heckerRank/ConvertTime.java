package heckerRank;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertTime {

    public static void convert(String s) throws ParseException {
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
        Date date = parseFormat.parse(s);
        System.out.println(displayFormat.format(date));
    }
    public static void main(String[] args) {
        try {
            convert("12:01:00PM");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
