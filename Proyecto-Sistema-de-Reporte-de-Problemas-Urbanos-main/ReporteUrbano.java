import java.util.ArrayList;

/**
 * Clase principal que representa un reporte de un problema urbano.
 *
 * Un ReporteUrbano está compuesto por objetos Evidencia
 * y objetos Seguimiento.
 */
public class ReporteUrbano {

    // Número que identifica el reporte.
    private int numero;

    // Tipo de problema reportado.
    private String tipoProblema;

    // Lugar donde se encuentra el problema.
    private String ubicacion;

    // Explicación detallada del problema.
    private String descripcion;

    // Estado actual del reporte.
    private String estado;

    // Lista de evidencias que pertenecen al reporte.
    private ArrayList<Evidencia> evidencias;

    // Lista de seguimientos que pertenecen al reporte.
    private ArrayList<Seguimiento> seguimientos;

    /**
     * Constructor de ReporteUrbano.
     */
    public ReporteUrbano(
            int numero,
            String tipoProblema,
            String ubicacion,
            String descripcion) {

        // Guardamos el número del reporte.
        this.numero = numero;

        // Guardamos el tipo de problema.
        this.tipoProblema = tipoProblema;

        // Guardamos la ubicación.
        this.ubicacion = ubicacion;

        // Guardamos la descripción.
        this.descripcion = descripcion;

        // Todo reporte comienza con estado "Pendiente".
        this.estado = "Pendiente";

        // Creamos la lista de evidencias.
        this.evidencias = new ArrayList<>();

        // Creamos la lista de seguimientos.
        this.seguimientos = new ArrayList<>();
    }

    /**
     * Agrega una evidencia al reporte.
     */
    public void agregarEvidencia(String descripcion) {

        // Creamos una nueva Evidencia.
        Evidencia evidencia = new Evidencia(descripcion);

        // Agregamos la evidencia a la lista del reporte.
        evidencias.add(evidencia);
    }

    /**
     * Agrega un seguimiento al reporte.
     */
    public void agregarSeguimiento(String descripcion) {

        // Creamos un nuevo Seguimiento.
        Seguimiento seguimiento = new Seguimiento(descripcion);

        // Agregamos el seguimiento a la lista del reporte.
        seguimientos.add(seguimiento);
    }

    /**
     * Cambia el estado del reporte.
     */
    public void cambiarEstado(String nuevoEstado) {

        // Actualizamos el estado del reporte.
        this.estado = nuevoEstado;
    }

    /**
     * Muestra toda la información del reporte.
     */
    public void mostrarReporte() {

        System.out.println("\n====================================");
        System.out.println("         REPORTE URBANO");
        System.out.println("====================================");

        // Mostramos los datos principales.
        System.out.println("Número: " + numero);
        System.out.println("Problema: " + tipoProblema);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Estado: " + estado);

        // Mostramos las evidencias.
        System.out.println("\nEVIDENCIAS:");

        if (evidencias.isEmpty()) {

            // Si no existen evidencias.
            System.out.println("No hay evidencias registradas.");

        } else {

            // Recorremos todas las evidencias.
            for (Evidencia evidencia : evidencias) {

                // Mostramos cada evidencia.
                evidencia.mostrarEvidencia();
            }
        }

        // Mostramos los seguimientos.
        System.out.println("\nSEGUIMIENTOS:");

        if (seguimientos.isEmpty()) {

            // Si no existen seguimientos.
            System.out.println("No hay seguimientos registrados.");

        } else {

            // Recorremos todos los seguimientos.
            for (Seguimiento seguimiento : seguimientos) {

                // Mostramos cada seguimiento.
                seguimiento.mostrarSeguimiento();
            }
        }

        System.out.println("====================================");
    }
}