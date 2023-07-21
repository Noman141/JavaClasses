package Java.Hierarchical.Inheritance;

public class Sports {
    public String stadium="Bangabandhu National Stadium";
    public String type;
    public String equipment;

    public Sports (){

    }

    public void play(){
        System.out.println("We play football is the "+stadium);
    }

    public static void main(String[] args) {



        Hadudu hadudu= new Hadudu();
        FootBall football= new FootBall();
        Cricket cricket= new Cricket();

        hadudu.playHadudu();
        football.playFootball();
        cricket.playCricket();

    }
}
