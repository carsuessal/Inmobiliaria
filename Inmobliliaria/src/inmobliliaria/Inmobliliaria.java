/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobliliaria;
import Controlador.ConexionBDInmobiliaria;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author serhe
 */
public class Inmobliliaria {
    
     public static void main(String[] args) {
            ConexionBDInmobiliaria conexion = new ConexionBDInmobiliaria();
            conexion.getConnection();
        } 

    /**
     * @param args the command line arguments
     */
}
