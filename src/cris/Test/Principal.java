package cris.Test;

import cris.Pelicula.*;

public class Principal {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula();
        pelicula.setNombre("Encanto");
        pelicula.setFechaDeLanzamiento(2021);
        pelicula.setDuracionDePelicula(120);
        pelicula.evaluaPelicula(7.8);
        pelicula.evaluaPelicula(10);
        System.out.println(pelicula.toString());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionDePelicula(180);
        System.out.println(otraPelicula.toString());
    }


}
