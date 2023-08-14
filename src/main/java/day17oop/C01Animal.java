package day17oop;

        /*
            1)Java does not let us create an object from "abstract classes"
              because "abstract classes" can have "abstract methods",
              "abstract methods" have a missing part which is "method body",
              it means "abstract methods" are not completed methods.
              If a method is not completed, it cannot complete the tasks in the application.
              This is issue, we do not want it.
            2)If an abstract method was overridden by any concrete child class, child classes of the concrete child class
              may or may not override the abstract method.
            3)It is mandatory to override "abstract methods" for "concrete child classes",
              if the child class is "abstract class" it is optional to override the abstract method.
            4) "abstract classes" can have both "abstract methods" and "concrete methods"
               "concrete classes" can have just "concrete methods"
            5) "abstract methods" can use "public", "protected", and "default" access modifiers,
               "abstract methods" cannot use "private" access modifiers.
            6) What is "final method"?
               "final method" is a method whose body cannot be updated.
               Can we make an abstract method "final"?
               "abstract methods" do not have anybody that is why the body cannot be "final"
               Can we override a final method?
               We cannot because, we change body in overriding but final methods do not accept any change on body.
            7) Can we make an "abstract method" "static"?
               An "abstract method" cannot be static.
         */

public abstract class C01Animal {

    public abstract void eat();



}


