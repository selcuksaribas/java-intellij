package day16oop;

        /*
            1)If a method has method body it is called "concrete method",
              if a method does not have method body it is called "abstract method".
            2)To make a method abstract
                i)Remove method body
                ii)Use "abstract" keyword between "access modifier" and "return type"
                iii)Make the class abstract as well
                    because abstract methods can be put into abstract classes
            3)When you create an abstract,
              all the "concrete child classes" "must override" the abstract method
              But if parent class has "concrete methods", it is not mandatory to override.
         */

public abstract class C07Animal {

    public abstract void eat();

}