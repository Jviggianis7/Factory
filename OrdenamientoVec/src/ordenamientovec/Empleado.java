/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientovec;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class Empleado {
    private int id;
    private String nombre;
    private String genero;
    private double salariob;
    private double salarioneto;
    private int estrato;
    private int he;
    private int fechavin;

    public Empleado(int id, String nombre, String genero, double salariob, int estrato, int he, int fechavin) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.salariob = salariob;
        this.estrato = estrato;
        this.he = he;
        this.fechavin = fechavin;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getSalariob() {
        return salariob;
    }

    public void setSalariob(double salariob) {
        this.salariob = salariob;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public int getHe() {
        return he;
    }

    public void setHe(int he) {
        this.he = he;
    }

    public int getFechavin() {
        return fechavin;
    }

    public void setFechavin(int fechavin) {
        this.fechavin = fechavin;
    }
    public void Mostar(){
        String info= "Los datos del Empleado son: \n";
        info += "ID del Empleado: "+id+"\n";
        info += "Nombre del Empleado: "+nombre+"\n";
        info += "Género del Empleado: "+genero+"\n";
        info += "Salario base: "+salariob+"\n";
        info += "Estrato del Empleado: "+estrato+"\n";
        info += "H.E laboradas: "+he+"\n";
        info += "Fecha de vinculación del empleado: "+fechavin;
        
        JOptionPane.showMessageDialog(null, info);
        
    }
    
}
