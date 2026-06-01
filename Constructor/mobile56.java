class Mobile{
    String brand ;
    String model;

    Mobile(String b, String m){
        brand= b;
        model= m;
    }
    void display(){
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
    }
}
public class mobile56 {
    public static void main(String[] args) {
        Mobile m = new  Mobile("Vivo", "T2x");
        m.display();
    }
}
