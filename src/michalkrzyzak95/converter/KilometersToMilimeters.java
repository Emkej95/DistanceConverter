package michalkrzyzak95.converter;

import michalkrzyzak95.UIController;

/**
 * Created by Michal Krzyżak, 14.11.2018
 */

public class KilometersToMilimeters implements ConverterChain {

    private UIController uiController = new UIController();
    private ConverterChain chain;

    @Override
    public void setNextChain(ConverterChain nextchain) {
        this.chain = nextchain;
    }

    @Override
    public void whatToConvert(int amount, String unit) {
        if (uiController.getUnit().equals("kilometers")) {
            amount = uiController.getAmount();
            System.out.println(amount + " kilometers equals " + amount * 1000000 + " centimeters.");
            this.chain.whatToConvert(amount, unit);
        }
    }
}