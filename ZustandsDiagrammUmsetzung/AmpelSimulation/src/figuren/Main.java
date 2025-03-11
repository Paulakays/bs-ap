package figuren;
import ack.shapes.Leinwand;

public class Main {
    public static void main(String[] args) {
        Leinwand leinwand = new Leinwand();
        Ampel ampel = new Ampel();

        ampel.zeichne(leinwand);
//Die Ampel sollte gelb leuchten
        leinwand.warte(1000);
        for (int i = 0; i < 1000; i++) {
            // i represents the loop of iterations (the number of times the colors are going to change to the next color)
            ampel.umschalten();
            ampel.zeichne(leinwand);
            //leinwand waits for one second before switching to the next light
            leinwand.warte(1000);
//Man sollte einen Wechsel von gelb zu rot zu rot-gelb zu grün
//und anschließend wieder zu gelb beobachten

        }
    }
}

