package JavaBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class List {
    public static void main(String[] args) {

        /*
        An ArrayList is a resizable array that can grow as needed.
        Allows duplicate elements. add(),get(),set(),remove(),size()
        1. add() → inserts new element
        2. set() → replaces existing element
         */

        ArrayList<String> cars = new ArrayList<>();

        //ADD
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("Audi");
        cars.add("Jaguar");
        cars.add("Mercedes");
        System.out.println("ArrayList data :-" + cars);

        //UPDATE
        cars.set(1, "KIA"); //It will replace the value
        cars.addFirst("Maruti");
        cars.addLast("Tata");
        cars.add("NewCar");
        System.out.println("Updated with KIA , Maruti ,Tata :-" + cars);

        //GET
        System.out.println("Get the all cars :-" + cars);
        System.out.println("Get the first element :-" + cars.getFirst());
        System.out.println("Get the last element :-" + cars.getLast());
        System.out.println("Get the index of KIA:-" + cars.indexOf("KIA"));
        System.out.println("Get the 3nd element :-" + cars.get(2));


        //REMOVE
        cars.remove("Toyota");
        cars.removeFirst();
        cars.removeLast();
        cars.remove(1);
        System.out.println("Removed Toyota :-" + cars);



        //============LINKED LIST================//

        LinkedList<String> animals = new LinkedList<String>();

        //ADD
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Monkey");
        System.out.println("LinkedList data :-" + animals);

        //UPDATE
        animals.add(1,"Pig");
        System.out.println("LinkedList data after update:-" + animals);

        //GET
        System.out.println("LinkedList 2nd element:-" + animals.get(2));

        //REMOVE
        animals.remove("Dog");
        System.out.println("LinkedList after removing Dog:-" + animals);

        //REPLACE
        animals.set(0,"Naanu");
        System.out.println("LinkedList after replacing Naanu:-" + animals);
    }
}


