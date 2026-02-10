public class five {
    public static void main(String[] args) {
        String sentence = "I Love You";
        String[] words = sentence.split(" ");
        if(words.length>2){
            System.out.println(words[1].toUpperCase());
        } else{
            System.out.println("no second word.");
        }
    }
}
