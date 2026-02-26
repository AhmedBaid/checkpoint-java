public class AverageCalc {
    public static int average(int start, int end, int step) {
        if (step == 0)
            return 0;
        int sum = 0;
        int count = 0;

        for (int i = start; end < start ? i >= end : i <= end; i += step) {
            count++;
            sum += i;

        }

        return sum / count;

    }

    public static void main(String[] args) {
        System.out.println(AverageCalc.average(1, 10, 2));
        System.out.println(AverageCalc.average(10, 1, -2));
        System.out.println(AverageCalc.average(1, 1, 2));
        System.out.println(AverageCalc.average(1, 1, 1));
        System.out.println(AverageCalc.average(1, 2, 10));
        System.out.println(AverageCalc.average(1, 2, 10));
        System.out.println(AverageCalc.average(-10, -1, 2));
        System.out.println(AverageCalc.average(-1, -10, -2));
        System.out.println(AverageCalc.average(1, 10, 0));


    }
}