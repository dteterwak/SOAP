package example.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CountryInterface {

    @WebMethod
    public Country getCountry(String name);
}
