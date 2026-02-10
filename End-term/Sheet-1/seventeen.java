import java.util.Scanner;

public class seventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        int count = 0;
        int[] freq = new int[10];
        while(num>0){
            int digit = num  % 10;
            freq[digit] += 1;
            num = num/10;
        }
        for (int i = 0; i <10; i++){
        if(freq[i] == 1 ){
            count = count+1;
        }
            
        }
        System.out.println(count);
    }
}
