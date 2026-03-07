class car {
    String brand;
    int year;

    void dispaly(){
        System.out.println("Brand : "+brand);
        System.out.println("Year : "+year);
    }
}
public class CarInformation {
    public static void main(String[] args) {
        car c1 =  new car();
        c1.brand ="Suzuki";
        c1.year = 2020;
        c1.dispaly();
    }
}
