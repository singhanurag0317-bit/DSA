public class eighteen {
    public static void main(String[] args) {
        int num = 5432;
        int sum =0;
        num = Math.abs(num);
        while(num> 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num/10;

        }
        System.out.println(sum);
    }
}
