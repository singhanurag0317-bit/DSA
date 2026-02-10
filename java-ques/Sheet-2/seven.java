
public class seven {
    public static void main(String[] args) {
    String s = "abcd";
    int weight = 0;
    for(int i =0; i<s.length(); i++){
        char ch = Character.toLowerCase(s.charAt(i));
        if(ch>='a'&& ch<='z'){
            weight= weight+(ch-'a'+1);
        }
    }
    System.out.println(weight);
    }
}
