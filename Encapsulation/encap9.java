class Smartphone{
    private String brand;
    private String model;
    private int storage;

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setStorage(int storage){
        this.storage = storage;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getStorage(){
        return storage;
    }


    public void increaseStorage(int extra){
        storage += extra;
    }
}
public class encap9 {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.setBrand("Vivo");
        s.setModel("T2x 5g");
        s.setStorage(8);
        System.out.println(s.getBrand());
        System.out.println(s.getModel());
        System.out.println(s.getStorage());
        s.increaseStorage(8);
        System.out.println(s.getStorage());
    }
}
