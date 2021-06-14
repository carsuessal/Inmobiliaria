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
    private String direccion;
    private String telefono;
    private String barrio;
    private String zona;
    private int precioAlquiler;
    private String descripcionPropiedad;

    public Propiedad(String numMatricula, String direcion, String telefono, String barrio, String zona, int precioAlquiler, String descripcionPropiedad) {
        this.numMatricula = numMatricula;
        this.direccion = direcion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDirecion(String direcion) {
        this.direccion = direccion;
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

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
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
        return "Propiedad{" + "numMatricula=" + numMatricula + ", direccion=" + direccion + ", telefono=" + telefono + ", barrio=" + barrio + ", zona=" + zona + ", precioAlquiler=" + precioAlquiler + ", descripcionPropiedad=" + descripcionPropiedad + '}';
    }
    
    
}
