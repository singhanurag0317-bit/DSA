import java.util.*;
public class prob2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
System.out.println("enter m: ");
        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i = 0; i<m;i++){
            b[i] = sc.nextInt();
        }

        int i = 0;
        int j =0;
        System.out.println("intersecting elements: ");

        while(i<n && j<m){
            if(a[i] == b[j]){
                System.out.println(a[i] + " ");
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            } else{
                j++;
            }
        }
    }
}