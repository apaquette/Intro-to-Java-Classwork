
import javax.swing.JFrame;

/**
 * TextFieldDemo
 * @author <a href="mailto:alexandre.d.paquette@gmail.com">Alexandre Paquette</a>
 * @version Apr 1, 2022
 */

public class TextFieldDemo{

    /**
     * Executable method to start the program
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TextFrame app = new TextFrame("TextField demo");
        app.setSize(400, 100);
        app.setLocation(800,400); //specify position on screen
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

}
