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
public class Arrendador {
    private String nombresA;
    private String apellidosA;
    private String telefonoA;
    private String direccionA;
    private String profesionA;
    private String lugarTrabajoA;
    private String descripcionPropiedadA;
    private int salarioA;

    public Arrendador(String nombresA, String apellidosA, String telefonoA, String direccionA, String profesionA, String lugarTrabajoA, String descripcionPropiedadA, int salarioA) {
        this.nombresA = nombresA;
        this.apellidosA = apellidosA;
        this.telefonoA = telefonoA;
        this.direccionA = direccionA;
        this.profesionA = profesionA;
        this.lugarTrabajoA = lugarTrabajoA;
        this.descripcionPropiedadA = descripcionPropiedadA;
        this.salarioA = salarioA;
    }

    
    public String getNombresA() {
        return nombresA;
    }
    public void setNombresA(String nombresA) {
        this.nombresA = nombresA;
    }
    public String getApellidosA() {
        return apellidosA;
    }

    public void setApellidosA(String apellidosA) {
        this.apellidosA = apellidosA;
    }
    
    public String getTelefonoA() {
        return telefonoA;
    }

    public void setTelefonoA(String telefonoA) {
        this.telefonoA = telefonoA;
    }

    public String getDireccionA() {
        return direccionA;
    }

    public void setDireccionA(String direccionA) {
        this.direccionA = direccionA;
    }

    public String getProfesionA() {
        return profesionA;
    }

    public void setProfesionA(String profesionA) {
        this.profesionA = profesionA;
    }

    public String getLugarTrabajoA() {
        return lugarTrabajoA;
    }

    public void setLugarTrabajoA(String lugarTrabajoA) {
        this.lugarTrabajoA = lugarTrabajoA;
    }

    public String getDescripcionPropiedadA() {
        return descripcionPropiedadA;
    }

    public void setDescripcionPropiedadA(String descripcionPropiedadA) {
        this.descripcionPropiedadA = descripcionPropiedadA;
    }

    public int getSalarioA() {
        return salarioA;
    }

    public void setSalarioA(int salarioA) {
        this.salarioA = salarioA;
    }

    @Override
    public String toString() {
        return "Arrendador{" + "nombresA=" + nombresA +"apellidosA"+ apellidosA +", telefonoA=" + telefonoA + ", direccionA=" + direccionA + ", profesionA=" + profesionA + ", lugarTrabajoA=" + lugarTrabajoA + ", descripcionPropiedadA=" + descripcionPropiedadA + ", salarioA=" + salarioA + '}';
    }
    
    
}
