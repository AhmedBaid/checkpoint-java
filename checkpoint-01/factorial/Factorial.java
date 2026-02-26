public class Factorial {
    public static Integer factorial(Integer n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(Factorial.factorial(3));
    }
}