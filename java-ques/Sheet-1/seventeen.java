import java.util.Scanner;

public class seventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        int count = 0;
        int[] freq = new int[10];
        while(num>0){
            int dight = num %10;
            freq[dight] += 1;
            num /=10;
        }
        for(int i=0; i< 10;i++){
            if(freq[i]==1){
                count++;
            }
        }
        System.out.println(count);
    }
}

