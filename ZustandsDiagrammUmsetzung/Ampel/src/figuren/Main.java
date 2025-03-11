package figuren;
import ack.shapes.Leinwand;

public class Main {
    public static void main (String[]args){
        Leinwand leinwand = new Leinwand();
        Ampel ampel = new Ampel();


        ampel.zeichne(leinwand);
    }
}
