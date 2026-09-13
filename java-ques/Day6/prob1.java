import java.util.*;
public class prob1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt(); 
        }
        System.out.println("enter target: ");
        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int need = target - arr[i];
            if(map.containsKey(need)){
                System.out.println(map.get(need) +" "+ i);
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("no pair found");


    }
}