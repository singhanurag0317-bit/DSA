import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
         System.out.println("enter numbers: ");
        for(int i = 1; i<=5; i++){
         
            int num = sc.nextInt();
            if(num % 2 == 0){
                count++;
            }
        }
        System.out.println("no. of even numbers: "+ count);
        sc.close();
    }
}
