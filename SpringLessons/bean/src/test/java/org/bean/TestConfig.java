package org.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


// empty Configuration that scans thru the package "org.whySpring" 
@ComponentScan(basePackages = {"org.bean"})
public class TestConfig {

    @Bean
    @Qualifier("componentA")
    public IComponent getA() {
        return new MyComponentA();
    }
    

    @Bean
    @Qualifier("componentB")
    public IComponent getB() {
        return new MyComponentB();
    }

}
