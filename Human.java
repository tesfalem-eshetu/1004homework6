/*****************************************
 * A template for a Human Nim player
 ****************************************/ 
 /* Tesfalem Eshetu
  * te2320
  * Computer.java
  * will simulate human player in the game
 */
import java.util.Scanner;

public class Human{
   
    private int choice;
    private Scanner input;
    
    public Human(){
        input=new Scanner(System.in);
        choice = -1;
    }
    
    public void move(){
        //will collect input from the human player 
        choice = input.nextInt();
    
        // your code here
        
    }
    
    
    public int getChoice(){
        return choice;
    }
    
    
}
