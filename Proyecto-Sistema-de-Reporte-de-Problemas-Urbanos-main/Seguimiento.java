/**
 * Clase que representa un seguimiento realizado
 * a un problema urbano.
 */
public class Seguimiento {

    // Atributo que almacena la descripción del seguimiento.
    private String descripcion;

    // Constructor de la clase Seguimiento.
    public Seguimiento(String descripcion) {

        // Guardamos la descripción recibida.
        this.descripcion = descripcion;
    }

    // Método que permite obtener la descripción.
    public String getDescripcion() {

        // Retornamos la descripción.
        return descripcion;
    }

    // Método que muestra la información del seguimiento.
    public void mostrarSeguimiento() {

        // Imprimimos la descripción en pantalla.
        System.out.println("- " + descripcion);
    }
}