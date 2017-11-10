/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava3;
import static java.awt.Color.gray;
import ConexionBD.Conexion;//importar paquete.ventana
import java.awt.Color;
import javax.swing.JFrame;

/************************************
 * Myriam Castillo Zavala;
 * @author LAB07
 * Fecha: Noviembre 10  2017
 * Programa: Pruebajava3 
 * Responsabilidad: Aplicaciones Escritorio Java
 ************************************/
public class PruebaJava3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      // TODO code application logic here
        //PASO 9 - LLAMADA A LA CLASE JFRAME
        PruebaJava3 conexion  = new conexion();//Creo un objeto tipo 
        conexion.setVisible(gray);
        conexion.setBounds(0, 0, 300, 500);
        //La siguiente inst. le pone titulo a la ventana 
        conexion.SetTitle("Tercera Evaluacion Sumativa");
        //La siguiente sentencia es para finalizar el proyecto el cerrea la ventana
       conexion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setVisible(Color gray) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setBounds(int i, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void SetTitle(String tercera_Evaluacion_Sumativa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
