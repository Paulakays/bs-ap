public class Mixer {
    //create a variable to initialise the blender container as closed
    boolean behaelterGeschlossen= true;

    //Create enums for the differengt states of the blender
    public enum mixerZustand {
        AN,AUS, SCHNELL, LANGSAM
    }


    public mixerZustand zustand;

    //Set initial state of the blender to off and the container to closed
    public Mixer(boolean geschlossen) {
        this.behaelterGeschlossen = geschlossen;
        this.zustand = mixerZustand.AUS;
    }

    // first button turns the blender on and off
    public void knopfdruck1(){
        System.out.println("Knopf 1 würde gedrückt");
      if (zustand == mixerZustand.AUS){
          zustand =mixerZustand.AN;
          System.out.println("Mixer wird eingeschaltet");

    }else  {
          zustand =mixerZustand.AUS;
          System.out.println("Mixer wird ausgeschaltet");

      }
    }

    /*second button controls the intensity of the blender to either high or low.
    when the blender is off the second button doesn't function
    This button also depends on if the blender is on.
     */

    public void knopfdruck2(){
        System.out.println("Knopf 2 würde gedrückt");

        if (zustand == mixerZustand.AUS){
            System.out.println("Mit dieser Aktion keine Zustandsaänderung");
            return;
        }
       if (zustand == mixerZustand.AN){
           zustand =mixerZustand.LANGSAM;
            System.out.println("Geschwindigkeit wird erhöht");
    }
       else if (zustand == mixerZustand.LANGSAM){
           zustand =mixerZustand.SCHNELL;
           System.out.println("Geschwindigkeit wird verringert");
       }
       else if (zustand == mixerZustand.SCHNELL){
           zustand =mixerZustand.LANGSAM;
           System.out.println("Geschwindigkeit wird verringert");
       }
    }

    public void zustandsWechseln(){
        switch (zustand){
            case AN:
                knopfdruck1();
                break;
            case AUS:
                 knopfdruck1();
                 break;
            case SCHNELL:
                knopfdruck2();
                break;
            case LANGSAM:
                knopfdruck2();
                break;
        }
    }

    }

