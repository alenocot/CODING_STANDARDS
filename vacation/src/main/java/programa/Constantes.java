package programa;

/**
 * Esta clase proporciona constantes utilizadas en el programa
 * de estimación de costos de vacaciones.
 */
public final class Constantes {

	/**
     * Constructor privado para evitar instanciación.
     */
	private Constantes() { }

    /**
     * Costo adicional para el destino Paris.
     */
    public static final int COSTO_PARIS = 500;

    /**
     * Costo adicional para el destino New York City.
     */
    public static final int COSTO_NYC = 600;

    /**
     * Descuento del 10%.
     */
    public static final double DESC_10 = 0.9;

    /**
     * Descuento del 20%.
     */
    public static final double DESC_20 = 0.8;

    /**
     * Penalización por duración de vacación corta.
     */
    public static final int PENAL_DURA_CORTA = 200;

    /**
     * Tamaño máximo del grupo de viajeros.
     */
    public static final int MAXIMO_VIAJEROS = 10;

    /**
     * Tamaño mínimo del grupo de viajeros.
     */
    public static final int MINIMO_VIAJEROS = 4;

    /**
     * Tamaño máximo del grupo de viajeros considerado demasiado grande.
     */
    public static final int DEM_VIAJEROS = 80;

    /**
     * Número mínimo de días para que una vacación no se considere corta.
     */
    public static final int MIN_DIAS = 7;

    /**
     * Número mínimo de días para que una vacación no se considere larga.
     */
    public static final int MAX_DIAS = 30;


    /**
     * Costo base.
     */
    public static final int COSTO_BASE = 1000;
    /**
     * Costo adicional para el paquete Todo Incluido por viajero.
     */
    public static final int COSTO_TODO_INCLUIDO = 200;

    /**
     * Costo adicional para el paquete de Actividades de Aventura por viajero.
     */
    public static final int COSTO_ACTIVIDADES_AVENTURA = 150;

    /**
     * Costo adicional para el paquete de Spa y Bienestar por viajero.
     */
    public static final int COSTO_SPA_Y_BIENESTAR = 100;

}
