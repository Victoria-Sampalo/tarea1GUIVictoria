/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1guivictoria;

import java.awt.Color;
import javax.swing.JFrame;
/**
 *
 * @author Victoria
 */
public class TestTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //construccion de la ventana
       JFrame ventanaPrincipal = new JFrame("Victoria Sampalo");
       //establezco posición y tamaño
       ventanaPrincipal.setBounds(250, 250, 800, 600);
       //hago visible la ventana
        ventanaPrincipal.setVisible(true);
        // ventanaPrincipal.setLocationRelativeTo(null);
        //añado objeto MiPanel a JFrame
        ventanaPrincipal.add(new teoria.MiPanel(Color.MAGENTA));
        
        //acción por defecto al pulsar el botón de cierre de la ventana
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
