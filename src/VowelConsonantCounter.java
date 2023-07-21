public class VowelConsonantCounter {

    public static boolean hasMoreVowels(String s) {
        int vowelCount = countVowels(s);
        int consonantCount = s.length() - vowelCount;

        return vowelCount > consonantCount;
    }

    private static int countVowels(String s) {
        if (s.isEmpty()) {
            return 0;
        } else {
            char firstChar = s.charAt(0);
            boolean isVowel = isVowel(firstChar);
            int remainingVowels = countVowels(s.substring(1));
            return (isVowel ? 1 : 0) + remainingVowels;
        }
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        boolean hasMoreVowels = hasMoreVowels(inputString);
        System.out.println("Input String: " + inputString);
        System.out.println("Has more vowels than consonants? " + hasMoreVowels);
    }
}
