package michalkrzyzak95;

import michalkrzyzak95.converter.*;

public class ChainFactory {

    public Converter getChain(){

        Converter mToCm = new MeterToCentimeterConverter();
        Converter mToMm = new MeterToMilimeterConverter();
        Converter mToKm = new MeterToKilometerConverter();
        Converter cmToKm = new CentimeterToKilometerConverter();
        Converter cmToM = new CentimeterToMeterConverter();
        Converter cmToMm = new CentimeterToMilimeterConverter();
        Converter kmToM = new KilometerToMeterConverter();
        Converter kmToCm = new KilometerToCentimeterConverter();
        Converter kmToMm = new KilometerToMilimeterConverter();
        Converter mmToCm = new MilimeterToCentimeterConverter();
        Converter mmToM = new MilimeterToMeterConverter();
        Converter mmToKm = new MilimeterToKilometerConverter();

        mToCm.setNextInChain(mToMm);
        mToMm.setNextInChain(mToKm);
        mToKm.setNextInChain(cmToKm);
        cmToKm.setNextInChain(cmToM);
        cmToM.setNextInChain(cmToMm);
        cmToMm.setNextInChain(kmToM);
        kmToM.setNextInChain(kmToCm);
        kmToCm.setNextInChain(kmToMm);
        kmToMm.setNextInChain(mmToCm);
        mmToCm.setNextInChain(mmToM);
        mmToM.setNextInChain(mmToKm);

        return mToCm;
    }
}
