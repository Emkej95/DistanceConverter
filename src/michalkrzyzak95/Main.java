package michalkrzyzak95;

import michalkrzyzak95.converter.Converter;
import michalkrzyzak95.model.DistanceToConvert;
import michalkrzyzak95.model.Unit;

/**
 * Created by Michal Krzyżak, 14.11.2018
 */

public class Main {
    public static void main(String[] args) {

        ChainFactory chainFactory = new ChainFactory();
        Converter chain = chainFactory.getChain();

        DistanceToConvert distanceToConvert = new DistanceToConvert(Unit.METER, 2.4, Unit.CENTIMETER);

        chain.convert(distanceToConvert);


    }
}
