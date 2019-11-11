package com.example.apigobierno.model;

import java.util.ArrayList;

public class Parametro {
    private ArrayList<String> provincia;

    public Parametro(ArrayList<String> provincia) {
        this.provincia = provincia;
    }

    public Parametro(){}

    public ArrayList<String> getProvincia() {
        return provincia;
    }

    public void setProvincia(ArrayList<String> provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Parametro{" +
                "provincia=" + provincia +
                '}';
    }
}
