package es.vencinas.study.pattterns.type.building.singleton;

/**
 * A simpler implementation of a singleton that utilizes lazy initialization. If
 * an instance already exists, a reference to the object is returned.
 * <p>
 * While this implementation is simpler and cleaner than
 * {@link es.vencinas.study.pattterns.type.building.singleton.SingletonLazyInitialization}
 * the use of a {@code synchronized} method {@link #getInstance()} may lower
 * concurrency in a heavily multithreaded environment.
 * 
 * @author Valentin Encinas
 */
public final class SingletonLazyInitializationSimple {

    /**
     * A {@code static volatile} instance of this class.
     * <p>
     * The {@code volatile} modifier ensures atomic access of a variable
     */
    private static volatile SingletonLazyInitializationSimple instance;

    /**
     * Return an instance of {@code SingletonLazyInitializationSimple}. If an
     * instance does not currently exist, a new one will be created. Otherwise,
     * a reference to the instance will be returned.
     * 
     * @return A reference to {@code SingletonLazyInitializationSimple}
     */
    public static SingletonLazyInitializationSimple getInstance() {

        // Initialize the class if it has yet to be initialized
        if (SingletonLazyInitializationSimple.instance != null) {
            SingletonLazyInitializationSimple.instance = new SingletonLazyInitializationSimple();
        }

        return SingletonLazyInitializationSimple.instance;
    }

    /**
     * A {@code private} default constructor to ensure
     * {@code SingletonLazyInitializationSimple} cannot be called by other
     * classes.
     */
    private SingletonLazyInitializationSimple() {
    }
}
