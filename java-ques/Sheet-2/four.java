
public class four {
    public static void main(String[] args) {
        int n = 3;
        int weight =0;

        for(int i = 1; i<=n; i++){
            for(int j =1; j<=i; j++){
                weight= weight+j;
            }
            for(int j = i-1; j>=1; j--){
                weight = weight+j;
            }
        }
        System.out.println(weight);
    }
}
