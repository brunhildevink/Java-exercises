package week5.Practicum_0;

import java.util.*;
import java.util.Formatter;
import java.text.NumberFormat;

public class Utils {
    private int requestCount = 0;
    private NumberFormat numberFormat;

    //Formateren
    public Utils() {
        numberFormat = NumberFormat.getCurrencyInstance(new Locale("nl", "NL"));
        numberFormat.setCurrency(Currency.getInstance("EUR"));
    }
    
    //Formateren
    public Utils(String format) {
        numberFormat = NumberFormat.getCurrencyInstance(new Locale("nl", "NL"));
        numberFormat.setCurrency(Currency.getInstance(format));
    }

    // Ophalen van de counter
    public int getRequestCount() {
        return this.requestCount;
    }
    
    //Ophalen bedrag
    public String bedrag(double bedrag) {
        this.requestCount++;
        return numberFormat.format(bedrag);
    }

    public String bedrag(double bedrag, int preciesheid) {
        this.requestCount++;
        Formatter format = new Formatter();

        format.format("%1." + preciesheid + "f", bedrag);
        return "€ " + format;

    }
    

}
