package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setBirthDateTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);

        // When (a dog's name is set to the given name)
        dog.setBirthDate(new Date());

        // Then (we expect to get the given name from the dog)
        Date dogBirthDate = dog.getBirthDate();
        Assert.assertEquals(new Date(), dogBirthDate);
    }

    @Test
    public void speakTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog("Peaches", new Date(), 1);

        // When (a dog's name is set to the given name)
        String dogSpeak = dog.speak();

        // Then (we expect to get the given name from the dog)

        Assert.assertEquals("bark!", dogSpeak);
    }
    @Test
    public void dogEatTest(){
        //Given
        Dog dog = new Dog("Buch", new Date(), 2);

        Food food = new Food();
        Integer numberOfMealsEaten= dog.getNumberOfMealsEaten();

        //When
        dog.eat(food);
        Integer afterMeals= dog.getNumberOfMealsEaten();
        numberOfMealsEaten++;
        //Then
        Assert.assertEquals(afterMeals, numberOfMealsEaten);
    }
    @Test
    public void getIdTest(){
        //Given
        Dog dog = new Dog("Pooch", new Date(), 3);
        Integer givenId = 3;

        //When
        Integer id = dog.getId();

        //Then
        Assert.assertEquals(givenId, id);
    }

    @Test
    public void dogAnimalInheritanceTest(){
        //Given
        Dog dog = new Dog("Princess", new Date(), 4);

        //When
        Boolean dogBoolean = dog instanceof Animal;

        //Then
        Assert.assertEquals(true, dogBoolean);
    }
    @Test
    public void dogMammalInheritanceTest(){
        //Given
        Dog dog = new Dog("Daisy", new Date(), 5);

        //When
        Boolean dogBoolean = dog instanceof Mammal;

        //Then
        Assert.assertEquals(true, dogBoolean);
    }

}
