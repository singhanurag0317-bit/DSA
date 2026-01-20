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

        int writeIndex = 0;

        for(int readIndex = 1; readIndex < n; readIndex++){
            if(arr[readIndex] != arr[writeIndex]){
                writeIndex++;
                arr[writeIndex] = arr[readIndex];
            }
        }
        int newLength = writeIndex+1;
        System.out.print("new length: " + newLength);
       
    }
}