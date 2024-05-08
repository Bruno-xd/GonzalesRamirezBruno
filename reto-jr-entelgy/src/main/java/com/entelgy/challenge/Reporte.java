package com.entelgy.challenge;
import pojos.Perro;
import pojos.Gato;
import pojos.Vaca;

public class Reporte {

    public Animal[] cargarDatos() {
        Perro perro1 = new Perro("perro1", 5, "Labrador", 12);
        Perro perro2 = new Perro("perro2", 3, "Bulldog", 10);
        Perro perro3 = new Perro("perro3", 2, "Pitubll", 14);

        Gato gato1 = new Gato("gato1", 4, "raza", 15);
        Gato gato2 = new Gato("gato2", 2, "raza", 12);
        Gato gato3 = new Gato("gato3", 3, "raza", 13);

        Vaca vaca1 = new Vaca("vaca1", 6, "raza", 20);
        Vaca vaca2 = new Vaca("vaca2", 8, "raza", 18);
        Vaca vaca3 = new Vaca("vaca3", 7, "raza", 22);

        return new Animal[]{perro1, perro2, perro3, gato1, gato2, gato3, vaca1, vaca2, vaca3};
    }

    public static void main(String[] args) {
        Reporte reporte = new Reporte();
        Animal[] animales = reporte.cargarDatos();

        try {
            animales[0].describir();
        } catch (NullPointerException e) {
            System.out.println("Animal no encontrado");
        }
    }

    }
