class Desktop{
    private String brand;
    private String processor;
    private int ramSize;

    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public void setProcessor(String processor){
        this.processor = processor;
    }

    public void setRamSize(int  ramSize){
        this.ramSize = ramSize;
    }

    public String getBrand(){
        return brand;
    }

    public String getProcessor(){
        return processor;
    }
    
    public int getRamSize(){
        return ramSize;
    }

    public void upgradeRam(int extra){
        ramSize += extra;
    }
}
public class encap10 {
    public static void main(String[] args) {
        Desktop d = new Desktop();
        d.setBrand("Asus");
        d.setProcessor("i5 , H series");
        d.setRamSize(16);
        System.out.println(d.getBrand());
        System.out.println(d.getProcessor());
        System.out.println(d.getRamSize());
        d.upgradeRam(16);
        System.out.println(d.getRamSize());
    }
}
