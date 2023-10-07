/*****************************************
 * A template for a computer Nim player
 ****************************************/ 
 /* Tesfalem Eshetu
  * te2320
  * Computer.java
  * will simulate computer player in the game
 */
import java.util.Random;
public class Computer{
    // declaring instance varibales 
    private int mode;
    private int choice;
    private int[] smartpool = {3, 7, 15 , 31, 63};
    private Random random;
    
    //instantiate the instance varibales
    public Computer(int m){
        random =new Random();
        mode = m;
        choice = -1;
    }
    
    // a method call to move the computer player 
    public void move(int marblesLeft){
        if (mode == 2 ){
            // check if marbles are in the smartpool possible
            // if then generate a random choice 
            //if not , choose from the smartpool
            for(int i: smartpool){
                if(i == marblesLeft){
                    choice = random.nextInt(marblesLeft/2) +1;
                    marblesLeft = marblesLeft - choice;
                    break;
                }
        //marbleLeft shoukld be half and more
                if (i >marblesLeft/2 && i < marblesLeft){

                    //choose a number form the smartpool
                     choice = marblesLeft -i;
                     marblesLeft = i;
                }
            }
        } else if (mode == 1) {
            // this is stupid mode
            // generate a random munber 
             choice = random.nextInt(marblesLeft/2) +1;
             marblesLeft = marblesLeft - choice;

        }
        
        }
    
    
    
    public int getChoice(){
        return choice;
    }
    
 }
