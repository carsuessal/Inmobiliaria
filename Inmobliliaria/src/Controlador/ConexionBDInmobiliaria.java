/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConexionBDInmobiliaria {
    private static Connection conn;
       public ConexionBDInmobiliaria() {
        conn = null;
        System.out.println("Método conectar MySQL");
        try {
            conn =  DriverManager.getConnection("jdbc:mysql://mysql-seriestv.alwaysdata.net:3306/"
					+ "seriestv_inmobiliaria?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false"
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
	 * Termina la conexion a a la base de datos
	 */
	public void desconect() {
		conn = null;
		if (conn == null) {
			System.out.println("La base de datos se ha desconectado");
		}  
    }
       
	public ResultSet buscarPropietario(String item) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String query = "SELECT * FROM Propietario WHERE telefono = ?";

		try {
			ConexionBDInmobiliaria dbConexion = new ConexionBDInmobiliaria();
			Connection con = dbConexion.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, item);
			rs = pstmt.executeQuery();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return rs;

	}
        public ResultSet buscarPropiedad(String item) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String query = "SELECT * FROM Propiedad WHERE numero_de_matricula = ?";

		try {
			ConexionBDInmobiliaria dbConexion = new ConexionBDInmobiliaria();
			Connection con = dbConexion.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, item);
			rs = pstmt.executeQuery();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return rs;

	}
        public ResultSet buscarArrendatario(String item) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String query = "SELECT * FROM Arrendatario WHERE telefono = ?";

		try {
			ConexionBDInmobiliaria dbConexion = new ConexionBDInmobiliaria();
			Connection con = dbConexion.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, item);
			rs = pstmt.executeQuery();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return rs;

	}
}
