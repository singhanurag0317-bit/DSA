public class ten {
    public static void main(String[] args) {
        String s = "ronak";
        String code ="";
        for(int i = 1; i<s.length(); i++){
            char ch = Character.toLowerCase(s.charAt(i));
            code = code + (ch - 'a'+1);
        }
        System.out.println(code);
    }
}
