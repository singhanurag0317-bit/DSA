import java.util.*;
public class prob2{
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

        int left = 0;
        int right = n-1;

        while(left<right){
            int sum = arr[left] + arr[right];

            if(sum == target){
                System.out.println(left + " " + right);
                break;
            }
            else if (sum<target){
                left++;
            }
            else{
                right--;
            }
        }

    }
}