package app.personas;

import java.util.List;

import app.INominable;

public class Actor extends Persona implements INominable {
    public Actor (String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
    }

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

    public void decirDiscurso(){
        System.out.println("Quiero agradecer a ...");
    }

}