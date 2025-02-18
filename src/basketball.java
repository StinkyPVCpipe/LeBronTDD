import java.util.Random;
public class basketball
{
    //uh idk stats for players ig
    String name;
    int lvl;
    int quota;
    int shotsMade;
    int leBronWins;
    String playerID;

    public basketball()
    {
        name = "none";
        lvl = 5;
        quota = lvl*2;
        shotsMade = 0;
        leBronWins = 0;
        playerID = getPlayerID();
    }

    public basketball(String name, int lvl)
    {
        this.name = name;
        this.lvl = lvl;
        quota = 1;
        shotsMade = 0;
        leBronWins = 0;
        playerID = getPlayerID();
    }

    public String getName()
    {
        return name;
    }

    public int getShotsMade()
    {
      return shotsMade;
    }

    public int getLvl()
    {
        return lvl;
    }

    //standard stuff uh idk man

    public boolean shootBall(int lvl)
    {
        Random ran = new Random();
        //weighted probabilyt, and having a higher level increases the chances
        if (ran.nextDouble() <= lvl*.1 )
        {
            shotsMade++;
            //levelUp(shotsMade);
            return true;
        }
        return false;
    }

    public String getPlayerID()
    {
        playerID = "";
        Random ran = new Random();
        double num;
        String str;
        if (name.length()>1)
        {
            str = name.substring(0,2).toUpperCase();
           playerID = playerID.concat(str);
        }
        else
        {
            playerID = playerID.concat(name.toUpperCase());
        }
        for(int i = 0; i<4; i++)
        {
            num = ran.nextDouble()*9;
            str = Double.toString(num);
            playerID = playerID.concat(str.substring(0,1));
        }
        return playerID;
    }

    public int levelUp(int shotsMade)
    {
        if (shotsMade >= quota && lvl<=10)
        {
            lvl++;
            quota = quota*2;
            System.out.println("congrats! You are now level " + lvl);
        }
        return lvl;
    }

    public String faceOffLeBron()
    {
        Random ran = new Random();
        int playerScore = 0;
        int leBronScore = 0;

        for(int i = 0; i<10; i++)
        {
            if (ran.nextDouble()*1000 <= lvl*107){
                playerScore++;
            }
            if(ran.nextDouble()*100 <= 99){
                leBronScore++;
            }
        }
        if(leBronScore > playerScore)
        {
            return "lose: " + playerScore + "-" + leBronScore;
        }
        if(leBronScore == playerScore) {
            return "tie: " + playerScore + "-" + leBronScore;
        }
            leBronWins++;
            shotsMade+=10;
            return "win: " + playerScore + "-" + leBronScore;

        //return win/lose ur score - lebron score
    }

    public String BballStats(int shotsMade)
    {
        int meow = shotsMade*2;
        String numm = Integer.toString(meow);
        String num = "";
        if (shotsMade*2 < 10)
        {
            num = num.concat("00" + numm);
        }
        else if (shotsMade*2<100)
        {
            num = num.concat("0" + numm);
        }
        else
        {
            num = numm;
        }

        String output = name + " - player id:" + playerID + " - shots made:" + shotsMade + " - pts:" + num + " - lvl:"
                + lvl + " - shots needed to level up:" + (quota-shotsMade) + " - wins against LeBron:" + leBronWins;
        return output;
    }
}
