public class Digitlen {
    public static int digitlen(long number) {
        // your code here
        String i = Integer.toString(Math.abs((int) number));
        return i.length();
    }

    public static void main(String[] args) {
        System.out.println(Digitlen.digitlen(-123456789));
    }
}