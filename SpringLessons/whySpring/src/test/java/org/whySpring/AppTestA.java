package org.whySpring;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.whySpring.componentsA.AComponent;


@RunWith(SpringRunner.class) // Class that run the tests
@SpringBootTest(classes = TestConfigA.class) // Run tests with the TestCOnfigA configuration
public class AppTestA 
{
    // For the client is the component an interface  
    @Autowired
    IComponent component1;
        
    
    @Test
    public void allTest() {
        assertTrue(component1 instanceof AComponent);
    }
    
}
