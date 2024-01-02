package javaExamples;

import java.util.Calendar;
import java.util.Formatter;

public class DisplayHourAndMinute {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        fmt.format("%tl:%tM", cal, cal);
        System.out.println(fmt);
    }
}
