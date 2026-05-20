class Movie{
    private String title;
    private String director;
    private int duration;

    public void setTitle(String title){
        this.title = title;
    }

    public void setDirector(String director){
        this.director = director;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public String getTitle(){
        return title;
    }

    public String getDirector(){
        return director;
    }

    public int getDuration(){
        return duration;
    }

    public String getMovieDetails(){
            return "Movie: "+ title + 
            "\nDirector: "+ director +
            "\nDuration: "+duration+ " minutes";
    }
}
public class encap13 {
    public static void main(String[] args) {
        Movie m =new Movie();
        m.setTitle("Dhurandhar : The Revenge");
        m.setDirector("Aditya Dhar");
        m.setDuration(180);
        System.out.println(m.getTitle());
        System.out.println(m.getDirector());
        m.getDuration();
        System.out.println(m.getMovieDetails());
    }
}
