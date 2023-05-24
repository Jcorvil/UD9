package Ejercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InterfazEj2 extends Frame{
    public static void main(String[] args) {
        new InterfazEj2();
    }

    InterfazEj2 (){
        setTitle("Login");
        setBackground(Color.PINK);
        setLayout(null);
        setSize(400, 300);
        setVisible(true);

        //Control
        Button cancelar = new Button("Cancelar");
        cancelar.setBounds(50, 200, 80, 20);
        Button acceder = new Button("Acceder");
        acceder.setBounds(150, 200, 80, 20);


        Label nombre1, pass1;

        nombre1 = new Label("Nombre:");
        nombre1.setBounds(50, 80, 100, 20);
        pass1 = new Label("Password:");
        pass1.setBounds(50, 130, 100, 20);

        TextField nombre = new TextField();
        nombre.setBounds(150, 80, 100, 20);
        TextField pass = new TextField();
        pass.setBounds(150, 130, 100, 20);

        //Añade el control al contenedor
        add(cancelar);
        add(acceder);
        add(nombre1);
        add(nombre);
        add(pass1);
        add(pass);

        //1.- Cerrar la ventana
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                InterfazEj2.this.dispose();
            }
        });

        //2.-El botón cancelar borra el texto introducido
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombre.setText("");
                pass.setText("");
            }
        });


        //3.-El botón acceder muestre un diálogo modal dando la bienvenida al usuario
        acceder.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Dialog dialog = new Dialog(InterfazEj2.this, "Bienvenido", true);
                    dialog.setSize(150, 100);
                    dialog.setLocationRelativeTo(InterfazEj2.this);

                    Label label = new Label("Bienvenido");
                    dialog.add(label);
                    dialog.setVisible(true);
                }
        });

    }

}