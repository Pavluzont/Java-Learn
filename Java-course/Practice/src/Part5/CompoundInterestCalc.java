package Part5;

import java.math.BigDecimal;

public class CompoundInterestCalc {
    public static BigDecimal calculate(String principal, String rate, int period, String contribution) {
        // Balance(Y) = P(1+r)^Y + c[ ((1+r)^Y - 1) / r ]
        BigDecimal a = BigDecimal.ONE.add(new BigDecimal(rate)).pow(period); //(1+r)^period
        BigDecimal c = a.subtract(BigDecimal.ONE); //((1+r)^Y - 1)
        BigDecimal d = c.divide(new BigDecimal(rate)); //((1+r)^Y - 1) / r
        BigDecimal e = d.multiply(new BigDecimal(contribution)); //c[ ((1+r)^Y - 1) / r ]
        BigDecimal f = a.multiply(new BigDecimal(principal)); //P(1+r)^Y
        BigDecimal g = f.add(e); //P(1+r)^Y + c[ ((1+r)^Y - 1) / r ]
        return g;
    }

    public static void main(String[] args) {
        BigDecimal balance = CompoundInterestCalc.calculate("10000.00", ".08", 10, "1000");
        System.out.println(balance);
    }
}
