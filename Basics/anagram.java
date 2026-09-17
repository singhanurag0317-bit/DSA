public class anagram{
    public static void main(String [] args){
        String s1 = "listen";
        String s2 = "silent";
        boolean anagram = true;

        if(s1.length()!=s2.length()){
            anagram = false;
        }
        for(int i =0;i<s1.length();i++){
            char curr = s1.charAt(i);
            int freq1=0;
            int freq2=0;

            for(int j =0;j<s1.length();j++){
                if(s1.charAt(j)==curr){
                    freq1= freq1+1;
                }
            }

            for(int j =0;j<s2.length();j++){
                if(s2.charAt(j)==curr){
                    freq2= freq2+1;
                }
            }
            if(freq1!=freq2){
                anagram = false;
                break;
            }
        }
        System.out.println(anagram);
    }
}