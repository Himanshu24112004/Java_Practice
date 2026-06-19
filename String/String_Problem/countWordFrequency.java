public class countWordFrequency {
    public static void main(String[] args) {
        String sentence = "java is great and java is fun";
        String[] words = sentence.split(" ");

        String[] uniqueWords = new String[words.length];
        int[] count = new int[word.length];
        int size = 0;

        for(int i=0; i<words.length; i++){
            boolean found = false;

            for(int j=0; j<size; j++){
                if(uniqueWords[j].equals(words[i])){
                    count[j]++;
                    found = true;
                    break;
                }
            }
            if(!found){
                uniqueWords[size]=words[i];
                count[size]++;
                size++;
            }
        }
        System.out.println("{");
        for(int i=0; i<size; i++){
            System.out.println(uniqueWords[i]+"="+count[i]);
            if(i<size-1){
                System.out.println(",");
            }
        }
        System.out.println("}");
    }
}
