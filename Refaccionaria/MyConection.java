/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Refaccionaria;

import Alumnos.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author gera
 */
public class MyConection {

    Connection conexion = null;
    Statement comando = null;
    ResultSet registro = null;

    public Connection Miconexion() {
        try {
            //generar driver de MySQl 
            Class.forName("com.mysql.jdbc.Driver");
            //generamos el nombre y el puerto del servidor
            String servidor = "jdbc:mysql://localhost:3306/refaccionaria";
            //generar el nombre del usuario y la contraseña
            String user = "root";
            String pwd = "sistemas";
            //creamos la conexion bd
            conexion = DriverManager.getConnection(servidor, user, pwd);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e, "Error en la conneccion" + e.getMessage(), JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error en la conexion con la BD" + e.getMessage(), JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error en la Conexion" + e.getMessage(), JOptionPane.ERROR_MESSAGE);
        } finally {
            return conexion;
        }

    }

}
