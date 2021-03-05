/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.*;
/**
 *
 * @author Andres
 */
public class conexion {
    Connection cn;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/lavadora","root","");
            System.out.println("Conexión Establecida");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cn;
    }
    
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
}
