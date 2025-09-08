package dev.fer.demo.house;

public interface InterfaceHouseBuilder {

    HouseEntityBuilder garage(boolean hasGarage);
    HouseEntityBuilder pool(boolean hasPool);
    HouseEntityBuilder garden(boolean hasGarden);
    HouseEntityBuilder statues(int number);
    HouseEntity build();

}
