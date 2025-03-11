package figuren;
import ack.shapes.Leinwand;
public class Test {

    public static void main (String[]args) {

            Rechteck rechteck1 = new Rechteck(200,100,20, 50,"blau");
            Leinwand leinwand1 = new Leinwand();
            Kreis kreis1 = new Kreis(400,100,50,"gelb ");
            leinwand1.zeichne(rechteck1);
            leinwand1.zeichne(kreis1);
        }
    }
