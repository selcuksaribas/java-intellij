package day16oop;

public class C06StudentRunner {

    public static void main(String[] args) {

        C05Student std = new C05Student();

        System.out.println(std.getStdId());// TH001
        System.out.println(std.getIllness());// Depression

        std.setStdId("AC123");
        System.out.println(std.getStdId());//AC123

        std.setIllness("Headache");
        System.out.println(std.getIllness());//Headache


    }

}