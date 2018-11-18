package michalkrzyzak95.converter;

import michalkrzyzak95.model.DistanceToConvert;
import michalkrzyzak95.model.Unit;

public class MilimeterToCentimeterConverter extends Converter {

    private static final Unit unitIn = Unit.MILIMETER;
    private static final Unit unitOut = Unit.CENTIMETER;

    @Override
    protected double convert(Double distance) {
        return distance/10;
    }

    @Override
    protected boolean accept(DistanceToConvert distance) {
        return false;
    }
}
