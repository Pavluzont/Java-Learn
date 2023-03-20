package Part5;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.text.ParseException;

public class Exercise7 {
    public static String calculate(String money) throws ParseException {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        Number value = format.parse(money);
        BigDecimal result = new BigDecimal(value.toString()).divide(new BigDecimal("32.19"), MathContext.DECIMAL32);

        return format.format(result);
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(calculate("$12,345.83"));
    }
}
