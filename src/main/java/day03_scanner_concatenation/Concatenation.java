package day03_scanner_concatenation;

public class Concatenation {
    public static void main(String[] args) {

        String name = "Tom";
        String lastName = "Hanks";

        int i = 12;
        int k = 5;

        char c = 'A';
        System.out.println(name+ " "+lastName);
        System.out.println(name.concat(" ").concat(lastName));

        System.out.println(name +i+k);
        System.out.println(name+ (i+k));
        System.out.println(i+k+name);
        System.out.println(name + i*k);
    }
}
