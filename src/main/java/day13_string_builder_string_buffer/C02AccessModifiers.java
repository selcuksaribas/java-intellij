package day13_string_builder_string_buffer;

public class C02AccessModifiers {

        /*
            1)Access Modifiers modify accessing to data
            2)There are 4 Access Modifiers: i)public  ii)protected  iii)default  iv)private
            3)"private" class members can be accessible just from the class they were created in.
              If you go to another class, it cannot be accessible.
              But others can be accessed from other classes.
            4)"public" access modifier is accessible from entire the project.
              "default" access modifier is accessible from the package itself.
              When you go to another package, default class members cannot be accessible
            5)"default" class members cannot be accessed from other packages, but
              "protected" class members can be accessed if we are in child class.
         */

    public static void main(String[] args) {

        C03AccessModifiersClass std = new C03AccessModifiersClass();



    }

}