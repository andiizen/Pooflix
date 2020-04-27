package app;

public class Episodio {

    // constructor por defecto
    // public Episodio (){
    // }

    // Constructor de 3 parametros.
    // accesor: public
    // NombreClase: nombre de la clase que se quiere instanciar
    // parametros: los parametros pueden tener cualquier

    public Episodio(int numero, String nombre, int duracionEnMin) {
        this.numero = numero;
        this.nombre = nombre;
        this.duracionEnMin = duracionEnMin;
    }

    private int numero;
    private String nombre;
    private int duracionEnMin;
    private String descripcion;
    private int anio;

    // Getter --> devolver el valor de un atributo. el Set va a ponerle valor.
    // Getter num
    public int getNumero() {
        return this.numero;
    }

    // Setter num
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // nombre get and set
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // duracionEnMin
    public int getDuracionEnMin() {
        return this.duracionEnMin;
    }

    public void setDuracionEnMin(int duracionEnMin) {
        this.duracionEnMin = duracionEnMin;
    }

    // Descripcion
    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // anio
    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void reproducir() {
        System.out.println("Reproduciendo episodio " + this.getNumero() + " " + this.getNombre());
    }
}
