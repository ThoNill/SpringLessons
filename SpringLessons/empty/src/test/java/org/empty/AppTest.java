package org.empty;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class) // Class that run the tests
@SpringBootTest(classes = TestConfig.class) // Run tests with the TestCOnfig configuration
public class AppTest 
{
    // Extract a property from application.properties
    @Value("${all}")
    private int all;
    
    @Test
    public void allTest() {
        assertEquals(42,all);
    }
    
}
