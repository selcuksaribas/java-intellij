package day18_oop_static_keyword;

        /*
            What is the difference between being "static" and being "non-static"?
            1)"static class members" are shared by all objects
              "non-static class members" are not shared by all objects, they are specific for the objects.
            2)Updates on "static class members" are visible by all objects automatically.
              Updates on "non-static class members" are not visible by other objects,
              to make it visible for the others, you need to type some codes.
            3)To access "static class members" just class name is enough, but
              To access "non-static class members" you have to create object.
            4)"static class members" are created together with the class
              "non-static class members" are created when you create an object.
            5)"static class members" are created just once, but
              "non-static class members" are created in every object creation.
         */

public class C06Student {

    public static int numOfStdCreated = 0;//"class variable" and "static variable" are synonym

    public int numOfEyes = 0;

    public C06Student() {
        numOfEyes = numOfEyes + 2;
        numOfStdCreated++;
    }
}