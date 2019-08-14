package unitTesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RaceEntryTest {
    private static final String EXISTING_RIDER = "Rider %s is already added";
    private static final String RIDER_INVALID = "Rider cannot be null.";
    private static final String RIDER_ADDED = "Rider %s added in race.";
    private static final int MIN_PARTICIPANTS = 2;
    private static final String RACE_INVALID = "The race cannot start with less than %d participants.";

    private RaceEntry raceEntry;
    private UnitRider unitRider;
    private UnitMotorcycle unitMotorcycle;


    @Before
    public void Constructor(){
        raceEntry = new RaceEntry();
        unitMotorcycle = new UnitMotorcycle("XZ", 150, 450);
        unitRider = new UnitRider("Misho", unitMotorcycle);
    }

    @Test
    public void addMethodShouldWorkCorrectly(){
        raceEntry.addRider(unitRider);
        Assert.assertTrue(raceEntry.getRiders().contains(unitRider));
    }

    @Test(expected = NullPointerException.class)
    public void addMethodShouldThrowNullException(){
        raceEntry.addRider(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addMethodShouldThrowIllegalException(){
        raceEntry.addRider(unitRider);
        raceEntry.addRider(unitRider);
    }

    @Test
    public void calculationMathodShouldWorkCorrectly(){
        raceEntry.addRider(unitRider);
        raceEntry.addRider(new UnitRider("Bobi", new UnitMotorcycle("BOKA", 55,424)));

        raceEntry.calculateAverageHorsePower();

        double AVRG = raceEntry.getRiders().stream().mapToDouble(e -> e.getMotorcycle().getHorsePower()).average().getAsDouble();

        Assert.assertEquals(AVRG, raceEntry.calculateAverageHorsePower(), 0.001);

    }

    @Test(expected = IllegalArgumentException.class)
    public void calculationMethodShouldThrowException(){
        raceEntry.addRider(unitRider);
        raceEntry.calculateAverageHorsePower();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void gettingAndTryingToModiftTheCollectionShouldThrowAnException(){
        raceEntry.addRider(unitRider);
        raceEntry.getRiders().remove(raceEntry);
    }

}
