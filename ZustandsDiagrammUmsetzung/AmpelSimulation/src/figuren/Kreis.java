package figuren;

//Create class and instance variables
public class Kreis {
    int positionX;
    int positionY;
    String farbe;
    int radius;

    //create constructor
    public Kreis(int positionX, int positionY, String farbe, int radius) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.farbe = farbe;
        this.radius = radius;
    }

    public void setzeFarbe(String neueFarbe) {
        this.farbe = neueFarbe;
    }
    public String getFarbe(){
        return farbe;
    }
}
