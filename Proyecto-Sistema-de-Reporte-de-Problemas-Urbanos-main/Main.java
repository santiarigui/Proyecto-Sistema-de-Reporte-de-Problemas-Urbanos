import java.util.Scanner;

/**
 * Clase principal del programa.
 *
 * Se encarga de interactuar con el usuario
 * y utilizar la clase ReporteUrbano.
 */
public class Main {

    public static void main(String[] args) {

        // Creamos un objeto Scanner para leer información.
        Scanner entrada = new Scanner(System.in);

        // Variable para controlar el menú.
        int opcion;

        // Variable que almacenará el reporte creado.
        ReporteUrbano reporte = null;

        // Repetimos el menú hasta que el usuario seleccione salir.
        do {

            // Mostramos el menú principal.
            System.out.println("\n====================================");
            System.out.println("   SISTEMA DE PROBLEMAS URBANOS");
            System.out.println("====================================");
            System.out.println("1. Crear reporte");
            System.out.println("2. Agregar evidencia");
            System.out.println("3. Agregar seguimiento");
            System.out.println("4. Cambiar estado");
            System.out.println("5. Mostrar reporte");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            // Leemos la opción del usuario.
            opcion = entrada.nextInt();

            // Limpiamos el salto de línea pendiente.
            entrada.nextLine();

            // Evaluamos la opción seleccionada.
            switch (opcion) {

                case 1:

                    // Solicitamos el número del reporte.
                    System.out.print("Número del reporte: ");
                    int numero = entrada.nextInt();
                    entrada.nextLine();

                    // Solicitamos el tipo de problema.
                    System.out.print("Tipo de problema: ");
                    String tipo = entrada.nextLine();

                    // Solicitamos la ubicación.
                    System.out.print("Ubicación: ");
                    String ubicacion = entrada.nextLine();

                    // Solicitamos la descripción.
                    System.out.print("Descripción: ");
                    String descripcion = entrada.nextLine();

                    // Creamos el objeto ReporteUrbano.
                    reporte = new ReporteUrbano(
                            numero,
                            tipo,
                            ubicacion,
                            descripcion);

                    System.out.println("Reporte creado correctamente.");

                    break;

                case 2:

                    // Verificamos que exista un reporte.
                    if (reporte == null) {

                        System.out.println("Primero debe crear un reporte.");

                    } else {

                        // Pedimos la descripción de la evidencia.
                        System.out.print("Descripción de la evidencia: ");
                        String evidencia = entrada.nextLine();

                        // Agregamos la evidencia al reporte.
                        reporte.agregarEvidencia(evidencia);

                        System.out.println(
                                "Evidencia agregada correctamente.");
                    }

                    break;

                case 3:

                    // Verificamos que exista un reporte.
                    if (reporte == null) {

                        System.out.println("Primero debe crear un reporte.");

                    } else {

                        // Pedimos la descripción del seguimiento.
                        System.out.print(
                                "Descripción del seguimiento: ");

                        String seguimiento = entrada.nextLine();

                        // Agregamos el seguimiento al reporte.
                        reporte.agregarSeguimiento(seguimiento);

                        System.out.println(
                                "Seguimiento agregado correctamente.");
                    }

                    break;

                case 4:

                    // Verificamos que exista un reporte.
                    if (reporte == null) {

                        System.out.println("Primero debe crear un reporte.");

                    } else {

                        // Pedimos el nuevo estado.
                        System.out.print(
                                "Nuevo estado (Pendiente/En proceso/Solucionado): ");

                        String estado = entrada.nextLine();

                        // Cambiamos el estado.
                        reporte.cambiarEstado(estado);

                        System.out.println(
                                "Estado actualizado correctamente.");
                    }

                    break;

                case 5:

                    // Verificamos que exista un reporte.
                    if (reporte == null) {

                        System.out.println("Primero debe crear un reporte.");

                    } else {

                        // Mostramos toda la información.
                        reporte.mostrarReporte();
                    }

                    break;

                case 6:

                    // Mensaje antes de terminar.
                    System.out.println(
                            "Gracias por utilizar el sistema.");

                    break;

                default:

                    // Si la opción no existe.
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        // Cerramos Scanner.
        entrada.close();
    }
}
