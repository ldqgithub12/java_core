import models.Player;
import services.PlayerServices;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        PlayerServices playerServices = new PlayerServices();
        ArrayList<Player> team= playerServices.getTeams(1,4,4,2);
        playerServices.printTeam(team);
    }
}
