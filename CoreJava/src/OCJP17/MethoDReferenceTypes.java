package OCJP17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethoDReferenceTypes {

	public static void main(String... strings) {
		staticMR();
		boundMR();
		constructorMR();

	}

	public static void staticMR() {
		List<Integer> list= Arrays.asList(1,2,7,4,5);
		Consumer<List<Integer>> c= list1 -> Collections.sort(list1);
		c.accept(list);
		System.out.println();
		list.forEach(System.out::print);
		 list= Arrays.asList(1,2,7,4,5);
		 Consumer<List<Integer>> c2= Collections::sort;
		 c2.accept(list);
		 System.out.println();
		 list.forEach(System.out::print);

	}

	public static void boundMR() {
		String name ="Mr. Joe Bloggs";
		Predicate<String> p= v -> name.startsWith(v);
		System.out.println("name starts with Mr "+p.test("Mr"));
		System.out.println("name starts with Ms "+p.test("Ms"));
		Predicate<String> p2= name::startsWith;
		System.out.println("name starts with Mr "+p2.test("Mr"));
		System.out.println("name starts with Ms "+p2.test("Ms"));

	}

	public static void unBoundMR() {
		Predicate<String> p0= v ->v.isEmpty();
		p0.test("");
		p0.test("xyz");
		Predicate<String> p= String::isEmpty;
		p.test("");
		p.test("xyz");
		BiPredicate<String,String> p1= (f,s) ->f.startsWith(s);
		p1.test("Mr. Joe Bloggs","Mr");
		p1.test("Mr. Joe Bloggs","Ms");
		BiPredicate<String,String> p2= String::startsWith;
		p2.test("Mr. Joe Bloggs","Mr");
		p2.test("Mr. Joe Bloggs","Ms");
		
	}

	public static void constructorMR() {
		 List<String> list;
        Supplier<List<String>> s= () -> new ArrayList<String>() ;
        list=s.get();
        list.add("Lambda");
        list.forEach(v-> System.out.println(v));
        Supplier<List<String>> s2= ArrayList:: new ;
        list=s2.get();
        list.add("Method Reference");
        list.forEach(System.out::println);

        Function<Integer,List<String>> f= (a) ->new ArrayList<String>(a);
        list=f.apply(10);
        list.add("Lambda");
        list.forEach(v-> System.out.println(v));
        
        Function<Integer,List<String>> f2= ArrayList::new;
        list=f2.apply(10);
         list.add("Method Reference");
        list.forEach(System.out::println);

}
}
