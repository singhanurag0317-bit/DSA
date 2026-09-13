public class nineteen {
    public static void main(String[] args) {
        int num = 298475;
        num = Math.abs(num);
        int evensum = 0;
        while(num>0){
            int digit = num%10;
            if(digit % 2 == 0){
                evensum = evensum + digit;
            }
            num = num/10;
        }
        System.out.println(evensum);
    }
}
