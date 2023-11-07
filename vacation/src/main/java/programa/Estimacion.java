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
     * 
     */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        // Solicitar datos de la vacación
        System.out.print("Ingrese el destino de la vacación (Paris, New York City u otro): ");
        final String destination = scanner.nextLine();
        System.out.print("Ingrese el número de viajeros: ");
        final int numberOfTravelers = scanner.nextInt();
        System.out.print("Ingrese la duración de la vacación en días: ");
        final int duration = scanner.nextInt();

        VacationPackage paquete = new VacationPackage(destination, numberOfTravelers, duration);
        if (paquete.calculateTotalCost()==-1) {
            System.out.println("\nDatos de entrada no válidos. Por el momento solo tenemos disponibles Paris y NY.");
        }else {
        	// Solicitar la selección de complementos opcionales
            System.out.print("¿Desea agregar el paquete Todo Incluido? (Sí/No): ");
            String todoIncluidoInput = scanner.next();
            paquete.setTodoIncluido("Sí".equalsIgnoreCase(todoIncluidoInput) || "Si".equalsIgnoreCase(todoIncluidoInput));

            System.out.print("¿Desea agregar el paquete de Actividades de Aventura? (Sí/No): ");
            String actividadesAventuraInput = scanner.next();
            paquete.setActividadesAventura("Sí".equalsIgnoreCase(actividadesAventuraInput) || "Si".equalsIgnoreCase(actividadesAventuraInput));

            System.out.print("¿Desea agregar el paquete de Spa y Bienestar? (Sí/No): ");
            String spaBienestarInput = scanner.next();
            paquete.setSpaBienestar("Sí".equalsIgnoreCase(spaBienestarInput) || "Si".equalsIgnoreCase(spaBienestarInput));        

            int totalCost = paquete.calculateTotalCost();

            if (totalCost == -1) {
                System.out.println("Datos de entrada no válidos.");
            } else {
                System.out.println("Costo total de la vacación: $" + totalCost);
            }
        }
        
    }
    // CHECKSTYLE:ON
}
