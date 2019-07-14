package kulo.sgg.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableApolloConfig({"pro'"})
@EnableApolloConfig
public class AppConfig {
//    @Value("${TEST1.pro.test_path}")
    @Value("${str1}")
    private String defaultPath;

    public String getDefaultPath() {
        return defaultPath;
    }

    public void setDefaultPath(String defaultPath) {
        this.defaultPath = defaultPath;
    }
}
