package example.ws;

public class Country {
    long id;
    String name;
    String capital;
    String currency;
    int population;

    public Country(){

    }

    public Country(String name, String capital, String currency, int population){
        this.name = name;
        this.capital = capital;
        this.currency = currency;
        this.population = population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getCurrency() {
        return currency;
    }

    public int getPopulation() {
        return population;
    }


}
