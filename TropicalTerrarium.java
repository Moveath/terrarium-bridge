public class TropicalTerrarium extends Terrarium
{
    private static final int WATER_AMOUNT_ML = 200;

    public TropicalTerrarium(WateringSystem wateringSystem)
    {
        super(wateringSystem);
    }

    @Override
    public void waterPlants()
    {
        System.out.println("Tropical terrarium");
        wateringSystem.water(WATER_AMOUNT_ML);
    }
}