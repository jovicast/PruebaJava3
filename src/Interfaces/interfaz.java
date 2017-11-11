/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import javax.swing.*;//Importamos TODO de swing
import java.awt.*;
//IMPORTAR  LA CLASE CONEXION
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
 
    JPanel panel;
    JLabel label;
    JTextField text;
    JButton boton; 
    JButton boton2;
    
   
    conexionBD con;
    
    public interfaz()
    {
    
        panel = new JPanel();
        label = new JLabel();
        text = new JTextField(20);
        boton = new JButton();  
        boton2 = new JButton();
        
         
        this.add(panel);
       panel.add(label);
       panel.add(text);
       panel.add(boton);
       panel.add(boton2);
       
       
       label.setText("Atributo");
       boton.setText("Conectar");
       boton2.setText("Desconectar");
       panel.setBackground(Color.gray);//Color de fondo de JPanel
       
       //AGREGAR RSCUCHADORES AL BOTON 
       
       boton.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent evt)
           {
       ConexionBD con = new ConexionBD();
        Connection reg = con.conectar();
       }
    });
        boton2.addActionListener(new ActionListener()
     {
     public void actionPerformed(ActionEvent evt)
     {
      con.deaconectar();
     }

     });
       
        
    }

}