package intereface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnClickMeListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        Exmple2 frame = (Exmple2) btn.getTopLevelAncestor();
        frame.setTitle("Click Me");
        frame.btnClickMe.setForeground(Color.cyan);
    }
}
