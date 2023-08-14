package day18_oop_static_keyword;

public class C07StudentRunner {

    public static void main(String[] args) {

        C06Student std1 = new C06Student();
        System.out.println(std1.numOfEyes);//2
        System.out.println(C06Student.numOfStdCreated);//1

        C06Student std2 = new C06Student();
        System.out.println(std2.numOfEyes);//2
        System.out.println(C06Student.numOfStdCreated);//2

        C06Student std3 = new C06Student();

        System.out.println(std1.numOfStdCreated);//3
        System.out.println(std1.numOfEyes);//2
        System.out.println(std2.numOfStdCreated);//3
        System.out.println(std2.numOfEyes);//2
        System.out.println(std3.numOfStdCreated);//3
        System.out.println(std2.numOfEyes);//2
    }
}