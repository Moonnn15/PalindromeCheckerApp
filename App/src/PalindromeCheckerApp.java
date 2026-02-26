public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println("The given string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + word + "\" is NOT a Palindrome.");
        }
        System.out.println("Program ended.");


        // 3 rd program
        String original = "noon";


        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println("The given string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + original + "\" is NOT a Palindrome.");
        }
    }
}