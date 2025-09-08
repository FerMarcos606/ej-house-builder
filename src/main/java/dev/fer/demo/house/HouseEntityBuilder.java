package dev.fer.demo.house;

import org.springframework.stereotype.Component;

@Component
public class HouseEntityBuilder implements InterfaceHouseBuilder {

    private final HouseEntity house;

    public HouseEntityBuilder() {
        this.house = new HouseEntity();
    }

    @Override
    public HouseEntityBuilder garage(boolean hasGarage) {
        this.house.setGarage(hasGarage);
        return this;
    }

    @Override
    public HouseEntityBuilder pool(boolean hasPool) {
        this.house.setPool(hasPool);
        return this;
    }

    @Override
    public HouseEntityBuilder garden(boolean hasGarden) {
        this.house.setGarden(hasGarden);
        return this;
    }

    @Override
    public HouseEntityBuilder statues(int number) {
        this.house.setStatues(number);
        return this;
    }

    @Override
    public HouseEntity build() {
        return this.house;
    }
}
