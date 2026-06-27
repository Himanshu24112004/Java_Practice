import java.util.Scanner;

public class count {

    static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)>= 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int vow =0, con=0, dig=0, spe=0;

        for(char c : s.toCharArray()){
            if(c==' '){
                continue;
            }
            else if(Character.isDigit(c)){
                dig++;
            }
            else if(isVowel(c)){
                vow++;
            }
            else if(Character.isLetter(c)){
                con++;
            }
            else{
                spe++;
            }
        }
        System.out.println(vow+" "+con+" "+dig+" "+spe);

        sc.close();
    }
}
