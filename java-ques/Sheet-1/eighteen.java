public class eighteen {
    public static void main(String[] args) {
        int num = 5432;
        int sum =0;
        num = Math.abs(num);
    while(num>0){
        int dight = num %10;
        sum += dight;
        num /=10;
    }
    System.out.println(sum);
    
    }
}
