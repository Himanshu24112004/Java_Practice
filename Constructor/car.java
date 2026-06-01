 class Innercar {
    String brand;
    int Price ;

     Innercar(String n , int p){
        brand = n;
        Price = p;
     }

    void display(){
        System.out.println("Brand :"+ brand);
        System.out.println("Price : "+Price);
    }
    
}
public class car {
    public static void main(String[] args) {
        Innercar c= new Innercar(" BMW M5" , 500000000);
        c.display();
    }
}
