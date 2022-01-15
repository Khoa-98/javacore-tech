import java.util.ArrayList;
import java.util.Random;

public class Team {

    public ArrayList<Player> getAllPlayer(){
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(23, "Nguyễn Văn Toản", Position.GK) );
        players.add(new Player(4, "Bùi Tiến Dũng", Position.DF) );
        players.add(new Player(2, "Đỗ Duy Mạnh", Position.DF) );
        players.add(new Player(13, "Hồ Tấn Tài", Position.DF) );
        players.add(new Player(3, "Quế Ngọc Hải", Position.DF) );
        players.add(new Player(19, "Nguyễn Quang HẢi", Position.MF) );
        players.add(new Player(20, "Phan Văn Đức", Position.MF) );
        players.add(new Player(15, "Tony Kroos", Position.MF) );
        players.add(new Player(11, "Luka Modric", Position.MF) );
        players.add(new Player(11, "Nguyễn Tuấn Anh", Position.MF) );
        players.add(new Player(9, "Nguyễn Văn Toàn", Position.FW) );
        players.add(new Player(22, "Nguyễn Tiến Linh", Position.FW) );
        players.add(new Player(10, "Nguyễn Công Phượng", Position.FW) );
        players.add(new Player(7, "Ronaldo", Position.FW) );

        return players;
    }

    public void show(ArrayList<Player> players){
        for (Player p: players){
            System.out.println(p);
        }
    }

    public ArrayList<Player> buildTeam(int df, int mf, int fw, ArrayList<Player> allPlayer){
        ArrayList<Player> choiceTeam = new ArrayList<>();

        int teamNumer = allPlayer.size();

        Random random = new Random();

        int gkNumber = 0;
        int dfNumber = 0;
        int mfNumber = 0;
        int fwNumber = 0;


        //Chọn thủ môn:
        while (gkNumber < 1){
            int gkRandom = random.nextInt(teamNumer);
            if(allPlayer.get(gkRandom).getPosition()== Position.GK){
                Player choicePlayer = allPlayer.get(gkRandom);
                choiceTeam.add(choicePlayer);
                gkNumber++;
            }
        }


        //chọn hậu vệ
        while (dfNumber< df){
            int dfRandom = random.nextInt(teamNumer);
            if(allPlayer.get(dfRandom).getPosition() == Position.DF){ //Kiểm tra vị trí có chính xác không
                if(!choiceTeam.contains(allPlayer.get(dfRandom))){    //Kiểm tra cầu thủ đó đã có trong đội chưa
                    choiceTeam.add(allPlayer.get(dfRandom));          // Thêm vào đội
                    dfNumber++;
                }
            }
        }

        //chọn tiền vệ
        while (mfNumber < mf){
            int mfRandom = random.nextInt(teamNumer);
            if(allPlayer.get(mfRandom).getPosition() == Position.MF)
            {
                if(!choiceTeam.contains(allPlayer.get(mfRandom)))
                {
                    choiceTeam.add(allPlayer.get(mfRandom));
                    mfNumber++;
                }
            }
        }

        //chọn tiền đạo
        while (fwNumber < fw){
            int fwRandom = random.nextInt(teamNumer);
            if(allPlayer.get(fwRandom).getPosition() == Position.FW){
                if(!choiceTeam.contains(allPlayer.get(fwRandom))){
                    choiceTeam.add(allPlayer.get(fwRandom));
                    fwNumber++;
                }
            }
        }
        return choiceTeam;
    }


}
