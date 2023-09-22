package Assignment6.interfaces;

public interface Playable {
    void play();

    default void playerId() {
        System.out.println("print user ID");
        playerName();
    }

    static int groundArea(int length){
        return (length*length);
    }

    private void playerName(){
        System.out.println("print player name");
    }
}
