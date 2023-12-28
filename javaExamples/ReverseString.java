package javaExamples;

public class ReverseString {
    public static void main(String[] args) {
        String string = "abcdef";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("\nString before reverse: " + string);
        System.out.println("String after reverse: " + reverse);
        System.out.println();
        String input = "alfaizuna";
        System.out.println("input = " + input);
        char[] try1 = input.toCharArray();
        for (int i = try1.length - 1; i >= 0; i--) {
            System.out.print(try1[i]);
        }
    }
}