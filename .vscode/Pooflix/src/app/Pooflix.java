package app;

import java.util.ArrayList;
import java.util.List;

import app.personas.*;

public class Pooflix {
    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    public List<INominable> nominados = new ArrayList<>();

    public Serie buscarSerie(String titulo) {
        for (Serie s : this.series) {
            if (s.getNombre().equals(titulo))
                return s;
        }
        return null;
    }

    public void inicializarCatalogo() {
        this.inicializarGreysAnatomy();
        this.inicializarLaCasaDePapel();
        this.inicializarPelis();
    }

    public void inicializarPelis() {
        Pelicula peli = new Pelicula("The Notebook", 126, 2004);

        Actor actor = new Actor("Ryan Gosling", 34);
        // actor.nombre = "Ryan Gosling";

        peli.getElenco().add(actor);
        this.peliculas.add(peli);

        peli = new Pelicula("La vida es bella", 122, 1997);

        actor = new Actor("Roberto Benigni", 40);

        this.peliculas.add(peli);
        peli.getElenco().add(actor);
    }

    public void inicializarGreysAnatomy() {
        Serie ga = new Serie("Greys Anatomy", 2005, "Comedia Drama");// saar numero
        // ga.nombre = "Greys Anatomy";
        // ga.setAnio(2005);
        // ga.setGenero("Comedia Drama")

        this.series.add(ga);

        Temporada t1 = new Temporada(1, 2005);
        // t1.numero = 1;
        ga.getTemporadas().add(t1);

        Temporada t2 = new Temporada(2, 2006);
        // t2.numero = 2;
        ga.getTemporadas().add(t2); // se crea un espacio en posicion 0, y ese elemento va a hacer uan referencia al
        // objeto temporada. Asi se relaciona.

        Episodio cap1 = new Episodio(1, "La noche de un dia dificil", 43);
        // cap1.numero = 1;
        // cap1.nombre = "La noche de un día dificil";
        // cap1.duracionEnMin = 43;
        cap1.setDescripcion(
                "Meredith Grey se inscribe en un riguroso programa de residencia quirúrgica en el hospital Seattle Grace, donde pasará los próximos 7 años. En este primer episodio, Meredith descubre que durmió con uno de sus jefes, el Dr. Shepherd. Mientras tanto, George O'Malley es elegido para llevar a cabo la primera operación. Izzie Stevens es discriminada por haber sido modelo.");

        t1.getEpisodios().add(cap1);

        Episodio cap2 = new Episodio(2, "El primer corte es el mas profundo", 45);
        // cap2.numero = 2;
        // cap2.nombre = "El primer corte es el mas profundo";
        // cap2.duracionEnMin = 45;
        cap2.setDescripcion(
                "Meredith busca gente para compartir la casa de su madre. Izzie ayuda a una mujer asiática cuya hija sin papeles de residencia tiene una grave enfermedad. Meredith visita el pabellón de maternidad y descubre un problema en uno de los bebés.");

        t1.getEpisodios().add(cap2); // creo un espacio de memoria en la lista oarray de episodios y referencia al
        // objeto anterior.EPISODIO

        Episodio cap10 = new Episodio(10, "Gotas de lluvia sobre mi cabeza", 49);
        cap10.setDescripcion(
                "Mientras que Meredith y Cristina discuten sus deficiencias en el bar Emerald city, Joe el camarero se derrumba. El Dr. Webber se recupera de su cirugía y pide a George que sea sus ojos y oidos. Addison mientras tanto comienza a adaptarse al hospital ya que ha venido a cubrir un caso.");

        t2.getEpisodios().add(cap10);

        Episodio cap11 = new Episodio(11, "Ya basta", 48);
        cap11.setDescripcion(
                "La Sra. Adele Webber regresa de vacaciones para ayudar a recuperarse a su marido, el Dr. Webber, de su cirugía. George sigue estando con la enfermera Olivia, pero todavía siente algo por Meredith. Un accidente de coche trae una familia al hospital, lo que provoca que el padre de la familia (con pasado violento) necesite un trasplante por parte de su hijo que no está dispuesto a dárselo. La Dra. Bailey tiene que realizar una operación complicada.");

        t2.getEpisodios().add(cap11);

        Websodio webi = new Websodio(23, "Episodio Web", 6, "htpp://direccion.com");
        // webi.numero = 23;
        // webi.nombre = "Episodio Web";
        // webi.duracionEnMin = 6;
        // webi.url = "htpp://direccion.com"
        webi.setDescripcion("La cirugia continua en el Seattle Grace");
        t2.getEpisodios().add(webi);

    }

    public void inicializarLaCasaDePapel() {
        Serie lcdpapel = new Serie("La casa de papel", 2017, "Policial, Suspenso, Humor Negro");
        // lcdpapel.nombre = "La casa de papel";
        // lcdpapel.anio = 2017;
        // lcdpapel.clasificacion = "Policial, Suspenso, Humor Negro";

        this.series.add(lcdpapel);

        Temporada temporada1 = new Temporada(1, 2015);
        // temporada1.numero = 1;
        lcdpapel.getTemporadas().add(temporada1);

        Temporada temporada2 = new Temporada(2, 2016);
        // temporada2.numero = 2;
        lcdpapel.getTemporadas().add(temporada2);

        Episodio epi1 = new Episodio(1, "Efectuar lo acordado", 40);
        epi1.setDescripcion(
                "El Profesor recluta a una joven experta en atracos y a otros siete delincuentes para llevar a cabo un gran asalto a la Fábrica Nacional de Moneda y Timbre.");

        temporada1.getEpisodios().add(epi1);

        Episodio epi2 = new Episodio(2, "Imprudencias letales", 49);
        epi2.setDescripcion(
                "Raquel, la negociadora de rehenes, establece un primer contacto con el Profesor. La policía consigue una imagen de la cara de uno de los ladrones");

        temporada1.getEpisodios().add(epi2);

        Episodio epi16 = new Episodio(16, "Hemos vuelto", 48);
        epi16.setDescripcion(
                "Desconsolada por el secuestro de Río, Tokio recurre al Profesor. Después de tramar un nuevo y osado plan para rescatarlo, solo queda reunir al resto de la banda.");

        temporada2.getEpisodios().add(epi16);
    }

    public void inicializarListaNominados() {
        for (Pelicula peli : this.peliculas) {
            this.nominados.add(peli);
            for (Actor actor : peli.getElenco())
                this.nominados.add(actor);
        }
        for (Serie serie : this.series) {
            for (Actor actor : serie.getElenco())
                this.nominados.add(actor);
        }

    }

    public void reproducirTrailerNominacion() {
        for (INominable nominado : nominados) {
            nominado.reproducirTrailerNominacion();{

            }
            if (nominados instanceof Actor) {
                Actor actor = (Actor) nominados;
                actor.decirDiscurso();

            }
               
           }
       

       }

    }