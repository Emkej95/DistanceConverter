package michalkrzyzak95;

import michalkrzyzak95.model.ConvertedDistance;
import michalkrzyzak95.model.Unit;

class Printer {

    void printConvertedDistance(ConvertedDistance convertedDistance){
        System.out.println(convertedDistance.getConvertedValue() + " " + Unit.getFullName());
    }

}