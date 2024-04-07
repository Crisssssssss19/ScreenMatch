package cris.Pelicula;

public class Pelicula {

    private String nombre = "";
    private int fechaDeLanzamiento= 0;
    private int duracionDePelicula = 0;
    private boolean incluidoEnElPlan;
    private double sumaDeEvaluaciones=0;
    private int cantidaEvaluciones = 0;

    public Pelicula(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getDuracionDePelicula() {
        return duracionDePelicula;
    }

    public void setDuracionDePelicula(int duracionDePelicula) {
        this.duracionDePelicula = duracionDePelicula;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public void evaluaPelicula(double nota){
        this.sumaDeEvaluaciones += nota;
        cantidaEvaluciones++;
    }

    public double calculaMedia(){
        double media = 0;
        return this.cantidaEvaluciones == 0 ? (double) 0 : sumaDeEvaluaciones/cantidaEvaluciones ;
    }

    @Override
    public String toString() {
        return String.format("""
                Nombre: %s
                Fecha de lanzamiento: %d
                Duracion: %d
                Nota: %.1f
                """,this.nombre,this.fechaDeLanzamiento,this.duracionDePelicula,  calculaMedia() );
    }
}
