package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setNameTest(){
        //Given
        String givenName = "Queen";
        Date givenBirthDate = new Date();
        Integer givenId = 1;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        String changedName = "Liz";

        //When
        cat.setName(changedName);
        String afterNameChange = cat.getName();

        //Then
        Assert.assertEquals("Liz", afterNameChange);
    }

    @Test
    public void setBirthDateTest(){
        //Given
        String givenName = "Queen";
        Date givenBirthDate = new Date();
        Integer givenId = 2;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);


        //When
        cat.setBirthDate(new Date(2323223232L));
        Date afteDateChange = cat.getBirthDate();


        //Then
        Assert.assertEquals("Tue Jan 27 16:20:23 EST 1970", afteDateChange.toString());
    }
    @Test
    public void speakTest(){
        //Given
        String givenName = "Ally";
        Date givenBirthDate = new Date();
        Integer givenId = 3;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);


        //When
        String actualResponse = cat.speak();
        //Then
        Assert.assertEquals("meow!", actualResponse);
    }
    @Test
    public void eatTest(){
        //Given
        String givenName = "Ally";
        Date givenBirthDate = new Date();
        Integer givenId = 4;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Food food = new Food();
        Integer numberOfMealsEaten= cat.getNumberOfMealsEaten();

        //When
        cat.eat(food);
        Integer afterMeals= cat.getNumberOfMealsEaten();
        numberOfMealsEaten++;
        //Then
        Assert.assertEquals(afterMeals, numberOfMealsEaten);
    }
    @Test
    public void getIdTest(){
        //Given
        String givenName = "Pow";
        Date givenBirthDate = new Date();
        Integer givenId = 5;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //When
        Integer id = cat.getId();

        //Then
        Assert.assertEquals(givenId, id);
    }

    @Test
    public void catAnimalInheritanceTest(){
        //Given
        String givenName = "Rani";
        Date givenBirthDate = new Date();
        Integer givenId = 6;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //When
        Boolean catBoolean = cat instanceof Animal;

        //Then
        Assert.assertEquals(true, catBoolean);
    }
    @Test
    public void catMammalInheritanceTest(){
        //Given
        String givenName = "Kitty";
        Date givenBirthDate = new Date();
        Integer givenId = 7;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //When
        Boolean catBoolean = cat instanceof Mammal;

        //Then
        Assert.assertEquals(true, catBoolean);
    }


}
