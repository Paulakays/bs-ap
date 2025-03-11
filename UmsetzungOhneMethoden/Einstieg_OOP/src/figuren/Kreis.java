package figuren;

public class Kreis {
    int positionX;
    int positionY;
    int radius;
    String farbe;

    public Kreis(int positionX, int positionY,int radius,String farbe) {
        this.positionX=positionX;
        this.positionY=positionY;
        this.radius=radius;
        this.farbe=farbe;
    }
    public Kreis() {
        positionX = 100;
        positionY = 100;
        radius = 50;
        farbe = "gruen";
    }
}
