package app;

public class Episodio {

    //constructor por defecto
    //public Episodio (){
    //}

    //Constructor de 3 parametros.
    //accesor: public
    //NombreClase: nombre de la clase que se quiere instanciar
    //parametros: los parametros pueden tener cualquier 

    public Episodio(int numero, String nombre, int duracionEnMin) {
    this.numero = numero;
    this.nombre = nombre;
    this.duracionEnMin = duracionEnMin;
    }

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
