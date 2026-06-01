class House{
    String loc;
    int price ;

    House(String l, int p){
        price = p;
        loc = l;
    }
    void display(){
        System.out.println("Location : "+loc);
        System.out.println("Price : "+price);
    }
}
public class house23 {
    public static void main(String[] args) {
        House  h = new House("Indravati Nagar", 1246656532);
        h.display();
        
    }
    
}
