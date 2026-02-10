public class fifteen {
    public static void main(String[] args) {
        int num = 57944772;
        int count =0;
        num = Math.abs(num);
            while(num>0){
            count+=1;
            num=num/10;
        }
        System.out.println(count);
       
    }
}
    
