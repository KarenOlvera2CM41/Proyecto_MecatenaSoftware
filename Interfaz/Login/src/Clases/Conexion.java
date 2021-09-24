/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.*;

public class Conexion {
    public static Connection conectar(){
        try{
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/mecatenasoftware", "root", "");
        return cn;
        }catch(SQLException e){
            System.out.println("Error en conexión local!");
        }
        return (null);
    }
}
