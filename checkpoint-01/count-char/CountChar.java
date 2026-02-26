
public class CountChar {
    public static int count(String s, char c) {
        // your code here
        if (s == null)
            return 0;
        int ctr = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (c == ch) {
                ctr++;

            }

        }
        return ctr;
    }

    public static void main(String[] args) {
        System.out.println(CountChar.count("Hello World! @$@!", '@'));
    }

}