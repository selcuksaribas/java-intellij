package day14constructors_oop;

    /*
        1)Constructors are for "Object Creation".
          If you do not have a constructor in a class it is impossible to create an object
        2)When you create a class, Java gives you a constructor automatically,
          this constructor is invisible because it comes from Parent Object Class.
          This "invisible constructor" is called "Default Constructor"
        3)If you need, you can create multiple constructors in a class.
          But when you create a constructor in a Class, Java deletes the "Default Constructor"
        4)You can create constructors manually or by the help of the IntelliJ(Recommended)
        5)We create multiple constructors by changing the parameters
        6)Having different constructors makes the class template flexible to create different objects.

        Question: What is the difference between "Constructors" and "Methods"?
                  1) "Constructors" are used to create Objects, "Methods" are used to do some actions.
                  2) "Constructors" do not have "return types" but "Methods" have.
                  3) "Constructor Names" must be  the same with the class name, but "Method Names" can be any name
     */

public class  C01Students {

    public String stdName = "Tom Hanks";
    public int stdAge = 13;
    private String stdId = "TH2010001";

    public void study(){
        System.out.println("Study well...");
    }
    public void doSport(){
        System.out.println("Sport is good for health...");
    }

    //Create a constructor manually
    public C01Students(){

    }
    public C01Students(String stdName, int stdAge, String stdId){
        this.stdName = stdName;
        this.stdAge = stdAge;
        this.stdId = stdId;
    }

    //Create a constructor by the help of the IntelliJ
    public C01Students(String stdName, int stdAge) {
        this.stdName = stdName;
        this.stdAge = stdAge;
    }
}