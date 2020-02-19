import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AthletesTest {

    Application application = new Application();

    @Test
    public void itShouldReturn1IfThereIsOnlyOneAthlete() {
        List<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete(2, 2));

        Integer maxAthletesInPyramid = application.getMaxAthletesInPyramid(athletes.size(), athletes);
        assertEquals(Integer.valueOf(1), maxAthletesInPyramid);
    }

    @Test
    public void itShouldReturn2IfThereAreTwoEqualAthletes() {
        List<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete(2, 2));
        athletes.add(new Athlete(2, 2));

        Integer maxAthletesInPyramid = application.getMaxAthletesInPyramid(athletes.size(), athletes);
        assertEquals(Integer.valueOf(2), maxAthletesInPyramid);
    }

    @Test
    public void itShouldReturn1IfThereAreThreeEqualAthletes() {
        List<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete(2, 2));
        athletes.add(new Athlete(2, 2));
        athletes.add(new Athlete(2, 2));

        Integer maxAthletesInPyramid = application.getMaxAthletesInPyramid(athletes.size(), athletes);
        assertEquals(Integer.valueOf(2), maxAthletesInPyramid);
    }

    @Test
    public void itShouldReturn1IfThereAreTwoEqualAthletes() {
        List<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete(4, 1));
        athletes.add(new Athlete(2, 2));

        Integer maxAthletesInPyramid = application.getMaxAthletesInPyramid(athletes.size(), athletes);
        assertEquals(Integer.valueOf(1), maxAthletesInPyramid);
    }

    @Test
    public void itShouldReturn3() {
        List<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete(3, 4));
        athletes.add(new Athlete(2, 2));
        athletes.add(new Athlete(7, 6));
        athletes.add(new Athlete(4, 5));

        Integer maxAthletesInPyramid = application.getMaxAthletesInPyramid(athletes.size(), athletes);
        assertEquals(Integer.valueOf(3), maxAthletesInPyramid);
    }
}
