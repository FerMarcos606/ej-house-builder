package dev.fer.demo.house;

public class HouseEntity {
    private boolean garage;
    private boolean pool;
    private boolean garden;
    private int statues;

    // getters y setters
    public boolean getGarage() { return garage; }
    public boolean getPool() { return pool; }
    public boolean getGarden() { return garden; }
    public int getStatues() { return statues; }

    public void setGarage(boolean garage) { this.garage = garage; }
    public void setPool(boolean pool) { this.pool = pool; }
    public void setGarden(boolean garden) { this.garden = garden; }
    public void setStatues(int statues) { this.statues = statues; }
}
