package com.divya.stream;

import com.divya.Java17.Days;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCollectExample {
    public static void main(String[] args) {
        Stream<String> data= Stream.of("I ","am","ja","sa");
        //TreeSet<String> set=data.collect(Collectors.toCollection(TreeSet::new));
    //   Set<String> set1=data.collect(Collectors.toSet());
      //  System.out.println(set1);
        //System.out.println(data.toArray());
        System.out.println(data.toList());

        List<Person> friends = Arrays.asList(new Person("Bob", 31),
                new Person("Paul", 32),
                new Person("John", 33));
        double averageAge = friends.stream()
                .filter(f->f.getAge()<32)
                .mapToInt(f->f.getAge())
                .average().getAsDouble();//returns optional
        System.out.println(averageAge);
        List<Person> friends2 = Arrays.asList(new Person("Bob", 31),
                new Person("Paul", 32),
                new Person("John", 33));

        List<List<Person>> list= new ArrayList<>();
               list.add (Arrays.asList(new Person("Bob", 31),
                new Person("Paul", 32),
                new Person("John", 33)));
        list.add ( Arrays.asList(new Person("Bob1", 10),
                        new Person("Pau1l", 32),
                        new Person("J1ohn", 30)));
      //  int v=10;
        List<Integer> avg = list.stream().flatMap(Collection::stream).map(v -> v.getAge()).collect(Collectors.toList());
        double sum = list.stream().flatMap(Collection::stream).filter(v->v.getAge()>50).mapToDouble(v -> v.getAge()).sum();
        OptionalDouble avd = list.stream().flatMap(Collection::stream).filter(v->v.getAge()>50).mapToDouble(v -> v.getAge()).average();
        System.out.println(avd);
    }
    static class Person{
        String name;
        int age;
        public Person(String name,int age){
            this.name=name;
            this.age=age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}
