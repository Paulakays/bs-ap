package figuren;
import ack.shapes.Leinwand;

public class Main {
    public static void main (String[]args){

        Rechteck Rechteck1 = new Rechteck(800,500,"braun",200,500);
        Kreis kreis1 = new Kreis(900,400,100,"gruen");
        Kreis kreis2 = new Kreis(1400, 100,70,"gelb");

        
        Leinwand leinwand = new Leinwand();


        leinwand.zeichne(Rechteck1);
        leinwand.zeichne(kreis1);
        leinwand.zeichne(kreis2);



    }

}
