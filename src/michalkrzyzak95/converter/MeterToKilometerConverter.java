package michalkrzyzak95.converter;

import michalkrzyzak95.model.DistanceToConvert;
import michalkrzyzak95.model.Unit;

public class MeterToKilometerConverter extends Converter {

    private static final Unit unitIn = Unit.METER;
    private static final Unit unitOut = Unit.KILOMETER;

    @Override
    protected double convert(Double distance) {
        return 0;
    }

    @Override
    protected boolean accept(DistanceToConvert distance) {
        return false;
    }
}
