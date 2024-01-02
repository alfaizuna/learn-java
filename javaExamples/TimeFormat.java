package javaExamples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormat {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat simpDate;
        simpDate = new SimpleDateFormat("kk:mm:ss");
        System.out.println(simpDate.format(d));
    }
}
