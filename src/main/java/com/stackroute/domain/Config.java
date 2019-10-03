package com.stackroute.domain;

import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
@Configuration
@ComponentScan("com.stackroute.domain")

public class Config {
@Bean
    public BeanLifecycleDemoBean getBeanLifecycleDemoBean()
{
    return new BeanLifecycleDemoBean();
}
//    @Bean
//    @Scope("prototype")
//    public Movie getmovie()
//    {
//        return new Movie();
//    }
//    @Bean
//    public Actor getActor()
//    {
//        return new Actor();
//    }


}



