# Catálogo de Videojuegos

Este proyecto es una aplicación de Android para visualizar un catálogo de videojuegos. Los usuarios pueden ver una lista de videojuegos con su portada, nombre, año de lanzamiento y descripción. Al hacer clic en un videojuego, el usuario es llevado a una pantalla de detalles donde puede ver más información sobre el videojuego seleccionado.

## Características

- Muestra una lista de videojuegos.
- Cada videojuego incluye:
  - Portada
  - Nombre
  - Año de lanzamiento
  - Descripción
- Al hacer clic en un videojuego, se abre una nueva pantalla con más detalles.
- Utiliza la librería [Picasso](https://square.github.io/picasso/) para cargar imágenes desde URLs.
- Implementación de RecyclerView para una lista dinámica.
  
## Tecnologías Utilizadas

- **Java**: Lenguaje principal para el desarrollo de la aplicación.
- **Android SDK**: Framework para el desarrollo de aplicaciones Android.
- **Picasso**: Librería para la carga y manipulación de imágenes.
- **Gson**: Librería para la serialización y deserialización de objetos JSON.
- **RecyclerView**: Componente para listas dinámicas.

## Instalación y Uso

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/tu_usuario/catalogo-videojuegos.git

  bash

2. **Abrir en Android Studio:**

Abre Android Studio
Importa el proyecto clonado.
3. **Ejecutar la aplicación:**

Conecta un dispositivo Android o usa un emulador.
Haz clic en el botón "Run" para compilar y ejecutar la aplicación.

4. **Estructura del Proyecto**
MainActivity.java: La actividad principal que muestra el catálogo de videojuegos.
DetalleVideojuegoActivity.java: La actividad que muestra los detalles de un videojuego.
VideoJuegoAdaptador.java: Adaptador para manejar la lista de videojuegos en el RecyclerView.
Videojuego.java: Clase que representa el objeto Videojuego con sus atributos (portada, nombre, año y descripción).

5. **Librerías Externas**
Picasso
Gson

6. **Próximas Mejoras**
Añadir función de búsqueda para filtrar videojuegos.
Agregar una opción para ordenar videojuegos por año de lanzamiento.
Implementar un sistema de favoritos.
