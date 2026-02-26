public class AlmostPalindrome {

    public static boolean isAlmostPalindrome(String s) {
        s = s.toLowerCase();
        if (isPalindrome(s)) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {

            String newStr = s.substring(0, i) + s.substring(i + 1);

            if (isPalindrome(newStr)) {
                return true;
            }
        }

        return false;
    }

    private static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
    public static void main(String[] args) {
        System.out.println(AlmostPalindrome.isAlmostPalindrome("aaa"));
        System.out.println(AlmostPalindrome.isAlmostPalindrome("abb"));
        System.out.println(AlmostPalindrome.isAlmostPalindrome("abc"));

    }
}