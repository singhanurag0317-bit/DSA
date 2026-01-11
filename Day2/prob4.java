import java.util.*;
public class prob4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
}