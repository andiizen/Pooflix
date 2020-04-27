package app;

import java.util.List;

public class Pelicula extends Contenido implements INominable {

    public Director director;
    public int duracionEnMin;

    @Override
    public boolean ganoPreviamente() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void reproducirTrailerNominacion() {
        System.out.println("Reproduciendo ytailer de pelicula: " + this.getNombre());

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

}