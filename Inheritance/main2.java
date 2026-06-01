 class grandFather {
    void anger(){
        System.out.println("Anger Issue");
    }    
}

class  Father extends grandFather{
    void hard(){
        System.out.println("Hard Working");
    }
} 

class me extends Father{
    void smart(){
        System.out.println("Smart");
    }
}
public class main2 {
    public static void main(String[] args) {
        me m =new me();
        m.anger();
        m.hard();
        m.smart();
    }
}
