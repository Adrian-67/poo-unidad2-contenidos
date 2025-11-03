package uni1a;

import java.util.ArrayList;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    private List<Temporada> listaTemporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.listaTemporadas = new ArrayList<>();
    }

    public int getTemporadas() { return temporadas; }
    public void setTemporadas(int temporadas) { this.temporadas = temporadas; }
    
    public List<Temporada> getListaTemporadas() { return listaTemporadas; }
    
    public void agregarTemporada(Temporada temporada) {
        this.listaTemporadas.add(temporada);
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración por episodio: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Número de temporadas: " + temporadas);
        System.out.println("Temporadas:");
        for (Temporada temporada : listaTemporadas) {
            System.out.println("  - Temporada " + temporada.getNumeroTemporada() + 
                             " (" + temporada.getNumEpisodios() + " episodios)");
        }
        System.out.println();
    }
}