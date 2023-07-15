package OCJP17;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamTest {
	
	public static final void main(String[] args) {
		Optional<Integer> s= Stream.of(12,3,5,7,4).min((s1,s2) -> s1-s2);
		System.out.println(s.get());
		Stream<Integer> s1= Stream.of(2,3);
		double x = s1.mapToDouble(n -> n+1.5).reduce(3,(d1,d2) ->d1+d2);
		System.out.println(x);
	}
	
}
