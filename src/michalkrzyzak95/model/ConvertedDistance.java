package michalkrzyzak95.model;

public class ConvertedDistance {

    private Unit destinyUnit;
    private Unit currentUnit;
    private double convertedValue;
    private double currentValue;

    public ConvertedDistance(double currentValue, Unit currentUnit, Unit destinyUnit, double convertedValue) {
        this.destinyUnit = destinyUnit;
        this.convertedValue = convertedValue;
        this.currentUnit = currentUnit;
        this.currentValue = currentValue;
    }

    public Unit getDestinyUnit() {
        return destinyUnit;
    }

    public void setDestinyUnit(Unit destinyUnit) {
        this.destinyUnit = destinyUnit;
    }

    public double getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(double convertedValue) {
        this.convertedValue = convertedValue;
    }

    public Unit getCurrentUnit() {
        return currentUnit;
    }

    public void setCurrentUnit(Unit currentUnit) {
        this.currentUnit = currentUnit;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

}
