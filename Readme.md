# Sistema de Gestión de Contenidos Audiovisuales

## Descripción
Sistema desarrollado en Java para gestionar diferentes tipos de contenidos audiovisuales utilizando conceptos avanzados de POO como herencia, asociación, agregación y composición.

## Características Principales
- Gestión de películas, series, documentales, videos de YouTube y cortometrajes
- Relaciones entre clases: Actores-Películas, Temporadas-Series, Investigadores-Documentales
- Sistema extensible y modular

## Clases Implementadas

### Clases Base
- `ContenidoAudiovisual` (clase abstracta)
- `Pelicula`, `SerieDeTV`, `Documental`

### Nuevas Clases de Relación
- `Actor` - Relación de agregación con Película
- `Temporada` - Relación de composición con SerieDeTV  
- `Investigador` - Relación de asociación con Documental

### Nuevas Subclases
- `VideoYouTube` - Videos de plataforma YouTube
- `Cortometraje` - Cortometrajes para festivales

## Instalación y Ejecución

1. Clonar el repositorio:
```bash
git clone https://github.com/Adrian-67/poo-unidad2-contenidos.git
cd poo-unidad2-contenidos