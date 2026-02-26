
public class RotateArray {
    public static Integer[] rotate(Integer[] arr, int rotationCount) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        int n = arr.length;
        int shift = ((rotationCount % n) + n) % n;

        if (shift == 0) {
            return arr;
        }

        Integer[] rotatedArr = new Integer[n];

        for (int i = 0; i < n; i++) {
            int newPos = (i + shift) % n;
            rotatedArr[newPos] = arr[i];
        }

        return rotatedArr;
    }
}