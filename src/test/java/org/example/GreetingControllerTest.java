package org.example;


import org.example.service.GreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest
public class GreetingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    GreetingService greetingService;

    @Test
    public void shouldGetWelcomePage() throws Exception {

        when(greetingService.getGreeting())
                .thenReturn("Hello");

        mockMvc.perform(get("/api/"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("Hello"));

        verify(greetingService, times(1)).getGreeting();
    }
}

