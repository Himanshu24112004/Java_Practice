public class removeDuplicates {
    public static void main(String[] args) {
        String input = "Programming";
        String result ="";

        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(result.indexOf(c)== -1){
                result += c;
            }
        }
        System.out.println("Without Duplicates: "+result);
    }
}
