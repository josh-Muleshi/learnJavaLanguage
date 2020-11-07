package intereface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Exmple1 extends JFrame implements ActionListener {

    private JButton btnClickMe = new JButton("Click Me");
    private JButton btnPushMe = new JButton("Click Me");
    private JButton btnActivateMe = new JButton("Click Me");

    public Exmple1() {
        super("Implementation d'Interface");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout( new FlowLayout());

        contentPane.add(btnClickMe);
        contentPane.add(btnPushMe);
        contentPane.add(btnActivateMe);

        btnClickMe.addActionListener(this);

        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Exmple1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button \"Click Me\" Clicked ");
    }
}

