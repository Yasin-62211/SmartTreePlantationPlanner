public class Tree {

    String name;
    String soilType;
    String rainfallLevel;
    double minTemperature;
    double maxTemperature;

    public Tree(String name, String soilType, String rainfallLevel,
                double minTemperature, double maxTemperature) {

        this.name = name;
        this.soilType = soilType;
        this.rainfallLevel = rainfallLevel;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }
}