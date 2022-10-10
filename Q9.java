/**
 * Created by learn on 03/10/22.
 */
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.*;
public class Q9 {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        String age = JOptionPane.showInputDialog("Enter your age ");
        String number = JOptionPane.showInputDialog("Enter your phone number");

        System.out.print("Hello ");
        System.out.println(name);
        System.out.print("AGE :");
        System.out.println(age);
        System.out.print("number :");
        System.out.println(number);

    }

}
