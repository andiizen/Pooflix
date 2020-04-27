package app;

import java.util.List;

import app.personas.*;

public class Pelicula extends Contenido implements INominable {

    public Pelicula(String nombre, int duracionEnMin, int anio) {
        this.setNombre(nombre);
        this.setDuracionEnMin(duracionEnMin);
        this.setAnio(anio);
    }
    
private Director director;
private int duracionEnMin;


    @Override
    public boolean ganoPreviamente() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void reproducirTrailerNominacion() {
        System.out.println("Reproduciendo tailer de pelicula: " + this.getNombre());

    }

    @Override
    public void sacarSelfie(List<Actor> elenco) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean estaNominada() {
        // TODO Auto-generated method stub
        return false;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public int getDuracionEnMin() {
        return duracionEnMin;
    }

    public void setDuracionEnMin(int duracionEnMin) {
        this.duracionEnMin = duracionEnMin;
    }

}