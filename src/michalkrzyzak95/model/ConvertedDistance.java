package michalkrzyzak95.model;

public class ConvertedDistance {

    private Unit destinyUnit;
    private double convertedValue;

    public ConvertedDistance(Unit destinyUnit, double convertedValue) {
        this.destinyUnit = destinyUnit;
        this.convertedValue = convertedValue;
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

}
