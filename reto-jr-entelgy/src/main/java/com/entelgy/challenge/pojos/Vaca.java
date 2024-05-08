package com.entelgy.challenge.pojos;

public class Gato {
    private String nombre;
    private int edad;
    private String raza;
    private int tiempoDeVida;
    private final String tipo = "Vaca";

    public Vaca(String nombre, int edad, String raza, int tiempoDeVida) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tiempoDeVida = tiempoDeVida;
    }

    public void realizarSonido() {
        System.out.println("Mugir");
    }

    public void describir() {
        System.out.println(nombre + " es un " + tipo + " de raza " + raza + " que tiene " + edad + " años. Siempre " + realizarSonido() + " cuando está feliz. Su expectativa de vida es de " + tiempoDeVida + " años.");
    }
}