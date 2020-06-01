package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Conditioner;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {


    @Test
    public void shouldConditionerCreateTest()
    {
        Conditioner conditioner=new Conditioner();
        conditioner.setName("Кондиционер");
        conditioner.setMaxTemperature(50);
        conditioner.setMinTemperature(-50);
        conditioner.setCurrentTemperature(20);
        conditioner.setOn(true);
    }
    @Test
    public void shouldConditionerIncreaseDegreeTest()
    {

        Conditioner conditioner=new Conditioner();
        conditioner.setMaxTemperature(50);
        conditioner.setMinTemperature(-50);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        assertEquals(conditioner.getCurrentTemperature(),21);
    }
    @Test
    public void shouldConditionerDecreaseDegreeTest()
    {
        Conditioner conditioner=new Conditioner();
        conditioner.setMaxTemperature(50);
        conditioner.setMinTemperature(-50);
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature();
        assertEquals(conditioner.getCurrentTemperature(),19);

    }
    @Test
    public void shouldConditionerLessThanMaxTemperature()
    {
        Conditioner conditioner=new Conditioner();
        conditioner.setMaxTemperature(50);
        conditioner.setMinTemperature(-50);
        conditioner.setCurrentTemperature(51);
        assertEquals(conditioner.getCurrentTemperature(),50);
    }
    @Test
    public void shouldConditionerLessThanMinTemperature()
    {
        Conditioner conditioner=new Conditioner();
        conditioner.setMaxTemperature(50);
        conditioner.setMinTemperature(-50);
        conditioner.setCurrentTemperature(-52);
        assertEquals(conditioner.getCurrentTemperature(),-50);
    }
    @Test
    public void shouldConditionerIncreaseDegreeToMaxTest()
    {
        Conditioner conditioner=new Conditioner();
        conditioner.setMaxTemperature(50);
        conditioner.setMinTemperature(-50);
        conditioner.setCurrentTemperature(50);
        conditioner.increaseCurrentTemperature();
        assertEquals(conditioner.getCurrentTemperature(),50);
    }
    @Test
    public void shouldConditionerDecreaseDegreeToMinTest()
    {
        Conditioner conditioner=new Conditioner();
        conditioner.setMaxTemperature(50);
        conditioner.setMinTemperature(-50);
        conditioner.setCurrentTemperature(-50);
        conditioner.decreaseCurrentTemperature();
        assertEquals(conditioner.getCurrentTemperature(),-50);
    }
}
