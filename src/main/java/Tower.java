import java.util.*;

public class Tower {

    private List<Athlete> athletes;

    public Tower(List<Athlete> athletes) {
        this.athletes = athletes;
    }

    public Integer getMaxAthletesInPyramid() {
        orderAthletesByMass();

        return calculateMaxAthletes();
    }

    private void orderAthletesByMass() {
        athletes.sort(Comparator.comparing(Athlete::getMass).reversed());
    }

    private Integer calculateMaxAthletes() {
        int sumOfLighterAthletes = 0;
        int sum;
        int maxAthletes = 1;
        int max = 1;

        for (int i = 0; i < athletes.size() - 1; i++) {
            for (int j = i + 1; j < athletes.size(); j++) {
                sum = sumOfLighterAthletes + athletes.get(j).getMass();
                if (sum <= athletes.get(i).getStrength()) {
                    sumOfLighterAthletes = sum;

                    maxAthletes = updateMaxAthletes(maxAthletes, ++max);
                } else {
                    break;
                }
            }
            max = 1;
            sumOfLighterAthletes = 0;
        }

        return maxAthletes;
    }

    private int updateMaxAthletes(int maxAthletes, int max) {
        return Math.max(maxAthletes, max);
    }
}
