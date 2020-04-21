package app;

public class Episodio {
    public int numero;
    public String nombre;
    public int duracionEnMin;
    public String descripcion;
    public int topEpisodio;
	public Object episodios;

	public void reproducir() {
        System.out.println("Reproduciendo episodio " + this.numero + " " + this.nombre);
}
}
