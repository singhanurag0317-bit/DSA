import java.util.Arrays;

public class prob1 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {0,1,0,2,3};

        int index = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0){
                arr[index++] = arr[i]; 
            
            }
        }
        while(index <n){
            arr[index++] = 0;
        }
    System.out.println(Arrays.toString(arr));
    }
}
