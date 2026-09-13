import java.util.Scanner;

public class twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 0;i<n-2; i++){
            int temp = a+b;
            a = b;
            b = temp;
            System.out.print(temp+" ");
            } 
            System.out.println(b);
        }
    }

