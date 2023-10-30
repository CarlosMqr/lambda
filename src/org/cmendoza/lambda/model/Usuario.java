package org.cmendoza.lambda.model;

public class Usuario {
    private String nombre;

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre;
    }
}
