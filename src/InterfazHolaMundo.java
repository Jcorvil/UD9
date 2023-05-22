import javax.swing.*;
import java.awt.*;

public class InterfazHolaMundo {
    public static void main(String[] args) {
        //Contenedor
        Frame frame = new Frame("Hola Mundo");

        frame.setBackground(Color.PINK);
        frame.setLayout(null);
        frame.setSize(400, 300);
        frame.setVisible(true);

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
        frame.add(cancelar);
        frame.add(acceder);
        frame.add(nombre1);
        frame.add(nombre);
        frame.add(pass1);
        frame.add(pass);

    }
}