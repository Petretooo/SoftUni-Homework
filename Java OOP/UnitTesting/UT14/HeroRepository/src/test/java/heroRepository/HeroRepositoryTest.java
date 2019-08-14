package heroRepository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroRepositoryTest {
    private Item item;
    private Hero hero;
    private HeroRepository heroRepository;

    @Before
    public void creating(){
        this.item = new Item(5,15,20);
        this.hero = new Hero("Aragon", 30, item);
        this.heroRepository = new HeroRepository();
    }

    @Test
    public void addingMethodShouldWork(){
        heroRepository.add(hero);
        int size = heroRepository.getCount();
        Assert.assertEquals(size, this.heroRepository.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addingMethodShoulntdWork(){
        heroRepository.add(hero);
        heroRepository.add(hero);
    }

    @Test
    public void removingMethodShouldWorkCorrectly(){
        heroRepository.add(hero);
        heroRepository.remove(hero.getName());
        int actualSize = this.heroRepository.getCount();
        Assert.assertEquals(0, actualSize);

    }

    @Test(expected = NullPointerException.class)
    public void removingWontWork(){
        heroRepository.remove(null);

    }

    @Test
    public void highestStrenght(){
        heroRepository.add(hero);
        Hero hero1 = this.heroRepository.getHeroWithHighestStrength();
        Assert.assertEquals(hero1, hero);
    }

    @Test(expected = NullPointerException.class)
    public void highestStrenghtNULL(){
        heroRepository.add(null);
        heroRepository.getHeroWithHighestStrength();
    }

    @Test
    public void highestIntelligence(){
        heroRepository.add(hero);
        Hero hero1 = this.heroRepository.getHeroWithHighestStrength();
        Assert.assertEquals(hero, hero1);
    }

    @Test(expected = NullPointerException.class)
    public void highestIntelligenceNULL(){
        heroRepository.add(null);
        heroRepository.getHeroWithHighestIntelligence();
    }

    @Test
    public void highestAbility(){
        heroRepository.add(hero);
        Hero hero1 = this.heroRepository.getHeroWithHighestStrength();
        Assert.assertEquals(hero, hero1);
    }

    @Test(expected = NullPointerException.class)
    public void highestAbilityNULL(){
        heroRepository.add(null);
        heroRepository.getHeroWithHighestAgility();
    }

    @Test
    public void getSize(){
        heroRepository.add(hero);
        int size = heroRepository.getCount();
        Assert.assertEquals(size,heroRepository.getCount());
    }

    @Test
    public void shouldReturnCorrectHeroInformationAsString() {
        this.heroRepository.add(hero);
        String heroString = hero.toString();
        String actual = this.heroRepository.toString();
        Assert.assertEquals(heroString, actual);
    }
}