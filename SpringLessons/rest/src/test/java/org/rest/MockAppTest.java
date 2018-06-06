package org.rest;
import static org.junit.Assert.assertEquals;
import org.springframework.test.web.servlet.MockMvc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.support.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.rest.entities.Kunde;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.context.embedded.LocalServerPort;
import static org.hamcrest.Matchers.containsString;

@RunWith(SpringRunner.class)
@WebMvcTest(org.rest.controller.KundenController.class)
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class MockAppTest {
    
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/greeting?name=Era")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Era")));
        
    }
}
