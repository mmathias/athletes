import java.util.List;

public class Athlete implements Comparable<Athlete> {

    private Integer mass;
    private Integer strength;

    public Athlete(Integer mass, Integer strength) {
        this.mass = mass;
        this.strength = strength;
    }

    public boolean canHold(List<Athlete> athletesInTower) {
        return strength >= totalAthletesMass(athletesInTower);
    }

    private int totalAthletesMass(List<Athlete> athletesInTower) {
        return athletesInTower.stream().map(a -> a.mass).mapToInt(Integer::intValue).sum();
    }

    @Override
    public int compareTo(Athlete o) {
        return this.mass.compareTo(o.mass);
    }
}
