package ru.netology.domain;

public class Conditioner {

    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if(currentTemperature>maxTemperature){
            System.out.println("Превышен предел максимальной температуры");
            setCurrentTemperature(getMaxTemperature());
            return;
        }
        if (currentTemperature<minTemperature){
            System.out.println("Вышли за пределы минимальной температуры");
            setCurrentTemperature(getMinTemperature());
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void increaseCurrentTemperature()
    {
        int addDegree=currentTemperature+1;
        if (addDegree>getMaxTemperature())
        {
            addDegree=getMaxTemperature();
            return;
        }
        setCurrentTemperature(addDegree);

    }
    public void decreaseCurrentTemperature()
    {
        int minusDegree=currentTemperature-1;
        if (minusDegree<minTemperature)
        {
            return;
        }
        setCurrentTemperature(minusDegree);
    }

}
