package app;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {
    public Serie(String nombre, int anio, String genero) {

        this.nombre = nombre;
        this.anio = anio;
        this.genero = genero;

    }

    private int anio;

    public int getAnio() {
        return this.anio;
    }

    // Setter anio
    public void setAnio(int numero) {
        this.anio = numero;
    }

    // nombre
    private String nombre;

    public String getNombre() {
        return this.nombre;
    }

    // Setter nom
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private List<Temporada> temporadas = new ArrayList<>(); // lista de objeto temporada

    public List<Temporada> getTemporadas() {
        return this.temporadas;

    }

    // Setter num
    public void setTemporadas(List<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    private String genero;

    public String getGenero() {
        return this.genero;
    }

    // Setter
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Temporada getTemporada(int nro) {
        // recorrer cada temporada
        // si el nro de temporada del ciclo es igual a "nro"
        // devolver esa temporada

        for (Temporada tempo : this.temporadas) {
            if (tempo.getNumero() == nro) {
                return tempo;
            }
        }
        return null;
    }
}