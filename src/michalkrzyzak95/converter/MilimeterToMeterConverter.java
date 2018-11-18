package michalkrzyzak95.converter;

import michalkrzyzak95.model.DistanceToConvert;
import michalkrzyzak95.model.Unit;

public class MilimeterToMeterConverter extends Converter {

    private static final Unit unitIn = Unit.MILIMETER;
    private static final Unit unitOut = Unit.METER;

    @Override
    protected double convert(Double distance) {
        return 0;
    }

    @Override
    protected boolean accept(DistanceToConvert distance) {
        return false;
    }
}
