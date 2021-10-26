package learnerlab;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(1, "Mr.Floss");

        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(1, "Rion");

        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
                     Instructor instructor = new Instructor(1, "Dimos");
                        Student student = new Student(6, "Akeha");

         instructor.teach(student, 2);
            double actual = student.getTotalStudyTime();
        Assert.assertEquals(2, actual, 0);

    }

    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(1, "Rion");
        Learner[] learners = new Learner[2];

                    learners[0] = new Student(0, "Oz");
                    learners[1] = new Student(1, "Norman");

        instructor.lecture(learners, 6);
        double actual = learners[0].getTotalStudyTime();
        Assert.assertEquals(3, actual, 0);

    }

}
