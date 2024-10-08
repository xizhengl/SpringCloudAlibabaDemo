package com.alibaba.cloud.order;

//import com.alibaba.cloud.ribbon.RibbonRandomRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@EnableFeignClients
//@RibbonClients(
//        value = {
//                @RibbonClient(name = "service-stock", configuration = RibbonRandomRuleConfig.class)
//        }
//)
@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(OrderApplication.class, args);
        String name = applicationContext.getEnvironment().getProperty("user.name");
        String age = applicationContext.getEnvironment().getProperty("user.age");
        System.out.println(name);
        System.out.println(age);
    }

//    @Bean
//    @LoadBalanced
//    public RestTemplate registered(RestTemplateBuilder restTemplateBuilder){
//        RestTemplate restTemplate = restTemplateBuilder.build();
//        return restTemplate;
//    }
}
