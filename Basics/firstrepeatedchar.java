import java.util.Scanner;
public class firstrepeatedchar{
    public static void main(String [] args){
        String s = "programming";
        boolean found = false;
        for(int i =0;i<s.length();i++){
            for(int j =0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    found = true;
                    break;
                }
            }
            if(found){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}