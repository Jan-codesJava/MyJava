package Encapsulation;

public class City {

    private String name;
    private int population;
    private int establishmentYear;

    public void setName(String newName) {

        name = newName;
    }

    public String getName() {
        return name;
    }

//create the setters and getters for other instance fields

    public void setPopulation(Integer newPopulation){
        Integer population = newPopulation;
    }
    public int getPopulation(){
        return population;
    }
    public void setEstablishmentYear(int newEstablishmentYear){
        establishmentYear = newEstablishmentYear;
    }
    public int getEstablishmentYear(){
        return establishmentYear;
    }
}

