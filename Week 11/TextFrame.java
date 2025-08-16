
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author <a href="mailto:alexandre.d.paquette@gmail.com">Alexandre Paquette</a>
 * 
 */
public class TextFrame extends JFrame {

    //frame elements
    private JTextField txtName = new JTextField("type your name here"); //text field
    private JPasswordField passField = new JPasswordField(10);          //password field (like a text field but masked text input
    
    //buttons
    private JButton btnClickMe = new JButton("Click Me");
    private JButton btnClickMe2 = new JButton("Click Me 2");
    private JButton btnClickMe3 = new JButton("Click Me 3");
    private JButton btnDemoAnonClass = new JButton("Anon Handler");
    
    //handlers
    private TextHandler txtHandler = new TextHandler();
    private ButtonHandler btnHandler = new ButtonHandler();
    

    public TextFrame(String title) {
        super(title);

        setLayout(new FlowLayout());
        add(txtName);
        add(passField);
        add(btnClickMe);
        add(btnClickMe2);
        add(btnClickMe3);
        add(btnDemoAnonClass);
        addActionListeners();
    }

    private void addActionListeners() {
        txtName.addActionListener(txtHandler);
        passField.addActionListener(txtHandler);
        btnClickMe.addActionListener(btnHandler);
        btnClickMe2.addActionListener(new ButtonHandler2());
        btnClickMe3.addActionListener(new ButtonHandler3());
        btnClickMe3.addActionListener(btnHandler);
        
        btnDemoAnonClass.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Something");
            }
        });
    }
    
    //inner class
    private class TextHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == txtName) {// if textbox, do this
                System.out.println("Hello " + txtName.getText());
                JOptionPane.showMessageDialog(txtName, "Hello " + txtName.getText(),
                        "Hello Message", JOptionPane.INFORMATION_MESSAGE);
            } else if (e.getSource() == passField) {// if password field, do this
                JOptionPane.showMessageDialog(null, "Your password is " + passField.getText(),
                        "Hello Message", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    //inner class
    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(TextFrame.this, "Ouch!", "Clicked", JOptionPane.ERROR_MESSAGE);
            System.out.println(TextFrame.this.getClass().getName());
            if(txtName.isEditable()){
                txtName.setEditable(false);
                btnClickMe3.setEnabled(false);
            }else{
                txtName.setEditable(true);
                btnClickMe3.setEnabled(true);
            }
        }
    }
}

//outer class
class ButtonHandler2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Handler 2");
    }
    
}