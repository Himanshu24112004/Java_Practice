public class reverseString {
    public static void main(String[] args) {
        String org = "Programming";
        String reversed = "";

        for(int i= org.length()-1; i>=0; i--){
            reversed += org.charAt(i);
        }

        System.out.println("Reversed String :" + reversed);

        StringBuilder  sb = new StringBuilder(org);
        System.out.println("Using SB: "+sb.reverse());
    }
}
