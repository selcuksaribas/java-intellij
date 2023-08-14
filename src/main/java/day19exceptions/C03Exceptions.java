package day19exceptions;

        /*
            1)In Java, "Exception" and "Error" can be thrown.
            2)What is the difference between "Exception" and "Error"?
              "Exceptions" can be handled but "Errors" cannot.
              Examples for Errors: StackOverFlowError: Stack memory is full.
                                   OutOfMemoryError: Heap memory is full.
                                   VirtualMachineError:
              Exceptions are in 2 types i)Runtime Exceptions:ArithmeticException
                                                             NullPointerException
                                                             ArrayIndexOutOfBoundsException
                                                             NumberFormatException
                                                             StringIndexOutOfBoundsException
                                        ii)CompileTime Exceptions:FileNotFoundException
                                                                  IOException
             3)When you use multiple catch blocks, if there is no parent child relationship between the Exception Classes
               you can put multiple catch blocks in any order, but if there is parent child relationship between the Exception Classes
               child must come before the parent otherwise, you will get error.
         */

public class C03Exceptions {

    public static void main(String[] args) {

        System.out.println(getCharConvertToInt("98765", 2));//7
        System.out.println(getCharConvertToInt("98765", 5));//StringIndexOutOfBoundsException: Java throws StringIndexOutOfBoundsException
        //if you use non-existing index in a String
        System.out.println(getCharConvertToInt("My Java", 3));//NumberFormatException: Java throws NumberFormatException
        //if you use non-digit character in parseInt()

        System.out.println(getCharacterConvertToInt("98765", 5));
        System.out.println(getCharacterConvertToInt("My Java", 3));

        System.out.println(getCharConvertInt("98765", 5));
        System.out.println(getCharConvertInt("My Java", 3));

    }

    //Create a method gets a character from a String and converts it to int.
    //1.Way: To handle multiple Exceptions, you can create catch block for every Exception
    public static int getCharConvertToInt(String s, int idx){
        int result = 0;
        try {
            String ch = s.substring(idx, idx + 1);
            result = Integer.parseInt(ch);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Do not use non-existing index for a String");
        }catch(NumberFormatException e){
            System.out.println("Do not use non-digit character in parseInt()");
        }
        return result;
    }

    //2.Way: To handle multiple Exceptions, use just a single catch block
    public static int getCharacterConvertToInt(String s, int idx){
        int result = 0;
        try {
            String ch = s.substring(idx, idx + 1);
            result = Integer.parseInt(ch);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    //3.Way: To handle multiple Exceptions, use a specific implementation for a specific Exception, and use Exception class for all the others
    public static int getCharConvertInt(String s, int idx){
        int result = 0;
        try {
            String ch = s.substring(idx, idx + 1);
            result = Integer.parseInt(ch);
        }catch(NumberFormatException e){
            System.out.println("Specific implementation for NumberFormatException");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

}