
import java.security.SecureRandom;

/**
 * RandomNums
 * @author alexa
 * @version Feb 4, 2022
 */

public class RandomNums{

    /**
     * Executable method to start the program
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SecureRandom rando = new SecureRandom();
        
        for(int i = 1; i <= 20; i++){
            System.out.printf("%f     ", rando.nextDouble());
            if(i % 5 == 0){
                System.out.println();
            }
        }
    }

}
