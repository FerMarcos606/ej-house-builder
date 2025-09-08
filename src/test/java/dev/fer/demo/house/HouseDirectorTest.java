package dev.fer.demo.house;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HouseDirectorTest {

    @Test
    void testConstructLuxuryHouse() {
        
        HouseEntityBuilder builder = new HouseEntityBuilder();
        HouseDirector director = new HouseDirector(builder);

        HouseEntity luxuryHouse = director.constructFerLuxuryHouse();

        assertThat(luxuryHouse.getGarage(), is(true));
        assertThat(luxuryHouse.getPool(), is(true));
        assertThat(luxuryHouse.getGarden(), is(true));
        assertThat(luxuryHouse.getStatues(), is(5));
    }

    @Test
    void testConstructHasOnlyGardenPoolHouse() {
        HouseEntityBuilder builder = new HouseEntityBuilder();
        HouseDirector director = new HouseDirector(builder);

        HouseEntity gardenPoolHouse = director.constructGardenPoolHouse();

        assertThat(gardenPoolHouse.getGarage(), is(false));
        assertThat(gardenPoolHouse.getPool(), is(true));
        assertThat(gardenPoolHouse.getGarden(), is(true));
        assertThat(gardenPoolHouse.getStatues(), is(0));
    }

       @Test
    void testConstructModelBasicHouse() {
        HouseEntityBuilder builder = new HouseEntityBuilder();
        HouseDirector director = new HouseDirector(builder);

        HouseEntity basicHouse = director.constructBasicHouse();

        assertThat(basicHouse.getGarage(), is(false));
        assertThat(basicHouse.getPool(), is(false));
        assertThat(basicHouse.getGarden(), is(false));
        assertThat(basicHouse.getStatues(), is(0));
    }
 
}

