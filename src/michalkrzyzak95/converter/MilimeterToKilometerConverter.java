package michalkrzyzak95.converter;

import michalkrzyzak95.model.DistanceToConvert;
import michalkrzyzak95.model.Unit;

public class MilimeterToKilometerConverter extends Converter {

    private static final Unit unitIn = Unit.MILIMETER;
    private static final Unit unitOut = Unit.KILOMETER;

    @Override
    protected double convert(Double distance) {
        return distance*1000000;
    }

    @Override
    protected boolean accept(DistanceToConvert distance) {
        return false;
    }
}
