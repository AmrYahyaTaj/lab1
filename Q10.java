/**
 * Created by learn on 03/10/22.
 */
import javax.swing.*;
public class Q10 {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("What is your name?");
        System.out.print("Hello ");
        System.out.println(name);
        JOptionPane.showInputDialog("My name is Amr!What would you like me to do?");
        JOptionPane.showMessageDialog(null,"I am sorry "+name+",I am not sure if i can  do that.");

    }
}
