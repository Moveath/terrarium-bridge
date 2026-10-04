public class ManualWatering implements WateringSystem
{
    @Override
    public void water(int amountMl)
    {
        System.out.println("Manual watering: pour " + amountMl + " ml of water");
    }
}