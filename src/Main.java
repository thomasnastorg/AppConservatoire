import View.Home;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Home ui = new Home();
        JPanel root = ui.getRootPanel();
        JFrame frame = new JFrame("Banque");
        frame.setContentPane(root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1000,500 ));
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
