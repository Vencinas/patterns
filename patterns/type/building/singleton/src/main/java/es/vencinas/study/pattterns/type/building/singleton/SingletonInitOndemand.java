package es.vencinas.study.pattterns.type.building.singleton;

/**
 * Bill Pugh's solution is known as the <b>Initialization-on-demand</b>. This
 * solution is a lazy initialization solution that takes advantages of Java's
 * guarantees about class initialization.
 * <p>
 * 
 * @author Valentin Encinas
 */
public final class SingletonInitOndemand {

    /**
     * A {@code static volatile} instance of this class.
     * <p>
     * The {@code volatile} modifier ensures atomic access of a variable
     */
    private static volatile SingletonInitOndemand instance;

    /**
     * Return an instance of {@code SingletonInitOndemand}.
     * 
     * @return A reference to {@code SingletonInitOndemand}
     */
    public static SingletonInitOndemand getInstance() {
        if (SingletonInitOndemand.instance == null) {
            SingletonInitOndemand.createInstance();
        }
        return SingletonInitOndemand.instance;
    }

    /**
     * If an instance does not currently exist, a new one will be created.
     */
    private static void createInstance() {
        // Initialize the class if it has yet to be initialized
        if (SingletonInitOndemand.instance == null) {
            // Use a synchronized statement to ensure that only one thread can
            // create an instance of SingletonLazyInitialization
            synchronized (SingletonInitOndemand.class) {
                // Is necessary to ask if the class is not initialized
                if (SingletonInitOndemand.instance == null) {
                    SingletonInitOndemand.instance = new SingletonInitOndemand();
                }
            }
        }
    }

    /**
     * A {@code private} default constructor to ensure
     * {@code SingletonInitOndemand} cannot be called by other classes.
     */
    private SingletonInitOndemand() {
    }
}
