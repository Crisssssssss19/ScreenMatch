package com.cris.screenmatch.Pelicula;

import com.cris.screenmatch.calculos.Clasificacion;
import com.cris.screenmatch.titulo.Titulo;

public class Pelicula extends Titulo implements Clasificacion {

    private String director = "";

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getClasificacion() {
        return calculaMedia()/2;
    }
}
