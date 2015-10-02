package es.vencinas.study.pattterns.type.building.singleton;

/**
 * Lazy initialization avoids initializing a value until the first time it is
 * accessed. If an instance already exists, a reference to the object is
 * returned.
 * <p>
 * 
 * @author Valentin Encinas
 */
public final class SingletonLazyInitialization {

    /**
     * A {@code static volatile} instance of this class.
     * <p>
     * The {@code volatile} modifier ensures atomic access of a variable
     */
    private static volatile SingletonLazyInitialization instance;

    /**
     * Return an instance of {@code SingletonLazyInitialization}. If an instance
     * does not currently exist, a new one will be created. Otherwise, a
     * reference to the instance will be returned.
     * 
     * @return A reference to {@code SingletonLazyInitialization}
     */
    public static SingletonLazyInitialization getInstance() {

        // Initialize the class if it has yet to be initialized
        if (SingletonLazyInitialization.instance != null) {

            // Use a synchronized statement to ensure that only one thread can
            // create an instance of SingletonLazyInitialization
            synchronized (SingletonLazyInitialization.class) {
                SingletonLazyInitialization.instance = new SingletonLazyInitialization();
            }
        }

        return SingletonLazyInitialization.instance;
    }

    /**
     * A {@code private} default constructor to ensure
     * {@code SingletonLazyInitialization} cannot be called by other classes.
     */
    private SingletonLazyInitialization() {
    }
}
