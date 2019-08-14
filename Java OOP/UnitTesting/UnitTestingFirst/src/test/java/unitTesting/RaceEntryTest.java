package unitTesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class RaceEntryTest {

    private static final int MIN_PARTICIPANTS = 2;
    private RaceEntry raceEntry;
    private UnitRider unitRider;
    private UnitMotorcycle unitMotorcycle;

    @Before
    public void RaceEntry(){
        this.raceEntry = new RaceEntry();
        this.unitMotorcycle = new UnitMotorcycle("Kawasaki", 500, 350.0);
        this.unitRider = new UnitRider("Ivan", unitMotorcycle);
    }

    @Test
    public void creatingMapSetElementsCorrectly(){
        raceEntry.addRider(this.unitRider);
        Assert.assertTrue(raceEntry.getRiders().contains(this.unitRider));
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowWhenAddingNullRiderToRace() {
        this.raceEntry.addRider(null);
    }

    @Test(expected = NullPointerException.class)
    public void ifRiderIsNullShouldThrowException(){
        raceEntry.addRider(null);
        Assert.assertFalse(raceEntry.getRiders().contains(null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void ifAlreadyExistShouldThrowException(){
        raceEntry.addRider(this.unitRider);
        raceEntry.addRider(this.unitRider);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getCollectionShouldThrow() {
        raceEntry.addRider(this.unitRider);
        raceEntry.getRiders().remove(this.unitRider);
        //OR raceEntry.getRiders().remove(this.unitRider);
    }

    @Test
    public void shouldReturnAvarageHorsePower(){
        UnitRider unitRider1 = new UnitRider("Ivan1", new UnitMotorcycle("Kawasaki", 500, 350.0));

        raceEntry.addRider(this.unitRider);
        raceEntry.addRider(unitRider1);

        Assert.assertEquals(500, raceEntry.calculateAverageHorsePower(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void belowTwoParticipateShoudThrowException(){
        raceEntry.addRider(this.unitRider);
        raceEntry.calculateAverageHorsePower();

    }

}
