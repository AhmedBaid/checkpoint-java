public class NextPrime {
    public static Integer nextPrime(Integer n) {

        
        if (isprime(n+1)) {
            return n+1;
        }
        return nextPrime(n + 1);
    }

    public static boolean isprime(Integer n) {
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(NextPrime.nextPrime(0));
        System.out.println(NextPrime.nextPrime(1));
        System.out.println(NextPrime.nextPrime(29));
        System.out.println(NextPrime.nextPrime(-5));

    }
}