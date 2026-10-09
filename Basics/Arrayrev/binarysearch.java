public class binarysearch{
    public static void main(String [] args){
        int [] arr = {2,5,8,12,16,23,38,45};
        int target = 23;
        int left = 0;
        int right = arr.length-1;
        boolean found = false;

        while(left<=right){
            int mid = (left+right)/2;

        
        if(arr[mid] == target){
            found = true;
            break;
        }
        else if (arr[mid] < target){
            left = mid +1;
        } else{
            right = mid-1;
        }
    }
    if(found){
        System.out.println("found");
    }else{
        System.out.println("not found");
    }
    }
}