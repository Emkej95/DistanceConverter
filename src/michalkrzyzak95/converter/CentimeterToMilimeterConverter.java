package michalkrzyzak95.converter;

import michalkrzyzak95.model.DistanceToConvert;
import michalkrzyzak95.model.Unit;

public class CentimeterToMilimeterConverter extends Converter {

    private static final Unit unitIn = Unit.CENTIMETER;
    private static final Unit unitOut = Unit.MILIMETER;

    @Override
    protected double convert(Double distance) {
        return distance*10;
    }

    @Override
    protected boolean accept(DistanceToConvert distance) {
        return false;
    }
}
