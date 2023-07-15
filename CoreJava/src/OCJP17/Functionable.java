package OCJP17;

@FunctionalInterface
public interface Functionable<T, R> {

	R applyThis(T t);

}
