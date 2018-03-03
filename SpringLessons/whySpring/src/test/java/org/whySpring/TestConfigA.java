package org.whySpring;

import org.springframework.context.annotation.ComponentScan;


// empty Configuration that scans thru the package "org.whySpring.componentsA" 
@ComponentScan(basePackages = {"org.whySpring.componentsA"})
public class TestConfigA {

}
