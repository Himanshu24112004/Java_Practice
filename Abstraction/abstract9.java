abstract class Instrument {
    protected String name;

    public Instrument(String name) {
        this.name = name;
    }

    abstract void play();
    abstract void tune();
} 
class Glockenspiel extends Instrument {
    public Glockenspiel(String name) {
        super("Glockenspiel");
    }

    void play() {
        System.out.println(name + " (Glockenspiel) is played by striking the metal bars with mallets.");
    }

    void tune() {
        System.out.println(name + " (Glockenspiel) is tuned by adjusting the length of the metal bars.");
    }
}
class Violin extends Instrument {
    public Violin(String name) {
        super("Violin");
    }

    void play() {
        System.out.println(name + " (Violin) is played by drawing a bow across the strings or plucking them with fingers.");
    }

    void tune() {
        System.out.println(name + " (Violin) is tuned by adjusting the tension of the strings using tuning pegs.");
    }
}
public class abstract9 {
    public static void main(String[] args) {
        Instrument glockenspiel = new Glockenspiel("Glockenspiel");
        Instrument violin = new Violin("Violin");

        System.out.println("Glockenspiel:");
        glockenspiel.play();
        glockenspiel.tune();

        System.out.println("\nViolin:");
        violin.play();
        violin.tune();
    }
    
}
