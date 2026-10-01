public class palindromeproject {
    public static void main(String[] args) {
        if(args.length == 0)
        {
            System.out.println("Please provide a wordtocheck.");
            return;
        }
        string input = args[0];
        if(isPalindrome(word)){
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String st) {
        string reversed = new StringBuilder(st).reverse().toString();
        return st.equalsIgnoreCase(reversed);
    }