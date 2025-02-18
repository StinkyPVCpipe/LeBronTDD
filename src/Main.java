//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random ran = new Random();

       System.out.println("Hey you! My name is Bo Jackson. And though Im not a star in basketball, I am a star in sports" +
               "\nAnd I am here to train you. " +
               "\nYou beautiful aspiring basketball player, going for the likes of" +
               "\nfamous basketballer LeBron James? Well you're gonna need to work for it!" +
               "\n\nEnter 'S' to shoot a ball, the more succesful shots you make, the more your" +
               "\nlevel will increase, and as will your chances!" +
               "\nenter 'L' to face off LeBron!" +
               "\nenter 'stats' to view your stats ^_^" +
               "\nenter 'end' in order to stop playing :3");

       Scanner scan = new Scanner(System.in);
       String input;
       System.out.println("Please enter your name");
       input = scan.nextLine();
       basketball player = new basketball(input, 1);
       System.out.println(player.BballStats(player.getShotsMade()));

        while(!(input.equals("end")))
       {
           input = scan.nextLine();
           if(input.equals("S"))
           {
             if(player.shootBall(player.getLvl()))
             {
                 System.out.println("You made the ball in! :D");
                 player.levelUp(player.getShotsMade());
             }
             else{
                 System.out.println("You did not make the ball in :(");
             } //screams into pillow
           }
           if (input.equals("L"))
           {
               System.out.println(player.faceOffLeBron());
           }
           if(input.equals("stats"))
           {
               System.out.println(player.BballStats(player.getShotsMade()));
           }
       }
        System.out.println("Thanks for playing :3 here are your final stats \n"+ player.BballStats(player.getShotsMade()));
/*
       basketball me = new basketball("aub",10);

       System.out.println(me.faceOffLeBron());
       System.out.println(me.getPlayerID());
       System.out.println(me.BballStats(3));
        System.out.println(me.BballStats(42));
        System.out.println(me.BballStats(76));
*/


    }
}