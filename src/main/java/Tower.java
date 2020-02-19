import java.util.*;
import java.util.stream.Stream;

public class Tower {

    private Stream<Athlete> athletes;

    public Tower(List<Athlete> athletes) {
        this.athletes = sortAthletesByLighterFirst(athletes);
    }

    private Stream<Athlete> sortAthletesByLighterFirst(List<Athlete> athletes) {
        return athletes
                .stream()
                .sorted();
    }

    public int getMaxAthletes() {
        List<Athlete> athletesInTower = new ArrayList<>();

        athletes.forEach(athlete -> {
            if (athlete.canHold(athletesInTower)) {
                athletesInTower.add(athlete);
            } else {
                return;
            }
        });

        return athletesInTower.size();
    }
}
