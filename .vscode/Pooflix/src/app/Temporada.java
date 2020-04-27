package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    public Temporada(int numero, int anio) {

        this.setNumero(numero);
        this.setAnio(anio);
    }

    private int numero;
    private int anio;
    private List<Episodio> episodios = new ArrayList<>();

    public Episodio getEpisodio(int nro) {

        for (Episodio epi : this.episodios) {
            if (epi.getNumero() == nro) {
                return epi;

            }

        }
        return null;
    }

    /**
     * Obtiene un episodio en base a la posicion dentro del ArrayList. Recordar que
     * los arrayList la primer posicion es la 0.
     * 
     * @param pos
     * @return
     */
    public Episodio getEpisodioAtPosicion(int pos) {
        return this.episodios.get(pos);
    }

   public List<Websodio> obtenerWebSodios() {
      List<Websodio> lista = new ArrayList<>();
       for (Episodio epi : this.episodios) {
           if (epi instanceof Websodio)
               lista.add((Websodio) epi);
       }
    
        return lista;
       }

    public int getCantidadEpisodios() {
        return this.episodios.size();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(List<Episodio> episodios) {
        this.episodios = episodios;
    }

}
