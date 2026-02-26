import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static Integer[] reverse(Integer[] arr) {
        Collections.reverse(Arrays.asList(arr));
        return arr;
    }
}