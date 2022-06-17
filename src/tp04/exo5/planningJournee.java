package tp04.exo5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class planningJournee {

     LocalDate Date;
     List<MiniExcursionPlanifiee> lesMiniExcursionsPlanifiees = new ArrayList<>();


     public planningJournee(LocalDate laDate, List<MiniExcursionPlanifiee> lesMiniExcursionsPlanifiees) {
          this.Date = laDate;
          this.lesMiniExcursionsPlanifiees = lesMiniExcursionsPlanifiees;
     }

     public LocalDate getDate() {
          return Date;
     }

     public void setDate(LocalDate laDate) {
          this.Date = laDate;
     }

     public List<MiniExcursionPlanifiee> getLesMiniExcursionsPlanifiees() {
          return lesMiniExcursionsPlanifiees;
     }

     public void setLesMiniExcursionsPlanifiees(List<MiniExcursionPlanifiee> lesMiniExcursionsPlanifiees) {
          this.lesMiniExcursionsPlanifiees = lesMiniExcursionsPlanifiees;
     }
}
