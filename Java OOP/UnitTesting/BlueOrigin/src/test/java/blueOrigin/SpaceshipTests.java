package blueOrigin;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

public class SpaceshipTests {
    private Astronaut astronaut;
    private Spaceship spaceship;

    @Before
    public void Creating(){
        astronaut = new Astronaut("Armstrong", 100);
        spaceship = new Spaceship("Apollo", 2);
    }

    @Test
    public void addMethodCorrectly(){
        spaceship.add(astronaut);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addSameShouldThrowException(){
        spaceship.add(astronaut);
        spaceship.add(astronaut);
    }


    @Test(expected = IllegalArgumentException.class)
    public void addingIfEqualToSizeException(){
        spaceship.add(astronaut);
        spaceship.add(new Astronaut("dada", 122));
        spaceship.add(new Astronaut("s", 444));
    }


    @Test
    public void sizeCorrect(){
        spaceship.add(astronaut);
        Assert.assertEquals(1, this.spaceship.getCount());
    }

    @Test(expected = NullPointerException.class)
    public void nullNameExceptionShip(){
        Spaceship spaceship1 = new Spaceship(null, 2);

    }

    @Test(expected = NullPointerException.class)
    public void whiteNameException(){
        Spaceship spaceship1 = new Spaceship("", 2);
    }


    @Test(expected = IllegalArgumentException.class)
    public void capacityException(){
        Spaceship spaceship1 = new Spaceship("fafa", -1);
    }

    @Test
    public void removerSuccessfully(){
        spaceship.add(astronaut);
        Assert.assertEquals(true,  spaceship.remove(astronaut.getName()));
    }

    @Test
    public void failRemove(){
        spaceship.add(astronaut);
        Assert.assertEquals(false, spaceship.remove("John"));
    }

    @Test
    public void gettingNameCorrectly(){
        Assert.assertEquals("Apollo", spaceship.getName());
    }

}
