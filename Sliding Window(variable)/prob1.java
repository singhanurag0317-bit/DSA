import java.util.Scanner;

public class prob1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n :");
        int n = sc.nextInt();
        System.out.println("enter array elements: ");
        int[] arr = new int[n];
        System.out.println("enter k :");
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for(int right = 0; right<n;right++){
            sum = sum + arr[right];

            while (sum>k){
                sum = sum - arr[left];
                left++;
            }

            maxLen = Math.max(maxLen,right-left+1);
        }
        System.out.println(maxLen);
    }
}
