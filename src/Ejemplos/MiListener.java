package Ejemplos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiListener implements ActionListener {

    MiComponenteAWT component;

    public MiListener(MiComponenteAWT component){
        this.component = component;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        component.dispose();
    }
}