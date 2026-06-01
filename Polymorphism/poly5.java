class Sports{
    void play(){
        System.out.println("Playing Sports!!");
    }
}

class BasketBall extends Sports{
    @Override
    void play(){
        System.out.println("Playing BasketBall!!");
    }
}

class Rugby extends Sports{
    @Override
    void play(){
        System.out.println("Playing Rugby!!");
    }
}
public class poly5 {
    public static void main(String[] args) {
        Sports s1 = new Sports();
        Sports s2 = new BasketBall();
        Sports s3 = new Rugby();

        s1.play();
        s2.play();
        s3.play();
    }
}
