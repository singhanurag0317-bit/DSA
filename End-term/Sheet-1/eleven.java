import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long factorial = 1;
        System.out.println("enter num: ");
        int num = sc.nextInt();
        for(int i = 1; i<=num; i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        sc.close();
    }
}
