package dev.fer.demo.house;

import org.springframework.stereotype.Component;

@Component
public class HouseDirector {

    private final HouseEntityBuilder builder;

    public HouseDirector(HouseEntityBuilder builder) {
        this.builder = builder;
    }

   // Casa lujosa
    public HouseEntity constructFerLuxuryHouse() {
        return builder
                .garage(true)
                .pool(true)
                .garden(true)
                .statues(5)
                .build();
    }

    // modelo básico de casa
    public HouseEntity constructBasicHouse() {
        return builder
                .garage(false)
                .pool(false)
                .garden(false)
                .statues(0)
                .build();
    }

        //casa modelo piscina y jardín
    public HouseEntity constructGardenPoolHouse() {
        return builder
                .garage(false)
                .pool(true)
                .garden(true)
                .statues(0)
                .build();
    }
}
