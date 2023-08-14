package day02_datatypes;

public class C02TypeCasting {

    public static void main(String[] args) {

        //Type Casting: If you assign a value of a primitive data type to another primitive data type,
        //it is called typecasting.

        //To put small data type into large data type is easy and Java will do it automatically
        //The name of this process is "Auto Widening"
        byte myAge = 34;
        int age = myAge;

        //To put large data type into small data type has risk that is why Java does not do it automatically
        //You have to type small data type in front of the name of the large data explicitly.
        //THe name of this process is "Explicit Narrowing"
        long value1 = 3400;
        short value2 = (short) value1;

        //Note 1:
        int numOfStd = 12;
        int amountOfMoney = 500;
        //If all values are int in a mathematical operation, the result will be int as well.
        //If the result is decimal in math, Java coverts it to int by removing decimal part of the result
        System.out.println(amountOfMoney / numOfStd);// 41.6666...

        //Note 2:
        int numOfStudents = 12;
        float moneyAmount = 500.0F;

        //If you use different data types in a mathematical operation, the result will be in the largest data type
        //you used in the mathematical operation
        System.out.println(moneyAmount / numOfStudents);// 41.666668
    }
}