import java.util.*;

public class Application {
    public Integer getMaxAthletesInPyramid(int size, List<Athlete> athletes) {
        athletes.sort(Comparator.comparing(Athlete::getMass).reversed());

        List<Integer> matrixSumOfLighterAthletes = new ArrayList<>();

        Integer sumOfLighterAthletes = 0;
        for (int i = 0; i < athletes.size() - 1; i++) {
            for (int j = i + 1; j < athletes.size(); j++) {
                sumOfLighterAthletes += athletes.get(j).getMass();
            }
            matrixSumOfLighterAthletes.add(sumOfLighterAthletes);
            sumOfLighterAthletes = 0;
        }

        for (int i = 0; i < athletes.size() - 1; i++) {
            for (int j = i; j < matrixSumOfLighterAthletes.size(); j++) {
                if (athletes.get(i).getStrength() >= matrixSumOfLighterAthletes.get(j)) {
                    return athletes.size() - j;
                }
            }
        }

        return 1;
    }
}
