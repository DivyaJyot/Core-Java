package com.divya.reflection;

import OCJP17.Person;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReflectionTest {
// This class is for implementing search feature in a list where you can pass the dynamic field & its value which you want to match.
    public static void main(String[] args) {
        List<Person> list= new ArrayList<>();
        list.add(new Person("divya",19,29.0));
        list.add(new Person("sneh",39,109.0));
        list.add(new Person("sharda",69,56.0));
        list.add(new Person("divyanew",19,59.0));
        callGetter(list,"age",19);
        callGetter(list,"name","sneh");

    }

    public static void callGetter(List<Person> list, String field, Object value){
        try {
            PropertyDescriptor pd = new PropertyDescriptor(field, Person.class);
            Method getter= pd.getReadMethod();
            List<Person> list2 = list.stream().filter(v -> {
                try {
                    return getter.invoke(v).equals(value);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }).collect(Collectors.toList());
            list2.forEach(System.out::println);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
