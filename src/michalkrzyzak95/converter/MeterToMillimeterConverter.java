package michalkrzyzak95.converter;

import michalkrzyzak95.model.DistanceToConvert;
import michalkrzyzak95.model.Unit;

public class MeterToMillimeterConverter extends Converter {

    private static final Unit unitIn = Unit.METER;
    private static final Unit unitOut = Unit.MILLIMETER;

    @Override
    protected double convert(Double distance) {
        return distance*1000;
    }

    @Override
    protected boolean accept(DistanceToConvert distance) {
        Unit currentUnit = distance.getCurrentUnit();
        Unit destinyUnit = distance.getDestinyUnit();
        return (unitIn.getCode().equals(currentUnit.getCode()) && unitOut.getCode().equals(destinyUnit.getCode()));
    }
}
