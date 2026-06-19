public class capitalizeEachWord {
    public static void main(String[] args) {
        String sentence = "java programming language";
        String[] words = sentence.split(" ");
        String res ="";

        for(String word : words){
            res += Character.toUpperCase(word.charAt(0)) + word.substring(1) +" ";
        }
        System.out.println(res.trim());
    }
}
