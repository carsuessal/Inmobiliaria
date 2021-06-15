/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobliliaria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Controlador.ConexionBDInmobiliaria;
import Modelos.Arrendador;
import Modelos.Cliente;
import Modelos.Propiedad;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
/**
 *
 * @author serhe
 */
public class RegistroYDisponibilidad extends javax.swing.JFrame {
    
    int idGeneralBaseDatos;
    boolean permisoEdicion = false;
    /**
     * Creates new form RegistroYDisponibilidad
     */
    private static final long serialVersionUID = 1L;
    
    public RegistroYDisponibilidad() {
        initComponents();
    }

    public void enviarElementoA(Arrendador arrendador) {
		PreparedStatement stmt = null;
			

		String query = "INSERT INTO Propietario (nombres, apellidos, telefono, direccion, profesion, lugar_de_trabajo, descripcion_de_la_propiedad, salario) VALUES (?,?,?,?,?,?,?,?)";

		try {
			System.out.println(arrendador);
			ConexionBDInmobiliaria dbConexion = new ConexionBDInmobiliaria();
			Connection con = dbConexion.getConnection();

			stmt = con.prepareStatement(query);
			stmt.setString(1, arrendador.getNombresA());
			stmt.setString(2, arrendador.getApellidosA());
			stmt.setString(3, arrendador.getTelefonoA());
                        stmt.setString(4, arrendador.getDireccionA());
			stmt.setString(5, arrendador.getProfesionA());
			stmt.setString(6, arrendador.getLugarTrabajoA());
			stmt.setString(7, arrendador.getDescripcionPropiedadA());
			stmt.setInt(8, arrendador.getSalarioA());
			
			int retorno = stmt.executeUpdate();
	        if (retorno>0)
	           System.out.println("Insertado correctamente");   
	        	JOptionPane.showMessageDialog(null, "El propietario "+ arrendador.getNombresA() + "\n Se ha registrado con exito ");


		} catch (Exception e) {
			System.out.println("Error al conectar con la base de datos -Metodo:envarElemento- ");
			System.out.println(e);
		}
	}
	public void enviarElementoC(Cliente cliente) {
		PreparedStatement stmt = null;
			

		String query = "INSERT INTO Arrendatario (nombres, apellidos, telefono, direccion, profesion, lugar_de_trabajo, descripcion_de_la_propiedad, salario) VALUES (?,?,?,?,?,?,?,?)";

		try {
			System.out.println(cliente);
			ConexionBDInmobiliaria dbConexion = new ConexionBDInmobiliaria();
			Connection con = dbConexion.getConnection();

			stmt = con.prepareStatement(query);
			stmt.setString(1, cliente.getNombresC());
			stmt.setString(2, cliente.getApellidosC());
			stmt.setString(3, cliente.getTelefonoC());
                        stmt.setString(4, cliente.getDireccionC());
			stmt.setString(5, cliente.getProfesionC());
			stmt.setString(6, cliente.getLugarTrabajoC());
			stmt.setString(7, cliente.getDescripcionPropiedadC());
			stmt.setInt(8, cliente.getSalarioC());
			
			int retorno = stmt.executeUpdate();
	        if (retorno>0)
	           System.out.println("Insertado correctamente");   
	        	JOptionPane.showMessageDialog(null, "El arrendatario "+ cliente.getNombresC() + "\n Se ha registrado con exito ");


		} catch (Exception e) {
			System.out.println("Error al conectar con la base de datos -Metodo:envarElemento- ");
			System.out.println(e);
		}
	}
        
        public void enviarElementoP(Propiedad propiedad) {
		PreparedStatement stmt = null;
			

		String query = "INSERT INTO Propiedad (numero_de_matricula, direccion, telefono, barrio, zona, precio_alquiler, descripcion_de_la_propiedad) VALUES (?,?,?,?,?,?,?)";

		try {
			System.out.println(propiedad);
			ConexionBDInmobiliaria dbConexion = new ConexionBDInmobiliaria();
			Connection con = dbConexion.getConnection();

			stmt = con.prepareStatement(query);
			stmt.setString(1, propiedad.getNumMatricula());
			stmt.setString(2, propiedad.getDireccion());
			stmt.setString(3, propiedad.getTelefono());
			stmt.setString(4, propiedad.getBarrio());
			stmt.setInt(5, propiedad.getPrecioAlquiler());
                        stmt.setString(6, propiedad.getZona());
			stmt.setString(7, propiedad.getDescripcionPropiedad());
			
			int retorno = stmt.executeUpdate();
	        if (retorno>0)
	           System.out.println("Insertado correctamente");   
	        	JOptionPane.showMessageDialog(null, "La propiedad "+ propiedad.getNumMatricula() + "\n Se ha registrado con exito ");


		} catch (Exception e) {
			System.out.println("Error al conectar con la base de datos -Metodo:enviarElemento- ");
			System.out.println(e);
		}
	}
        
        
        public void borrarDatosIngresadoArrendador() {
	jtfArrendadorNombre.setText(null);
	jtfArrendadorApellidos.setText(null);
	jtfArrendadorProfesion.setText(null);
	jtfArrendadorLugarTrabajo.setText(null);
	jtfArrendadorSalario.setText(null);
	jtfArrendadorTelefono.setText(null);
	jtfArrendadorDireccion.setText(null);
	jtfArrendadorDescripcion.setText(null);

        }
        public void borrarDatosIngresadoCliente() {
	jtfArrendatarioNombres.setText(null);
	jtfArrendatarioApellidos.setText(null);
	jtfArrendatarioProfesion.setText(null);
	jtfArrendatarioLugarTrabajo.setText(null);
	jtfArrendatarioSalario.setText(null);
	jtfArrendatarioTelefono.setText(null);
	jtfArrendatarioDireccion.setText(null);
	jtfArrendatarioDescripcion.setText(null);

        }
        public void borrarDatosIngresadoPropiedad() {
	jtfPropiedadSnr.setText(null);
	jtfPropiedadTelefono.setText(null);
	jtfPropiedadZona.setText(null);
	jtfPropiedadDireccion.setText(null);
	jtfPropiedadBarrio.setText(null);
	jtfPropiedadPrecioAlquiler.setText(null);
	jtfPropiedadDescripcion.setText(null);
	
        }
        
        public void actualizarArrendatario(int id) {
		
		int salarioArrendatario = Integer.parseInt(jtfArrendatarioSalario.getText());
        
                Cliente arrendatario = new Cliente(jtfArrendatarioNombres.getText(),jtfArrendatarioApellidos.getText(),jtfArrendatarioTelefono.getText(),jtfArrendatarioDireccion.getText(),jtfArrendatarioProfesion.getText(),jtfArrendatarioLugarTrabajo.getText(),jtfArrendatarioDescripcion.getText(), salarioArrendatario);
        
		String query = "UPDATE Arrendatario "
				+ "SET nombres = ?,"
				+ "apellidos  = ?,"
				+ "telefono  = ?,"
				+ "direccion = ?,"
				+ "profesion = ?,"
				+ "lugar_de_trabajo = ?,"
				+ "descripcion_de_la_propiedad = ?, "
                                + "salario = ? "
				+ " WHERE id = " + id ;

		try {
			ConexionBDInmobiliaria dbConexion = new ConexionBDInmobiliaria();
			Connection con = dbConexion.getConnection();
                    PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, arrendatario.getNombresC());
			pstmt.setString(2,  arrendatario.getApellidosC());
			pstmt.setString(3,  arrendatario.getTelefonoC());
			pstmt.setString(4,  arrendatario.getDireccionC());
			pstmt.setString(5,  arrendatario.getProfesionC());
			pstmt.setString(6,  arrendatario.getLugarTrabajoC());
			pstmt.setString(7,  arrendatario.getDescripcionPropiedadC());
                        pstmt.setInt(8,  arrendatario.getSalarioC());
			int n = pstmt.executeUpdate();
			System.out.println(n);
			//valida si se guardaron los datos; si pst>0 entonces se guardaron
			if (n > 0)
				System.out.println("Insertado correctamente");
			JOptionPane.showMessageDialog(null, "El arrendatario " + arrendatario.getNombresC() + "\n Se ha actulizado con exito ");
			
			dbConexion.desconect();
			

		} catch (Exception e) {
			
			System.out.println("Error editando arrendatario" + e);
		}
	}
        
          public void actualizarArrendador(int id) {
		
		int salarioPropietario = Integer.parseInt(jtfArrendadorSalario.getText());
        
                Arrendador arrendador = new Arrendador(jtfArrendadorNombre.getText(),jtfArrendadorApellidos.getText(),jtfArrendadorTelefono.getText(),jtfArrendadorDireccion.getText(),jtfArrendadorProfesion.getText(),jtfArrendadorLugarTrabajo.getText(),jtfArrendadorDescripcion.getText(), salarioPropietario);
                
                
		String query = "UPDATE Propietario "
				+ "SET nombres = ?,"
				+ "apellidos  = ?,"
				+ "telefono  = ?,"
				+ "direccion = ?,"
				+ "profesion = ?,"
				+ "lugar_de_trabajo = ?,"
				+ "descripcion_de_la_propiedad = ?, "
                                + "salario = ? "
				+ " WHERE id = " + id ;

		try {
			ConexionBDInmobiliaria dbConexion = new ConexionBDInmobiliaria();
			Connection con = dbConexion.getConnection();
                    PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, arrendador.getNombresA());
			pstmt.setString(2,  arrendador.getApellidosA());
			pstmt.setString(3,  arrendador.getTelefonoA());
			pstmt.setString(4,  arrendador.getDireccionA());
			pstmt.setString(5,  arrendador.getProfesionA());
			pstmt.setString(6,  arrendador.getLugarTrabajoA());
			pstmt.setString(7,  arrendador.getDescripcionPropiedadA());
                        pstmt.setInt(8,  arrendador.getSalarioA());
			int n = pstmt.executeUpdate();
			System.out.println(n);
			//valida si se guardaron los datos; si pst>0 entonces se guardaron
			if (n > 0)
				System.out.println("Insertado correctamente");
			JOptionPane.showMessageDialog(null, "El propietario " + arrendador.getNombresA() + "\n Se ha actulizado con exito ");
			
			dbConexion.desconect();
			

		} catch (Exception e) {
			
			System.out.println("Error editando propietario" + e);
		}
	}
          
        public void actualizarPropiedad(int id) {
		
                int precioAlquilerPropiedad=Integer.parseInt(jtfPropiedadPrecioAlquiler.getText());
                
                Propiedad propiedad = new Propiedad (jtfPropiedadSnr.getText(),jtfPropiedadDireccion.getText(),jtfPropiedadTelefono.getText(),jtfPropiedadBarrio.getText(),jtfPropiedadZona.getText(), precioAlquilerPropiedad,jtfPropiedadDescripcion.getText());

		String query = "UPDATE Propiedad "
				+ "SET numero_de_matricula = ?,"
				+ "direccion  = ?,"
				+ "telefono  = ?,"
				+ "barrio = ?,"
				+ "zona = ?,"
				+ "precio_alquiler = ?,"
				+ "descripcion_de_la_propiedad = ? "   
				+ " WHERE id = " + id ;

		try {
			ConexionBDInmobiliaria dbConexion = new ConexionBDInmobiliaria();
			Connection con = dbConexion.getConnection();
                    PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, propiedad.getNumMatricula());
			pstmt.setString(2,  propiedad.getDireccion());
			pstmt.setString(3,  propiedad.getTelefono());
			pstmt.setString(4,  propiedad.getBarrio());
			pstmt.setString(5,  propiedad.getZona());
			pstmt.setInt(6,  propiedad.getPrecioAlquiler());
			pstmt.setString(7,  propiedad.getDescripcionPropiedad());
			int n = pstmt.executeUpdate();
			System.out.println(n);
			//valida si se guardaron los datos; si pst>0 entonces se guardaron
			if (n > 0)
				System.out.println("Insertado correctamente");
			JOptionPane.showMessageDialog(null, "La propiedad " + propiedad.getNumMatricula() + "\n Se ha actulizado con exito ");
			
			dbConexion.desconect();
			

		} catch (Exception e) {
			
			System.out.println("Error editando propiedad" + e);
		}
	}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfArrendadorApellidos = new javax.swing.JTextField();
        jtfArrendadorLugarTrabajo = new javax.swing.JTextField();
        jtfArrendadorNombre = new javax.swing.JTextField();
        jtfArrendadorTelefono = new javax.swing.JTextField();
        jtfArrendadorDireccion = new javax.swing.JTextField();
        jtfArrendadorProfesion = new javax.swing.JTextField();
        jtfArrendadorSalario = new javax.swing.JTextField();
        guardarPopietario = new javax.swing.JButton();
        modificarPopietario = new javax.swing.JButton();
        limpiarPopietario = new javax.swing.JButton();
        jtfArrendadorDescripcion = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jtfPropiedadSnr = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jtfPropiedadDireccion = new javax.swing.JTextField();
        jtfPropiedadTelefono = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jtfPropiedadBarrio = new javax.swing.JTextField();
        jtfPropiedadZona = new javax.swing.JTextField();
        jtfPropiedadPrecioAlquiler = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jtfPropiedadDescripcion = new javax.swing.JTextField();
        guardarPropiedad = new javax.swing.JButton();
        modificarPropiedad = new javax.swing.JButton();
        limpiarPropiedad = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jtfArrendatarioNombres = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtfArrendatarioTelefono = new javax.swing.JTextField();
        jtfArrendatarioApellidos = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jtfArrendatarioDireccion = new javax.swing.JTextField();
        jtfArrendatarioProfesion = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtfArrendatarioLugarTrabajo = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jtfArrendatarioSalario = new javax.swing.JTextField();
        guardarArrendatario = new javax.swing.JButton();
        modificarArrendatario = new javax.swing.JButton();
        limpiarArrendatario = new javax.swing.JButton();
        jtfArrendatarioDescripcion = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        alquilar = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        seleccionPropiedadDisponible = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        seleccionRangoPrecios = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        seleccionZona = new javax.swing.JComboBox<>();

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(332, 400));

        jLabel1.setText("Nombres");

        jLabel2.setText("Apellidos");

        jLabel3.setText("Teléfono");

        jLabel4.setText("Dirección");

        jLabel5.setText("Profesión");

        jLabel6.setText("Lugar de trabajo");

        jLabel7.setText("Salario");

        jLabel8.setText("Descripción");

        guardarPopietario.setText("Guardar");
        guardarPopietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarPopietarioActionPerformed(evt);
            }
        });

        modificarPopietario.setText("Buscar/Actualizar");
        modificarPopietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarPopietarioActionPerformed(evt);
            }
        });

        limpiarPopietario.setText("Limpiar");
        limpiarPopietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarPopietarioActionPerformed(evt);
            }
        });

        jtfArrendadorDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfArrendadorDescripcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtfArrendadorTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtfArrendadorSalario)
                        .addComponent(jtfArrendadorLugarTrabajo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtfArrendadorProfesion, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfArrendadorNombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtfArrendadorApellidos, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtfArrendadorDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(guardarPopietario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(limpiarPopietario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(modificarPopietario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfArrendadorDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfArrendadorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfArrendadorApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfArrendadorProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfArrendadorLugarTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addComponent(jtfArrendadorDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modificarPopietario)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfArrendadorSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfArrendadorTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardarPopietario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfArrendadorDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(limpiarPopietario))))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente propietario", jPanel1);

        jPanel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setText("Número de matrícula (SNR)");

        jtfPropiedadSnr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPropiedadSnrActionPerformed(evt);
            }
        });

        jLabel11.setText("Teléfono");

        jLabel28.setText("Dirección");

        jtfPropiedadDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPropiedadDireccionActionPerformed(evt);
            }
        });

        jtfPropiedadTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPropiedadTelefonoActionPerformed(evt);
            }
        });

        jLabel29.setText("Zona");

        jLabel30.setText("Barrio");

        jLabel37.setText("Precio de alquiler");

        jtfPropiedadBarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPropiedadBarrioActionPerformed(evt);
            }
        });

        jtfPropiedadZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPropiedadZonaActionPerformed(evt);
            }
        });

        jtfPropiedadPrecioAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPropiedadPrecioAlquilerActionPerformed(evt);
            }
        });

        jLabel38.setText("Descripción");

        jtfPropiedadDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPropiedadDescripcionActionPerformed(evt);
            }
        });

        guardarPropiedad.setText("Guardar");
        guardarPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarPropiedadActionPerformed(evt);
            }
        });

        modificarPropiedad.setText("Buscar/Actualizar");
        modificarPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarPropiedadActionPerformed(evt);
            }
        });

        limpiarPropiedad.setText("Limpiar");
        limpiarPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarPropiedadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtfPropiedadSnr)
                            .addComponent(jtfPropiedadTelefono)
                            .addComponent(jtfPropiedadZona))
                        .addGap(112, 112, 112)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfPropiedadDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPropiedadBarrio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPropiedadPrecioAlquiler, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jtfPropiedadDescripcion)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(guardarPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(modificarPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(limpiarPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPropiedadSnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPropiedadDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPropiedadTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPropiedadBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPropiedadZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPropiedadPrecioAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfPropiedadDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarPropiedad)
                    .addComponent(modificarPropiedad)
                    .addComponent(limpiarPropiedad))
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Propiedad", jPanel5);

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setText("Nombres");

        jLabel18.setText("Apellidos");

        jLabel19.setText("Teléfono");

        jLabel20.setText("Dirección");

        jLabel21.setText("Profesión");

        jLabel22.setText("Descripción");

        jLabel23.setText("Lugar de trabajo");

        jLabel24.setText("Salario");

        guardarArrendatario.setText("Guardar");
        guardarArrendatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarArrendatarioActionPerformed(evt);
            }
        });

        modificarArrendatario.setText("Buscar/Actualizar");
        modificarArrendatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarArrendatarioActionPerformed(evt);
            }
        });

        limpiarArrendatario.setText("Limpiar");
        limpiarArrendatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarArrendatarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfArrendatarioLugarTrabajo)
                            .addComponent(jtfArrendatarioApellidos)
                            .addComponent(jtfArrendatarioProfesion)
                            .addComponent(jtfArrendatarioNombres)
                            .addComponent(jtfArrendatarioSalario)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfArrendatarioTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(26, 26, 26))
                    .addComponent(jtfArrendatarioDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(limpiarArrendatario, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(guardarArrendatario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(modificarArrendatario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jtfArrendatarioDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jtfArrendatarioNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfArrendatarioApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfArrendatarioProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfArrendatarioLugarTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel24))
                    .addComponent(jtfArrendatarioDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfArrendatarioSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarArrendatario))
                .addGap(9, 9, 9)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfArrendatarioTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardarArrendatario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfArrendatarioDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiarArrendatario))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente arrendatario", jPanel3);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Resúmen"));

        jLabel31.setText("Dirección");

        jTextField28.setEditable(false);

        jLabel32.setText("Descripción");

        jTextField29.setEditable(false);

        jLabel33.setText("Estado");

        alquilar.setText("Alquilar");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField28)
                            .addComponent(jTextField29, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel33)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(alquilar)
                .addGap(162, 162, 162))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(alquilar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(34, 34, 34))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Disponibilidad"));

        jLabel34.setText("Propiedades disponibles");

        seleccionPropiedadDisponible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));

        jLabel35.setText("Rango de precios");

        seleccionRangoPrecios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "25000000-50000000", "50000000-75000000", "75000000-100000000", "100000000-150000000", "150000000-200000000", "200000000-500000000" }));

        jLabel36.setText("Zona");

        seleccionZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Urbana", "Rural" }));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seleccionPropiedadDisponible, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(seleccionRangoPrecios, 0, 179, Short.MAX_VALUE)
                                .addGap(59, 59, 59)))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 131, Short.MAX_VALUE))
                            .addComponent(seleccionZona, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seleccionRangoPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccionZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(seleccionPropiedadDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alquiler", jPanel11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarArrendatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarArrendatarioActionPerformed
        if (permisoEdicion == false){
        int salarioCliente = Integer.parseInt(jtfArrendatarioSalario.getText());
        
        Cliente cliente = new Cliente(jtfArrendatarioNombres.getText(),jtfArrendatarioApellidos.getText(),jtfArrendatarioTelefono.getText(),jtfArrendatarioDireccion.getText(),jtfArrendatarioProfesion.getText(),jtfArrendatarioLugarTrabajo.getText(),jtfArrendatarioDescripcion.getText(), salarioCliente);
        enviarElementoC(cliente);
        borrarDatosIngresadoCliente();
        }else{
            actualizarArrendatario(idGeneralBaseDatos);
            borrarDatosIngresadoCliente();
            permisoEdicion = false;
        }
    // TODO add your handling code here:
    }//GEN-LAST:event_guardarArrendatarioActionPerformed

    private void jtfPropiedadSnrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPropiedadSnrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPropiedadSnrActionPerformed

    private void jtfPropiedadDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPropiedadDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPropiedadDireccionActionPerformed

    private void jtfPropiedadTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPropiedadTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPropiedadTelefonoActionPerformed

    private void jtfPropiedadBarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPropiedadBarrioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPropiedadBarrioActionPerformed

    private void jtfPropiedadZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPropiedadZonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPropiedadZonaActionPerformed

    private void jtfPropiedadPrecioAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPropiedadPrecioAlquilerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPropiedadPrecioAlquilerActionPerformed

    private void jtfPropiedadDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPropiedadDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPropiedadDescripcionActionPerformed

    private void guardarPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarPropiedadActionPerformed
        
        if (permisoEdicion == false){
            int precioAlquilerPropiedad=Integer.parseInt(jtfPropiedadPrecioAlquiler.getText());
            Propiedad propiedad = new Propiedad (jtfPropiedadSnr.getText(),jtfPropiedadDireccion.getText(),jtfPropiedadTelefono.getText(),jtfPropiedadBarrio.getText(),jtfPropiedadZona.getText(), precioAlquilerPropiedad,jtfPropiedadDescripcion.getText());
            enviarElementoP(propiedad);
            borrarDatosIngresadoPropiedad();
        }else{
            actualizarPropiedad(idGeneralBaseDatos);
            borrarDatosIngresadoPropiedad();
            permisoEdicion = false;
        }
        
        
    // TODO add your handling code here:
    }//GEN-LAST:event_guardarPropiedadActionPerformed

    private void jtfArrendadorDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfArrendadorDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfArrendadorDescripcionActionPerformed

    private void guardarPopietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarPopietarioActionPerformed
        if (permisoEdicion == false){
        int salarioPropietario = Integer.parseInt(jtfArrendadorSalario.getText());
        
        Arrendador arrendador = new Arrendador(jtfArrendadorNombre.getText(),jtfArrendadorApellidos.getText(),jtfArrendadorTelefono.getText(),jtfArrendadorDireccion.getText(),jtfArrendadorProfesion.getText(),jtfArrendadorLugarTrabajo.getText(),jtfArrendadorDescripcion.getText(), salarioPropietario);
        enviarElementoA(arrendador);
        borrarDatosIngresadoArrendador();
        }else{
            actualizarArrendador(idGeneralBaseDatos);
            borrarDatosIngresadoArrendador();
            permisoEdicion = false;
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_guardarPopietarioActionPerformed

    private void limpiarPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarPropiedadActionPerformed
     
        borrarDatosIngresadoPropiedad();   
        
    }//GEN-LAST:event_limpiarPropiedadActionPerformed

    private void limpiarArrendatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarArrendatarioActionPerformed
        
        borrarDatosIngresadoCliente();
           
    }//GEN-LAST:event_limpiarArrendatarioActionPerformed

    private void limpiarPopietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarPopietarioActionPerformed
       
        borrarDatosIngresadoArrendador();
        
    }//GEN-LAST:event_limpiarPopietarioActionPerformed

    private void modificarPopietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPopietarioActionPerformed
        
        String telefono = JOptionPane.showInputDialog("Ingrese el número de teléfono del propietario a buscar");
		JOptionPane.showMessageDialog(null, "Se buscarán los datos para el teléfono " + telefono);
        
        ConexionBDInmobiliaria conexionbd = new ConexionBDInmobiliaria(); 
        
        ResultSet rs = conexionbd.buscarPropietario(telefono);
        
        try {
            while (rs.next()){
                idGeneralBaseDatos=rs.getInt("id");
                
                jtfArrendadorNombre.setText(rs.getString("nombres"));
                jtfArrendadorApellidos.setText(rs.getString("apellidos"));
                jtfArrendadorTelefono.setText(rs.getString("telefono"));
                jtfArrendadorDireccion.setText(rs.getString("direccion"));
                jtfArrendadorProfesion.setText(rs.getString("profesion"));
                jtfArrendadorLugarTrabajo.setText(rs.getString("lugar_de_trabajo"));
                jtfArrendadorDescripcion.setText(rs.getString("descripcion_de_la_propiedad"));
                jtfArrendadorSalario.setText(rs.getString("salario"));
                
            }
        conexionbd.desconect();
        permisoEdicion = true;
        }catch(Exception e){
            
            e.printStackTrace();
        }
            
    }//GEN-LAST:event_modificarPopietarioActionPerformed

    private void modificarArrendatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarArrendatarioActionPerformed
        
        String telefono = JOptionPane.showInputDialog("Ingrese el número de teléfono del arrendatario a buscar");
		JOptionPane.showMessageDialog(null, "Se buscarán los datos para el teléfono " + telefono);
        
        ConexionBDInmobiliaria conexionbd = new ConexionBDInmobiliaria(); 
        
        ResultSet rs = conexionbd.buscarArrendatario(telefono);
        
        try {
            while (rs.next()){
                idGeneralBaseDatos=rs.getInt("id");
                
                jtfArrendatarioNombres.setText(rs.getString("nombres"));
                jtfArrendatarioApellidos.setText(rs.getString("apellidos"));
                jtfArrendatarioTelefono.setText(rs.getString("telefono"));
                jtfArrendatarioDireccion.setText(rs.getString("direccion"));
                jtfArrendatarioProfesion.setText(rs.getString("profesion"));
                jtfArrendatarioLugarTrabajo.setText(rs.getString("lugar_de_trabajo"));
                jtfArrendatarioDescripcion.setText(rs.getString("descripcion_de_la_propiedad"));
                jtfArrendatarioSalario.setText(rs.getString("salario"));
                
            }
        conexionbd.desconect();
        permisoEdicion = true;
        }catch(Exception e){
            
            e.printStackTrace();
        }
       
    }//GEN-LAST:event_modificarArrendatarioActionPerformed

    private void modificarPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPropiedadActionPerformed
        
        
        String matricula = JOptionPane.showInputDialog("Ingrese el número de teléfono del arrendatario a buscar");
		JOptionPane.showMessageDialog(null, "Se buscarán los datos para el teléfono " + matricula);
        
        ConexionBDInmobiliaria conexionbd = new ConexionBDInmobiliaria(); 
        
        ResultSet rs = conexionbd.buscarPropiedad(matricula);
        
        try {
            while (rs.next()){
                idGeneralBaseDatos=rs.getInt("id");
                
                jtfPropiedadSnr.setText(rs.getString("numero_de_matricula"));
                jtfPropiedadTelefono.setText(rs.getString("telefono"));
                jtfPropiedadZona.setText(rs.getString("zona"));
                jtfPropiedadDireccion.setText(rs.getString("direccion"));
                jtfPropiedadBarrio.setText(rs.getString("barrio"));
                jtfPropiedadPrecioAlquiler.setText(rs.getString("precio_alquiler"));
                jtfPropiedadDescripcion.setText(rs.getString("descripcion_de_la_propiedad"));
            }
        conexionbd.desconect();
        permisoEdicion = true;
        }catch(Exception e){
            
            e.printStackTrace();
        }
    }//GEN-LAST:event_modificarPropiedadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroYDisponibilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroYDisponibilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroYDisponibilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroYDisponibilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroYDisponibilidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alquilar;
    private javax.swing.JButton guardarArrendatario;
    private javax.swing.JButton guardarPopietario;
    private javax.swing.JButton guardarPropiedad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jtfArrendadorApellidos;
    private javax.swing.JTextField jtfArrendadorDescripcion;
    private javax.swing.JTextField jtfArrendadorDireccion;
    private javax.swing.JTextField jtfArrendadorLugarTrabajo;
    private javax.swing.JTextField jtfArrendadorNombre;
    private javax.swing.JTextField jtfArrendadorProfesion;
    private javax.swing.JTextField jtfArrendadorSalario;
    private javax.swing.JTextField jtfArrendadorTelefono;
    private javax.swing.JTextField jtfArrendatarioApellidos;
    private javax.swing.JTextField jtfArrendatarioDescripcion;
    private javax.swing.JTextField jtfArrendatarioDireccion;
    private javax.swing.JTextField jtfArrendatarioLugarTrabajo;
    private javax.swing.JTextField jtfArrendatarioNombres;
    private javax.swing.JTextField jtfArrendatarioProfesion;
    private javax.swing.JTextField jtfArrendatarioSalario;
    private javax.swing.JTextField jtfArrendatarioTelefono;
    private javax.swing.JTextField jtfPropiedadBarrio;
    private javax.swing.JTextField jtfPropiedadDescripcion;
    private javax.swing.JTextField jtfPropiedadDireccion;
    private javax.swing.JTextField jtfPropiedadPrecioAlquiler;
    private javax.swing.JTextField jtfPropiedadSnr;
    private javax.swing.JTextField jtfPropiedadTelefono;
    private javax.swing.JTextField jtfPropiedadZona;
    private javax.swing.JButton limpiarArrendatario;
    private javax.swing.JButton limpiarPopietario;
    private javax.swing.JButton limpiarPropiedad;
    private javax.swing.JButton modificarArrendatario;
    private javax.swing.JButton modificarPopietario;
    private javax.swing.JButton modificarPropiedad;
    private javax.swing.JComboBox<String> seleccionPropiedadDisponible;
    private javax.swing.JComboBox<String> seleccionRangoPrecios;
    private javax.swing.JComboBox<String> seleccionZona;
    // End of variables declaration//GEN-END:variables
}
