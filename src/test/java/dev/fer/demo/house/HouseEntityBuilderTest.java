package dev.fer.demo.house;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HouseEntityBuilderTest {

    @Test
    void testCreateHouseEntityWithBuilder() {
        HouseEntity house = new HouseEntityBuilder()
                                .garden(true)
                                .garage(true)
                                .pool(true)
                                .statues(3)
                                .build();

        assertThat(house.getGarden(), is(true));
        assertThat(house.getGarage(), is(true));
        assertThat(house.getPool(), is(true));
        assertThat(house.getStatues(), is(3));
    }

    @Test
            void testHouseEntityWithBuilderUpsideDown() {
                HouseEntity house = new HouseEntityBuilder()
                                    .statues(3)
                                    .pool(true)
                                    .garage(true)
                                    .garden(true)
                                    .build();
            
            assertThat(house.getStatues(), is(3));
            assertThat(house.getPool(), is(true));
            assertThat(house.getGarage(), is(true));
            assertThat(house.getGarden(), is(true));
        }

         @Test
        void testHouseEntityWithBuilderEmpty() {
            HouseEntity house = new HouseEntityBuilder().build();

            assertThat(house.getGarage(), is(false));
            assertThat(house.getPool(), is(false));
            assertThat(house.getGarden(), is(false));
            assertThat(house.getStatues(), is(0));
        }

}

