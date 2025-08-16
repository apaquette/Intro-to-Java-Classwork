/**
 * Exercise_7_18
 * @author Alexandre Paquette
 * @version Feb 18, 2022
 */

import java.security.SecureRandom;

public class Exercise_7_18{
    //Below code taken from Fig. 6.8
    private static final SecureRandom randomNumbers = new SecureRandom();
    
    // enum type with constants that represent the game status
   private enum Status {CONTINUE, WON, LOST};    
    
    // roll dice, calculate sum and display results
   public static int rollDice() {
      // pick random die values
      int die1 = 1 + randomNumbers.nextInt(6); // first die roll
      int die2 = 1 + randomNumbers.nextInt(6); // second die roll

      int sum = die1 + die2; // sum of die values

      return sum; 
   }
   
   //count wins and losses based on game status
   public static void recordGame(int resultsArray[][], Status gameStatus, int rollCount){
       if(rollCount > 19){//max out at 20 games (0 to 19)
           rollCount = 19;
       }
       if(gameStatus == Status.WON){//increment wins
           resultsArray[rollCount][0]++;
       }else{//increment losses
           resultsArray[rollCount][1]++;
       }
   }
   
   //display results of an array with wins and losses
   public static void processResults(int resultsArray[][]){
      int totalWon = 0, totalLost = 0;
      System.out.println("Final Results");
      System.out.println("~~~~~~~~~~~~~~");
      System.out.printf("%n%5s%12s%12s%n", "Roll", "WON", "LOST");
      for(int x = 0; x < resultsArray.length; x++){
          totalWon += resultsArray[x][0];
          totalLost += resultsArray[x][1];
          System.out.printf("%2d%15d%12d%n", x+1, resultsArray[x][0], resultsArray[x][1]);
      }
      
      System.out.printf("%nTotal Won: %d%n", totalWon);
      System.out.printf("Total Lost: %d%n", totalLost);
      System.out.printf("Win Percent: %f%%%n", (double)totalWon/(totalWon + totalLost));
   }
   
   // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;      
    private static final int SEVEN = 7;     
    private static final int YO_LEVEN = 11; 
    private static final int BOX_CARS = 12; 
   
    /**
     * Executable method to start the program
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int myPoint = 0; // point if no win or loss on first roll
      Status gameStatus; // can contain CONTINUE, WON or LOST
      int results[][] = new int[20][2];
      final int GAME_NUMS = 1000000;
      
      for(int x = 0; x < GAME_NUMS; x++){
        int rolls = 0;
        int sumOfDice = rollDice(); // first roll of the dice
          
        // determine game status and point based on first roll 
        switch (sumOfDice) {
           case SEVEN: // win with 7 on first roll    
           case YO_LEVEN: // win with 11 on first roll
              gameStatus = Status.WON;
              recordGame(results, gameStatus, rolls);
              //results[rolls][0]++;
              break;
           case SNAKE_EYES: // lose with 2 on first roll
           case TREY: // lose with 3 on first roll      
           case BOX_CARS: // lose with 12 on first roll 
              gameStatus = Status.LOST;
              recordGame(results, gameStatus, rolls);
              //results[rolls][1]++;
              break;
           default: // did not win or lose, so remember point  
              gameStatus = Status.CONTINUE; // game is not over
              myPoint = sumOfDice; // remember the point
              break; 
        }
        
        // while game is not complete
        while (gameStatus == Status.CONTINUE) { // not WON or LOST
            //if(rolls != 19){
                rolls++;
            //
            sumOfDice = rollDice(); // roll dice again

            // determine game status
            if (sumOfDice == myPoint) { // win by making point
               gameStatus = Status.WON;
               recordGame(results, gameStatus, rolls);
               //results[rolls][0]++;
            } 
            else {
               if (sumOfDice == SEVEN) { // lose by rolling 7 before point
                  gameStatus = Status.LOST;
                  recordGame(results, gameStatus, rolls);
                  //results[rolls][1]++;
               }
            }
        }//end while loop
      }//end for loop
      
      processResults(results);
    }//end main
    
    
}//end exercise_7_18 class
