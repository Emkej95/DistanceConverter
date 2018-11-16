package michalkrzyzak95;

import michalkrzyzak95.converter.Converter;
import michalkrzyzak95.converter.MeterToCentimeterConverter;

public class ChainFactory {

    public Converter getChain(){

        Converter mToCm = new MeterToCentimeterConverter();
        //Converter mToKm = new MeterToKilometerConverter();
        //Tutaj reszta converterów.


        //mToCm.setNextInChain(mToKm);
        //mToKm.setNesxtInChain(...);

        return mToCm;
    }
}
