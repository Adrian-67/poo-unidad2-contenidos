package uni1a;

public abstract class ContenidoAudiovisual {
    private static int contar = 0;
    private String titulo;
    private int duracionEnMinutos;
    private String genero;
    private int id;

    public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero) {
        this.id = contar++;
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
    }

    // Getters
    public String getTitulo() { return titulo; }
    public int getDuracionEnMinutos() { return duracionEnMinutos; }
    public String getGenero() { return genero; }
    public int getId() { return id; }

    // Setters
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setDuracionEnMinutos(int duracionEnMinutos) { this.duracionEnMinutos = duracionEnMinutos; }
    public void setGenero(String genero) { this.genero = genero; }

    public abstract void mostrarDetalles();
}