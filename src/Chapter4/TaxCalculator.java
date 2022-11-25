package Chapter4;

import java.math.BigDecimal;

public class TaxCalculator {
    private static final BigDecimal MIINIMUM_EARNING = BigDecimal.valueOf(30000);
    private static final double BASE_TAX_RATE = 0.15;
    private static final double ADDITIONAL_TAX_RATE = 0.20;



    public static BigDecimal calculateTax(Citizien citizien) {
        return calculateTax(citizien.getEarnings().doubleValue());
    }
    public static BigDecimal calculateTax(double earning){
        BigDecimal taxAmount = BigDecimal.ZERO;
        if (earning <= MIINIMUM_EARNING.doubleValue()){
            taxAmount = BigDecimal.valueOf(earning*BASE_TAX_RATE);
        }else {
            taxAmount = BigDecimal.valueOf(MIINIMUM_EARNING.doubleValue()*BASE_TAX_RATE);

            double additionalEarning = earning - MIINIMUM_EARNING.doubleValue();
            taxAmount = taxAmount.add(BigDecimal.valueOf(additionalEarning * ADDITIONAL_TAX_RATE));
        }

        return taxAmount;
}}
