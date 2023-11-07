package programa;

/**
 * Esta clase representa un paquete de vacaciones
 * con su destino, no. de viajeros y duración.
 */
public class VacationPackage {

    /**
     * El destino de la vacación.
     */
    final private String destination;

    /**
     * El número de viajeros.
     */
    private int numberOfTravelers;

    /**
     * La duración de la vacación en días.
     */
    private int duration;

    private boolean todoIncluido;
    private boolean actividadesAventura;
    private boolean spaBienestar;

    /**
     * Constructor para crear un objeto VacationPackage.
     *
     * @param destination       El destino de la vacación.
     * @param numberOfTravelers El número de viajeros.
     * @param duration          La duración de la vacación en días.
     */
    public VacationPackage(String destination, int numberOfTravelers, int duration) {
        this.destination = destination;
        this.numberOfTravelers = numberOfTravelers;
        this.duration = duration;
        todoIncluido = false;
        actividadesAventura = false;
        spaBienestar = false;
    }
    
    public void setTodoIncluido(boolean todoIncluido) {
        this.todoIncluido = todoIncluido;
    }

    public void setActividadesAventura(boolean actividadesAventura) {
        this.actividadesAventura = actividadesAventura;
    }

    public void setSpaBienestar(boolean spaBienestar) {
        this.spaBienestar = spaBienestar;
    }

    /**
	 * @return the destination
	 */
    public String getDestination() {
		return destination;
	}


	/**
	 * @return the numberOfTravelers
	 */
	public int getNumberOfTravelers() {
		return numberOfTravelers;
	}

	/**
	 * @param numberOfTravelers the numberOfTravelers to set
	 */
	public void setNumberOfTravelers(int numberOfTravelers) {
		this.numberOfTravelers = numberOfTravelers;
	}

	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

	
	/**
     * Calcula el costo total del paquete de vacaciones.
     *
     * @return El costo total del paquete de vacaciones
     * -1 si los datos de entrada no son válidos.
     * */
	public int calculateTotalCost() {
        int additionalCost = 0;

        // Determinar el costo adicional basado en el destino
        if ("Paris".equalsIgnoreCase(destination)) {
            additionalCost = Constantes.COSTO_PARIS;
        } else if ("New York City".equalsIgnoreCase(destination)) {
            additionalCost = Constantes.COSTO_NYC;
        } else if (!"otro".equalsIgnoreCase(destination)) {
            return -1; // Destino no válido
        }


        double totalCost = Constantes.COSTO_BASE + additionalCost;

        // COnidicon plicar descuentos basados en el número de viajeros
        boolean condicion = numberOfTravelers > Constantes.MINIMO_VIAJEROS && numberOfTravelers <= Constantes.MAXIMO_VIAJEROS;

        // Aplicar descuentos basados en el número de viajeros
        if (condicion) {
            totalCost *= Constantes.DESC_10; // Aplicar descuento del 10%
        } else if (numberOfTravelers > Constantes.MAXIMO_VIAJEROS) {
            totalCost *= Constantes.DESC_20; // Aplicar descuento del 20%
        }

        // Aplicar penalizaciones y promociones basadas en la duración
        //y el número de viajeros
        if (duration < Constantes.MIN_DIAS) {
            totalCost += Constantes.PENAL_DURA_CORTA; // Penalización
        } else if (duration > Constantes.MAX_DIAS || numberOfTravelers == 2) {
            totalCost -= Constantes.PENAL_DURA_CORTA; // Promoción
        }

        
        if (todoIncluido) {
            totalCost += Constantes.COSTO_TODO_INCLUIDO * numberOfTravelers;
        }

        if (actividadesAventura) {
            totalCost += Constantes.COSTO_ACTIVIDADES_AVENTURA * numberOfTravelers;
        }

        if (spaBienestar) {
            totalCost += Constantes.COSTO_SPA_Y_BIENESTAR * numberOfTravelers;
        }

        
        
        // Validar si el grupo es demasiado grande
        if (numberOfTravelers > Constantes.DEM_VIAJEROS) {
            return -1; // Grupo demasiado grande
        }

        return (int) totalCost;
    }
}
