package com.cris.screenmatch.calculos;

import com.cris.screenmatch.Pelicula.Pelicula;
import com.cris.screenmatch.titulo.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(@org.jetbrains.annotations.NotNull Titulo titulo){
        this.tiempoTotal+=titulo.getDuracionEnMinutos();
    }
}
