package day14constructors_oop;

public class C07AnimalRunner {

    public static void main(String[] args) {

        C04Dog myDog = new C04Dog();
        myDog.eat();
        myDog.drink();
        myDog.bark();
        System.out.println(myDog.age);//0
        System.out.println(myDog.name);//null

        C05Cat myCat = new C05Cat();
        myCat.eat();
        myCat.drink();
        myCat.meow();

    }

}