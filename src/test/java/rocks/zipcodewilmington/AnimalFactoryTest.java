package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest(){
        //Given
        String dogName = "Nash";
        Date date = new Date();

        //When
        Dog newDog = AnimalFactory.createDog(dogName, date);
        String createdDogName = newDog.getName();
        Date birthDate = newDog.getBirthDate();

        //Then
        Assert.assertEquals("Nash", createdDogName);
        Assert.assertEquals(date,birthDate);

    }
    @Test
    public void createCatTest(){
        //Given
        String catName = "Kitty";
        Date date = new Date();

        //When
        Cat newCat = AnimalFactory.createCat(catName, date);
        String createdCatName = newCat.getName();
        Date birthDate = newCat.getBirthDate();

        //Then
        Assert.assertEquals("Kitty", createdCatName);
        Assert.assertEquals(date,birthDate);

    }
}
