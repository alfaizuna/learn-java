package javaExamples;

public class StringCompareEqual {
    public static void main(String []args){
        String s1 = "alfaizunaulia";
        String s2 = "alfaizunaulia";
        String s3 = new String ("Alfaizuna Aulia");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
    }
}
