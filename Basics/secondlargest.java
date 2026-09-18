public class secondlargest{
    public static void main(String [] args){
        int [] arr = {10,20,30,40,50};
        int largest;
        int secondl;
        if(arr[0]>arr[1]){
            largest = arr[0];
            secondl=arr[1];
        } else {
            largest = arr[1];
            secondl = arr[0];
        }
        for(int i=2;i<arr.length;i++){
            int curr = arr[i];
            if(curr>largest){
               
                secondl = largest; 
                largest = curr;
            }
            else if (curr>secondl){
                secondl = curr;
                
            }
        }
        System.out.println(secondl);
    }
}