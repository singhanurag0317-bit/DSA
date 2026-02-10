public class twentyone {
    public static void main(String[] args) {
        int num =47965846;
        num = Math.abs(num);
        int evensum= 0;
        int oddsum = 0;
        while(num>0){
            int digit = num % 10;
            if(digit % 2==0){
                evensum =evensum+digit;
            }
            else{
                oddsum =oddsum+digit;
            }
            num = num/10;
        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}
