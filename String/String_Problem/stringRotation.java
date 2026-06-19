public class stringRotation {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "deabc";

        boolean isRotation = (s1+s1).contains(s2) && s1.length()==s2.length();
        System.out.println("Is rotation : "+isRotation);
    }
}
