/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;
//PASO 10 - Necesario para conexion con MySQL
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/************************************
 * Myriam Castillo Zavala;
 * @author LAB07
 * Fecha: Noviembre 10  2017
 * Programa: Pruebajava3 
 * Responsabilidad: Aplicaciones Escritorio Java
 ************************************/
public class conexionBD
{
   private static Connection conex;//Objeto tipo Connection
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String URL = "jdbc:mysql://localhost:3306/pruebajava3";
    public conexionBD()
    {
        conex = null;//Inicializar la variable 
        
        //Metodo para manejar excepciones
        try
        {
            Class.forName(DRIVER);
            conex = DriverManager.getConnection(URL, USER, PASS);
            if (conex != null) 
            {
             System.out.println("Conexion Establecida");
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
         System.out.println("Conexion tuvo exito");
        }
    }
    
    //PASO 13 - DEFINICION METODOS PARA CONECTAR Y DESCONECTAR
    public Connection conectar()
    {
        return conex;//Retorna el objeto conex  
    }
    
    public void desconectar()
    {
      conex=null;
        if (conex==null) 
        {
          System.out.println("Conexion Finalizada");
        }
    }

   

        
    
}
