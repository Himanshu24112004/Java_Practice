class dog{
    String  name ;
    String breed;

    void dispaly(){
        System.out.println("Name : "+ name);
        System.out.println("Breed : "+breed);
    }
}
public class dogInformation {
    public static void main(String[] args) {
        dog d1= new dog();
        d1.name="Tommy";
        d1.breed="German Shepherd";
        d1.dispaly();
    }
}
