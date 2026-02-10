

public class three {
    public static void main(String[] args) {
        int alpha = 487;
        int beta = 264;
        int gamma =631;

        int a = Math.abs(alpha%10);
        int b = Math.abs(beta%10);
        int c = Math.abs(gamma%10);

        int pin = (a*100)+ (b*10)+ (c);
        System.out.println("pin: " +pin);    
    }
}
