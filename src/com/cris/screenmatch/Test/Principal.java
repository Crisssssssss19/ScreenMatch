package com.cris.screenmatch.Test;

import com.cris.screenmatch.Pelicula.Pelicula;
import com.cris.screenmatch.calculos.CalculadoraDeTiempo;
import com.cris.screenmatch.calculos.FiltroDeRecomendacion;
import com.cris.screenmatch.serie.Episodio;
import com.cris.screenmatch.serie.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula();
        CalculadoraDeTiempo cal =new CalculadoraDeTiempo();

        pelicula.setNombre("Encanto");
        pelicula.setFechaDeLanzamiento(2021);
        pelicula.setDuracionEnMinutos(120);
        pelicula.evaluaPelicula(7.8);
        pelicula.evaluaPelicula(10);
        System.out.println(pelicula.toString());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(180);
        System.out.println(otraPelicula.toString());



        Serie serie = new Serie();
        serie.setNombre("Casa dragon");
        serie.setFechaDeLanzamiento(2022);
        serie.setTemporadas(1);
        serie.setMinutosPorEpisodio(50);
        serie.setEpisodiosPorTemporada(10);
        System.out.println(serie.toString());

        cal.incluye(pelicula);
        cal.incluye(serie);
        cal.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos estas vacaciones " + cal.getTiempoTotal() + " minutos");

        FiltroDeRecomendacion filtroDeRecomendacion = new FiltroDeRecomendacion();
        System.out.println(filtroDeRecomendacion.filtra(pelicula));

        Episodio episodio = new Episodio();
        episodio.setCapitulo(1);
        episodio.setNombre("La casa Targeryen");
        episodio.setSerie(serie);
        episodio.setTotalVisualizaciones(100);
        System.out.println(filtroDeRecomendacion.filtra(episodio));

    }


}
