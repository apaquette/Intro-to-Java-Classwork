
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author alexa
 */
public class AlignFrame extends JFrame{
    //checkbox
    private JCheckBox chkSnap =  new JCheckBox("Snap to Grid");
    private JCheckBox chkShow = new JCheckBox("Show Grid");
    
    //labels
    private JLabel lblX = new JLabel("X");
    private JLabel lblY = new JLabel("Y");
    
    //text fields
    private JTextField txtX = new JTextField(4);
    private JTextField txtY = new JTextField(4);
    
    //buttons
    private JButton btnOK = new JButton("OK");
    private JButton btnCancel = new JButton("Cancel");
    private JButton btnHelp = new JButton("Help");
    
    public AlignFrame() {
        JPanel panEast = new JPanel(new GridLayout(3, 0, 10, 10));
        panEast.add(btnOK);
        panEast.add(btnCancel);
        panEast.add(btnHelp);

        Box bxWest = Box.createVerticalBox();
        bxWest.add(Box.createGlue());
        bxWest.add(chkSnap);
        bxWest.add(chkShow);
        bxWest.add(Box.createGlue());
        
        JPanel panCenterX = new JPanel();
        panCenterX.add(lblX);
        panCenterX.add(txtX);
        
        JPanel panCenterY = new JPanel();
        panCenterY.add(lblY);
        panCenterY.add(txtY);
        
        Box bxCenter = Box.createVerticalBox();
        bxCenter.add(Box.createGlue());
        bxCenter.add(panCenterX);
        bxCenter.add(panCenterY);
        bxCenter.add(Box.createGlue());
        
        add(panEast, BorderLayout.EAST);
        add(bxWest, BorderLayout.WEST);
        add(bxCenter, BorderLayout.CENTER);
    }
}
