package uni1a;

public class Cortometraje extends ContenidoAudiovisual {
    private String festival;
    private String premio;
    private int duracionMinutos;

    public Cortometraje(String titulo, int duracionEnMinutos, String genero, 
                       String festival, String premio) {
        super(titulo, duracionEnMinutos, genero);
        this.festival = festival;
        this.premio = premio;
        this.duracionMinutos = duracionEnMinutos;
    }

    // Getters y setters
    public String getFestival() { return festival; }
    public void setFestival(String festival) { this.festival = festival; }
    
    public String getPremio() { return premio; }
    public void setPremio(String premio) { this.premio = premio; }
    
    public int getDuracionMinutos() { return duracionMinutos; }
    public void setDuracionMinutos(int duracionMinutos) { this.duracionMinutos = duracionMinutos; }
    
    public boolean esElegibleParaPremio() {
        return premio != null && !premio.isEmpty();
    }
    
    public void mostrarFestival() {
        System.out.println("Este cortometraje se presentó en: " + festival);
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del cortometraje:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + duracionMinutos + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Festival: " + festival);
        System.out.println("Premio: " + (premio != null ? premio : "Ninguno"));
        System.out.println();
    }
}