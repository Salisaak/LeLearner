package learnerlab;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        Person person;
        int id = 0;
        String name = "Sawado";

        person = new Person(id, name);
        Assert.assertNotNull(person);
    }

    @Test
    public void testSetName(){
        Person person;
        int id = 0;
        person = new Person(id, null);

        person.setName("LeVania");
        String actual = person.getName();
        Assert.assertEquals("LeVania", actual);
    }



}
