package com.example.practicaguiada;

public class Mascota {
    private String nombre;
    private String tipo;

    public Mascota(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }


    public double funcionPrecio() {
        double precio = 0;

        if (getTipo() == "Perro") {
            precio = 3500;
        } else {
            precio = 4500;
        }
        return precio;
    }
}
