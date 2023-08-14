package practices.miniproject.busticketcalculation;

import java.util.ArrayList;
import java.util.List;

public class Bus {

    public  String busNum;

    public List<String> seats = new ArrayList<>();

    public Bus(String busNum) {
        this.busNum = busNum;

        for (int i = 1; i<33; i++){

            this.seats.add(i+"");

        }
    }
}
