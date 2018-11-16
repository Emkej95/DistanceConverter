package michalkrzyzak95.model;

public class DistanceToConvert {

    private Unit currentUnit;
    private double currentValue;
    private Unit destinyUnit;

    public DistanceToConvert(Unit currentUnit, double value, Unit destinyUnit) {
        this.currentUnit = currentUnit;
        this.currentValue = value;
        this.destinyUnit = destinyUnit;
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

    public Unit getDestinyUnit() {
        return destinyUnit;
    }

    public void setDestinyUnit(Unit destinyUnit) {
        this.destinyUnit = destinyUnit;
    }
}