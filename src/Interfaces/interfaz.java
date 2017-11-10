/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import java.awt.Color;
import javax.swing.*;//Importamos TODO de swing
import bd2.conexionBD;
import java.sql.Connection;
import java.awt.event.*;

/************************************
 * Myriam Castillo Zavala;
 * @author LAB07
 * Fecha: Noviembre 10  2017
 * Programa: Pruebajava3
 * Responsabilidad: Aplicaciones Escritorio Java
 ************************************/
public class interfaz extends JFrame
{
 //PASO 3 - DECLARAR ELEMENTOS A UTILIZAR
    JPanel panel;
    JLabel label;
    JTextField text;
    JButton boton; 
    JButton boton2;
    
    // PASO 4 - DEFINIR EL CONSTRUCTOR 
    ConexionBD con;
    
    public interfaz()
    {
    //PASO 5 - CREAR E INICIALIZAR LOS OBJETOS
        panel = new JPanel();//Creo un objeto Tipo JPanel
        label = new JLabel();
        text = new JTextField(15);//15 es la cantidad de caracteres
        boton = new JButton();  
        boton2 = new JButton();
        
         //PASO 6 - AGREGAR LOS ELEMENTOS AL JFRAME
       this.add(panel);//Recomendable el JPanel
       panel.add(label);
       panel.add(text);
       panel.add(boton);
       panel.add(boton2);
       
       //PASO 7 - PROPIEDADES DE LOS OBJETOS
       label.setText("Atributo");
       boton.setText("Conectar");
       boton2.setText("Desconectar");
       panel.setBackground(Color.gray);//Color de fondo de JPanel
        
    }

    public void SetTitle(String mi_primera_interfaz_JavaSwing) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   

    private void add(JPanel panel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
