package practices.practice01;

public class Q05_Arrays {
    public static void main(String[] args) {

        String[] cities = {"Istanbul","Baku", "London", "New York", "Tokyo"};

        int sum = 0;

        for (String w : cities){
            sum += w.length();
        }
        System.out.println(sum);
    }
}
