package com.stackroute;


import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Config;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
      //  BeanLifecycleDemoBean lc=context.getBean(BeanLifecycleDemoBean.class);

        Movie movie=context.getBean(Movie.class);
        // movie.print();

       // ((ConfigurableApplicationContext)context).close();

       // System.out.println( "Hello World!" );
    }
}
