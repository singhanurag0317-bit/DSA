public class linearsearch{
    public static void main(String [] args){
        int [] arr = {1,5,8,4,6};
        int target = 3;
        boolean found = false;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == target ){
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}