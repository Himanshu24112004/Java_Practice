public class stringCaseTrim {
    public static void main(String[] args) {
        String messy = " HeLLo WoRLd ";

        System.out.println("Original: ["+messy+"]");
        System.out.println("Upper: "+messy.toUpperCase());
        System.out.println("Lower: "+messy.toLowerCase());
        System.out.println("Trim: ["+messy.trim()+"]");
    }
}
