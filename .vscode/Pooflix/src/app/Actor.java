package app;

import java.util.List;

public class Actor extends Persona implements INominable {

    public boolean ganoPreviamente(){
       //aca se ve la logica
       
        return true;
    }

    public void reproducirTrailerNominacion(){
        System.out.println("Reproduciendo trailer de escena de pelicula del actor: " + this.nombre);

    }

    public void sacarSelfie (List<Actor> elenco){
        
    }

    @Override
    public boolean estaNominada() {
        // TODO Auto-generated method stub
        return false;
    }

}