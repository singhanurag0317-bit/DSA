public class ten{
    public static void main(String[] args) {
        int num = 13;
        boolean isPrime = true;

        if(num<=1){
            isPrime = false;
        }
        else{
            for(int i =2;i<num;i++){
                if(num%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("yes"+num);
        }
        else{
            System.out.println("no"+num);
        }
    }
}