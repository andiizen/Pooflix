package app;

public class App {
    public static void main(String[] args) throws Exception {

        Pooflix miPooflix = new Pooflix();

        System.out.println("Iniciando Catalogo");

        miPooflix.inicializarCatalogo();

        Serie ga = miPooflix.buscarSerie("Greys Anatomy");

        Temporada laMejorTemporada = ga.getTemporada(2);

        Episodio elTop;

        elTop = laMejorTemporada.getEpisodio(23);

        elTop.reproducir();
        

    
    }
}