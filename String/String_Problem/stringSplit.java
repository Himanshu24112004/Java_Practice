public class stringSplit {
    public static void main(String[] args) {
        String csv  = "apple,banana,orange,grape";

        String[] fruits = csv.split(",");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        String sentence = "Java is fun to learn";
        String[] words = sentence.split(" ");
        System.out.println("Word count: "+words.length);
    }
}
