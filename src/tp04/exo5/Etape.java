package tp04.exo5;

import java.time.LocalTime;

public class Etape {

    private int numEtape = 0;
    private String descriptionPrevue;
    private int dureePrevue;
    private static int numeroEtape = 1;


    public Etape(String descriptionPrevue, int dureePrevue) {
        this.descriptionPrevue = descriptionPrevue;
        this.dureePrevue = dureePrevue;
        this.setNumEtape();
        numeroEtape++;

    }

    public int getNumEtape() {
        return numEtape;
    }

    public void setNumEtape() {
        this.numEtape = numeroEtape;
    }

    public String getDescriptionPrevue() {
        return descriptionPrevue;
    }

    public void setDescriptionPrevue(String descriptionPrevue) {
        this.descriptionPrevue = descriptionPrevue;
    }

    public int getDureePrevue() {
        return dureePrevue;
    }

    public void setDureePrevue(int dureePrevue) {
        this.dureePrevue = dureePrevue;
    }

    public LocalTime donneDureePrevueHHMM() {

        int hours =dureePrevue / 60; //since both are ints, you get an int
        int minutes = dureePrevue % 60;

        LocalTime duree = LocalTime.of(hours, minutes);
        //retourne la durée prévue sous la forme HH:MM:SS exemple 02:05:23

        return duree;

    }

}
