/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosteoria;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Victoria
 */
public class Saludo extends JPanel{
    // Componentes gráficos: un botón y un área de texto
	private JButton botonSaludar;
        private JButton botonDespedir;
	private JTextArea texto;
    
	public Saludo(){
    		initComponents();
	}

       private void initComponents(){
		// Tamaño del panel
		this.setPreferredSize(new Dimension(600,200));

		// Borde del panel
        	this.setBorder(new TitledBorder("Borde del panel"));

   	 	// Creamos el botón, con un texto a mostrar
    	botonSaludar = new JButton("Saludar");

	// Creamos el textArea de una fila por 25 columnas
    	texto = new JTextArea(1,25);

	// Establecemos el color de fondo del textArea
    	texto.setBackground(Color.ORANGE);
   	
	// Posicionamiento de componentes con FlowLayout
    	this.setLayout(new FlowLayout());
   	
	// Añadimos los componentes al panel
    	this.add(botonSaludar);
        this.add(botonDespedir);
    	this.add(texto);
        
        /*añado evento al objeto boton
        */
        botonSaludar.addActionListener((ActionListener) this);
        //controlar el evento boton despedir
        botonDespedir.addActionListener((ActionListener) this);

        
	}	 
 
	// Sobrescribimos el método de la interfaz
	//@Override  --ERROR ME DICE QUE NO ES OVERRIDE
//        public void actionPerformed(ActionEvent ae) {
//		
//		// Este ejemplo es tan básico que no hemos usado el objeto ae
//                // Indicamos el texto que queremos mostrar en el área de texto
//
//    		texto.setText("Hola amigos!!");
//	}
       
       //@Override  --> ME DICE QUE NO ES OVERRRIDE
	public void actionPerformed(ActionEvent ae) {

   	 	// Si el botón pulsado es botonSaludar
    	if(ae.getSource() == botonSaludar){
        	texto.setText("Hola amigos!!");
    	} else { 
        	texto.setText("Adios amigos!!");
    	}
	}	


}
