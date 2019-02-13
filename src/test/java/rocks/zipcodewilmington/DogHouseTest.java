package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    @Test
    public void addTest(){
        //Given
        Dog dog = new Dog("Diana", new Date(), 1);
        Integer passedId = 1;

        //When
        DogHouse.add(dog);
        Dog retrieveDog = DogHouse.getDogById(passedId);
        Integer retrieveId = dog.getId();
        String retrieveName = dog.getName();

        //Then
        Assert.assertEquals(passedId,retrieveId);
        Assert.assertEquals("Diana",retrieveName);

    }

    @Test
    public void removeIdTest(){
        //Given
        Dog dog = new Dog("Minnie", new Date(), 2);
        Integer passedId = 2;
        DogHouse.add(dog);

        //When
        DogHouse.remove(passedId);
        Dog removeDogbyId = DogHouse.getDogById(passedId);


        //Then
        Assert.assertEquals(null,removeDogbyId);

    }

    @Test
    public void removeTest(){
        //Given
        Dog dog = new Dog("Holly", new Date(), 3);
        Integer passedId = 3;
        DogHouse.add(dog);

        //When
        DogHouse.remove(dog);
        Dog removedDog = DogHouse.getDogById(passedId);

        //Then
        Assert.assertEquals(null,removedDog);

    }

    @Test
    public void getDogByIdTest(){
        //Given
        Dog dog = new Dog("Molly", new Date(), 4);
        Integer passedId = 4;
        DogHouse.add(dog);
        //When

        Dog retrievedDog = DogHouse.getDogById(passedId);
        Integer retrieveId = dog.getId();
        String retrieveName = dog.getName();


        //Then
        Assert.assertEquals(passedId,retrieveId);
        Assert.assertEquals("Molly",retrieveName);
    }

    @Test
    public void getNumberOfDogs(){

        //Given
        Dog dog = new Dog("Molly", new Date(), 4);
        DogHouse.add(dog);
        Integer count  = 0;
        //When

        Integer countDogs = DogHouse.getNumberOfDogs();
        count++;

        //Then
        Assert.assertEquals(count,countDogs);
    }
}
