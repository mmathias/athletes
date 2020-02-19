import java.util.*;

public class Tower {

    private List<Athlete> athletes;

    public Tower(List<Athlete> athletes) {
        this.athletes = athletes;
    }

    public Integer getMaxAthletesInPyramid() {
        athletes.sort(Comparator.comparing(Athlete::getMass).reversed());

        return getMatrixSumOfLighterAthletesMasses();
    }

    private Integer getMatrixSumOfLighterAthletesMasses() {
        int sumOfLighterAthletes = 0;
        int temporarySumOfLighterAthletes;
        int maxAthletes = 1;
        int temporaryMaxAthletes = 1;

        for (int i = 0; i < athletes.size() - 1; i++) {
            for (int j = i + 1; j < athletes.size(); j++) {
                temporarySumOfLighterAthletes = sumOfLighterAthletes + athletes.get(j).getMass();
                if (temporarySumOfLighterAthletes <= athletes.get(i).getStrength()) {
                    sumOfLighterAthletes = temporarySumOfLighterAthletes;

                    if (maxAthletes < ++temporaryMaxAthletes) {
                        maxAthletes = temporaryMaxAthletes;
                    }
                }
            }
            temporaryMaxAthletes = 0;
            sumOfLighterAthletes = 0;
        }

        return maxAthletes;
    }
}
