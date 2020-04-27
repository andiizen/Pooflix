package app;

public class Websodio extends Episodio {
    public Websodio(int numero, String nombre, int duracionEnMin, String url) {
        super(numero, nombre, duracionEnMin);// llama al constructor de Episodio.
        // this.numero = numero;
        // this.nombre = nombre;
        // this.duracionEnMin = duracionEnMin;
        this.url = url;
    }

    private String url;

    @Override // Anotacion uqe indica que el metodo se sobre escribe (redefinicion)
    public void reproducir() {
        System.out.println("Reproduciendo websodio " + this.getNumero() + " " + this.getNombre() + " url: " + this.url);
    }

    /**
     * "envia" un mail de alerta cuando la serie este online. Este metdo NO esta en
     * EPISODIO.
     */
    public void enviarAlertaDeQueEstaOnline() {
        // mandaria un mail a los usuarios avisando que ya esta disponible para ver.
        System.out.println("Enviando mail con url " + this.url);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}