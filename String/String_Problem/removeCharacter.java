public class removeCharacter {
    public static void main(String[] args) {
        String text = "Hello World";
        char toRemove = 'l';
        String res = "";

        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)!=toRemove){
                res += text.charAt(i);
            }
        }
        System.out.println("After Removing '"+toRemove+"':"+res);
    }
}
