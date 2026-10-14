import java.util.Arrays;
public class duplicatezeroes {

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 6 };
        int[] des = new int[arr.length];
        int s = 0;
        int d = 0;

        while (s < arr.length) {
            if (arr[s] == 0) {
                if (d < arr.length) {
                    des[d] = 0;
                }
                d = d + 1;
                if (d < arr.length) {
                    des[d] = 0;
                }

            } else {
                if (d < arr.length) {
                    des[d] = arr[s];
                }
            }
            d = d + 1;
            s = s + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = des[i];
        }
        System.out.println(Arrays.toString(des));
    }
}