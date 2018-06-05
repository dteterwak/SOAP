package example.ws;

import javax.xml.ws.Endpoint;

public class SoapApp {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/service", new CountryService());
    }
}
