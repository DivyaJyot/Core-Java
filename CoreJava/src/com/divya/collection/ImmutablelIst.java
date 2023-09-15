package com.divya.collection;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;

public class ImmutablelIst {

    public static void main(String[] args) {

        Person p1= new Person(12,"abc",50.3);
        Person p2= new Person(22,"abc1",54.3);
        Person p3= new Person(22,"abc2",50.9);
        Person p4= new Person(72,"abc2",50.9);

        List<Person> list3=List.of(p1,p2);
      //  list3.add(p3);
        List<Person> list1= new ArrayList<>();
        list1.add(p1);
        list1.add(p2);
        list1.add(p4);
        list1.add(p3);
        Collection<Person> list2 = Collections.unmodifiableCollection(list1);

   /*     list1.add(p3);
        for(Person p: list2){
            p.setAge(80);
        }*/
        System.out.println(list2);
        System.out.println(list2);
        List<Person> list4=  List.copyOf(list1);
        Collections.sort(list1, new AgeComparator());
        System.out.println(list1);
       /* Collections.sort(list4, Comparator.comparing(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }


        }));
*/      Person p=Collections.max(list1);
        System.out.println(list4);

        System.out.println("min is--"+Collections.min(list1));
        Map<Integer, List<Person>> map = list1.stream().collect(groupingBy(Person::getAge));
        System.out.println(map.get(22));
        List<String> x= Arrays.asList("I","am","divya","Jyoti");
        String s=x.stream().collect(Collectors.joining(":"));
        map.get(22);

    }

}
