/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.newpackage;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author randy
 */
public class conexion {
    Connection conectar = null;
     public Connection conectar(){
         try{
             Class.forName("com.mysql.jdbc.Driver");
             conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/tareajava?characterEncoding=latin1","Emilio","adminuser1902.");
             //JOptionPane.showMessageDialog(null, "Conexion exitosa", "Conexion", JOptionPane.INFORMATION_MESSAGE);
         }
         catch(ClassNotFoundException | SQLException e) {
             JOptionPane.showMessageDialog(null, "No se pudo conectar "+e, "Conexion", JOptionPane.ERROR_MESSAGE);
         }
         return conectar;
     }
}
