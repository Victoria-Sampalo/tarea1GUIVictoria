/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosteoria;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Victoria
 */
public class Test2 {

    public static void main(String[] args) {
        //construcción de la ventana
        JFrame ventanaPrincipal = new JFrame("Aplicación");
        //estableccemos posición y tamaño
        ventanaPrincipal.setBounds(250, 250, 800, 600);

        //hacemos visible la ventana
        ventanaPrincipal.setVisible(true);

        //accion ppor defecto al pulsar el botón de cierre
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*
        Cuando se diseña una interfaz gráfica, el contenedor de mayor nivel 
        es el JFrame, y dentro del mismo se incluyen otros elementos 
        contenedores que agrupan componentes. Si deseamos que la ventana 
        aparezca centrada en pantalla se puede cambiar la línea del método 
        setBounds por las siguientes:
         */
        //VENTANA CENTRADA
        ventanaPrincipal.setSize(800, 600);

        ventanaPrincipal.setLocation(null);

        /*Una vez creada la clase anterior, hay que incluir un objeto de tipo 
    MiPanel dentro de un contenedor principal, esto es, dentro de un JFrame. 
    En nuestro caso, el código del método main() de la clase Test quedaría 
    como sigue:

         */
        //add un objeto MiPanel al JFrame
        ventanaPrincipal.add(new teoria.MiPanel(Color.cyan));
        ventanaPrincipal.add(new teoria.MiPanel(Color.magenta));
        //si pongo dos colores se queda el último de todos.

        //hacemos visible la ventana
        ventanaPrincipal.setVisible(true);
        //acción por defecto al pulsar el botón de cierre de la ventana
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());

        //añadir paneles a cada posición del BorderLayout
        //panel yellow en la posicion superior north 
        ventanaPrincipal.add(new MiPanel(Color.yellow), BorderLayout.NORTH);
        // Añadir panel rojo en la posición inferior (SOUTH)
        ventanaPrincipal.add(new MiPanel(Color.red), BorderLayout.SOUTH);

// Añadir panel gris en la posición central (CENTER)
        ventanaPrincipal.add(new MiPanel(Color.gray), BorderLayout.CENTER);

// Añadir panel verde en la posición izquierda (WEST)
        ventanaPrincipal.add(new MiPanel(Color.green), BorderLayout.WEST);

// Añadir panel cián en la posición derecha (EAST)
        ventanaPrincipal.add(new MiPanel(Color.cyan), BorderLayout.EAST);

    }
}
