package Part5;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Exercise6 {

    public static String getMoneyFormat(String money) {
        return NumberFormat.getCurrencyInstance(Locale.JAPAN).format(new BigDecimal(money));
    }

    public static void main(String[] args) {
        System.out.println(getMoneyFormat("16"));
    }
}
