package javaExamples;

import java.util.Calendar;
import java.util.Formatter;

public class FormatMonth {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        fmt.format("%tB %tb %tm", cal, cal, cal);
        System.out.println(fmt);
    }
}
