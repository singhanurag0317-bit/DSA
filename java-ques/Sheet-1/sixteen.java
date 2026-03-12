
import java.util.HashSet;
import java.util.Scanner;

public class sixteen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

           HashSet<Integer> set = new HashSet<>();
           int num = sc.nextInt(); 
           if(num == 0)   System.out.println(1); 
           
           
           
            while(num>0){
                set.add(num%10);
                num /= 10;

                
            
        }
        System.out.println(set.size());




           
    }
}
