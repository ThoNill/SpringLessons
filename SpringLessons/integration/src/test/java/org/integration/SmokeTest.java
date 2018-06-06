package org.integration;

import static org.junit.Assert.assertNotNull;

import org.integration.controller.IntegrationController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {

    @Autowired
    private IntegrationController controller;

    @Test
    public void contexLoads() throws Exception {
        assertNotNull(controller);
    }
}