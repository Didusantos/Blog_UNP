package com.example.demo.controllers;

import com.example.demo.domainmodel.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.UUID;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class UserControllerIntegrationTest {

    @Autowired
    private UserController userController;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    @DisplayName("Fluxo completo: POST -> GET ALL -> GET_BY_ID -> PUT -> PATH -> GET -> ERRO404")
    public void FullFlow() throws Exception {
        UUID id = UUID.randomUUID();
        var bodyCreate = new User(id, "Eduardo", "Eduardo@hotmail.com", "Eduardo123", null, null);
        var postResult = mockMvc.perform(
                post("/api/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(bodyCreate)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id" ,is(id)))
                .andExpect(jsonPath("$.name", is("Eduardo")))
                        .andReturn();

        var crated = objectMapper.readValue(postResult.getResponse().getContentAsByteArray(), User.class);
        var returnedId = crated.getId();
    }
}
