package day17oop;

        /*
            1)Interfaces have "abstract methods",
              "abstract methods" are uncompleted methods
              that is why Java does not let create an
              object from interfaces like abstract classes
            2)"abstract class" is a class that is why
              it has "constructor" but abstract class
              constructor cannot create an object.
              Interface is not a class, it is a different
              structure, it does not have constructor.
            3)All methods in an interface must be overridden
              by concrete child classes. That is why, interfaces
              are called as "to do list" as well.
         */

public interface Engine {

    void start();// All methods in an interface are "public" and "abstract" as default that is why no need to type "public" and "abstract" in method creation
    void stop();

    //static concrete method
    static void accelerate(){
        System.out.println("Increase the speed so fast...");
    }
    //default concrete methods
    default void price(){
        System.out.println("Every engine has a price...");
    }

    //Variables in an interface
    //1)Variables in an interface are "final", "final variables" must be initialized
    //                                         The value of "final variables" cannot be updated after initializing
    //                                         "final variables" names are type in upper cases
    //2)All variables in an interface are "public", and "final", "static" as default that is why no need to type "public", and "final", and "static" in method declaration
    String ENGINE_NAME = "Electrical Engine";// public static final String engineName = "Electrical Engine"; has same meaning

}