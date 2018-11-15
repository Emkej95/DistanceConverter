package michalkrzyzak95;

import michalkrzyzak95.converter.*;

import java.util.List;

/**
 * Created by Michal Krzyżak, 14.11.2018
 */

public class UIController {

    private int amount;
    private String unit;
    private ConverterChain c1, c4, c7, c10;

    public UIController(){

        this.c1 = new CentimetersToMilimeters();
        ConverterChain c2 = new CentimetersToMeters();
        ConverterChain c3 = new CentimetersToKilometers();
        this.c4 = new KilometersToCentimeters();
        ConverterChain c5 = new KilometersToMeters();
        ConverterChain c6 = new KilometersToMilimeters();
        this.c7 = new MetersToCentimeters();
        ConverterChain c8 = new MetersToMilimeters();
        ConverterChain c9 = new MetersToKilometers();
        this.c10 = new MilimetersToCentimeters();
        ConverterChain c11 = new MilimetersToMeters();
        ConverterChain c12 = new MilimetersToKilometers();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c4.setNextChain(c5);
        c5.setNextChain(c6);
        c7.setNextChain(c8);
        c8.setNextChain(c9);
        c10.setNextChain(c11);
        c11.setNextChain(c12);

        convertingMachine();
    }

    void getUserInput(List<String> inputList) {
        this.amount = Integer.parseInt(inputList.get(0));
        this.unit = inputList.get(1);
    }

    public String getUnit() {
        if (this.unit.equalsIgnoreCase("meters") || this.unit.equalsIgnoreCase("m") || this.unit.equalsIgnoreCase("metrow")) {
            return "meters";
        } else if (this.unit.equalsIgnoreCase("kilometers") || this.unit.equalsIgnoreCase("km") || this.unit.equalsIgnoreCase("kilometrow")){
            return "kilometers";
        } else if (this.unit.equalsIgnoreCase("centimeters") || this.unit.equalsIgnoreCase("cm") || this.unit.equalsIgnoreCase("centymetrow")) {
            return "centimeters";
        } else return "milimeters";
    }

    public int getAmount() {
        return this.amount;
    }

    private void convertingMachine(){
        UIController uiController = new UIController();

        switch (getUnit()) {
            case "centimeters":
                uiController.c1.whatToConvert(getAmount(), getUnit());
                return;
            case "kilometers":
                uiController.c4.whatToConvert(getAmount(), getUnit());
                return;
            case "meters":
                uiController.c7.whatToConvert(getAmount(), getUnit());
                return;
            default:
                uiController.c10.whatToConvert(getAmount(), getUnit());
        }
    }
}