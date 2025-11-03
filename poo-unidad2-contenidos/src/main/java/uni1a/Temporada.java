package uni1a;

public class Temporada {
    private int numeroTemporada;
    private int numEpisodios;
    private String fechaEstreno;

    public Temporada(int numeroTemporada, int numEpisodios, String fechaEstreno) {
        this.numeroTemporada = numeroTemporada;
        this.numEpisodios = numEpisodios;
        this.fechaEstreno = fechaEstreno;
    }

    // Getters y setters
    public int getNumeroTemporada() { return numeroTemporada; }
    public void setNumeroTemporada(int numeroTemporada) { this.numeroTemporada = numeroTemporada; }
    
    public int getNumEpisodios() { return numEpisodios; }
    public void setNumEpisodios(int numEpisodios) { this.numEpisodios = numEpisodios; }
    
    public String getFechaEstreno() { return fechaEstreno; }
    public void setFechaEstreno(String fechaEstreno) { this.fechaEstreno = fechaEstreno; }
    
    public void calcularDuracionTotal(int duracionEpisodio) {
        int duracionTotal = numEpisodios * duracionEpisodio;
        System.out.println("Duración total temporada " + numeroTemporada + ": " + duracionTotal + " minutos");
    }
}