public class AutomaticWatering implements WateringSystem
{
    @Override
    public void water(int amountMl)
    {
        System.out.println("Automatic watering: pump " + amountMl + " ml of water");
    }
}