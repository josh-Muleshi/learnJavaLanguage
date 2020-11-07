package intereface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exmple5 extends JFrame {

    private static final long serialVersionUID = -5488220951900494888L;

    private JButton btnClickMe = new JButton("Click Me");
    private JButton btnPushMe = new JButton("Click Me");
    private JButton btnActivateMe = new JButton("Click Me");

    public Exmple5() {
        super("Implementation d'Interface");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout( new FlowLayout());

        contentPane.add( btnClickMe);
        contentPane.add(btnPushMe);
        contentPane.add(btnActivateMe);

        /*btnClickMe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClickMe.setText("btn");
                btnClickMe.setForeground(Color.cyan);
            }
        });*/

        //btnClickMe.addActionListener((e) -> System.out.println("ok"));
        /*btnClickMe.addActionListener((e) -> {
            System.out.println("ok");
        });*/
        //btnClickMe.addActionListener( e -> btnClickMeListener(e));
        btnClickMe.addActionListener(this::btnClickMeListener);


        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void btnClickMeListener(ActionEvent e) {
        System.out.println("ok");
    }

    public static void main(String[] args) {
        new Exmple5();
    }
}
