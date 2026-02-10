import java.math.BigInteger;
public class three{
    public static String addLargeNumbers(String num1, String num2){
        BigInteger bignum1 = new BigInteger(num1);
        BigInteger bignum2 = new BigInteger(num2);
        BigInteger sum = bignum1.add(bignum2);
        return sum.toString();
    }
    public static void main(String[] args) {
        String numberA = "745851265222";
        String numberB = "213115467674";
        String result = addLargeNumbers(numberA, numberB);
        System.out.println(numberA);
        System.out.println(numberB);
        System.out.println(result);
    }
}