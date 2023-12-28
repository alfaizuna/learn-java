package javaExamples;

public class SearchString {
    public static void main(String[] args) {
        String strOrig = "Hello readers";
        int intIndex = strOrig.indexOf("Hello");

        if (intIndex == -1) {
            System.out.println("Hello not found");
        } else {
            System.out.println("Found Hello at index " + intIndex); // Found Hello at index 0
        }
        System.out.println();
        String text = "The cat is on the table";
        System.out.print(text.contains("the")); // true
    }
}
