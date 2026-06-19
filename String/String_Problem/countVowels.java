public class countVowels {
    public static void main(String[] args) {
        String text = "Hello World".toLowerCase();
        int vowels =0, consonant = 0;

        for(int i=0; i<text.length();i++){
            char c = text.charAt(i);
            if(ch>='a'&&ch<='z'){
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowels++;
            }
            else{
                consonant++;
            }
          }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonant: "+consonant);
    }
}
