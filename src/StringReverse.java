public class StringReverse {

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return "";
        } else {
            char lastChar = str.charAt(str.length() - 1);
            String reversedSubstring = reverseString(str.substring(0, str.length() - 1));
            return lastChar + reversedSubstring;
        }
    }

    public static void main(String[] args) {
        String inputString = "pots&pans II";
        String reversedString = reverseString(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }
}
