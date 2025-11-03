package uni1a;

public class VideoYouTube extends ContenidoAudiovisual {
    private String canal;
    private int likes;
    private String categoria;

    public VideoYouTube(String titulo, int duracionEnMinutos, String genero, 
                       String canal, int likes, String categoria) {
        super(titulo, duracionEnMinutos, genero);
        this.canal = canal;
        this.likes = likes;
        this.categoria = categoria;
    }

    // Getters y setters
    public String getCanal() { return canal; }
    public void setCanal(String canal) { this.canal = canal; }
    
    public int getLikes() { return likes; }
    public void setLikes(int likes) { this.likes = likes; }
    
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    
    public void calcularPopularidad() {
        if (likes > 1000) {
            System.out.println("El video es popular");
        } else {
            System.out.println("El video necesita más likes");
        }
    }
    
    public void mostrarComentarios() {
        System.out.println("Mostrando comentarios del video...");
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del video de YouTube:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Canal: " + canal);
        System.out.println("Likes: " + likes);
        System.out.println("Categoría: " + categoria);
        System.out.println();
    }
}