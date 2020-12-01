package ash.wxtest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author : Ashiamd email: ashiamd@foxmail.com
 * @date : 2020/11/30 1:56 PM
 */

@Configuration
public class RibbonConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
