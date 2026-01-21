public class prob2{
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {2,1,5,1,3,2};

        int k = 3;
        int windowSum = 0;
        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum = windowSum+arr[i];
        }

        for (int i = k; i < n; i++) {
            windowSum = windowSum+arr[i];
            windowSum = windowSum-arr[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println(maxSum);
    }
}