/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1guivictoria;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Victoria
 */
public class TestTarea2 extends JPanel {

    /**
     * @param args the command line arguments
     */
    /*
    La tarea final consiste en que adaptes el ejemplo de los 5 paneles de colores (página 9) para que:
a . El color de los paneles sea diferente al del ejemplo.
b . El nombre de la ventana sea tu nombre y apellidos.
c . La ventana no sea redimensionable.
d . El texto que se muestre en cada uno de los cinco paneles de color 
    sea diferente (pista: crea los paneles de forma independiente, 
    accede a su etiqueta y cambia el texto de la misma usando el método 
    setText de la etiqueta).
     */
    public static void main(String[] args) {
        //b . El nombre de la ventana sea tu nombre y apellidos.
        // Construimos la ventana
        JFrame ventanaPrincipal = new JFrame("Victoria Sampalo");
        // añado tamaño y posición
        ventanaPrincipal.setSize(800, 600);

        ventanaPrincipal.setLocationRelativeTo(null);

        //c . La ventana no sea redimensionable.  
        // La ventana no se puede redimensionar
        ventanaPrincipal.setResizable(false);

        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);
        //Acción por defecto al pulsar el botón de cierre de la ventana
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //5 PANELES Y LOS AÑADO A LA VENTANA PRINCIPAL
        //establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());

        //añadir paneles a cada posición del BorderLayout
        //panel yellow en la posicion superior north 
        ventanaPrincipal.add(new ejerciciosteoria.MiPanel(Color.MAGENTA), BorderLayout.NORTH);
        // Añadir panel rojo en la posición inferior (SOUTH)
        ventanaPrincipal.add(new ejerciciosteoria.MiPanel(Color.GREEN), BorderLayout.SOUTH);

        // Añadir panel gris en la posición central (CENTER)
        ventanaPrincipal.add(new ejerciciosteoria.MiPanel(Color.YELLOW), BorderLayout.CENTER);

        // Añadir panel verde en la posición izquierda (WEST)
        ventanaPrincipal.add(new ejerciciosteoria.MiPanel(Color.CYAN), BorderLayout.WEST);

        // Añadir panel cián en la posición derecha (EAST)
        ventanaPrincipal.add(new ejerciciosteoria.MiPanel(Color.GRAY), BorderLayout.EAST);

    }

}
