package learnerlab;

public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        System.out.println(learner.getTotalStudyTime());
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        for (Learner learner : learners) {
            double numberOfHoursPerLearner = numberOfHours / learners.length;
            learner.learn(numberOfHoursPerLearner);
        }
    }
}



