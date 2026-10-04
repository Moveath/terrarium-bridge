public class Main
{
    public static void main(String[] args)
    {
        WateringSystem manualWatering = new ManualWatering();
        WateringSystem automaticWatering = new AutomaticWatering();

        Terrarium desertTerrarium = new DesertTerrarium(manualWatering);
        Terrarium tropicalTerrarium = new TropicalTerrarium(automaticWatering);

        desertTerrarium.waterPlants();
        tropicalTerrarium.waterPlants();

        System.out.println("Switching watering systems");

        desertTerrarium.setWateringSystem(automaticWatering);
        tropicalTerrarium.setWateringSystem(manualWatering);

        desertTerrarium.waterPlants();
        tropicalTerrarium.waterPlants();
    }
}