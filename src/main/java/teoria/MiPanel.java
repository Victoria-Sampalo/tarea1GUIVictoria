/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Victoria
 */
public class MiPanel extends JPanel {

    //Añadimos un componente de tipo etiqueta (JLabel)
    private JLabel etiqueta;
    //constructor pasando un color, que llama al método initComponents();

    public MiPanel(Color color) {
        initComponets();
        cambiarColorFondo(color);

    }

    //METODO QUE INICIALIZA LOS ELEMENTOS GRÁFICOS DEL FORMULARIO
    private void initComponets() {
        //construimos la etiqueta con el texto que queremos que muestre 
        etiqueta = new JLabel("Etiqueta de MiPanel");
        //añade la etiqueta al contenedor MiPanel (al JPanel)
        this.add(etiqueta);

    }

    //método de cambiar color de fondo del panel
    private void cambiarColorFondo(Color color) {
        //color de fondo
        this.setBackground(color);

    }

    //método getter

    public JLabel getEtiqueta() {
        return etiqueta;
    }
    /*Una vez creada la clase anterior, hay que incluir un objeto de tipo 
    MiPanel dentro de un contenedor principal, esto es, dentro de un JFrame. 
    En nuestro caso, el código del método main() de la clase Test quedaría 
    como sigue:

    */
}
