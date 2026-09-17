import java.util.Scanner;
public class maxcharfreq{
    public static void main(String [] args){
        String s = "banana";
        int highest=0;
        char answer = ' ';
        for(int i =0; i<s.length();i++){ 
            int curr=0;
            for(int j =0;j<s.length();j++){
               
                if(s.charAt(i)==s.charAt(j)){
                    curr= curr +1;
                }
            }
            if(curr>highest){
                highest = curr;
                answer = s.charAt(i);
            }
        }
        System.out.println(answer);
        System.out.println(highest);
    }
}