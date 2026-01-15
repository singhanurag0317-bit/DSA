import java.util.HashSet;

public class prob1{
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5};

        HashSet<Integer> set = new HashSet<>();
        boolean hasDuplicate = false;

        for(int x : arr){
            if(set.contains(x)){
                hasDuplicate = true;
                break;
            } 
             set.add(x);
        }
        System.out.println(hasDuplicate);
      
    }
}