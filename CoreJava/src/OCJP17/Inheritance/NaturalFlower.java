package OCJP17.Inheritance;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NaturalFlower extends Flower implements Smellable{
public NaturalFlower(){
    print();
}
    public void print(){
    this.color="Red";
        System.out.println("Printing from natural flower");
    }

    /*public void print(NavigableSet<String> flowers){
        System.out.println("Printing from navigableset");
    }*/


}
