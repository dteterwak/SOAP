package example.client;

import example.ws.CountryInterface;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class Client {
        public static void main(String[] args) throws Exception {
            URL wsdlUrl = new URL("http://localhost:8888/service?wsdl");
            QName qname = new QName("http://ws.example/", "CountryServiceService");
            Service service = Service.create(wsdlUrl, qname);
            CountryInterface countryInterface = service.getPort(CountryInterface.class);
            System.out.println(countryInterface.getCountry("Spain").getName() + " " + countryInterface.getCountry("Spain").getCurrency() + " " + countryInterface.getCountry("Spain").getCapital() + " " + countryInterface.getCountry("Spain").getPopulation());
        }
}
