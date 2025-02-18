import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class basketballTest {

    @Test
    void shootBallSuccess(){
        basketball test = new basketball();
        assertTrue(test.shootBall(10));
    }

    @Test
    void shootBallFail() {
        basketball test = new basketball();
        assertFalse(test.shootBall(0));
    }

    @Test
    void shootBallFiftyFifty(){
        int success = 0;
        basketball test = new basketball();
        for(int i = 0; i<=1000; i++)
        {
            if(test.shootBall(5))
            {
                success++;
            }
        }
        assertTrue(success >= 475 && success <=525);
    }

    @Test
    void shootBallThreeSeven(){
        int success = 0;
        basketball test = new basketball();
        for(int i = 0; i<=1000; i++)
        {
            if(test.shootBall(3))
            {
                success++;
            }
        }
        assertTrue(success >= 275 && success <=325);
    }
    @Test
    void shootBallTwoEight(){
        int success = 0;
        basketball test = new basketball();
        for(int i = 0; i<=1000; i++)
        {
            if(test.shootBall(2))
            {
                success++;
            }
        }
        assertTrue(success >= 175 && success <=225);
    }
    @Test
    void shootBallSixFour(){
        int success = 0;
        basketball test = new basketball();
        for(int i = 0; i<=1000; i++)
        {
            if(test.shootBall(6))
            {
                success++;
            }
        }
        assertTrue(success >= 575 && success <=625);
    }

    @Test
    void levelUpYes() {
        basketball test = new basketball("ah", 3);
        assertTrue(test.levelUp(100) == 4);
    }

    @Test
    void levelUpNo() {
        basketball test = new basketball("ah", 3);
        assertEquals(4, test.levelUp(1));
    }

    @Test
    void LoseToLeBron()
    {
        basketball test = new basketball("The worst",1);
        assertTrue(test.faceOffLeBron().matches("lose:\\s[0-2]-([8-9]|10)"));
    }
    @Test
    void BeatOrTieLeBron()
    {

        basketball test = new basketball("The best",10);
        assertTrue(test.faceOffLeBron().matches("(win|tie):\\s([8-9]|10)-([8-9]|10)"));
    }
//im abpout gto genuiinely tweak i have to like redo this whole thign QHAT WHYU AHHHGHHSDSKL SAVE MEEEEE
    @Test
    void BballStatsLessThanTen()
    {
        basketball test = new basketball("Aub", 3);
        assertTrue(test.BballStats(2).matches("[A-Z][a-z]+\\s-\\splayer\\sid:[A-Z]{2}[0-9]{4}\\s-\\sshots\\smade:[0-9]+\\s-\\spts:0{2}[0-9]\\s-\\slvl:([0-9]|10)\\s-\\sshots\\sneeded\\sto\\slevel\\sup:[0-9]+\\s-\\swins\\sagainst\\sLeBron:[0-9]+"));
    }

    @Test
    void BballStatsLessThan100()
    {
        basketball test = new basketball("Darwin", 4);
        assertTrue(test.BballStats(42).matches("[A-Z][a-z]+ - player id:[A-Z]{2}[0-9]{4} - shots made:[0-9]+ - pts:0[0-9]{2} - lvl:([0-9]|10) - shots needed to level up:[0-9]+ - wins against LeBron:[0-9]+"));
    }

    @Test
    void BballStatsGreaterThan100()
    {
        basketball test = new basketball("Caleb", 5);
        assertTrue(test.BballStats(76).matches("[A-Z][a-z]+ - player id:[A-Z]{2}[0-9]{4} - shots made:[0-9]+ - pts:[1-2][0-9]{2} - lvl:([0-9]|10) - shots needed to level up:[0-9]+ - wins against LeBron:[0-9]+"));
    }

    //string of numbers :(
    @Test
    void playerIdMoreThanOne()
    {
        basketball test = new basketball("Aub",4);
        assertTrue(test.getPlayerID().matches("[A-Z]{2}[0-9]{4}"));
    }

    @Test
    void playerIdOne()
    {
        basketball test = new basketball("A", 3);
        assertTrue(test.getPlayerID().matches("[A-Z][0-9]{4}"));
    }

    @Test
    void playerIdSupposedly()
    {

    }

}