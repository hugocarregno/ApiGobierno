package com.example.apigobierno.model;

import java.util.ArrayList;

public class Resultado {
    private int cantidad;
    private int inicio;
    private ArrayList<Municipio> municipios;
    private Parametro parametros;
    private int total;

    public Resultado(int cantidad, int inicio, ArrayList<Municipio> municipios, Parametro parametros, int total) {
        this.cantidad = cantidad;
        this.inicio = inicio;
        this.municipios = municipios;
        this.parametros = parametros;
        this.total = total;
    }

    public Resultado(){}

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public ArrayList<Municipio> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(ArrayList<Municipio> municipios) {
        this.municipios = municipios;
    }

    public Parametro getParametros() {
        return parametros;
    }

    public void setParametros(Parametro parametros) {
        this.parametros = parametros;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "cantidad=" + cantidad +
                ", inicio=" + inicio +
                ", municipios=" + municipios +
                ", parametros=" + parametros +
                ", total=" + total +
                '}';
    }
}
