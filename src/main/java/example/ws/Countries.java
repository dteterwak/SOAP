package example.ws;

import java.util.ArrayList;
import java.util.List;

public class Countries {
    List<Country> countries = new ArrayList<Country>();

    public Countries(){
        countries.add(new Country("Spain","Madrid", "EUR",9898989));
        countries.add(new Country("Poland","Warsaw","PLN",48648));
        countries.add(new Country("Germany","Berlin","EUR",8498489));
        countries.add(new Country("Great Britain", "London","GBP",445656));
    }
}
