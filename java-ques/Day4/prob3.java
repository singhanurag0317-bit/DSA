public class prob3 {
public static void main(String[] args) {
    int[] arr ={1,5,9,14};

    boolean isSorted = true;
    for(int i =0; i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
            isSorted = false;
        }
    }
    System.out.println(isSorted);
}    
}
