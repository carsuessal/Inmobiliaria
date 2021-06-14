/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author serhe
 */
public class ConexionBDInmobiliaria {
    private static Connection conn;
       public void ConexionBDInmobiliaria() {
        conn = null;
        System.out.println("Método conectar MySQL");
        try {
            conn = DriverManager.getConnection("jdbc:mysql://mysql-seriestv.alwaysdata.net:3306/"
                    + "seriestv_bd?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false"
                    + "&serverTimezone=UTC", "seriestv", "INTRODUCTORIOi15");
            if (conn != null){
                System.out.println("Conexión exitosa");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }  
    }
     public Connection getConnection() {
		return conn;
	}
	
	/**
	 * Termina la conexi�n a ala base de datos
	 */
	public void desconect() {
		conn = null;
		if (conn == null) {
			System.out.println("La base de datos se ha desconectado");
		}  
}

}
