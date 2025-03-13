public class mixerMain {
    public static void main (String []args){
        Mixer mixer = new Mixer(true);
        mixer.knopfdruck1();
        mixer.knopfdruck2();
        mixer.knopfdruck2();
        mixer.knopfdruck1();
        mixer.knopfdruck2();
        mixer.knopfdruck1();
        mixer.zustandsWechseln();

    }
}
