/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author isaac
 */
public class conectar {
    
    
    Connection cn;
    
    public Connection conexion(){
        try{
              Class.forName("com.mysql.jdbc.Driver");
              
              cn=DriverManager.getConnection( "jdbc:mysql://localhost/bd","root","");
              
              System.out.println("conectado");
                      
        } catch (Exception e) {
            System.err.println(e.getMessage());
        
        
        }
    
         return cn;  
   
         
    }    
    
    
    
}
                   