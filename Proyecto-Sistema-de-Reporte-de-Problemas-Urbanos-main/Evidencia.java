/**
 * Clase que representa una evidencia de un problema urbano.
 *
 * Una evidencia puede ser, por ejemplo, una fotografía
 * o una descripción que ayude a demostrar el problema.
 */
public class Evidencia {

    // Atributo que almacena la descripción de la evidencia.
    private String descripcion;

    // Constructor de la clase Evidencia.
    public Evidencia(String descripcion) {

        // Guardamos la descripción recibida en el atributo.
        this.descripcion = descripcion;
    }

    // Método que permite obtener la descripción.
    public String getDescripcion() {

        // Retornamos la descripción de la evidencia.
        return descripcion;
    }

    // Método que muestra la información de la evidencia.
    public void mostrarEvidencia() {

        // Imprimimos la descripción en pantalla.
        System.out.println("- " + descripcion);
    }
}
    