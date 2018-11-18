package michalkrzyzak95;

import michalkrzyzak95.model.ConvertedDistance;

public class Printer {

    private ConvertedDistance convertedDistance;

    public void setConvertedDistance (ConvertedDistance convertedDistance){
        this.convertedDistance = convertedDistance;
    }

    public void printConvertedDistance (ConvertedDistance convertedDistance){
        System.out.println(convertedDistance.getConvertedValue() + " " + convertedDistance.getDestinyUnit());
    }

}