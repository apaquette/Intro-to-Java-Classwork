/**
 * Example
 * @author alexa
 * @version Feb 17, 2022
 */

public class Example{

    /**
     * Executable method to start the program
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        method1(42, 13, 14, 99, -1);
        
        method1(42, 100, 101);
        
        method1(42);
    }
    
    public static void method1(int a, int ... b){
        System.out.println(a);
        
        for(int num : b){
            System.out.printf("%d\t", num);
        }
        System.out.println();
    }

}
