package day21collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class C03Sets {

    /*
        1)Sets are for storing multiple unique data
        2)Hash: Hashing is a technique to create unique data
        3)There are 3 types of Sets: i)HashSet:
                                        a)HashSet is for storing unique data
                                        b)HashSet puts the elements in random order
                                        c)HashSet accepts null as element
                                        d)HashSet is super-fast because it does not spend time on ordering elements
                                     ii)LinkedHashSet:
                                        a)LinkedHashSet is for storing unique data
                                        b)LinkedHashSet puts the elements in insertion order
                                     iii)TreeSet:
                                        a)TreeSet is for storing unique data
                                        b)TreeSet puts elements in natural order(Alphabetical order for Strings, ascending order for numeric data)
                                        c)TreeSet is so slow, because putting elements in natural order needs too much time.
                                        d)TreeSet does not accept "null" as element because "null" cannot be put in natural order
     */

    public static void main(String[] args) {

        long t1 = System.nanoTime();

        HashSet<String> emails = new HashSet<>();
        emails.add("xy@gmail.com");
        emails.add("dc@gmail.com");
        emails.add("mn@gmail.com");
        emails.add("ab@gmail.com");
        emails.add("kn@gmail.com");
        emails.add("xy@gmail.com");//Does not give error, ignores repeated data
        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails);// [ab@gmail.com, null, xy@gmail.com, dc@gmail.com, mn@gmail.com, kn@gmail.com]

        long t2 = System.nanoTime();

        LinkedHashSet<String> ids = new LinkedHashSet<>();
        ids.add("xy@gmail.com");
        ids.add("dc@gmail.com");
        ids.add("mn@gmail.com");
        ids.add("ab@gmail.com");
        ids.add("kn@gmail.com");
        ids.add("xy@gmail.com");
        ids.add(null);
        ids.add(null);
        ids.add(null);
        System.out.println(ids);// [xy@gmail.com, dc@gmail.com, mn@gmail.com, ab@gmail.com, kn@gmail.com, null]

        long t3 = System.nanoTime();

        TreeSet<String> ssn = new TreeSet<>();
        ssn.add("xy@gmail.com");
        ssn.add("dc@gmail.com");
        ssn.add("mn@gmail.com");
        ssn.add("ab@gmail.com");
        ssn.add("kn@gmail.com");
        ssn.add("xy@gmail.com");
        ssn.add("de@gmail.com");
        ssn.add("de@gmail.com");
        ssn.add("de@gmail.com");
        System.out.println(ssn);// [ab@gmail.com, dc@gmail.com, de@gmail.com, kn@gmail.com, mn@gmail.com, xy@gmail.com]

        long t4 = System.nanoTime();

        //Question: Which data structure do you use to store unique data in natural order?
        //          TreeSet
        //Question: But TreeSet is so slow how do you prevent your code to be so slow?
        //          I use HashSet to add elements then convert HashSet to TreeSet.
        HashSet<String> stdId = new HashSet<>();
        stdId.add("xy@gmail.com");
        stdId.add("dc@gmail.com");
        stdId.add("mn@gmail.com");
        stdId.add("ab@gmail.com");
        stdId.add("kn@gmail.com");
        stdId.add("xy@gmail.com");
        stdId.add("de@gmail.com");
        stdId.add("de@gmail.com");
        stdId.add("de@gmail.com");

        TreeSet<String> stdIdTree = new TreeSet<>(stdId);
        System.out.println(stdIdTree);// [ab@gmail.com, dc@gmail.com, de@gmail.com, kn@gmail.com, mn@gmail.com, xy@gmail.com]

        long t5 = System.nanoTime();

        System.out.println("HashSet: " + (t2 - t1));
        System.out.println("LinkedHashSet: " + (t3 - t2));
        System.out.println("TreeSet: " + (t4 - t3));
        System.out.println("HashSet + TreeSet: " + (t5 - t4));
    }
}