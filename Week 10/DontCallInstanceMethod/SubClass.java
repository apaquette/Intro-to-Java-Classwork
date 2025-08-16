
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alexa
 */
public class SubClass extends SuperClass{
    public SubClass(){
        super();
        name = "Jim";
    }
    public void method1(){
        JOptionPane.showMessageDialog(null, "From the subclass", "SUBCLASS", 0);
        System.out.println(name);
    }
}
