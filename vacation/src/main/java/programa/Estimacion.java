package programa;
import java.util.Scanner;

/**
 * Esta clase proporciona una interfaz de línea de comandos
 * para estimar el costo de un paquete de vacaciones.
 */
public final class Estimacion {

    /**
     * Constructor privado para evitar instanciación.
     */
    private Estimacion() {
    }

    // CHECKSTYLE:OFF
    /**
     * Método principal que interactúa con el usuario
     * para estimar el costo de un paquete de vacaciones.
     *
     * @param args Los argumentos de línea de comandos
     * (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos de la vacación
        System.out.print("Ingrese el destino de la vacación (Paris, New York City u otro): ");
        String destination = scanner.nextLine();
        System.out.print("Ingrese el número de viajeros: ");
        int numberOfTravelers = scanner.nextInt();
        System.out.print("Ingrese la duración de la vacación en días: ");
        int duration = scanner.nextInt();

        VacationPackage paquete = new VacationPackage(destination, numberOfTravelers, duration);
        int totalCost = paquete.calculateTotalCost();

        if (totalCost == -1) {
            System.out.println("Datos de entrada no válidos.");
        } else {
            System.out.println("Costo total de la vacación: $" + totalCost);
        }
    }
    // CHECKSTYLE:ON
}
