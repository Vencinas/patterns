package es.vencinas.study.pattterns.type.building.singleton;

/**
 * The eager initialization singleton creates a new INSTANCE when the class is
 * initialized.
 * <p>
 * An eager initialization is the simplest way to implement this design pattern.
 * Only use this implementation if the cost of creating the INSTANCE is not too
 * large in terms of time/resources.
 * <p>
 * 
 * @version 1.0.0 - 01 Oct 2016
 * @author Valentin Encinas
 */
public final class SingletonEagerInitialization {

    /**
     * A {@code static final} INSTANCE of this class.
     */
    private static final SingletonEagerInitialization INSTANCE = new SingletonEagerInitialization();

    /**
     * Return an INSTANCE of {@code SingletonEagerInitialization}.
     * 
     * @return A reference to {@code SingletonEagerInitialization}
     */
    public static SingletonEagerInitialization getInstance() {
        return SingletonEagerInitialization.INSTANCE;
    }

    /**
     * A {@code private} default constructor to ensure
     * {@code SingletonEagerInitialization} cannot be called by other classes.
     */
    private SingletonEagerInitialization() {
    }

}
