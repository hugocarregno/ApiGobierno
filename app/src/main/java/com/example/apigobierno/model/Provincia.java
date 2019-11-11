package com.example.apigobierno.model;

public class Provincia {
    private String id;
    private String nombre;

    public Provincia(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Provincia(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Provincia{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
