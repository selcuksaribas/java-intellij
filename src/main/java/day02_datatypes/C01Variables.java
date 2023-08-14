package day02_datatypes;

public class C01Variables {

    public static void main(String[] args) {

        byte stdAge = 25;
        System.out.println(stdAge);

        short numOfStdInHighSchool = 3245;
        System.out.println(numOfStdInHighSchool);

        int populationOfMiami = 1200000;
        System.out.println(populationOfMiami);

        //If you create "long" variable, use "L" at the end of the value when the value is out of "int range"
        long populationOfTheWorld = 7000000000L;
        System.out.println(populationOfTheWorld);

        //If you create "long" variable, no need to use "L" at the end of the value when the value is in "int range"
        long populationOfChina = 1500000000;
        System.out.println(populationOfChina);

        float shirtPrice = 23.99F;
        System.out.println(shirtPrice);

        double weightOfACell = 0.000000012;
        System.out.println(weightOfACell);

        boolean isRetired = false;
        System.out.println(isRetired);

        char initial = 'A';
        System.out.println(initial);

        String stdName = "Mark Twain";
        System.out.println(stdName);
    }
}