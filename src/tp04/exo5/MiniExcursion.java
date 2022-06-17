package tp04.exo5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class MiniExcursion {


    String libelleMiniExcursion;
    int nbrePlace;
    List<Etape> lesEtapes;
    int numMiniExcursion;
    private static int nbrMiniExcursion = 0;

    public MiniExcursion(String libelleMiniExcursion, int nbrePlace, List<Etape> lesEtapes) {
        this.libelleMiniExcursion = libelleMiniExcursion;
        this.nbrePlace = nbrePlace;
        this.lesEtapes = lesEtapes;
        this.setNumMiniExcursion();
        nbrMiniExcursion++;
    }

    public int getNumMiniExcursion() {
        return numMiniExcursion;
    }

    public void setNumMiniExcursion() {
        this.numMiniExcursion = nbrMiniExcursion;
    }

    public String getLibelleMiniExcursion() {
        return libelleMiniExcursion;
    }

    public void setLibelleMiniExcursion(String libelleMiniExcursion) {
        this.libelleMiniExcursion = libelleMiniExcursion;
    }

    public int getNbrePlace() {
        return nbrePlace;
    }

    public void setNbrePlace(int nbrePlace) {
        this.nbrePlace = nbrePlace;
    }

    public List getLesEtapes() {
        return lesEtapes;
    }

    public void setLesEtapes(List lesEtapes) {
        this.lesEtapes = lesEtapes;
    }

    public LocalTime donneDureePrevueHHMM(){
        int duree = 0;
        for (Etape lEtape : lesEtapes) {
            duree += lEtape.getDureePrevue();
        }
        int hours =duree / 60; //since both are ints, you get an int
        int minutes = duree % 60;

        LocalTime dureeTotal = LocalTime.of(hours, minutes);
        //retourne la durée prévue sous la forme HH:MM:SS exemple 02:05:23

        return dureeTotal;
    }

}
