package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Conditioner;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {

    @Test
    public void shouldConditionerCreateTest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("Кондиционер");
        assertEquals("Кондиционер",conditioner.getName());
        conditioner.setMaxTemperature(50);
        assertEquals(50,conditioner.getMaxTemperature());
        conditioner.setMinTemperature(-50);
        assertEquals(-50,conditioner.getMinTemperature());
        conditioner.setCurrentTemperature(20);
        assertEquals(20,conditioner.getCurrentTemperature());
        conditioner.setOn(true);
        assertEquals(true,conditioner.isOn());

    }

    @Test
    public void shouldConditionerIncreaseDegreeTest() {

        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(50);
        conditioner.setMinTemperature(-50);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldConditionerDecreaseDegreeTest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(50);
        conditioner.setMinTemperature(-50);
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature();
        assertEquals(19, conditioner.getCurrentTemperature());

    }

    @Test
    public void shouldConditionerLessThanMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(50);
        conditioner.setMinTemperature(-50);
        conditioner.setCurrentTemperature(51);
        assertEquals(50, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldConditionerLessThanMinTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(50);
        conditioner.setMinTemperature(-50);
        conditioner.setCurrentTemperature(-52);
        assertEquals(-50, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldConditionerIncreaseDegreeToMaxTest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(50);
        conditioner.setMinTemperature(-50);
        conditioner.setCurrentTemperature(50);
        conditioner.increaseCurrentTemperature();
        assertEquals(50, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldConditionerDecreaseDegreeToMinTest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(50);
        conditioner.setMinTemperature(-50);
        conditioner.setCurrentTemperature(-50);
        conditioner.decreaseCurrentTemperature();
        assertEquals(-50, conditioner.getCurrentTemperature());
    }
}
