package BigDecimalAndFormatNumericValues;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalPractice {


    public static void main(String[] args) {
        double price = 1.85;
        double rate = 0.065;
        price -= price*rate;
        price = Math.round(price * 100) / 100.0;
        System.out.println(price);


        BigDecimal price1 = BigDecimal.valueOf(1.85);
        BigDecimal rate1 = BigDecimal.valueOf(0.065);
        price1 = price1.subtract(price1.multiply(rate1)).setScale(2, RoundingMode.HALF_UP);
        System.out.println(price1);


    }


}
