package Assignment6.interfaces;

public class FootBall implements Playable{
    @Override
    public void play() {
        System.out.println("I play football");
    }

    public static void main(String[] args) {
        System.out.println(Playable.groundArea(10));
        Playable playable = new FootBall();
        playable.play();
        playable.playerId();
    }
}
