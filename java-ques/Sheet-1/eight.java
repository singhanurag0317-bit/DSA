import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
         System.out.println("enter numbers: ");
        for(int i = 1; i<=5; i++){
         
            int num = sc.nextInt();
            if(num % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("no. of odd numbers: "+ odd);
          System.out.println("no. of even numbers: "+ even);
        sc.close();
    }
}