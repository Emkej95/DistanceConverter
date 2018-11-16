package michalkrzyzak95.converter;

import michalkrzyzak95.model.ConvertedDistance;
import michalkrzyzak95.model.DistanceToConvert;

public abstract class Converter {

    protected Converter nextInChain;

    public ConvertedDistance convert(DistanceToConvert distance){

        if (accept(distance)){
            double convertedValue = convert(distance.getCurrentValue());
            return new ConvertedDistance(distance.getDestinyUnit(), convertedValue);
        }else {
            return nextInChain.convert(distance);
        }
    }

    protected abstract double convert(Double distance);

    protected abstract boolean accept(DistanceToConvert distance);

    public void setNextInChain(Converter nextInChain) {
        this.nextInChain = nextInChain;
    }
}
