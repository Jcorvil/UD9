package Ejemplos;

import java.awt.*;
import java.awt.event.*;

public class MiComponenteAWT extends Frame /*implements ActionListener*/ {

    Button botonSalir;

    public static void main(String[] args) {
        new MiComponenteAWT();
    }

    MiComponenteAWT (){
        setTitle("Mi Componente");
        setVisible(true);
        setLayout(null);
        setBounds(200, 200, 400, 400);

        botonSalir = new Button("Salir");
        botonSalir.setBounds(300, 300, 50, 30);
        add(botonSalir);

        botonSalir.addActionListener(new MiListener(this));

        //Para hacerlo todo en el mismo método VV
        //botonSalir.addActionListener(this);

        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                MiComponenteAWT.this.dispose();
            }
        });

    }


    //Para hacerlo todo en el mismo método VV
    /*
    @Override
    public void actionPerformed(ActionEvent e) {
        ((Frame)botonSalir.getParent()).dispose();
    }
    */



}