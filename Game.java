/*****************************************
 * A template for a Nim game
 ****************************************/ 
/* Tesfalem Eshetu
  * te2320
  * Computer.java
  * will simulate computer player in the game
 */
import java.util.Random;
import java.util.Scanner;
public class Game{
    
    //declaring instance varibales

    private int marbles;
    private Human humanPlayer;
    private Computer computerPlayer;
    private boolean turn;
    private Random random;
    private Scanner input;
   
//Using the constructors to intialize 
    public Game(int difficulty){
        random = new Random();
        input = new Scanner(System.in);
        computerPlayer = new Computer(difficulty);
        humanPlayer = new Human();
        
        
    }
     
  public void play(){ 
        //random marble generator for every round
        marbles = random.nextInt(91)+10;
       
        //turn = random.nextInt(2) == 1 ? true:false;
        //true correspondes to computer while false to human
        if (random.nextInt(2) == 1) {
                turn = true;
            }

            else {
                turn = false;
            }


        System.out.println(marbles +" " + "are randomly choosen");
            
            // start playing the game
        while(marbles > 1){

            //here we will use the turn boolean
            if(turn){
                System.out.println("computer took turn. ");
                computerPlayer.move(marbles);

                System.out.println("Computer removes  "  + computerPlayer.getChoice());
                //computaion of marbles left 
                marbles = marbles - computerPlayer.getChoice();
                System.out.println("marbles left " + marbles);

            } else {
        System.out.println("human turn,choose number of marbles to take. ");
               humanPlayer.move();
               marbles = marbles - humanPlayer.getChoice();

            }
            //switch the turn of the players
            turn =! turn;
            
        } 
        if (turn ){
            System.out.println("Human won");
        } else{
            System.out.println("computer won");
        }
        //if turn is true human will win the game 
          // else if false the computer will win
        
       
    }
    

}