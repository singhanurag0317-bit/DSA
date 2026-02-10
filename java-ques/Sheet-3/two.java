

public class two {
    public static void main(String[] args) {
        
    
    String s = "ronak";
    String value ="";

    for(int i = 0; i<s.length(); i++){
        char ch = Character.toLowerCase(s.charAt(i));
        value = value + (ch - 'a' + 1);
    
    }
    System.out.println(value);
}
}
