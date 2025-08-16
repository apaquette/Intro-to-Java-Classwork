
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alexa
 */
public class SuperClass {
    public String name;
    
    public SuperClass(){
        method1();
    }
    
    public void method1(){
        name = "Jim";
        JOptionPane.showMessageDialog(null, "From the superclass", "SUPERCLASS", 0);
        System.out.println(name);
    }
}
