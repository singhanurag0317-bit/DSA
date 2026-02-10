import java.util.Arrays;

public class four {
    public static int[] encode(int[] arr) {
        int[] encoded = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            encoded[i] = arr[i] + 1;
        }
        return encoded;
    }

    public static int[] decode(int[] arr) {
        int[] decoded = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            decoded[i] = arr[i] - 1;
        }
        return decoded;
    }

    public static void main(String[] args) {
        int[] original = { 4, 5, 6, 7 };
        int[] encoded = encode(original);
        int[] decoded = decode(original);
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(encoded));
        System.out.println(Arrays.toString(decoded));
    }
}
