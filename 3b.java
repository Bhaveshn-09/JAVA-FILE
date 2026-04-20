package stringfunctions1;

public class StringFunctionsDemo {

    // All 10 functions here (your code is already PERFECT ✅)

    // ---- paste your functions here ----

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static int countOccurrences(String mainString, String subString) {
        if (mainString == null || subString == null || subString.isEmpty()) {
            return 0;
        }
        return (mainString.length() - mainString.replace(subString, "").length()) / subString.length();
    }

    public static String reverseString(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    public static String removeWhitespace(String str) {
        return str == null ? null : str.replaceAll("\\s", "");
    }

    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) return str;

        StringBuilder result = new StringBuilder();
        String[] words = str.split("\\s+");

        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1).toLowerCase())
                  .append(" ");
        }
        return result.toString().trim();
    }

    public static String truncate(String str, int maxLength) {
        if (str == null) return null;
        return str.length() > maxLength ? str.substring(0, maxLength) + "..." : str;
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) return false;
        return str.matches("\\d+");
    }

    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder random = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * chars.length());
            random.append(chars.charAt(index));
        }
        return random.toString();
    }

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }

    // ===== MAIN METHOD =====
    public static void main(String[] args) {

        System.out.println("1. isNullOrEmpty: " + isNullOrEmpty(" "));
        System.out.println("2. countOccurrences: " + countOccurrences("hello hello", "hello"));
        System.out.println("3. reverseString: " + reverseString("Java"));
        System.out.println("4. isPalindrome: " + isPalindrome("Madam"));
        System.out.println("5. removeWhitespace: " + removeWhitespace("Hello World"));
        System.out.println("6. capitalizeWords: " + capitalizeWords("hello world"));
        System.out.println("7. truncate: " + truncate("Hello World", 5));
        System.out.println("8. isNumeric: " + isNumeric("12345"));
        System.out.println("9. generateRandomString: " + generateRandomString(8));
        System.out.println("10. countWords: " + countWords("Java is easy"));
    }
}