

public class two {
    public static void main(String[] args) {
        int num = 10001;
        num = Math.abs(num);
        int[] freq = new int[10];

        // count digit frequency
        if(num == 0) freq[0] = 1;
        while(num>0){
            int digit = num %10;
            freq[digit]++;
            num = num/10;
        }
        int oddcount = 0;
        for(int f : freq){
            if(f%2!=0){
                oddcount++;
            }
        }
        if(oddcount <= 1){
            System.out.println("yes possible");
        } else{
            System.out.println("not possible");
        }
    }
}
