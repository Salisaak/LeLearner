package learnerlab;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {


    @Test
    public void testImplementation(){
        Learner student = new Student(1,"Noelle");

        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student student = new Student(1,"Binyamin");

        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        Student student = new Student(1, "Tejani");

        student.learn(5);
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(5, actual, 0);
    }






}
