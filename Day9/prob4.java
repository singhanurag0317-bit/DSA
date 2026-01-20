import java.util.HashMap;
import java.util.Scanner;

public class prob4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int x : arr) {
            if(map.containsKey(x)){
                int oldcount = map.get(x);
                map.put(x, oldcount+1);
            }
            else {
                map.put(x, 1);
            }
        }
        System.out.println(map);
    }
}