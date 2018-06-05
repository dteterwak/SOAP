package example.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "example.ws.CountryInterface")
public class CountryService implements CountryInterface{

    Countries countries;
    public CountryService(){
        countries = new Countries();
    }

    public Country getCountry(String name){
        for(Country c : countries.countries){
            if(c.getName().equals(name))
            {
                return c;
            }
        }
        return null;
    }
}
