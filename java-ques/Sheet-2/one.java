

public class one{
    public static void main(String[] args) {
        int num = 5435;
        int original = num;
        int rev = 0;

        while(num!=0){
            int digit= num%10;
            rev = rev*10+digit;
            num =num/10;
        }
        if(rev==original){
            System.out.println("yes palindrome");
        } else{
            System.out.println("no");
        }
    }
}

