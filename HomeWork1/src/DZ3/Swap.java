package DZ3;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 9};
        int tmp = arr[1];
        arr[1] = arr[2];
        arr[2] = tmp;
        System.out.println(Arrays.toString(arr));
    }
}
