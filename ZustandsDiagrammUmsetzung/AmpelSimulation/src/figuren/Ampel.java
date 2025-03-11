
package figuren;

import ack.shapes.Leinwand;

public class Ampel {
    public enum Ampelzustand {
        Gelb, Rot, RotGelb, Gruen;
    }

    private Rechteck gehause;
    private Kreis gruenerKreis, gelberKreis, roterKreis;
    private Ampelzustand zustand;

    public Ampel() {
        this.zustand = Ampelzustand.Gelb;
        this.gehause = new Rechteck(50, 50, 100, "schwarz", 3 * 100);
        this.roterKreis = new Kreis(50 + 100 / 2, 50 + 100 / 2, "grau", 100 / 2);
        this.gelberKreis = new Kreis(50 + 100 / 2, 50 + 3 * 100 / 2, "gelb", 100 / 2);
        this.gruenerKreis = new Kreis(50 + 100 / 2, 50 + 5 * 100 / 2, "grau", 100 / 2);
    }

    public void zeichne(Leinwand leinwand) {
        leinwand.zeichne(gehause);
        leinwand.zeichne(roterKreis);
        leinwand.zeichne(gelberKreis);
        leinwand.zeichne(gruenerKreis);
    }

    private void setzeFarbe(String rot, String gelb, String gruen) {
        roterKreis.setzeFarbe(rot);
        gelberKreis.setzeFarbe(gelb);
        gruenerKreis.setzeFarbe(gruen);
    }

    private void rotSchalten() {
        zustand = Ampelzustand.Rot;
        setzeFarbe("rot", "grau", "grau");
    }

    private void rotGelbSchalten() {
        zustand = Ampelzustand.RotGelb;
        setzeFarbe("rot", "gelb", "grau");
    }

    private void gruenSchalten() {
        zustand = Ampelzustand.Gruen;
        setzeFarbe("grau", "grau", "gruen");
    }

    private void gelbSchalten() {
        zustand = Ampelzustand.Gelb;
        setzeFarbe("grau", "gelb", "grau");
    }

    public void umschalten() {
        switch (zustand) {
            case Gelb -> rotSchalten();
            case Rot -> rotGelbSchalten();
            case RotGelb -> gruenSchalten();
            case Gruen -> gelbSchalten();
        }
    }
}





