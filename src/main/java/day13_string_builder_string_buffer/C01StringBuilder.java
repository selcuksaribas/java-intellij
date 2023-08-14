package day13_string_builder_string_buffer;

public class C01StringBuilder {

    /*
        1)We have 3 classes in Java to create String;
            i)String Class  ii)StringBuilder Class ii)StringBuffer Class
        2)Why did Java create 3 classes to create Strings?
            i)String Class is "immutable", StringBuilder Class is "mutable"
            When you update a String, Java creates a new container and puts the updated value in it.
            When you update a String, Java does not update original value. This is called "immutability"

            When you update a StringBuilder, Java updates the original value. This is called "mutability"
        3)Is there any other immutable class in Java?
          Yes, all wrapper classes are immutable
        4)StringBuilder and StringBuffer are "mutable" so what is the difference between StringBuilder and StringBuffer?
          i)StringBuilder is faster than StringBuffer
          ii)StringBuffer is "thread-safe" and "synchronized", but StringBuilder is not.
             Being "thread-safe" means to be able to do multiple tasks(threads) at the same time.
             Being "synchronized" means to be able to order the threads to save time.
     */

    public static void main(String[] args) {

        String s = "Java";
        String t = "Java";
        String u = "Apex";
        System.out.println(s);// Java


        s = s.concat("!");
        System.out.println(s);// Java

        //I want Java not to check String Pool, I want Java to create new containers every time.
        String y = new String("Apex");


        StringBuilder v = new StringBuilder("Python");
        System.out.println(v);//Python

        v.append("!");
        System.out.println(v);// Python!

        StringBuffer x = new StringBuffer("Ruby");
        System.out.println(x);

        //Methods in StringBuilder Class
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);

        sb.append("Hi! ").append("Java!...");
        System.out.println(sb);// Hi! Java...

        System.out.println(sb.capacity());// 16
        System.out.println(sb.length());// 12


        StringBuilder stateAbbr = new StringBuilder(2);

        stateAbbr.append("FL").append("Why").append("Jack");

        System.out.println(stateAbbr);

        System.out.println(stateAbbr.capacity());// New Capacity = 2*Existing Capacity + 2 ==> 14
        System.out.println(stateAbbr.length());// 9

        sb.reverse();
        System.out.println(sb);// ...!avaJ !iH

        sb.replace(0, 4, "*");
        System.out.println(sb);// *avaJ !iH

        sb.insert(5, "123");
        System.out.println(sb);// *avaJ123 !iH

        sb.delete(5, 8);
        System.out.println(sb);// *avaJ !iH

        sb.deleteCharAt(6);
        System.out.println(sb);// *avaJ iH

        StringBuilder a = new StringBuilder("Nava");
        StringBuilder b = new StringBuilder("Lava");

        int r = a.compareTo(b);// Compares two StringBuilder instances lexicographically
        System.out.println(r);// +2

        a.setCharAt(2, 'n');
        System.out.println(a);// Nana

        //Methods in StringBuffer Class
        StringBuffer sbf = new StringBuffer("Python");

        System.out.println(sbf.subSequence(2, 4));//th
        System.out.println(sbf);
    }
}