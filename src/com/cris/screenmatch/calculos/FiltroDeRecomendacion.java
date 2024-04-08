package com.cris.screenmatch.calculos;

public class FiltroDeRecomendacion {

    public String filtra(Clasificacion clasificacion){
        return (clasificacion.getClasificacion() >=4)? "Muy bien evaluado en el momento" :clasificacion.getClasificacion() >= 2 ? "Popular en el momento" : "Colocalo en tu lista para verlo despues";
    }
}
