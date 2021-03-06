package govind.learner;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("learner.props")
public class LearnerProperties {

    private String name;
    private String hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
}
