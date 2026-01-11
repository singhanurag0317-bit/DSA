import java.util.*;
public class prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println(1);
            return;
        }
        int count = 0;
        while (n!=0){
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}