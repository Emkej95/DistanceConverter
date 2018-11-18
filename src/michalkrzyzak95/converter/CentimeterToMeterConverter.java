package michalkrzyzak95.converter;

import michalkrzyzak95.model.DistanceToConvert;
import michalkrzyzak95.model.Unit;

public class CentimeterToMeterConverter extends Converter {

    private static final Unit unitIn = Unit.CENTIMETER;
    private static final Unit unitOut = Unit.METER;

    @Override
    protected double convert(Double distance) {
        return distance*100;
    }

    @Override
    protected boolean accept(DistanceToConvert distance) {
        return false;
    }
}
