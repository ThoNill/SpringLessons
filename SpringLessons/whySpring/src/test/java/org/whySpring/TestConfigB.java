package org.whySpring;

import org.springframework.context.annotation.ComponentScan;


// empty Configuration that scans thru the package "org.whySpring.componentsB" 
@ComponentScan(basePackages = {"org.whySpring.componentsB"})
public class TestConfigB {

}
