import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Team team = new Team();
        ArrayList<Player> allPlayer = team.getAllPlayer();
//        team.show(allPlayer);
        int df = 4;
        int fw = 2;
        int mf = 4;
        ArrayList<Player> choiceTeam = team.buildTeam(df, mf, fw,  allPlayer);
        team.show(choiceTeam);

    }
}
