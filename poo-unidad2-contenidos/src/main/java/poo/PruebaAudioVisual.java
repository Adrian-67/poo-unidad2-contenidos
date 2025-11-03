package poo;
import uni1a.*;
import java.util.logging.*;
public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE CONTENIDOS AUDIOVISUALES ===\n");

        // Crear actores (CORREGIDO)
        Actor actor1 = new Actor("Leonardo DiCaprio", "1974-11-11", "Estadounidense");
        Actor actor2 = new Actor("Jennifer Lawrence", "1990-08-15", "Estadounidense");

        // Crear investigadores (CORREGIDO)
        Investigador investigador1 = new Investigador("Dr. Carlos Ruiz", "Biología Marina", "Universidad Central");

        // Crear contenidos (CORREGIDO)
        Pelicula avatar = new Pelicula("Avatar", 162, "Ciencia Ficción", "20th Century Studios");
        avatar.agregarActor(actor1);
        avatar.agregarActor(actor2);

        SerieDeTV got = new SerieDeTV("Game of Thrones", 55, "Fantasy", 8);
        Temporada temp1 = new Temporada(1, 10, "2011-04-17");
        Temporada temp2 = new Temporada(2, 10, "2012-04-01");
        got.agregarTemporada(temp1);
        got.agregarTemporada(temp2);

        Documental cosmos = new Documental("Cosmos: Una Odisea en el Espacio", 45, "Ciencia", "Astronomía", investigador1);

        VideoYouTube tutorial = new VideoYouTube("Aprende Java en 10 minutos", 10, "Educación", 
                                               "Programación Fácil", 25000, "Tecnología");

        Cortometraje corto = new Cortometraje("El Último Día", 12, "Drama", 
                                            "Festival de Sundance", "Mejor Cortometraje");

        // Mostrar todos los contenidos
        ContenidoAudiovisual[] contenidos = {avatar, got, cosmos, tutorial, corto};
        
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }

        // Demostrar funcionalidades específicas
        System.out.println("=== FUNCIONALIDADES ADICIONALES ===");
        
        actor1.mostrarFilmografia();
        temp1.calcularDuracionTotal(55);
        investigador1.publicarEstudio();
        tutorial.calcularPopularidad();
        tutorial.mostrarComentarios();
        corto.mostrarFestival();
        System.out.println("¿Elegible para premio? " + corto.esElegibleParaPremio());
    }
}