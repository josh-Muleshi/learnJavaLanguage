package intereface;

import javax.swing.*;
import java.awt.*;

public class Exmple0 extends JFrame {

    private static final long serialVersionUID = -5488220951900494888L;

    private JButton btnClickMe = new JButton("Click Me");
    private JButton btnPushMe = new JButton("Click Me");
    private JButton btnActivateMe = new JButton("Click Me");

    public Exmple0() {
        super("Implementation d'Interface");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout( new FlowLayout());

        contentPane.add( btnClickMe);
        contentPane.add(btnPushMe);
        contentPane.add(btnActivateMe);

        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Exmple0();
    }
}
