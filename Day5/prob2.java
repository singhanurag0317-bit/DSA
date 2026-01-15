
public class prob2 {
    public static void main(String[] args) {
    
        int n = 7;
        int[] arr = {1,5,4,6,7,3};
        int expected = n*(n+1)/2;
        int actual = 0;
      
        for(int x : arr){
            actual = actual+x;
        }
          int missing = expected-actual;
        System.out.println(missing);
    }
}
