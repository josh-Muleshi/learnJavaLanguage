package intereface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnClickMeListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Exmple2 btn = new Exmple2();
        btn.setTitle("Click Me");
    }
}
