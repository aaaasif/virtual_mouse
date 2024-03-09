public class Lab2 {
    public static void main(String[] args) {
        // Examples with literal strings
        printComboString("Hello", "hi");
        printComboString("hi", "Hello");
        printComboString("aaa", "b");
        printComboString("ooorrreee", "code");
        printComboString("lotaile", "codekori");

        // Example with variables
        String a = "korlam";
        String b = "code";
        printComboString(a, b);
    }

    public static void printComboString(String a, String b) {
        // Print the result of comboString
        System.out.println(comboString(a, b));
    }

    public static String comboString(String a, String b) {
        // Return a string of the form short + long + short
        return (a.length() < b.length()) ? a + b + a : b + a + b;
    }
}
