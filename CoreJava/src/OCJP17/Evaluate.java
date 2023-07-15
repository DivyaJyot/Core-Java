package OCJP17;

import java.util.function.Predicate;

@FunctionalInterface
public interface Evaluate<T> {

	Boolean isNegative(T t);
	
	
}
