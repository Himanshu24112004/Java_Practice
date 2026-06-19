class Sports{
    void play(){
        System.out.println("Playing Sports..");
    }
}
class Football extends Sports{
    void play(){
        System.out.println("Playing Football");
    }
}
Class BasketBall extends Sports{
    void play(){
        System.out.println("Playing BasketBall");
    }
}
Class Rugby extends Sports{
    void play(){
        System.out.println("Playing Rugby");
    }
}
public class inherit5 {
    public static void main(String[] args) {
      Sports  s1 = new Football();
      Sports s2 = new BasketBall();
      Sports s3 = new Rugby();
      
      s1.play();
      s2.play();
      s3.play();
    }
}
