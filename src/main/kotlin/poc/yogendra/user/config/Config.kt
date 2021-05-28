package poc.yogendra.user.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate
import poc.yogendra.user.vo.ResponseTemplate

@Configuration
class Config {

    @Bean
    @LoadBalanced
    fun getRestTemplate(): RestTemplate = RestTemplate()


}