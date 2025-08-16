
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author alexa
 */
public class CalcFrame extends JFrame{
    private JTextField data = new JTextField();
    private String names[] =    {"7", "8", "9", "/", 
                                "4", "5", "6", "*",
                                "1", "2", "3", "-",
                                "0", ".", "=", "+"};
    private JButton buttons[] = new JButton[16];
    private JPanel panCenter = new JPanel(new GridLayout(4, 0));
    
    public CalcFrame(){
        add(data, BorderLayout.NORTH);
        
        for(int i = 0; i < names.length; i++){
            buttons[i] = new JButton(names[i]);
            panCenter.add(buttons[i]);
        }
        add(panCenter, BorderLayout.CENTER);
    }
}
