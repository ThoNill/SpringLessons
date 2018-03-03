package org.qualifier;

import org.springframework.context.annotation.ComponentScan;


// empty Configuration that scans thru the package "org.whySpring" 
@ComponentScan(basePackages = {"org.qualifier"})
public class TestConfig {

}
