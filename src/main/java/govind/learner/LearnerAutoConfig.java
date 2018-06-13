package govind.learner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//配置注解
@Configuration
//指定配置类
@EnableConfigurationProperties(LearnerProperties.class)
//当LearnerService在类路径中且容器中没有这个Bean的情况下，开始自动配置LearnerService
@ConditionalOnClass(LearnerService.class)
//当配置文件中xample.service.enabled=true时配置
@ConditionalOnProperty(prefix = "learner.props", value = "enabled", matchIfMissing = true)
public class LearnerAutoConfig {

    @Autowired
    private LearnerProperties learnerProperties;

    //返回值
    @Bean
    // 当容器中没有Bean时，自动配置LearnerService
    @ConditionalOnMissingBean(LearnerService.class)
    public LearnerService learnerService() {
        LearnerService learnerService =  new LearnerService(learnerProperties);
        return learnerService;
    }
}
