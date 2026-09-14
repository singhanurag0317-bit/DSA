import java.util.Scanner;
public class countdigits{
    public static void main(String [] args){
        int n = 124758;
        int count = 0;
        while(n>0){
            int digit = n%10;

            count = count + 1;
            n = n/10;
        }
        System.out.println(count);
    }
}