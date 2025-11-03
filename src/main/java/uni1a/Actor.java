package uni1a;

import java.util.ArrayList;
import java.util.List;

public class Actor {
    private String nombre;
    private String fechaNacimiento;
    private String nacionalidad;
    private List<Pelicula> peliculas;

    public Actor(String nombre, String fechaNacimiento, String nacionalidad) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.peliculas = new ArrayList<>();
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    
    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }
    
    public List<Pelicula> getPeliculas() { return peliculas; }
    
    public void agregarPelicula(Pelicula pelicula) {
        this.peliculas.add(pelicula);
    }
    
    public void mostrarFilmografia() {
        System.out.println("Filmografía de " + nombre + ":");
        for (Pelicula pelicula : peliculas) {
            System.out.println("- " + pelicula.getTitulo());
        }
    }
}