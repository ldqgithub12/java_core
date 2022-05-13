package services;

import models.Player;
import models.Position;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class PlayerServices {
    private ArrayList<Player> players;
    private void init(){
        players = new ArrayList<>();
        // Các cầu thủ thuộc vị trí thủ môn
        players.add(new Player(1, "Bui Tan Truong", Position.GK));
        players.add(new Player(2, "Dang Van Lam", Position.GK));
        players.add(new Player(3, "Nguyen Van Hoang", Position.GK));
        players.add(new Player(4, "Quan Van Chuan", Position.GK));

        // Các cầu thủ thuộc vị trí hậu vệ
        players.add(new Player(5, "Do Duy Manh", Position.DF));
        players.add(new Player(6, "Nguyen Thanh Chung", Position.DF));
        players.add(new Player(7, "Tran Dinh Trong", Position.DF));
        players.add(new Player(8, "Nguyen Phong Hong Duy", Position.DF));
        players.add(new Player(9, "Vu Van Thanh", Position.DF));
        players.add(new Player(10, "Bui Tien Dung", Position.DF));
        players.add(new Player(11, "Que Ngoc Hai", Position.DF));
        players.add(new Player(12, "Ho Tan Tai", Position.DF));
        players.add(new Player(13, "Pham Xuan Manh", Position.DF));
        players.add(new Player(14, "Do Thanh Thinh", Position.DF));

        // Các cầu thủ thuộc vị trí tiền vệ
        players.add(new Player(15, "Nguyen Quang Hai", Position.MF));
        players.add(new Player(16, "Pham Duc Huy", Position.MF));
        players.add(new Player(17, "Luong Xuan Truong", Position.MF));
        players.add(new Player(18, "Nguyen Tuan Anh", Position.MF));
        players.add(new Player(19, "Tran Minh Vuong", Position.MF));
        players.add(new Player(20, "Phan Van Duc", Position.MF));
        players.add(new Player(21, "Nguyen Hoang Duc", Position.MF));
        players.add(new Player(22, "Ly Cong Hoang Anh", Position.MF));

        // Các cầu thủ thuộc vị trí tiền đạo
        players.add(new Player(23, "Pham Tuan Hai", Position.FW));
        players.add(new Player(24, "Nguyen Van Toan", Position.FW));
        players.add(new Player(25, "Nguyen Cong Phuong", Position.FW));
        players.add(new Player(26, "Ha Duc Chinh", Position.FW));
        players.add(new Player(27, "Nguyen Tien Linh", Position.FW));
    }

    public PlayerServices() {
        init();
    }
    private ArrayList<Player> getPlayers(Position position,int number){
        ArrayList<Player> psPlayer = new ArrayList<>();
        ArrayList<Player> rdPlayer = new ArrayList<>();
        for (Player pl:players
             ) {
            if(pl.getPosition().equals(position)){
                psPlayer.add(pl);
            }
        }
        Collections.shuffle(psPlayer);
        for(int i = 0; i<number;i++) {
            rdPlayer.add(psPlayer.get(i));
        }
        return rdPlayer;
    }
    public ArrayList<Player> getTeams(int numberOfGK, int numberOfDF, int numberOfMF, int numberOfFW){
        ArrayList<Player> team = new ArrayList<>();
        ArrayList<Player> GKs = this.getPlayers(Position.GK,numberOfGK);
        ArrayList<Player> DFs = this.getPlayers(Position.DF,numberOfDF);
        ArrayList<Player> MFs = this.getPlayers(Position.MF,numberOfMF);
        ArrayList<Player> FWs = this.getPlayers(Position.FW,numberOfFW);
        team.addAll(GKs);
        team.addAll(DFs);
        team.addAll(MFs);
        team.addAll(FWs);
        return  team;
    }
    public void printTeam(ArrayList<Player> team){
        for (Player pl:team
             ) {
            System.out.println(pl);
        }
    }
}
