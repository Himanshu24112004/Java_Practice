package String.String_Method;

public class toCharArrayMethod2 {
    public static void main(String[] args) {
        String text = "Hello World";
        char[] chars = text.toLowerCase().toCharArray();
        int vowels = 0;
        for(char c : chars){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    vowels++;
            }
        }
        System.out.println("Vowels : "+vowels);
    }
}
