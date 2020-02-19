import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TowerTest {

    @Test
    public void itShouldReturn1IfThereIsOnlyOneAthlete() {
        List<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete(2, 2));
        Tower tower = new Tower(athletes);

        int maxAthletesInPyramid = tower.getMaxAthletes();
        assertEquals(1, maxAthletesInPyramid);
    }

    @Test
    public void itShouldReturn2IfThereAreTwoEqualAthletes() {
        List<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete(2, 2));
        athletes.add(new Athlete(2, 2));
        Tower tower = new Tower(athletes);

        int maxAthletesInPyramid = tower.getMaxAthletes();
        assertEquals(2, maxAthletesInPyramid);
    }

    @Test
    public void itShouldReturn2IfThereAreThreeEqualAthletes() {
        List<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete(2, 2));
        athletes.add(new Athlete(2, 2));
        athletes.add(new Athlete(2, 2));
        Tower tower = new Tower(athletes);

        int maxAthletesInPyramid = tower.getMaxAthletes();
        assertEquals(2, maxAthletesInPyramid);
    }

    @Test
    public void itShouldReturn1IfThereAreTwoWeakAthletes() {
        List<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete(4, 1));
        athletes.add(new Athlete(2, 2));
        Tower tower = new Tower(athletes);

        int maxAthletesInPyramid = tower.getMaxAthletes();
        assertEquals(1, maxAthletesInPyramid);
    }

    @Test
    public void itShouldReturn3OutOf4When1OfThemIsNotStrongEnough() {
        List<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete(3, 4));
        athletes.add(new Athlete(2, 2));
        athletes.add(new Athlete(7, 6));
        athletes.add(new Athlete(4, 5));
        Tower tower = new Tower(athletes);

        int maxAthletesInPyramid = tower.getMaxAthletes();
        assertEquals(3, maxAthletesInPyramid);
    }

    @Test
    public void itShouldReturn4WhenAllFourAreLightAndStrong() {
        List<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete(3, 4));
        athletes.add(new Athlete(2, 2));
        athletes.add(new Athlete(7, 9));
        athletes.add(new Athlete(4, 5));
        Tower tower = new Tower(athletes);

        int maxAthletesInPyramid = tower.getMaxAthletes();
        assertEquals(4, maxAthletesInPyramid);
    }

    @Test
    public void itShouldReturn1WhenAllFourAreHeavyAndWeak() {
        List<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete(5, 1));
        athletes.add(new Athlete(6, 2));
        athletes.add(new Athlete(7, 3));
        athletes.add(new Athlete(8, 4));
        Tower tower = new Tower(athletes);

        int maxAthletesInPyramid = tower.getMaxAthletes();
        assertEquals(1, maxAthletesInPyramid);
    }

    @Test
    @Ignore // esse teste nao eh valido
    // o enunciado diz que se m[i] > m[j], entao s[i] > s[j]
    // ou seja, o quarto atleta, comparado ao terceiro, tem m[3] = 8 > m[2] = 7, porem s[3] = 6 < s[2] = 20,
    // o que faz com que o teste nao seja aderente ao enunciado
    public void itShouldReturn3WhenTheHeaviestIsNotTheStrongestButTheSecondHeaviestIs() {
        List<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete(5, 1));
        athletes.add(new Athlete(6, 2));
        athletes.add(new Athlete(7, 20));
        athletes.add(new Athlete(8, 6));
        Tower tower = new Tower(athletes);

        int maxAthletesInPyramid = tower.getMaxAthletes();
        assertEquals(3, maxAthletesInPyramid);
    }

    @Test
    public void acceptanceCriterion() {
        List<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete(3, 4));
        athletes.add(new Athlete(2, 2));
        athletes.add(new Athlete(7, 6));
        athletes.add(new Athlete(4, 5));

        Tower tower = new Tower(athletes);

        assertEquals(3, tower.getMaxAthletes());
    }
}
