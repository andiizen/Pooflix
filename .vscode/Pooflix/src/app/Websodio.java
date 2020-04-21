package app;

public class Websodio extends Episodio {
    public String url;

    @Override //Anotacion uqe indica que el metodo se sobre escribe (redefinicion)
    public void reproducir() {
        System.out.println("Reproduciendowebsodio " + this.numero + " " + this.nombre + " url: " + this.url);
    }

}