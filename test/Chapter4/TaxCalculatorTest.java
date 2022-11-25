package Chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {
    private  TaxCalculator calculator;
    private Citizien mathias;
    private Citizien Adewunmi;
    private Citizien Mazi;
@BeforeEach
    public  void setUp(){
        mathias = new Citizien();
        mathias.setFirstName("Mathias");
        mathias.setSurname("Momodu");
        mathias.setEarnings(new BigDecimal(17000));

        Adewunmi = new Citizien("Adewunmi", "Adegunwa");
        Adewunmi.setEarnings(BigDecimal.valueOf(25000));

        Mazi = new Citizien("Chinwoke", "Anugwara", BigDecimal.valueOf(40000));

    }
    @Test
public void calculateTax(){
        BigDecimal mathiasTax =TaxCalculator.calculateTax(mathias);
        assertEquals(2550, mathiasTax.intValue());

        BigDecimal wunmiTax = TaxCalculator.calculateTax(Adewunmi);
        assertEquals(3750, wunmiTax.intValue());

}
@Test
public void calculateExcessTax(){
    BigDecimal maziTax = TaxCalculator.calculateTax(Mazi);
    assertEquals(6500, maziTax.intValue());
}
}