import java.util.HashMap;

public class prob3 {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,4,4,2,3,3,1,5,2,5};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x : arr){
            if(map.containsKey(x)){
                int oldCount = map.get(x);
                map.put(x, oldCount+1);
            }
            else{
                map.put(x, 1);
            }
        }
        System.out.println(map);

    }    
}
