package OCJP17.Inheritance;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Flower {

    String color;

    public Flower(){
        this.color="white";
        print();
    }

    public void print(){
        System.out.println("Printing from flower");
    }

   /* public void print(Set<String> flowers){
        System.out.println("Printing from set");
    }*/

    public void print(HashSet<String> flowers){
        System.out.println("Printing from hashSet");
    }

    public void print(TreeSet<String> flowers){
        System.out.println("Printing from tresset");
    }

    public void print(Collection<String> flowers){
        System.out.println("Printing from collection");
    }
}
