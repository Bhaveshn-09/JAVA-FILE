package StringFunctions;

public class StringHandlingDemo {

    public static void main(String[] args) {

        // Basic String Creation
        System.out.println("=== String Creation and Basic Operations ===");

        String str1 = "Hello, World!";
        String str2 = new String("Java Programming");

        System.out.println("Original strings:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Length and Character Access
        System.out.println("\n=== Length and Character Access ===");
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 4 in str1: " + str1.charAt(4));

        // String Comparison
        System.out.println("\n=== String Comparison ===");
        String str3 = "hello, world!";
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));

        // Searching
        System.out.println("\n=== String Searching ===");
        System.out.println("Index of 'World': " + str1.indexOf("World"));
        System.out.println("Last index of 'o': " + str1.lastIndexOf('o'));
        System.out.println("Contains 'Hello': " + str1.contains("Hello"));

        // Substring
        System.out.println("\n=== Substring Operations ===");
        System.out.println("Substring(7): " + str1.substring(7));
        System.out.println("Substring(0,5): " + str1.substring(0, 5));

        // Modification
        System.out.println("\n=== String Modification ===");
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.println("Replace: " + str1.replace("World", "Java"));

        // Trim
        System.out.println("\n=== Whitespace Handling ===");
        String spaced = " Trimming Example ";
        System.out.println("Before: '" + spaced + "'");
        System.out.println("After: '" + spaced.trim() + "'");

        // Concatenation
        System.out.println("\n=== Concatenation ===");
        String a = "Hello";
        String b = "World";
        System.out.println(a + " " + b);
        System.out.println(a.concat(" ").concat(b));

        // Split
        System.out.println("\n=== Splitting ===");
        String csv = "Java,Python,C++,JavaScript";
        String[] arr = csv.split(",");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Language " + (i + 1) + ": " + arr[i]);
        }

        // StringBuilder
        System.out.println("\n=== StringBuilder ===");
        StringBuilder sb = new StringBuilder();
        sb.append("Learning ").append("Java ").append("Programming");
        System.out.println(sb);

        sb.insert(9, "Core ");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        // Formatting
        System.out.println("\n=== Formatting ===");
        String formatted = String.format("Name: %s, Age: %d", "John", 25);
        System.out.println(formatted);

        // Properties
        System.out.println("\n=== Properties ===");
        String test = "Java123";
        System.out.println("Empty: " + test.isEmpty());
        System.out.println("Starts with Ja: " + test.startsWith("Ja"));
        System.out.println("Ends with 123: " + test.endsWith("123"));

        // Email validation
        System.out.println("\n=== Email Validation ===");
        String email = "user@example.com";
        System.out.println("Valid: " + validateEmail(email));
    }

    private static boolean validateEmail(String email) {
        return email != null &&
                email.contains("@") &&
                email.contains(".") &&
                email.indexOf("@") < email.lastIndexOf(".") &&
                !email.startsWith("@") &&
                !email.endsWith(".") &&
                email.length() >= 5;
    }
}