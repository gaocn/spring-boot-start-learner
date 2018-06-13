package govind.learner;

public class LearnerService {

    private LearnerProperties learnerProperties;

    public LearnerService() {}

    public LearnerService(LearnerProperties learnerProperties) {
        this.learnerProperties = learnerProperties;
    }

    public String learn() {
        String logo = String.format("%s like %s", learnerProperties.getName(),learnerProperties.getHobbies());
        return logo;
    }
}
