public class DesertTerrarium extends Terrarium
{
    private static final int WATER_AMOUNT_ML = 50;

    public DesertTerrarium(WateringSystem wateringSystem)
    {
        super(wateringSystem);
    }

    @Override
    public void waterPlants()
    {
        System.out.println("Desert terrarium");
        wateringSystem.water(WATER_AMOUNT_ML);
    }
}