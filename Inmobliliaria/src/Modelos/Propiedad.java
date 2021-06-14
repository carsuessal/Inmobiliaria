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
public class Propiedad {
    
    private String numMatricula;
    private String direcion;
    private String telefono;
    private String barrio;
    private String zona;
    private String precioAlquiler;
    private String descripcionPropiedad;

    public Propiedad(String numMatricula, String direcion, String telefono, String barrio, String zona, String precioAlquiler, String descripcion) {
        this.numMatricula = numMatricula;
        this.direcion = direcion;
        this.telefono = telefono;
        this.barrio = barrio;
        this.zona = zona;
        this.precioAlquiler = precioAlquiler;
        this.descripcionPropiedad = descripcionPropiedad;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(String precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public String getDescripcionPropiedad() {
        return descripcionPropiedad;
    }

    public void setDescripcionPropiedad(String descripcionPropiedad) {
        this.descripcionPropiedad = descripcionPropiedad;
    }

    @Override
    public String toString() {
        return "Propiedad{" + "numMatricula=" + numMatricula + ", direcion=" + direcion + ", telefono=" + telefono + ", barrio=" + barrio + ", zona=" + zona + ", precioAlquiler=" + precioAlquiler + ", descripcionPropiedad=" + descripcionPropiedad + '}';
    }
    
    
}
