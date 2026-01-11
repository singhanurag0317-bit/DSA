import java.util.*;
public class prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        int[] arr = {1,2,3,4,5};
        int max = arr[0];
        for (int i = 1; i <= arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}