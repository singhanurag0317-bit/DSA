public class eight {
    public static void main(String[] args) {
        int num =4577776;
        int[] freq = new int[10];
        if (num == 0) freq[0]=1;
        while(num>0){
            int digit = num % 10;
            freq[digit]++;
            num = num/10;
        }
        int maxfreq = 0;
        int maxdigit = 0;
        for(int i = 1; i<10; i++){
            if(freq[i]>maxfreq){
                maxfreq = freq[i];
                maxdigit = i;
            }
        }
        System.out.println(maxfreq);
        System.out.println(maxdigit);

    }
}
