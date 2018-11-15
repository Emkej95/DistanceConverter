package michalkrzyzak95.converter;

/**
 * Created by Michal Krzyżak, 14.11.2018
 */

public interface ConverterChain {

    void setNextChain(ConverterChain nextchain);

    void whatToConvert(int amount, String unit);
}