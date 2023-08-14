package day16oop;

        /*
            1)The method in child class(Overriding Method) cannot have narrower
              access modifier than the method in parent class(Overridden Method)

              Overridden Method ==> default
              Overriding Method ==> default, protected, public

              Overridden Method ==> protected
              Overriding Method ==> protected, public

              Overridden Method ==> private
              Overriding Method ==> "private methods" cannot be overridden

            2)Polymorphism = Method Overloading(static polymorphism) + Method Overriding(dynamic polymorphism)

            3)What is the difference between "Method Overloading" and "Method Overriding"?
                i)"Method Overloading" occurs in a single class, "Method Overriding"
                  needs multiple classes.
                ii)"Method Overriding" needs "inheritance", "Method Overloading" does not
                iii)"private" methods can be overloaded, but "private" methods cannot be
                    overridden.
                iv) In "Method Overloading" we change "method signature", but in "Method Overriding"
                   we do not change "method signature".
                v) In "Method Overloading" "access modifiers" and "return types" do not take any role,
                   but in "Method Overriding" there are some rules to change "access modifiers" and "return types"
                vi)In "Method Overloading" we change the parameters and make the method work with different scenarios.
                   In "Method Overriding" we make the method implementation more specific for the child class.
                vii)"static methods" can be overloaded, but cannot be overridden.
         */

public class C01Animal {

    public void eat(){
        System.out.println("Animals eat...");
    }

}