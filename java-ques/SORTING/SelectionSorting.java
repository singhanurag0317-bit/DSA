import java.util.Arrays;
public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr= {6,5,2,4,7};
        for(int i =0; i<arr.length-1; i++){
            int smallest = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                    
                }
                // swap 
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;


            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
