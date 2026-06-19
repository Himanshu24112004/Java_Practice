public class stringConcatenation {
    public static void main(String[] args) {
        String first = "Java";
        String second = "Programming";

        String res1 = first+" "+second;

        String res2 = first.concat(" ").concat(second);
        
        StringBuilder sb = new StringBuilder();
        sb.append(first).append(" ").append(second);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(sb.toString());
    }
}
