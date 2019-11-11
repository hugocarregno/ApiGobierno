package com.example.apigobierno.model;

public class Municipio {
    private Centroide centroide;
    private String id;
    private String nombre;
    private Provincia provincia;

    public Municipio(Centroide centroide, String id, String nombre, Provincia provincia) {
        this.centroide = centroide;
        this.id = id;
        this.nombre = nombre;
        this.provincia = provincia;
    }

    public Municipio(){}

    public Centroide getCentroide() {
        return centroide;
    }

    public void setCentroide(Centroide centroide) {
        this.centroide = centroide;
    }

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

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Municipio{" +
                "centroide=" + centroide +
                ", id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", provincia=" + provincia +
                '}';
    }
}
