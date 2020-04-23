package app;

import java.util.ArrayList;
import java.util.List;

public class Pooflix {
    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    public Serie buscarSerie(String titulo) {
        for (Serie s : this.series) {
            if (s.nombre.equals(titulo))
                return s;
        }
        return null;
    }

    public void inicializarCatalogo() {
        this.inicializarGreysAnatomy();
         this.inicializarLaCasaDePapel();
    }

    public void inicializarGreysAnatomy() {
        Serie ga = new Serie();
        ga.nombre = "Greys Anatomy";
        ga.anio = 2005;
        ga.genero = "Comedia Drama";

        this.series.add(ga);

        Temporada t1 = new Temporada();
        t1.numero = 1;
        ga.temporadas.add(t1);

        Temporada t2 = new Temporada();
        t2.numero = 2;
        ga.temporadas.add(t2); // se crea un espacio en posicion 0, y ese elemento va a hacer uan referencia al
                               // objeto temporada. Asi se relaciona.

        Episodio cap1 = new Episodio(1, "La noche de un dia dificil", 43);
       // cap1.numero = 1;
       // cap1.nombre = "La noche de un día dificil";
      //cap1.duracionEnMin = 43;
        cap1.descripcion = "Meredith Grey se inscribe en un riguroso programa de residencia quirúrgica en el hospital Seattle Grace, donde pasará los próximos 7 años. En este primer episodio, Meredith descubre que durmió con uno de sus jefes, el Dr. Shepherd. Mientras tanto, George O'Malley es elegido para llevar a cabo la primera operación. Izzie Stevens es discriminada por haber sido modelo.";

        t1.episodios.add(cap1);

        Episodio cap2 = new Episodio(2, "El primer corte es el mas profundo", 45 );
       // cap2.numero = 2;
       // cap2.nombre = "El primer corte es el mas profundo";
       // cap2.duracionEnMin = 45;
        cap2.descripcion = "Meredith busca gente para compartir la casa de su madre. Izzie ayuda a una mujer asiática cuya hija sin papeles de residencia tiene una grave enfermedad. Meredith visita el pabellón de maternidad y descubre un problema en uno de los bebés.";

        t1.episodios.add(cap2); // creo un espacio de memoria en la lista oarray de episodios y referencia al
                                     // objeto anterior.EPISODIO

        Episodio cap10 = new Episodio(10, "Gotas de lluvia sobre mi cabeza", 49);
        cap10.descripcion = "Mientras que Meredith y Cristina discuten sus deficiencias en el bar Emerald city, Joe el camarero se derrumba. El Dr. Webber se recupera de su cirugía y pide a George que sea sus ojos y oidos. Addison mientras tanto comienza a adaptarse al hospital ya que ha venido a cubrir un caso.";

        t2.episodios.add(cap10);

        Episodio cap11 = new Episodio(11, "Ya basta", 48);
        cap11.descripcion = "La Sra. Adele Webber regresa de vacaciones para ayudar a recuperarse a su marido, el Dr. Webber, de su cirugía. George sigue estando con la enfermera Olivia, pero todavía siente algo por Meredith. Un accidente de coche trae una familia al hospital, lo que provoca que el padre de la familia (con pasado violento) necesite un trasplante por parte de su hijo que no está dispuesto a dárselo. La Dra. Bailey tiene que realizar una operación complicada.";

        t2.episodios.add(cap11);

        Websodio webi = new Websodio ();
        webi.numero = 23;
        webi.nombre = "Episodio Web";
        webi.duracionEnMin = 6;
        webi.url = "htpp://direccion.com";

        t2.episodios.add(webi);

    }
    public void inicializarLaCasaDePapel() {
        Serie lcdpapel = new Serie();
        lcdpapel.nombre = "La casa de papel";
        lcdpapel.anio = 2017;
        lcdpapel.clasificacion = "Policial, Suspenso, Humor Negro";

    

        this.series.add(lcdpapel);

        Temporada temporada1 = new Temporada();
        temporada1.numero = 1;
        lcdpapel.temporadas.add(temporada1);

        Temporada temporada2 = new Temporada();
        temporada2.numero = 2;
        lcdpapel.temporadas.add(temporada2);

        Episodio epi1 = new Episodio(1, "Efectuar lo acordado", 40);
        epi1.descripcion = "El Profesor recluta a una joven experta en atracos y a otros siete delincuentes para llevar a cabo un gran asalto a la Fábrica Nacional de Moneda y Timbre.";
       

        temporada1.episodios.add(epi1);

        Episodio epi2 = new Episodio(2, "Imprudencias letales", 49);
        epi2.descripcion = "Raquel, la negociadora de rehenes, establece un primer contacto con el Profesor. La policía consigue una imagen de la cara de uno de los ladrones";
        

        temporada1.episodios.add(epi2);

        Episodio epi16 = new Episodio(16, "Hemos vuelto", 48);
        epi16.descripcion = "Desconsolada por el secuestro de Río, Tokio recurre al Profesor. Después de tramar un nuevo y osado plan para rescatarlo, solo queda reunir al resto de la banda.";
        
        
        temporada2.episodios.add(epi16);
    }

    }

