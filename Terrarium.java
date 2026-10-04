public abstract class Terrarium
{
    protected WateringSystem wateringSystem;

    public Terrarium(WateringSystem wateringSystem)
    {
        this.wateringSystem = wateringSystem;
    }

    public void setWateringSystem(WateringSystem wateringSystem)
    {
        this.wateringSystem = wateringSystem;
    }

    public abstract void waterPlants();
}