package Assignment6.nongeneric;

public class Play {
    public static void main(String[] args) {
        PlayFootball playFootball = new PlayFootball(10);
        System.out.println(playFootball.getPlayerID());

        PlayCricket playCricket = new PlayCricket(100.10);
        System.out.println(playCricket.getAdmissionCost());

        PlayHadudu playHadudu = new PlayHadudu("Jahid Hasan");
        System.out.println(playHadudu.getPlayerName());


    }
}
