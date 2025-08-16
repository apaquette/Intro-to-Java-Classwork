/**
 * DemoStringCat
 * @author alexa
 * @version Feb 3, 2022
 */

public class DemoStringCat{

    /**
     * Executable method to start the program
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "one";
        String b = "one";
        String c = "o";
        
        System.out.printf("%b%n", a == b); // true
        System.out.printf("%b%n", a == c); // false
        
        String d = c + "ne";
        
        System.out.printf("%b%n", a == d); //false
        
        c+= "ne";
        System.out.printf("%b%n", a == c); //false
        
        System.out.printf("%b%n", a.equals(d)); //true
        System.out.printf("%b%n", a.equals(c)); //true
        
        String e = a;
        
        System.out.printf("%b%n", a == e); //true
        System.out.printf("%b%n", a.equals(e)); //true
    }

}
