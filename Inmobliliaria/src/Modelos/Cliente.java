/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author serhe
 */
public class Cliente {
    private String nombresC;
    private String apellidosC;
    private String telefonoC;
    private String direccionC;
    private String profesionC;
    private String lugarTrabajoC;
    private String descripcionPropiedadC;
    private int salarioC;

    public Cliente(String nombresC, String apellidosC, String telefonoC, String direccionC, String profesionC, String lugarTrabajoC, String descripcionPropiedadC, int salarioC) {
        this.nombresC = nombresC;
        this.apellidosC = apellidosC;
        this.telefonoC = telefonoC;
        this.direccionC = direccionC;
        this.profesionC = profesionC;
        this.lugarTrabajoC = lugarTrabajoC;
        this.descripcionPropiedadC = descripcionPropiedadC;
        this.salarioC = salarioC;
    }

    public String getNombresC() {
        return nombresC;
    }

    public void setNombresC(String nombresC) {
        this.nombresC = nombresC;
    }

    public String getApellidosC() {
        return apellidosC;
    }

    public void setApellidosC(String apellidosC) {
        this.apellidosC = apellidosC;
    }
    
    
    public String getTelefonoC() {
        return telefonoC;
    }

    public void setTelefonoC(String telefonoC) {
        this.telefonoC = telefonoC;
    }

    public String getDireccionC() {
        return direccionC;
    }

    public void setDireccionC(String direccionC) {
        this.direccionC = direccionC;
    }

    public String getProfesionC() {
        return profesionC;
    }

    public void setProfesionC(String profesionC) {
        this.profesionC = profesionC;
    }

    public String getLugarTrabajoC() {
        return lugarTrabajoC;
    }

    public void setLugarTrabajoC(String lugarTrabajoC) {
        this.lugarTrabajoC = lugarTrabajoC;
    }

    public String getDescripcionPropiedadC() {
        return descripcionPropiedadC;
    }

    public void setDescripcionPropiedadC(String descripcionPropiedadC) {
        this.descripcionPropiedadC = descripcionPropiedadC;
    }

    public int getSalarioC() {
        return salarioC;
    }

    public void setSalarioC(int salarioC) {
        this.salarioC = salarioC;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombresC=" + nombresC + "apelldiosC=" + apellidosC + ", telefonoC=" + telefonoC + ", direccionC=" + direccionC + ", profesionC=" + profesionC + ", lugarTrabajoC=" + lugarTrabajoC + ", descripcionPropiedadC=" + descripcionPropiedadC + ", salarioC=" + salarioC + '}';
    }
    
}
