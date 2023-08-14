package day21collections;

import java.util.LinkedList;

public class C02LinkedList {

    public static void main(String[] args) {

        LinkedList<String> countries = new LinkedList<>();
        countries.add("France");
        countries.add("Italy");
        countries.add("Albania");
        countries.add("Germany");
        countries.add("Netherlands");
        System.out.println(countries);// [France, Italy, Albania, Germany, Netherlands]

        //peek() and element() methods return first element without removing.
        //For empty lists, peek() method returns "null"
        //For empty lists, element() method throws "NoSuchElementException"
        String country1 = countries.peek();// Retrieves, but does not remove, the first element of this list. It checks the first node
        System.out.println(country1);//France
        System.out.println(countries);

        String country01 = countries.element();// Retrieves, but does not remove, the first element of this list.
        System.out.println(country01);// France
        System.out.println(countries);

        LinkedList<String> names = new LinkedList<>();
        System.out.println(names.peek());// null
        //System.out.println(names.element());// NoSuchElementException

        //pop() and poll() methods return and remove the first element.
        //For empty lists, poll() method returns "null"
        //For empty lists, pop() method throws "NoSuchElementException"
        String c = countries.pop();// This method is equivalent to removeFirst()
        System.out.println(c);// France
        System.out.println(countries);// [Italy, Albania, Germany, Netherlands]

        String d = countries.poll();// Retrieves and removes the first element of this list.
        System.out.println(d);// Italy
        System.out.println(countries);// [Albania, Germany, Netherlands]

        System.out.println(names.pop());// NoSuchElementException
        System.out.println(names.poll());// null
    }
}