package OCJP17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BasicLambdas {

	public static void main2(String[] args) {
		consumer();
		Printable<String> cs= v->System.out.println(v);
		Consumer<String> cs2=  System.out::println;
		cs.print("Printable lambda");
		cs2.accept("printable lambda");
		supplier();
		Supplier<Integer> s= ()->77;
		System.out.println(s.get());
		predicate(-1);
		predicate(1);
		Predicate<Integer> p= v->v<0?true:false;
		System.out.println(p.test(-1));
		System.out.println(p.test(1));
		function();
		Function<Integer,String> f2= v->"number is "+v;
		System.out.println(f2.apply(25));
		
		List<Person> namedList= getPeople();
		
		
		
		}
	
	public static void main3(String args[]){
	//	predicate(-1);
	//	predicate(1);
		Predicate<Integer> p= v->v<0?true:false;
		//System.out.println(p.test(-1));
		//System.out.println(p.test(1));
		Predicate<Integer> p0= v-> v%2 ==0;
		//System.out.println(check(4,p0));
		//System.out.println(check(7,p0));
		Predicate<String> p1= v-> v.startsWith("Mr");
		//System.out.println(check("Mr. Joe Bloggs",p1 ));
		//System.out.println(check("Ms. Ann Bloggs",p1 ));
		Predicate<Person> p2= v -> (v.getAge()>=18);
		System.out.println(check(new Person("Mike",33,1.8),p2));
		System.out.println(check(new Person("Ann",13,1.4),p2));
		
		}



	private static void function() {
		Functionable<Integer, String> f= v->"number is "+v;
		System.out.println(f.applyThis(25));
	}

	private static void consumer() {
		Printable<String> c1= v->System.out.println(v);
		Printable<String> c= System.out::println;
		c1.print("Printable lambda");
		c.print("Printable lambda")	;
	}
	private static void supplier() {
		Retrievable<Integer> c1= ()->77;
		System.out.println(c1.retrieve());
	}
	public static <T> boolean check(T t , Predicate<T> predicate){
		return predicate.test(t);

	}

	private static void predicate(Integer t) {
			Evaluate<Integer> p= v2->v2<0?true:false;
			System.out.println(p.isNegative(t));
	}
	
	private static List<Person> getPeople() {
		 List<Person> result = new ArrayList<>();
		 result.add(new Person("Mike", 33, 1.8));
		 result.add(new Person("Mary", 25, 1.4));
		 result.add(new Person("Alan", 34, 1.7));
		 result.add(new Person("Zoe", 30, 1.5));
		 return result;
		 }

	public static void main(String args[]) {
		List<Person> namedList= getPeople();
		namedList.forEach(v->System.out.println(v));
		System.out.println("original"+namedList);
		sortAge(namedList);
		namedList.forEach(System.out::println);
		sortName(namedList);
		namedList.forEach(v->System.out.println(v));
		sortHeight(namedList);
		namedList.forEach(v->System.out.println(v));
		
	}
	public static void sortAge(List<Person> list) {
		list.sort(Comparator.comparing(Person::getAge));;
	}
	public static void sortName(List<Person> list) {
		list.sort(Comparator.comparing(Person::getName));;
	}
	public static void sortHeight(List<Person> list) {
		list.sort(Comparator.comparing(Person::getHeight));;
	}
}
	
