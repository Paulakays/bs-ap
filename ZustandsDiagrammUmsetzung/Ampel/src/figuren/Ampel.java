package figuren;

import ack.shapes.Leinwand;

public class Ampel {
    private Rechteck gehause;
    private Kreis gruenerKreis,gelberKreis,roterKreis;

    public Ampel() {
        this.gehause = new Rechteck(50,50,100,"schwarz",3*100);
        this.roterKreis = new Kreis(50 + 100/2,50 + 100/2,"rot",100/2);
        this.gelberKreis = new Kreis(50 + 100/2,50 + 3*100/2,"gelb",100/2);
        this.gruenerKreis = new Kreis(50 + 100/2,50 + 5*100/2,"gruen",100/2);

    }

    public void zeichne (Leinwand leinwand){
        leinwand.zeichne (gehause);
        leinwand.zeichne(roterKreis);
        leinwand.zeichne(gelberKreis);
        leinwand.zeichne(gruenerKreis);
    }
}
