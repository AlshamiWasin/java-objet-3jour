package tp04.exo5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MiniExcursionPlanifiee {

    private LocalDateTime heureDepart;
    private int nbreInscrits;
    private MiniExcursion laMiniExcursion;



    public MiniExcursionPlanifiee(LocalDate heureDepart, int nbreInscrits, MiniExcursion laMiniExcursion) {
        this.setHeureDepart(heureDepart);
        this.setNbreInscrits(nbreInscrits);
        this.setLaMiniExcursion(laMiniExcursion);
    }

    public MiniExcursionPlanifiee(String heureDepart, int nbreInscrits, MiniExcursion laMiniExcursion) {
        this.setHeureDepart(heureDepart);
        this.setNbreInscrits(nbreInscrits);
        this.setLaMiniExcursion(laMiniExcursion);
    }

    public boolean estComplete()
    {

        return true;

    }

    public LocalDateTime getHeureDepart() {
        return heureDepart;
    }
    public void setHeureDepart(String heureDepart) {

        this.heureDepart = LocalDateTime.of(LocalDate.now(),LocalTime.parse(heureDepart));


    }
    public void setHeureDepart(LocalDate heureDepart) {

        this.heureDepart = LocalDateTime.of(heureDepart,LocalTime.of(23, 59, 59) );
    }

    public int getNbreInscrits() {
        return nbreInscrits;
    }

    public void setNbreInscrits(int nbreInscrits) {
        this.nbreInscrits = nbreInscrits;
    }

    public MiniExcursion getLaMiniExcursion() {
        return laMiniExcursion;
    }

    public void setLaMiniExcursion(MiniExcursion laMiniExcursion) {
        this.laMiniExcursion = laMiniExcursion;
    }
}
