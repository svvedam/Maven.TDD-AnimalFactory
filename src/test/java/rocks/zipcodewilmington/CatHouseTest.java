package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void addTest(){
        //Given
        Cat cat = new Cat("Diana", new Date(), 1);
        Integer passedId = 1;

        //When
        CatHouse.add(cat);
        Cat retrieveCat = CatHouse.getCatById(passedId);
        Integer retrieveId = cat.getId();
        String retrieveName = cat.getName();

        //Then
        Assert.assertEquals(passedId,retrieveId);
        Assert.assertEquals("Diana",retrieveName);

    }

    @Test
    public void removeIdTest(){
        //Given
        Cat cat = new Cat("Minnie", new Date(), 2);
        Integer passedId = 2;
        CatHouse.add(cat);

        //When
        CatHouse.remove(passedId);
        Cat remoCatbyId = CatHouse.getCatById(passedId);


        //Then
        Assert.assertEquals(null,remoCatbyId);

    }

    @Test
    public void removeTest(){
        //Given
        Cat cat = new Cat("Holly", new Date(), 3);
        Integer passedId = 3;
        CatHouse.add(cat);

        //When
        CatHouse.remove(cat);
        Cat removedCat = CatHouse.getCatById(passedId);
        
        //Then
        Assert.assertEquals(null,removedCat);

    }                   

    @Test
    public void getCatByIdTest(){
        //Given
        Cat cat = new Cat("Molly", new Date(), 4);
        Integer passedId = 4;
        CatHouse.add(cat);
        //When

        Cat retrievedCat = CatHouse.getCatById(passedId);
        Integer retrieveId = cat.getId();
        String retrieveName = cat.getName();


        //Then
        Assert.assertEquals(passedId,retrieveId);
        Assert.assertEquals("Molly",retrieveName);
    }

    @Test
    public void getNumberOfCats(){

        //Given
        Cat cat = new Cat("Molly", new Date(), 4);
        CatHouse.add(cat);
        Integer count  = 0;
        //When

        Integer countCats = CatHouse.getNumberOfCats();
        count++;

        //Then
        Assert.assertEquals(count,countCats);
    }
}
