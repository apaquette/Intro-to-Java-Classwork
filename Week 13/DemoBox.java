
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * DemoBox
 * @author alexa
 * @version Apr 14, 2022
 */

public class DemoBox extends JFrame{

    /**
     * Executable method to start the program
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DemoBox app = new DemoBox();
        app.setSize(500,500);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Box vbox = Box.createVerticalBox();
        Box hbox = Box.createHorizontalBox();
        
        app.add(vbox);
        vbox.add(Box.createVerticalGlue());
        
        for(int i=0; i<5; i++){
            vbox.add(new JButton("Button " + i));
            if(i==2){
                vbox.add(Box.createVerticalGlue());
            }
        }
        app.invalidate(); app.validate();
    }

}
